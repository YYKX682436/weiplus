package vi1;

/* loaded from: classes7.dex */
public final class j3 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.k3 f518911d;

    public j3(vi1.k3 k3Var) {
        this.f518911d = k3Var;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View arg0) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(arg0);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberVerifyCodeDialog$updateSendText$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arg0, "arg0");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhoneNumberVerifyCodeDialog", "click the resend spanBuilder, do resend sms");
        vi1.k3 k3Var = this.f518911d;
        if (k3Var.f518920d.f168938m) {
            k3Var.e(false);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PhoneNumberVerifyCodeDialog", "allow_send_sms is false, show send_verify_code_frequent error");
            java.lang.String string = k3Var.f518917a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571680m8);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            k3Var.f(string);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberVerifyCodeDialog$updateSendText$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }
}
