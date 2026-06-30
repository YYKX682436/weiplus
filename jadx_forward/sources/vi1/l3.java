package vi1;

/* loaded from: classes7.dex */
public final class l3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.z3 f518937d;

    public l3(vi1.z3 z3Var) {
        this.f518937d = z3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberVerifyCodeDialogNew$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vi1.z3 z3Var = this.f518937d;
        z3Var.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("errMsg", "user cancel");
        vi1.f0 f0Var = z3Var.f519055i;
        if (f0Var != null) {
            ((cb1.g0) f0Var).a(false, hashMap);
        }
        fl1.g2 g2Var = z3Var.f519056m;
        if (g2Var != null) {
            g2Var.a(z3Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberVerifyCodeDialogNew$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
