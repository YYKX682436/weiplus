package os3;

/* loaded from: classes8.dex */
public class x4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ os3.y4 f429784d;

    public x4(os3.y4 y4Var) {
        this.f429784d = y4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        os3.y4 y4Var = this.f429784d;
        int mo120141x964f6f4a = (int) (y4Var.f429792a.f236461g.mo120141x964f6f4a() * y4Var.f429792a.f236461g.mo120151x7520af94());
        y4Var.f429792a.f236461g.mo120141x964f6f4a();
        y4Var.f429792a.f236461g.getHeight();
        y4Var.f429792a.f236461g.mo120151x7520af94();
        if (java.lang.Math.abs(mo120141x964f6f4a - y4Var.f429792a.f236461g.getHeight()) < 10) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.C19488x4bf6d262) ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.e2) y4Var.f429792a.f236461g)).I0(true);
        }
    }
}
