package ku3;

/* loaded from: classes3.dex */
public final class w2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.e3 f393977d;

    public w2(ku3.e3 e3Var) {
        this.f393977d = e3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/professional/RecordMenuBeautyPlugin$initBeautyBar$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ku3.e3 e3Var = this.f393977d;
        if (e3Var.f393755y != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMenuBeautyPlugin", "select beauty light");
            zt3.a aVar = e3Var.f393737d;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("PARAM_1_INT", 2);
            zt3.a.V6(aVar, 6, true, bundle, false, false, 24, null);
            e3Var.f393755y = 2;
            ku3.e3.a(e3Var, e3Var.f393750t);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordMenuBeautyPlugin$initBeautyBar$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
