package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes10.dex */
public class r2 implements p012xc85e97e9.p103xe821e364.p104xd1075a44.z3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager f93744a;

    public r2(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager) {
        this.f93744a = layoutManager;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.z3
    public int a() {
        return this.f93744a.m8031xf39fff7a();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.z3
    public int b() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93744a;
        return layoutManager.m8018x1c4fb41d() - layoutManager.m8026xc96f6de6();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.z3
    public int c(android.view.View view) {
        return this.f93744a.m8016xfbd72d54(view) - ((android.view.ViewGroup.MarginLayoutParams) ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) view.getLayoutParams())).topMargin;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.z3
    public int d(android.view.View view) {
        return this.f93744a.m8010xd6b039cc(view) + ((android.view.ViewGroup.MarginLayoutParams) ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.z3
    /* renamed from: getChildAt */
    public android.view.View mo8220x6a486239(int i17) {
        return this.f93744a.m8007x6a486239(i17);
    }
}
