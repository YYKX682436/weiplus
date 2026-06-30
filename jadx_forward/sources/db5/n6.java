package db5;

/* loaded from: classes11.dex */
public class n6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a f309979d;

    public n6(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a c21516xe823d84a) {
        this.f309979d = c21516xe823d84a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMTagPanel$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a c21516xe823d84a = this.f309979d;
        boolean z17 = c21516xe823d84a.f279115n;
        if (c21516xe823d84a.f279115n) {
            c21516xe823d84a.h();
            c21516xe823d84a.F.requestFocus();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = c21516xe823d84a.F;
            c22621x7603e017.mo81549xf579a34a(c22621x7603e017.getText().length());
            ((android.view.inputmethod.InputMethodManager) c21516xe823d84a.getContext().getSystemService("input_method")).showSoftInput(c21516xe823d84a.F, 0);
            db5.t6 t6Var = c21516xe823d84a.C;
            if (t6Var != null) {
                t6Var.c();
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/base/MMTagPanel$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
