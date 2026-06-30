package em4;

/* loaded from: classes8.dex */
public final class a implements f70.f {
    @Override // f70.f
    public void a(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        em4.b.a(path);
    }

    @Override // f70.f
    public byte[] b(int i17) {
        byte[] bytes = ((b81.a) ((y71.e) i95.n0.c(y71.e.class))).wi().getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        return bytes;
    }

    @Override // f70.f
    public byte[] c(java.lang.String path) {
        r45.vs2 vs2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        boolean z17 = em4.b.f336745a;
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0(path);
            if (L0 != null && (vs2Var = L0.f65874xb5f7102a) != null) {
                return vs2Var.mo14344x5f01b1f6();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TingRedDotManager", e17, "getReddotCtrlInfo exception", new java.lang.Object[0]);
        }
        return null;
    }

    @Override // f70.f
    public byte[] d(int i17) {
        return gz2.c.f359261a.g(0).mo14344x5f01b1f6();
    }

    @Override // f70.f
    public boolean e(int i17) {
        return i17 == 10;
    }

    @Override // f70.f
    public boolean f(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(path, "Listen.Entrance") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(path, "Listen.MentionEntrance") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(path, "Listen.Music.Bubble") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(path, "Listen.NonMusic.Bubble") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(path, "Listen.CircleX.Bubble") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(path, "Listen.SlideOver");
    }

    @Override // f70.f
    public void g(int i17, int i18, byte[] bArr) {
        ((hm4.c) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).f478670h.mo141623x754a37bb()).getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleSyncResponse businessType: ");
        sb6.append(i17);
        sb6.append(", scene: ");
        sb6.append(i18);
        sb6.append(", finderCommonReddotSyncResponse: ");
        sb6.append(bArr != null ? java.lang.Integer.valueOf(bArr.length) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingSyncExtension", sb6.toString());
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = hm4.c.f363827b;
        if (bArr == null || bArr.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingSyncExtension", "handleSyncResponse finderCommonReddotSyncResponse is null");
            java.util.Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((hm4.b) ((hm4.a) it.next())).getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingRedDotSyncHandler", "handleSyncResponseError scene: " + i18);
                if (i18 == 8) {
                    ((ef0.d4) ((qk.h9) i95.n0.c(qk.h9.class))).Ai(null);
                }
            }
            return;
        }
        try {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27402x4854e6e5 m114506x3136c9db = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27402x4854e6e5.m114506x3136c9db();
            m114506x3136c9db.m114519x60f45402(bArr);
            java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27398x1fd13c47> m114511x727bb4c2 = m114506x3136c9db.m114509x59bc66e().m114511x727bb4c2();
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = m114511x727bb4c2 != null ? java.lang.Integer.valueOf(m114511x727bb4c2.size()) : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingSyncExtension", "handleSyncResponse cmdListSize: %s", objArr);
            if (m114511x727bb4c2 != null) {
                for (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27398x1fd13c47 c27398x1fd13c47 : m114511x727bb4c2) {
                    java.util.Iterator it6 = copyOnWriteArraySet.iterator();
                    while (it6.hasNext()) {
                        hm4.a aVar = (hm4.a) it6.next();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c27398x1fd13c47);
                        ((hm4.b) aVar).b(c27398x1fd13c47, i18);
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TingSyncExtension", e17, "handleSyncResponse exception", new java.lang.Object[0]);
        }
    }

    @Override // f70.f
    public byte[] h(int i17) {
        i95.m c17 = i95.n0.c(zy2.ca.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.t source = zy2.t.Ting;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        int b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.h4.f183754a.b(source, null);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27423x3e8dddfa m115216x3136c9db = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27423x3e8dddfa.m115216x3136c9db();
        m115216x3136c9db.m115227x504fbd1b(b17 * 2);
        m115216x3136c9db.m115226x49576703(b17);
        return m115216x3136c9db.m115217x59bc66e().mo14344x5f01b1f6();
    }

    @Override // f70.f
    public java.lang.String i(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        return ((ef0.z3) ((qk.d9) i95.n0.c(qk.d9.class))).Ai(path);
    }

    @Override // f70.f
    public boolean j(int i17, bw5.e4 e4Var) {
        ((ef0.z3) ((qk.d9) i95.n0.c(qk.d9.class))).getClass();
        return hm4.c.f363826a.b();
    }

    @Override // f70.f
    public byte[] k(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        boolean z17 = em4.b.f336745a;
        try {
            r45.f03 I0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().I0(path);
            if (I0 != null) {
                return I0.mo14344x5f01b1f6();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TingRedDotManager", e17, "getFinderTipsShowInfoAtPath exception", new java.lang.Object[0]);
        }
        return null;
    }
}
