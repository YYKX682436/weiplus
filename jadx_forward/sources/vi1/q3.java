package vi1;

/* loaded from: classes7.dex */
public final class q3 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.z3 f518968d;

    public q3(vi1.z3 z3Var) {
        this.f518968d = z3Var;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View arg0) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(arg0);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberVerifyCodeDialogNew$resetSendCodeTextToResend$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arg0, "arg0");
        vi1.z3 z3Var = this.f518968d;
        if (z3Var.f519054h.f168938m) {
            z3Var.w();
        } else {
            java.lang.String string = z3Var.f519050d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571680m8);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            z3Var.u(string);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberVerifyCodeDialogNew$resetSendCodeTextToResend$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }
}
