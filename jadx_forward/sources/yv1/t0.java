package yv1;

/* loaded from: classes12.dex */
public final class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f547693d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab f547694e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yv1.n0 f547695f;

    public t0(java.util.List list, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab, yv1.n0 n0Var) {
        this.f547693d = list;
        this.f547694e = c26987xeef691ab;
        this.f547695f = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Delete image query, talker count: ");
        java.util.List<java.lang.String> list = this.f547693d;
        sb6.append(list.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanService", sb6.toString());
        try {
            qk.x7 x7Var = (qk.x7) i95.n0.c(qk.x7.class);
            com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab = this.f547694e;
            yv1.n0 n0Var = this.f547695f;
            for (java.lang.String str : list) {
                if (c26987xeef691ab != null) {
                    c26987xeef691ab.m108011xf4ed245c();
                }
                ((c61.ec) x7Var).Ai(str);
                int[] iArr = n0Var.f547651i;
                iArr[2] = iArr[2] + 1;
                n0Var.a();
            }
        } catch (com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26993xde8292f unused) {
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanService", "Done delete image query");
    }
}
