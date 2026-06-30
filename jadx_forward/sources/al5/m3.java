package al5;

/* loaded from: classes15.dex */
public class m3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f87487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ al5.n3 f87488e;

    public m3(al5.n3 n3Var, boolean z17) {
        this.f87488e = n3Var;
        this.f87487d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f87487d;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        al5.n3 n3Var = this.f87488e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SwipeBackLayout", "on Complete, result %B, releaseLeft %d", valueOf, java.lang.Integer.valueOf(n3Var.f87499b));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab c22649x858f5ab = n3Var.f87501d;
        c22649x858f5ab.f292971s = z17;
        if (!z17) {
            c22649x858f5ab.f292974v = false;
        } else if (n3Var.f87499b > 0) {
            c22649x858f5ab.e(0.0f);
        } else {
            c22649x858f5ab.e(1.0f);
        }
        c22649x858f5ab.d(z17);
        if (z17 && c22649x858f5ab.f292975w) {
            int i17 = n3Var.f87499b;
            if (i17 == 0) {
                com.p314xaae8f345.mm.ui.p2740x696c9db.l5.a(c22649x858f5ab.f292964i, 200L, 0.0f, 0.0f, new al5.j3(this));
            } else {
                com.p314xaae8f345.mm.ui.p2740x696c9db.l5.a(c22649x858f5ab.f292964i, 200L, i17, 0.0f, new al5.l3(this));
                int i18 = n3Var.f87499b;
                if (!c22649x858f5ab.f292965m.f373187y) {
                    al5.a3.a(true, i18, true);
                }
            }
        }
        c22649x858f5ab.f292975w = false;
    }
}
