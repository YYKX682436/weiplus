package ku4;

/* loaded from: classes7.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394054e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f394055f;

    public k(java.lang.String str, java.lang.String str2, int i17) {
        this.f394053d = str;
        this.f394054e = str2;
        this.f394055f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f394053d;
        try {
            boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(str);
            int i17 = this.f394055f;
            java.lang.String appId = this.f394054e;
            if (j17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8 y8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8(str);
                y8Var.a();
                int b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.a.b(y8Var);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(20780, appId, 0, java.lang.Integer.valueOf(b17), 0, java.lang.Integer.valueOf(i17), 1);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(20780, appId, 0, 0, 3, java.lang.Integer.valueOf(i17), 1);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebCanvasStorageLogic", e17, "readPkgVersionAndReport exception", new java.lang.Object[0]);
        }
    }
}
