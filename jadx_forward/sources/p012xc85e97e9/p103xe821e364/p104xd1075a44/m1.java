package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes15.dex */
public class m1 {

    /* renamed from: b, reason: collision with root package name */
    public int f93662b;

    /* renamed from: c, reason: collision with root package name */
    public int f93663c;

    /* renamed from: d, reason: collision with root package name */
    public int f93664d;

    /* renamed from: e, reason: collision with root package name */
    public int f93665e;

    /* renamed from: f, reason: collision with root package name */
    public int f93666f;

    /* renamed from: g, reason: collision with root package name */
    public int f93667g;

    /* renamed from: i, reason: collision with root package name */
    public int f93669i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f93671k;

    /* renamed from: a, reason: collision with root package name */
    public boolean f93661a = true;

    /* renamed from: h, reason: collision with root package name */
    public int f93668h = 0;

    /* renamed from: j, reason: collision with root package name */
    public java.util.List f93670j = null;

    public void a(android.view.View view) {
        int b17;
        int size = this.f93670j.size();
        android.view.View view2 = null;
        int i17 = Integer.MAX_VALUE;
        for (int i18 = 0; i18 < size; i18++) {
            android.view.View view3 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) this.f93670j.get(i18)).f3639x46306858;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) view3.getLayoutParams();
            if (view3 != view && !layoutParams.d() && (b17 = (layoutParams.b() - this.f93664d) * this.f93665e) >= 0 && b17 < i17) {
                view2 = view3;
                if (b17 == 0) {
                    break;
                } else {
                    i17 = b17;
                }
            }
        }
        if (view2 == null) {
            this.f93664d = -1;
        } else {
            this.f93664d = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) view2.getLayoutParams()).b();
        }
    }

    public android.view.View b(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var) {
        java.util.List list = this.f93670j;
        if (list == null) {
            android.view.View f17 = z2Var.f(this.f93664d);
            this.f93664d += this.f93665e;
            return f17;
        }
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            android.view.View view = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) this.f93670j.get(i17)).f3639x46306858;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) view.getLayoutParams();
            if (!layoutParams.d() && this.f93664d == layoutParams.b()) {
                a(view);
                return view;
            }
        }
        return null;
    }
}
