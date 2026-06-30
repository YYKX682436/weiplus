package ku3;

/* loaded from: classes3.dex */
public final class v2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.e3 f393968d;

    public v2(ku3.e3 e3Var) {
        this.f393968d = e3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/professional/RecordMenuBeautyPlugin$initBeautyBar$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ku3.e3 e3Var = this.f393968d;
        if (e3Var.f393755y != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMenuBeautyPlugin", "select none beauty");
            zt3.a.V6(e3Var.f393737d, 6, false, null, false, false, 28, null);
            e3Var.f393755y = 1;
            ku3.e3.a(e3Var, e3Var.f393749s);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordMenuBeautyPlugin$initBeautyBar$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
