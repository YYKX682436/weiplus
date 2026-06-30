package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes15.dex */
public class m3 extends n3.c {

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f93676e;

    /* renamed from: f, reason: collision with root package name */
    public final n3.c f93677f = new p012xc85e97e9.p103xe821e364.p104xd1075a44.l3(this);

    public m3(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        this.f93676e = c1163xf1deaba4;
    }

    public n3.c b() {
        return this.f93677f;
    }

    @Override // n3.c
    /* renamed from: onInitializeAccessibilityEvent */
    public void mo7239x9d5dd31b(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.mo7239x9d5dd31b(view, accessibilityEvent);
        accessibilityEvent.setClassName(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.class.getName());
        if (view instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f93676e;
            if (!c1163xf1deaba4.f93446z || c1163xf1deaba4.I || c1163xf1deaba4.f93423g.g()) {
                return;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) view;
            if (c1163xf1deaba42.getLayoutManager() != null) {
                c1163xf1deaba42.getLayoutManager().mo7938x9d5dd31b(accessibilityEvent);
            }
        }
    }

    @Override // n3.c
    /* renamed from: onInitializeAccessibilityNodeInfo */
    public void mo7102x1bd2f9af(android.view.View view, o3.l lVar) {
        super.mo7102x1bd2f9af(view, lVar);
        lVar.n(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.class.getName());
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f93676e;
        if ((!c1163xf1deaba4.f93446z || c1163xf1deaba4.I || c1163xf1deaba4.f93423g.g()) || c1163xf1deaba4.getLayoutManager() == null) {
            return;
        }
        c1163xf1deaba4.getLayoutManager().m8062x1bd2f9af(lVar);
    }

    @Override // n3.c
    /* renamed from: performAccessibilityAction */
    public boolean mo7240xcdbe3403(android.view.View view, int i17, android.os.Bundle bundle) {
        boolean z17 = true;
        if (super.mo7240xcdbe3403(view, i17, bundle)) {
            return true;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f93676e;
        if (c1163xf1deaba4.f93446z && !c1163xf1deaba4.I && !c1163xf1deaba4.f93423g.g()) {
            z17 = false;
        }
        if (z17 || c1163xf1deaba4.getLayoutManager() == null) {
            return false;
        }
        return c1163xf1deaba4.getLayoutManager().m8071xcdbe3403(i17, bundle);
    }
}
