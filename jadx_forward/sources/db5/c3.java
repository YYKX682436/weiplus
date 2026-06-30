package db5;

/* loaded from: classes.dex */
public class c3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.d3 f309836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db5.f3 f309837e;

    public c3(db5.f3 f3Var, db5.d3 d3Var) {
        this.f309837e = f3Var;
        this.f309836d = d3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMHalfBottomEditDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        db5.f3 f3Var = this.f309837e;
        java.lang.String trim = (f3Var.M.getText() == null || f3Var.M.getText().toString() == null) ? "" : f3Var.M.getText().toString().trim();
        db5.d3 d3Var = this.f309836d;
        if (d3Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(trim)) {
            d3Var.a(trim);
        }
        yj0.a.h(this, "com/tencent/mm/ui/base/MMHalfBottomEditDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
