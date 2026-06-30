package hr3;

/* loaded from: classes11.dex */
public class li implements uc0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f365316a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hr3.mi f365317b;

    public li(hr3.mi miVar, java.lang.CharSequence charSequence) {
        this.f365317b = miVar;
        this.f365316a = charSequence;
    }

    @Override // uc0.p
    public void a(java.lang.String str) {
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        hr3.mi miVar = this.f365317b;
        if (!K0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a activityC16872x6384268a = miVar.f365347e;
            activityC16872x6384268a.E[3] = 1;
            activityC16872x6384268a.getClass();
        }
        miVar.f365347e.f235379h.m79040x765074af(((java.lang.Object) this.f365316a) + str);
        miVar.f365347e.f235379h.clearFocus();
        android.view.View view = miVar.f365347e.f235380i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$WriteRemarkSpan$1", "onClick", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$WriteRemarkSpan$1", "onClick", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
