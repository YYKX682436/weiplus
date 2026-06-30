package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes15.dex */
public class d2 implements p012xc85e97e9.p103xe821e364.p104xd1075a44.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f93532a;

    public d2(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        this.f93532a = c1163xf1deaba4;
    }

    public int a() {
        return this.f93532a.getChildCount();
    }

    public void b(int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f93532a;
        android.view.View childAt = c1163xf1deaba4.getChildAt(i17);
        if (childAt != null) {
            c1163xf1deaba4.W(childAt);
            childAt.clearAnimation();
        }
        c1163xf1deaba4.removeViewAt(i17);
    }
}
