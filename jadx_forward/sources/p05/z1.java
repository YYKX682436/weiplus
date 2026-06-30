package p05;

/* loaded from: classes10.dex */
public final class z1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p05.w0 f432273d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p05.d2 f432274e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(p05.w0 w0Var, p05.d2 d2Var) {
        super(0);
        this.f432273d = w0Var;
        this.f432274e = d2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        long j17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#oldWayAppend begin ");
        p05.w0 w0Var = this.f432273d;
        sb6.append(w0Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePkGiftEffect", sb6.toString());
        p05.d2 d2Var = this.f432274e;
        if (!d2Var.f432020b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePkGiftEffect", "This effect is not attached!");
        }
        if (d2Var.f432020b) {
            java.util.Iterator it = d2Var.f432024f.iterator();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
                p05.s1 s1Var = (p05.s1) next;
                if (java.lang.System.currentTimeMillis() - s1Var.f432219f > 8000) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("#sdkResponseTimeoutCheck ptr=");
                    long j18 = s1Var.f432214a;
                    sb7.append(j18);
                    sb7.append(" lastmod=");
                    sb7.append(s1Var.f432219f);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivePkGiftEffect", sb7.toString());
                    rh0.d0 d0Var = d2Var.f432021c;
                    if (d0Var != null) {
                        ((p05.l4) d0Var).t(j18);
                    }
                    it.remove();
                }
            }
            rh0.d0 d0Var2 = d2Var.f432021c;
            if (d0Var2 != null) {
                j17 = ((p05.l4) d0Var2).d(w0Var.f432250b + "/Lua");
            } else {
                j17 = -1;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePkGiftEffect", "#oldWayAppend " + w0Var.f432249a + ' ' + w0Var.f432250b + " new gl_ptr is:" + j17);
            if (j17 != -1) {
                d2Var.e(100L, new p05.y1(d2Var, j17, w0Var));
            }
        }
        return jz5.f0.f384359a;
    }
}
