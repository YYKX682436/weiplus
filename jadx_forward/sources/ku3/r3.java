package ku3;

/* loaded from: classes3.dex */
public final class r3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.y3 f393912d;

    public r3(ku3.y3 y3Var) {
        this.f393912d = y3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/professional/RecordMenuCountDownPlugin$initSecondBar$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ku3.y3 y3Var = this.f393912d;
        if (y3Var.B != 10) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMenuCountDownPlugin", "select ten count down");
            zt3.a aVar = y3Var.f394002d;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("PARAM_1_INT", 10);
            zt3.a.V6(aVar, 9, true, bundle, false, false, 24, null);
            y3Var.B = 10;
            ku3.y3.a(y3Var, y3Var.f394013r);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordMenuCountDownPlugin$initSecondBar$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
