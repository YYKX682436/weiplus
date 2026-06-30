package al5;

/* loaded from: classes15.dex */
public class k3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ al5.l3 f87473d;

    public k3(al5.l3 l3Var) {
        this.f87473d = l3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        al5.l3 l3Var = this.f87473d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab c22649x858f5ab = l3Var.f87479a.f87488e.f87501d;
        if (c22649x858f5ab.I != null) {
            if (c22649x858f5ab.getContext() instanceof android.app.Activity) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab c22649x858f5ab2 = l3Var.f87479a.f87488e.f87501d;
                if (c22649x858f5ab2.f292978z != null) {
                    if (c22649x858f5ab2.H) {
                        ((android.app.Activity) c22649x858f5ab2.getContext()).getWindow().getDecorView().setBackground(l3Var.f87479a.f87488e.f87501d.f292978z);
                    }
                    l3Var.f87479a.f87488e.f87501d.f292978z = null;
                }
            }
            l3Var.f87479a.f87488e.f87501d.I.mo2295x59cfc822();
        }
        l3Var.f87479a.f87488e.f87501d.e(1.0f);
        l3Var.f87479a.f87488e.f87501d.f292974v = false;
    }
}
