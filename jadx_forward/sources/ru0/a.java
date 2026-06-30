package ru0;

/* loaded from: classes5.dex */
public abstract class a {
    public static final java.util.List a(org.json.JSONObject jSONObject, boolean z17) {
        org.json.JSONArray optJSONArray;
        long j17;
        long j18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jSONObject, "<this>");
        java.lang.String optString = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24);
        int i17 = 0;
        boolean z18 = optString == null || optString.length() == 0;
        kz5.p0 p0Var = kz5.p0.f395529d;
        if (z18 || (optJSONArray = jSONObject.optJSONArray("words_info")) == null) {
            return p0Var;
        }
        java.util.List a17 = ru0.t.a(optJSONArray, "word", "begin_time", "end_time", z17);
        if (((java.util.ArrayList) a17).isEmpty()) {
            return p0Var;
        }
        java.lang.String optString2 = jSONObject.optString("lang");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        java.lang.String e17 = ru0.t.e(optString, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
        if (e17.length() <= ru0.t.c(optString2)) {
            r45.le4 le4Var = new r45.le4();
            le4Var.f460912f = e17;
            le4Var.f460913g = optString2;
            le4Var.f460910d = ((ru0.n) kz5.n0.X(a17)).f481224b;
            le4Var.f460911e = ((ru0.n) kz5.n0.i0(a17)).f481225c - ((ru0.n) kz5.n0.X(a17)).f481224b;
            return kz5.b0.c(le4Var);
        }
        java.lang.String optString3 = jSONObject.optString("lang");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString3, "optString(...)");
        java.util.List b17 = ru0.t.b(a17, optString3, e17.length());
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(b17, 10));
        for (java.lang.Object obj : b17) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            ru0.f fVar = (ru0.f) obj;
            ru0.f fVar2 = (ru0.f) kz5.n0.a0(b17, i18);
            ru0.f fVar3 = (ru0.f) kz5.n0.a0(b17, i17 - 1);
            if (fVar2 == null) {
                j17 = fVar.f481202c;
            } else {
                long j19 = fVar.f481202c;
                long j27 = (fVar2.f481201b - j19) / 2;
                if (j27 > 100) {
                    j27 = 100;
                }
                j17 = j19 + j27;
            }
            if (fVar3 == null) {
                j18 = fVar.f481201b - 100;
                if (j18 < 0) {
                    j18 = 0;
                }
            } else {
                long j28 = fVar.f481201b;
                long j29 = (fVar3.f481202c - j28) / 2;
                j18 = j28 - (j29 <= 100 ? j29 : 100L);
            }
            r45.le4 le4Var2 = new r45.le4();
            le4Var2.f460912f = fVar.f481200a;
            le4Var2.f460910d = j18;
            le4Var2.f460911e = j17 - j18;
            arrayList.add(le4Var2);
            i17 = i18;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.String b(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713) {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951 c4189xeb0c3951;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c4190xd8dd3713, "<this>");
        if (c4190xd8dd3713 instanceof ug.n) {
            return ((ug.n) c4190xd8dd3713).c();
        }
        if (!(c4190xd8dd3713 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951) || (D = (c4189xeb0c3951 = (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951) c4190xd8dd3713).D()) == null) {
            return null;
        }
        return com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951.N1(c4189xeb0c3951, D);
    }

    public static java.nio.ByteBuffer c(byte[] bArr, java.lang.Integer num, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            num = null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bArr, "<this>");
        int intValue = num != null ? num.intValue() : com.p314xaae8f345.mm.p963x7eba77a9.C11150x241988a2.m48251x1fdab703(new byte[]{bArr[0]}, 0L);
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            try {
                long m48245x2f5913fd = com.p314xaae8f345.mm.p963x7eba77a9.C11150x241988a2.m48245x2f5913fd(intValue, bArr, bArr.length, 0L);
                byte[] bArr2 = new byte[android.media.AudioTrack.getMinBufferSize(intValue, 4, 2) * 2];
                short s17 = (short) ((intValue * 20) / 1000);
                int i18 = 1;
                while (i18 > 0) {
                    i18 = com.p314xaae8f345.mm.p963x7eba77a9.C11150x241988a2.m48247xb934ae02(bArr2, s17, m48245x2f5913fd);
                    if (i18 == 0 || i18 == 1) {
                        byteArrayOutputStream.write(bArr2, 0, s17 * 2);
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Audio_Ext", "silk2pcmBuffer res " + com.p314xaae8f345.mm.p963x7eba77a9.C11150x241988a2.m48246xd1cf9af6(m48245x2f5913fd));
                java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
                vz5.b.a(byteArrayOutputStream, null);
                return wrap;
            } finally {
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Audio_Ext", "silk2wavFile", e17);
            return null;
        }
    }

    public static final java.nio.ByteBuffer d(com.p314xaae8f345.mm.vfs.r6 r6Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6Var, "<this>");
        java.io.InputStream C = com.p314xaae8f345.mm.vfs.w6.C(r6Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(C, "openRead(...)");
        byte[] c17 = vz5.a.c(C instanceof java.io.BufferedInputStream ? (java.io.BufferedInputStream) C : new java.io.BufferedInputStream(C, 8192));
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(c17.length);
        allocateDirect.put(c17);
        return allocateDirect;
    }

    public static final void e(java.nio.ByteBuffer byteBuffer, java.lang.String filePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(byteBuffer, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(filePath));
        if (r6Var.m()) {
            r6Var.l();
        }
        r6Var.k();
        int capacity = byteBuffer.capacity();
        byte[] bArr = new byte[capacity];
        byteBuffer.rewind();
        byteBuffer.get(bArr);
        com.p314xaae8f345.mm.vfs.w6.S(filePath, bArr, 0, capacity);
    }

    public static final yu0.t f(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713, com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2 info) {
        dw0.a aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c4190xd8dd3713, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.lang.String a17 = dw0.f.a(info);
        java.lang.String str = info.f129759d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getMaterialName(...)");
        if (dw0.f.b(info)) {
            aVar = dw0.a.f325612f;
        } else {
            java.lang.String str2 = info.f129757b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getMaterialID(...)");
            dw0.a aVar2 = dw0.a.f325611e;
            aVar = r26.i0.y(str2, "publisher_speech_enhance_", false) ? dw0.a.f325613g : dw0.a.f325611e;
        }
        return g(c4190xd8dd3713, a17, str, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final yu0.t g(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713, java.lang.String assignRoleID, java.lang.String assignRoleName, dw0.a materialPrefix) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c4190xd8dd3713, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(assignRoleID, "assignRoleID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(assignRoleName, "assignRoleName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialPrefix, "materialPrefix");
        if (c4190xd8dd3713 instanceof ug.n) {
            com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = c4190xd8dd3713.f130065a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c3971x241f78, "getSegmentID(...)");
            ug.n nVar = (ug.n) c4190xd8dd3713;
            java.lang.String e17 = nVar.e();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getAudioFilePath(...)");
            java.util.ArrayList d17 = kz5.c0.d(new com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4179xedb0cdf9(nVar.b(), new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5, c4190xd8dd3713.z())));
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a z17 = c4190xd8dd3713.z();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(z17, "getPresentationDuration(...)");
            return new yu0.t(c3971x241f78, assignRoleID, assignRoleName, e17, d17, z17, materialPrefix);
        }
        if (!(c4190xd8dd3713 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951)) {
            return null;
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951 c4189xeb0c3951 = (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951) c4190xd8dd3713;
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f782 = c4189xeb0c3951.f130065a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c3971x241f782, "getSegmentID(...)");
        java.lang.String Q1 = c4189xeb0c3951.Q1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q1, "getOriginNarrationFilePath(...)");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4179xedb0cdf9[] P1 = c4189xeb0c3951.P1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(P1, "getCaptionItems(...)");
        java.util.List z07 = kz5.z.z0(P1);
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a p07 = c4189xeb0c3951.p0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p07, "getTotalDurationIncludingExpandable(...)");
        return new yu0.t(c3971x241f782, assignRoleID, assignRoleName, Q1, z07, p07, materialPrefix);
    }
}
