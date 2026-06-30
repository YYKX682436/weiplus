package db5;

/* loaded from: classes11.dex */
public class l6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a f309965d;

    public l6(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a c21516xe823d84a) {
        this.f309965d = c21516xe823d84a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMTagPanel$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a c21516xe823d84a = this.f309965d;
        c21516xe823d84a.h();
        db5.t6 t6Var = c21516xe823d84a.C;
        if (t6Var != null) {
            t6Var.c();
        }
        yj0.a.h(this, "com/tencent/mm/ui/base/MMTagPanel$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
