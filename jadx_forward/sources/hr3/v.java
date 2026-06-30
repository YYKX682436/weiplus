package hr3;

/* loaded from: classes11.dex */
public class v implements uc0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f365625a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hr3.w f365626b;

    public v(hr3.w wVar, java.lang.CharSequence charSequence) {
        this.f365626b = wVar;
        this.f365625a = charSequence;
    }

    @Override // uc0.p
    public void a(java.lang.String str) {
        hr3.w wVar = this.f365626b;
        wVar.f365656e.f235179y[1] = 1;
        if (!x51.t1.b(str)) {
            wVar.f365656e.f235179y[2] = 1;
        }
        wVar.f365656e.f235162e.m79040x765074af(((java.lang.Object) this.f365625a) + str);
        wVar.f365656e.f235162e.clearFocus();
        android.view.View view = wVar.f365656e.f235166i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/AddDescriptionUI$WriteRemarkSpan$1", "onClick", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/AddDescriptionUI$WriteRemarkSpan$1", "onClick", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
