package wu1;

/* loaded from: classes13.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public int f531202d;

    /* renamed from: e, reason: collision with root package name */
    public int f531203e;

    /* renamed from: a, reason: collision with root package name */
    public final xu1.b f531199a = new xu1.b();

    /* renamed from: b, reason: collision with root package name */
    public final yu1.d f531200b = new yu1.c();

    /* renamed from: c, reason: collision with root package name */
    public final zu1.b f531201c = new zu1.a();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f531204f = new java.util.ArrayList();

    public final void a() {
        yu1.c cVar = (yu1.c) this.f531200b;
        cVar.f547378b = false;
        ((java.util.ArrayList) cVar.f547377a).clear();
        if (cVar.f547379c != null && cVar.f547378b) {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new yu1.b(cVar, null), 2, null);
        }
        zu1.a aVar = (zu1.a) this.f531201c;
        aVar.getClass();
        aVar.f557221a = false;
        java.lang.Thread.sleep(50L);
        xu1.b bVar = this.f531199a;
        if (bVar.f538721a == xu1.c.f538725f) {
            java.net.Socket socket = bVar.f538722b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(socket);
            socket.close();
            bVar.f538721a = xu1.c.f538723d;
            bVar.f538722b = new java.net.Socket();
        }
    }

    public final int b(byte b17, byte[] data, byte b18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        int length = data.length + 12;
        byte[] bArr = new byte[12];
        bArr[0] = (byte) 105;
        bArr[1] = (byte) 2;
        bArr[2] = (byte) (length & 255);
        bArr[3] = (byte) ((length >>> 8) & 255);
        bArr[4] = (byte) ((length >>> 16) & 255);
        bArr[5] = (byte) ((length >>> 24) & 255);
        bArr[6] = (byte) 12;
        bArr[7] = (byte) 0;
        bArr[8] = b17;
        if (b17 == 1) {
            int i17 = this.f531203e + 1;
            this.f531203e = i17;
            bArr[9] = (byte) (i17 & 255);
            bArr[10] = (byte) ((i17 >>> 8) & 255);
        }
        if (b17 == 2) {
            int i18 = this.f531202d + 1;
            this.f531202d = i18;
            bArr[9] = (byte) (i18 & 255);
            bArr[10] = (byte) ((i18 >>> 8) & 255);
        }
        bArr[11] = b18;
        byte[] x17 = kz5.v.x(bArr, data);
        zu1.a aVar = (zu1.a) this.f531201c;
        aVar.getClass();
        try {
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemoteWriter", "error happened in send data");
        }
        if (!aVar.f557221a) {
            return 0;
        }
        java.net.Socket socket = aVar.f557223c;
        if (socket == null || !socket.isConnected()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemoteWriter", "socket not connected");
            return -1;
        }
        java.io.OutputStream outputStream = aVar.f557222b;
        if (outputStream != null) {
            outputStream.write(x17);
        }
        java.io.OutputStream outputStream2 = aVar.f557222b;
        if (outputStream2 == null) {
            return 0;
        }
        outputStream2.flush();
        return 0;
    }
}
