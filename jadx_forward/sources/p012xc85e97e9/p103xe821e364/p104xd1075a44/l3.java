package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes15.dex */
public class l3 extends n3.c {

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.m3 f93657e;

    public l3(p012xc85e97e9.p103xe821e364.p104xd1075a44.m3 m3Var) {
        this.f93657e = m3Var;
    }

    @Override // n3.c
    /* renamed from: onInitializeAccessibilityNodeInfo */
    public void mo7102x1bd2f9af(android.view.View view, o3.l lVar) {
        super.mo7102x1bd2f9af(view, lVar);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.m3 m3Var = this.f93657e;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = m3Var.f93676e;
        if (!c1163xf1deaba4.f93446z || c1163xf1deaba4.I || c1163xf1deaba4.f93423g.g()) {
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = m3Var.f93676e;
        if (c1163xf1deaba42.getLayoutManager() != null) {
            c1163xf1deaba42.getLayoutManager().m8063x96481acd(view, lVar);
        }
    }

    @Override // n3.c
    /* renamed from: performAccessibilityAction */
    public boolean mo7240xcdbe3403(android.view.View view, int i17, android.os.Bundle bundle) {
        boolean z17 = true;
        if (super.mo7240xcdbe3403(view, i17, bundle)) {
            return true;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.m3 m3Var = this.f93657e;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = m3Var.f93676e;
        if (c1163xf1deaba4.f93446z && !c1163xf1deaba4.I && !c1163xf1deaba4.f93423g.g()) {
            z17 = false;
        }
        if (!z17) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = m3Var.f93676e;
            if (c1163xf1deaba42.getLayoutManager() != null) {
                return c1163xf1deaba42.getLayoutManager().m8073x100a59f9(view, i17, bundle);
            }
        }
        return false;
    }
}
