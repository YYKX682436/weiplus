package db5;

/* loaded from: classes11.dex */
public class s6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a f310039d;

    public s6(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a c21516xe823d84a) {
        this.f310039d = c21516xe823d84a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMTagPanel$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a c21516xe823d84a = this.f310039d;
        if (intValue == 0) {
            c21516xe823d84a.u((android.widget.TextView) view, true, false);
            if (c21516xe823d84a.C != null) {
                view.post(new db5.p6(this, view));
            }
        } else if (!c21516xe823d84a.f279115n || c21516xe823d84a.f279117p) {
            c21516xe823d84a.u((android.widget.TextView) view, false, false);
            if (c21516xe823d84a.C != null) {
                view.post(new db5.q6(this, view));
            }
        } else {
            db5.b7 b7Var = c21516xe823d84a.f279127z;
            if (b7Var == null) {
                c21516xe823d84a.f279127z = com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a.b(c21516xe823d84a, ((android.widget.TextView) view).getText().toString());
                db5.b7 b7Var2 = c21516xe823d84a.f279127z;
                if (b7Var2 != null) {
                    c21516xe823d84a.u(b7Var2.f309829b, false, true);
                }
            } else if (b7Var.f309829b == view) {
                c21516xe823d84a.f279127z = null;
                c21516xe823d84a.u((android.widget.TextView) view, false, false);
                if (c21516xe823d84a.C != null) {
                    view.post(new db5.r6(this, view));
                }
            } else {
                c21516xe823d84a.h();
                c21516xe823d84a.f279127z = com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a.b(c21516xe823d84a, ((android.widget.TextView) view).getText().toString());
                db5.b7 b7Var3 = c21516xe823d84a.f279127z;
                if (b7Var3 != null) {
                    c21516xe823d84a.u(b7Var3.f309829b, false, true);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/base/MMTagPanel$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
