package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes10.dex */
public class q2 implements p012xc85e97e9.p103xe821e364.p104xd1075a44.z3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager f93734a;

    public q2(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager) {
        this.f93734a = layoutManager;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.z3
    public int a() {
        return this.f93734a.m8028x805c2682();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.z3
    public int b() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93734a;
        return layoutManager.m8037x755bd410() - layoutManager.m8029x8b7f0b01();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.z3
    public int c(android.view.View view) {
        return this.f93734a.m8012x7f0ab3e8(view) - ((android.view.ViewGroup.MarginLayoutParams) ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) view.getLayoutParams())).leftMargin;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.z3
    public int d(android.view.View view) {
        return this.f93734a.m8015x62a22a5b(view) + ((android.view.ViewGroup.MarginLayoutParams) ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) view.getLayoutParams())).rightMargin;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.z3
    /* renamed from: getChildAt */
    public android.view.View mo8220x6a486239(int i17) {
        return this.f93734a.m8007x6a486239(i17);
    }
}
