package qu0;

/* loaded from: classes5.dex */
public final class a extends qu0.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qu0.i f448252a;

    public a(qu0.i iVar) {
        this.f448252a = iVar;
    }

    @Override // uu0.b
    public void a(byte[] bArr, int i17, boolean z17) {
        if (bArr == null) {
            return;
        }
        vu0.k kVar = this.f448252a.f448263a;
        kVar.getClass();
        ru0.g gVar = kVar.f521644f;
        pp0.s0 s0Var = null;
        if (gVar == null) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            gVar = null;
        }
        if (gVar == null) {
            return;
        }
        int length = gVar.f481207e.length;
        int i18 = length - gVar.f481205c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SpeechRequestData", "putBufferInfo: containerSize = " + length + ", bufferSize = " + gVar.f481205c + " size " + i17);
        if (i18 < i17) {
            int i19 = gVar.f481205c;
            if (length != i19) {
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            }
            byte[] bArr2 = new byte[i19 + i17];
            if (i19 != 0) {
                java.lang.System.arraycopy(gVar.f481207e, 0, bArr2, 0, i19);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SpeechRequestData", "putBufferInfo: copy old bufferSize " + gVar.f481205c);
            }
            gVar.f481207e = bArr2;
        }
        java.lang.System.arraycopy(bArr, 0, gVar.f481207e, gVar.f481205c, i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SpeechRequestData", "putBufferInfo: copy new destPos " + gVar.f481205c + " size " + i17);
        gVar.f481205c = gVar.f481205c + i17;
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        boolean z18 = uptimeMillis - gVar.f481206d >= 500;
        if (z18) {
            gVar.f481206d = uptimeMillis;
        }
        if (z18 || z17) {
            pp0.s0 s0Var2 = kVar.f521639a;
            if (s0Var2 == null) {
                java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            } else {
                s0Var = s0Var2;
            }
            if (s0Var == null) {
                return;
            }
            java.lang.String str4 = gVar.f481203a;
            int i27 = gVar.f481204b;
            gVar.f481204b = i27 + 1;
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(gVar.f481205c);
            allocateDirect.put(gVar.f481207e, 0, gVar.f481205c);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SpeechRequestData", "getByteBuffer: reset bufferSize " + gVar.f481205c);
            gVar.f481205c = 0;
            kVar.f521642d.put("session_id", str4);
            kVar.f521642d.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54497x63979feb, java.lang.String.valueOf(i27));
            kVar.f521642d.put("is_session_end", z17 ? "1" : "0");
            if (z17) {
                kVar.f521645g.put(str4, java.lang.Integer.valueOf(i27));
                kVar.f521643e.c(str4, vu0.u.f521695g);
            } else {
                kVar.f521645g.put(str4, -1);
                kVar.f521643e.c(str4, vu0.u.f521694f);
            }
            java.util.HashMap postParams = kVar.f521642d;
            com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4197x7df5f634 iLinkAppRequest = kVar.f521641c;
            vu0.d dVar = new vu0.d(kVar, str4, gVar, z17);
            dz0.s2 s2Var = (dz0.s2) s0Var;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(postParams, "postParams");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iLinkAppRequest, "iLinkAppRequest");
            synchronized (s2Var) {
                if (s2Var.f326539b) {
                    return;
                }
                s2Var.f326538a.g(allocateDirect, postParams, iLinkAppRequest, "getspeechrecognition", dVar);
            }
        }
    }

    @Override // uu0.b
    public void b(byte[] bArr, int i17, boolean z17) {
        if (bArr == null) {
            return;
        }
        vu0.r0 r0Var = this.f448252a.f448264b;
        r0Var.getClass();
        int i18 = i17 / 2;
        int i19 = i18 / 1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i27 = 0;
        int i28 = 0;
        while (i27 < i18) {
            int i29 = i27 * 2;
            int abs = java.lang.Math.abs((bArr[i29 + 1] << 8) | (bArr[i29] & 255));
            if (abs > i28) {
                i28 = abs;
            }
            i27++;
            if (i27 % i19 == 0) {
                arrayList.add(java.lang.Integer.valueOf(i28));
                i28 = 0;
            }
        }
        java.lang.Integer num = (java.lang.Integer) kz5.n0.m0(arrayList);
        int intValue = num != null ? num.intValue() : 0;
        int i37 = r0Var.f521680b;
        float f17 = intValue / i37;
        if (intValue > i37) {
            r0Var.f521680b = intValue;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = r0Var.f521681c;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(java.lang.Float.valueOf((((java.lang.Number) it.next()).intValue() * 1.0f) / r0Var.f521680b));
        }
        copyOnWriteArrayList.addAll(arrayList2);
        float[] P0 = kz5.n0.P0(copyOnWriteArrayList);
        if (fy0.i.a()) {
            r0Var.f521679a.J4(P0, f17);
        } else {
            fy0.i.b(new vu0.q0(r0Var, P0, f17));
        }
    }

    @Override // uu0.b
    public void c(int i17, java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        ru0.b bVar;
        boolean booleanValue = bool.booleanValue();
        qu0.i iVar = this.f448252a;
        iVar.f448264b.getClass();
        iVar.f448263a.f521644f = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJAudioManager", "onStop: filePath " + str + "  silkFilePath " + str2);
        java.lang.String str3 = iVar.a().f512781f;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(uu0.c.e().f512742d.f512780e, "wav") || str == null) {
            bVar = new ru0.b(str3, str, str2, null);
        } else {
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
            if (r6Var.m() && r6Var.A() && r6Var.C() > 0) {
                java.lang.String a17 = uu0.l.a("wav", r6Var.m82467xfb82e301() + "_quality");
                boolean bj6 = ((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).bj();
                com.p314xaae8f345.p457x3304c6.p479x4179489f.C4174xb63577dd c4174xb63577dd = new com.p314xaae8f345.p457x3304c6.p479x4179489f.C4174xb63577dd();
                c4174xb63577dd.f129968a = true;
                c4174xb63577dd.f129969b = com.p314xaae8f345.p457x3304c6.p479x4179489f.h.Points;
                c4174xb63577dd.f129971d = new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e[]{new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(80.0f, 6.0f), new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(120.0f, 0.0f), new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(2400.0f, 0.0f), new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(2800.0f, 6.0f)};
                c4174xb63577dd.f129972e = true;
                c4174xb63577dd.f129973f = com.p314xaae8f345.p457x3304c6.p479x4179489f.g.NewPeak;
                c4174xb63577dd.f129974g = 0.0d;
                c4174xb63577dd.f129975h = false;
                c4174xb63577dd.f129976i = true;
                c4174xb63577dd.f129977j = -12.0f;
                c4174xb63577dd.f129978k = -40.0f;
                c4174xb63577dd.f129979l = 2.0f;
                c4174xb63577dd.f129980m = 0.2f;
                c4174xb63577dd.f129981n = 1.0f;
                c4174xb63577dd.f129982o = true;
                c4174xb63577dd.f129983p = false;
                c4174xb63577dd.f129984q = true;
                c4174xb63577dd.f129985r = com.p314xaae8f345.p457x3304c6.p479x4179489f.i.EBUR128;
                c4174xb63577dd.f129986s = -18.0d;
                ru0.c[] cVarArr = ru0.c.f481192d;
                c4174xb63577dd.f129987t = 1 == iVar.f448269g;
                c4174xb63577dd.f129988u = bj6;
                c4174xb63577dd.f129989v = -18.0f;
                c4174xb63577dd.f129990w = -40.0f;
                c4174xb63577dd.f129991x = -10.0f;
                bVar = new ru0.b(str3, a17, str2, com.p314xaae8f345.p457x3304c6.p479x4179489f.C4175x22639adb.b(str, a17, c4174xb63577dd));
            } else {
                bVar = new ru0.b(str3, str, str2, null);
            }
        }
        java.lang.String str4 = iVar.a().f512781f;
        if (str4 != null) {
            iVar.f448267e.put(str4, bVar);
        }
        iVar.f448268f.c(i17, bVar.f481189b, bVar.f481190c, java.lang.Boolean.valueOf(booleanValue));
    }

    @Override // uu0.b
    public void j(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJAudioManager", "onError: errType " + i17);
        this.f448252a.f448268f.getClass();
    }

    @Override // uu0.b
    /* renamed from: onStart */
    public void mo160890xb05099c3() {
        qu0.i iVar = this.f448252a;
        qu0.g gVar = iVar.f448268f;
        uu0.k kVar = uu0.c.e().f512742d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(kVar, "getRecordParam(...)");
        gVar.d(kVar);
        java.lang.String str = uu0.c.e().f512742d.f512781f;
        if (str != null) {
            vu0.r0 r0Var = iVar.f448264b;
            r0Var.getClass();
            r0Var.f521681c.clear();
            vu0.k kVar2 = iVar.f448263a;
            kVar2.getClass();
            kVar2.f521644f = new ru0.g(str);
            kVar2.f521643e.c(str, vu0.u.f521694f);
        }
    }
}
