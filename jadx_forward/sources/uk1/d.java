package uk1;

/* loaded from: classes7.dex */
public class d extends uk1.b {

    /* renamed from: b, reason: collision with root package name */
    public java.nio.ByteBuffer f510049b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Random f510050c = new java.util.Random();

    public static int i(xk1.e eVar) {
        java.lang.String a17 = ((xk1.f) eVar).a("Sec-WebSocket-Version");
        if (a17.length() > 0) {
            try {
                return new java.lang.Integer(a17.trim()).intValue();
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // uk1.b
    public uk1.a a(xk1.a aVar, xk1.g gVar) {
        xk1.f fVar = (xk1.f) aVar;
        java.lang.String a17 = fVar.a("Sec-WebSocket-Protocol");
        xk1.f fVar2 = (xk1.f) gVar;
        java.lang.String a18 = fVar2.a("Sec-WebSocket-Protocol");
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17);
        uk1.a aVar2 = uk1.a.NOT_MATCHED;
        if (!K0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a18)) {
            java.lang.String[] split = a17.split(", ");
            int length = split.length;
            boolean z17 = false;
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    break;
                }
                if (a18.equals(split[i17])) {
                    z17 = true;
                    break;
                }
                i17++;
            }
            if (!z17) {
                return aVar2;
            }
        }
        if (fVar.f536540a.containsKey("Sec-WebSocket-Key") && fVar2.f536540a.containsKey("Sec-WebSocket-Accept")) {
            if (h(fVar.a("Sec-WebSocket-Key")).equals(fVar2.a("Sec-WebSocket-Accept"))) {
                return uk1.a.MATCHED;
            }
        }
        return aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // uk1.b
    public uk1.a b(xk1.a aVar) {
        int i17 = i(aVar);
        uk1.a aVar2 = uk1.a.NOT_MATCHED;
        if (i17 != 7 && i17 != 8) {
            return aVar2;
        }
        xk1.f fVar = (xk1.f) aVar;
        return fVar.a("Upgrade").equalsIgnoreCase("websocket") && fVar.a("Connection").toLowerCase(java.util.Locale.ENGLISH).contains("upgrade") ? uk1.a.MATCHED : aVar2;
    }

    @Override // uk1.b
    public uk1.b c() {
        return new uk1.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // uk1.b
    public xk1.b d(xk1.b bVar) {
        java.lang.String str;
        xk1.f fVar = (xk1.f) bVar;
        fVar.b("Upgrade", "websocket");
        fVar.b("Connection", "Upgrade");
        fVar.b("Sec-WebSocket-Version", "8");
        byte[] bArr = new byte[16];
        this.f510050c.nextBytes(bArr);
        try {
            str = yk1.b.d(bArr, 0, 16, 0);
        } catch (java.io.IOException unused) {
            str = null;
        }
        fVar.b("Sec-WebSocket-Key", str);
        return bVar;
    }

    @Override // uk1.b
    public java.util.List f(java.nio.ByteBuffer byteBuffer) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (this.f510049b != null) {
            try {
                byteBuffer.mark();
                int remaining = byteBuffer.remaining();
                int remaining2 = this.f510049b.remaining();
                if (remaining2 > remaining) {
                    this.f510049b.put(byteBuffer.array(), byteBuffer.position(), remaining);
                    byteBuffer.position(byteBuffer.position() + remaining);
                    return java.util.Collections.emptyList();
                }
                this.f510049b.put(byteBuffer.array(), byteBuffer.position(), remaining2);
                byteBuffer.position(byteBuffer.position() + remaining2);
                linkedList.add(j((java.nio.ByteBuffer) this.f510049b.duplicate().position(0)));
                this.f510049b = null;
            } catch (uk1.c e17) {
                this.f510049b.limit();
                int i17 = e17.f510048d;
                if (i17 < 0) {
                    throw new vk1.b(1002, "Negative count");
                }
                java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(i17);
                this.f510049b.rewind();
                allocate.put(this.f510049b);
                this.f510049b = allocate;
                return f(byteBuffer);
            }
        }
        while (byteBuffer.hasRemaining()) {
            byteBuffer.mark();
            try {
                linkedList.add(j(byteBuffer));
            } catch (uk1.c e18) {
                byteBuffer.reset();
                int i18 = e18.f510048d;
                if (i18 < 0) {
                    throw new vk1.b(1002, "Negative count");
                }
                java.nio.ByteBuffer allocate2 = java.nio.ByteBuffer.allocate(i18);
                this.f510049b = allocate2;
                allocate2.put(byteBuffer);
            }
        }
        return linkedList;
    }

    public final java.lang.String h(java.lang.String str) {
        try {
            byte[] digest = java.security.MessageDigest.getInstance("SHA1").digest((str.trim() + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").getBytes());
            try {
                return yk1.b.d(digest, 0, digest.length, 0);
            } catch (java.io.IOException unused) {
                return null;
            }
        } catch (java.security.NoSuchAlgorithmException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandNetWork.Draft_10", "not such algorithm " + e17.toString());
            return "";
        }
    }

    public wk1.e j(java.nio.ByteBuffer byteBuffer) {
        wk1.d dVar;
        wk1.f fVar;
        int remaining = byteBuffer.remaining();
        int i17 = 2;
        if (remaining < 2) {
            throw new uk1.c(this, 2);
        }
        byte b17 = byteBuffer.get();
        boolean z17 = (b17 >> 8) != 0;
        byte b18 = (byte) ((b17 & Byte.MAX_VALUE) >> 4);
        if (b18 != 0) {
            throw new vk1.c("bad rsv " + ((int) b18));
        }
        byte b19 = byteBuffer.get();
        boolean z18 = (b19 & Byte.MIN_VALUE) != 0;
        int i18 = (byte) (b19 & Byte.MAX_VALUE);
        byte b27 = (byte) (b17 & 15);
        wk1.d dVar2 = wk1.d.PONG;
        wk1.d dVar3 = wk1.d.PING;
        wk1.d dVar4 = wk1.d.CLOSING;
        if (b27 == 0) {
            dVar = wk1.d.CONTINUOUS;
        } else if (b27 == 1) {
            dVar = wk1.d.TEXT;
        } else if (b27 != 2) {
            switch (b27) {
                case 8:
                    dVar = dVar4;
                    break;
                case 9:
                    dVar = dVar3;
                    break;
                case 10:
                    dVar = dVar2;
                    break;
                default:
                    throw new vk1.c("unknow optcode " + ((int) b27));
            }
        } else {
            dVar = wk1.d.BINARY;
        }
        if (!z17 && (dVar == dVar3 || dVar == dVar2 || dVar == dVar4)) {
            throw new vk1.c("control frames may no be fragmented");
        }
        if (i18 < 0 || i18 > 125) {
            if (dVar == dVar3 || dVar == dVar2 || dVar == dVar4) {
                throw new vk1.c("more than 125 octets");
            }
            if (i18 != 126) {
                i17 = 10;
                if (remaining < 10) {
                    throw new uk1.c(this, 10);
                }
                byte[] bArr = new byte[8];
                for (int i19 = 0; i19 < 8; i19++) {
                    bArr[i19] = byteBuffer.get();
                }
                long longValue = new java.math.BigInteger(bArr).longValue();
                if (longValue > 2147483647L) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandNetWork.Draft_10", "Payloadsize is to big...");
                } else {
                    i18 = (int) longValue;
                }
            } else {
                if (remaining < 4) {
                    throw new uk1.c(this, 4);
                }
                i18 = new java.math.BigInteger(new byte[]{0, byteBuffer.get(), byteBuffer.get()}).intValue();
                i17 = 4;
            }
        }
        int i27 = i17 + (z18 ? 4 : 0) + i18;
        if (remaining < i27) {
            throw new uk1.c(this, i27);
        }
        if (i18 < 0) {
            throw new vk1.b(1002, "Negative count");
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(i18);
        if (z18) {
            byte[] bArr2 = new byte[4];
            byteBuffer.get(bArr2);
            for (int i28 = 0; i28 < i18; i28++) {
                allocate.put((byte) (byteBuffer.get() ^ bArr2[i28 % 4]));
            }
        } else {
            allocate.put(byteBuffer.array(), byteBuffer.position(), allocate.limit());
            byteBuffer.position(byteBuffer.position() + allocate.limit());
        }
        if (dVar == dVar4) {
            fVar = new wk1.b();
        } else {
            fVar = new wk1.f();
            fVar.f528463a = z17;
            fVar.f528464b = dVar;
        }
        allocate.flip();
        fVar.b(allocate);
        return fVar;
    }
}
