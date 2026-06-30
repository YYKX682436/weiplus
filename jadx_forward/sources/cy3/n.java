package cy3;

/* loaded from: classes.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f306343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f306344e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f306345f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f306346g;

    public n(yz5.q qVar, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f306343d = qVar;
        this.f306344e = c0Var;
        this.f306345f = str;
        this.f306346g = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f306344e.f391645d);
        java.lang.String str = this.f306345f;
        if (str.length() == 0) {
            str = c01.z1.r();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "ifEmpty(...)");
        this.f306343d.mo147xb9724478(valueOf, str, this.f306346g.f391656d);
        yj0.a.h(this, "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
