package fa;

/* loaded from: classes15.dex */
public class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fa.u f342158d;

    public j(fa.u uVar) {
        this.f342158d = uVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd.C2707x19559f2b c2707x19559f2b = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd.C2707x19559f2b) view;
        fa.u uVar = this.f342158d;
        fa.l lVar = uVar.f342171h;
        if (lVar != null) {
            lVar.f342161f = true;
        }
        o.u mo2574xc2025ad3 = c2707x19559f2b.mo2574xc2025ad3();
        boolean q17 = uVar.f342169f.q(mo2574xc2025ad3, uVar, 0);
        if (mo2574xc2025ad3 != null && mo2574xc2025ad3.isCheckable() && q17) {
            uVar.f342171h.y(mo2574xc2025ad3);
        }
        fa.l lVar2 = uVar.f342171h;
        if (lVar2 != null) {
            lVar2.f342161f = false;
        }
        uVar.c(false);
    }
}
