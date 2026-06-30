package hr3;

/* loaded from: classes11.dex */
public class fh implements uc0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f365097a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hr3.gh f365098b;

    public fh(hr3.gh ghVar, java.lang.CharSequence charSequence) {
        this.f365098b = ghVar;
        this.f365097a = charSequence;
    }

    @Override // uc0.p
    public void a(java.lang.String str) {
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        hr3.gh ghVar = this.f365098b;
        if (!K0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9 activityC16871x34c232c9 = ghVar.f365132e;
            activityC16871x34c232c9.f235372z[3] = 1;
            activityC16871x34c232c9.E = true;
        }
        ghVar.f365132e.f235350h.m79040x765074af(((java.lang.Object) this.f365097a) + str);
        ghVar.f365132e.f235350h.clearFocus();
        android.view.View view = ghVar.f365132e.f235351i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$WriteRemarkSpan$1", "onClick", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$WriteRemarkSpan$1", "onClick", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
