package al5;

/* loaded from: classes15.dex */
public class i3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ al5.n3 f87460d;

    public i3(al5.n3 n3Var) {
        this.f87460d = n3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        al5.n3 n3Var = this.f87460d;
        if (n3Var.f87501d.I != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SwipeBackLayout", "ashutest:: on popOut");
            if (n3Var.f87501d.getContext() instanceof android.app.Activity) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab c22649x858f5ab = n3Var.f87501d;
                if (c22649x858f5ab.f292978z != null) {
                    if (c22649x858f5ab.H) {
                        ((android.app.Activity) c22649x858f5ab.getContext()).getWindow().getDecorView().setBackground(n3Var.f87501d.f292978z);
                    }
                    n3Var.f87501d.f292978z = null;
                }
            }
            n3Var.f87501d.I.mo2295x59cfc822();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab c22649x858f5ab2 = n3Var.f87501d;
        c22649x858f5ab2.f292974v = false;
        c22649x858f5ab2.F = false;
    }
}
