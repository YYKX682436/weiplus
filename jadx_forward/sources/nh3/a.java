package nh3;

/* loaded from: classes8.dex */
public abstract class a implements f70.f {
    @Override // f70.f
    public void a(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N(path);
    }

    @Override // f70.f
    public /* bridge */ /* synthetic */ byte[] b(int i17) {
        return null;
    }

    @Override // f70.f
    public byte[] c(java.lang.String path) {
        r45.vs2 vs2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0(path);
        if (L0 == null || (vs2Var = L0.f65874xb5f7102a) == null) {
            return null;
        }
        return vs2Var.mo14344x5f01b1f6();
    }

    @Override // f70.f
    public /* bridge */ /* synthetic */ byte[] d(int i17) {
        return null;
    }

    @Override // f70.f
    public void g(int i17, int i18, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMEcRedDotHandler", "businessType=" + i17 + " scene=" + i18);
        if (bArr == null || bArr.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MMEcRedDotHandler", "handleSyncResponse finderCommonReddotSyncResponse is null");
            return;
        }
        try {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27402x4854e6e5 m114506x3136c9db = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27402x4854e6e5.m114506x3136c9db();
            m114506x3136c9db.m114519x60f45402(bArr);
            java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27398x1fd13c47> m114511x727bb4c2 = m114506x3136c9db.m114509x59bc66e().m114511x727bb4c2();
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = m114511x727bb4c2 != null ? java.lang.Integer.valueOf(m114511x727bb4c2.size()) : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMEcRedDotHandler", "handleSyncResponse cmdListSize: %s", objArr);
            if (m114511x727bb4c2 != null) {
                for (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27398x1fd13c47 c27398x1fd13c47 : m114511x727bb4c2) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c27398x1fd13c47);
                    l(c27398x1fd13c47, i18);
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MMEcRedDotHandler", e17, "handleSyncResponse exception", new java.lang.Object[0]);
        }
    }

    @Override // f70.f
    public java.lang.String i(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        return null;
    }

    @Override // f70.f
    public byte[] k(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        r45.f03 I0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().I0(path);
        if (I0 != null) {
            return I0.mo14344x5f01b1f6();
        }
        return null;
    }

    public abstract void l(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27398x1fd13c47 c27398x1fd13c47, int i17);
}
