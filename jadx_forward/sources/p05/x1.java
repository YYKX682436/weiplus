package p05;

/* loaded from: classes10.dex */
public final class x1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p05.w0 f432259d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p05.d2 f432260e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(p05.w0 w0Var, p05.d2 d2Var) {
        super(0);
        this.f432259d = w0Var;
        this.f432260e = d2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object obj;
        long j17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#newWayAppend begin ");
        p05.w0 w0Var = this.f432259d;
        sb6.append(w0Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePkGiftEffect", sb6.toString());
        p05.d2 d2Var = this.f432260e;
        if (!d2Var.f432020b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePkGiftEffect", "This effect is not attached!");
        }
        if (d2Var.f432020b) {
            java.util.Iterator it = d2Var.f432024f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((p05.s1) obj).f432215b, w0Var.f432249a)) {
                    break;
                }
            }
            p05.s1 s1Var = (p05.s1) obj;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("#newWayAppend same_ptr=");
            sb7.append(s1Var != null ? java.lang.Long.valueOf(s1Var.f432214a) : null);
            sb7.append(" same_stage=");
            sb7.append(s1Var != null ? java.lang.Integer.valueOf(s1Var.f432217d) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePkGiftEffect", sb7.toString());
            if (s1Var == null) {
                rh0.d0 d0Var = d2Var.f432021c;
                if (d0Var != null) {
                    j17 = ((p05.l4) d0Var).d(w0Var.f432250b + "/Lua");
                } else {
                    j17 = -1;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePkGiftEffect", "#newWayAppend " + w0Var.f432249a + ' ' + w0Var.f432250b + " new gl_ptr is:" + j17);
                if (j17 != -1) {
                    d2Var.e(100L, new p05.v1(d2Var, j17, w0Var));
                }
            } else {
                d2Var.e(100L, new p05.w1(d2Var, s1Var, w0Var));
            }
        }
        return jz5.f0.f384359a;
    }
}
