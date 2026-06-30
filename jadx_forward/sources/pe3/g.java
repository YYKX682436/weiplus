package pe3;

/* loaded from: classes.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pe3.h f435190d;

    public g(pe3.h hVar) {
        this.f435190d = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/magicbrush/scldemo/component/MagicBrushSclDemoDataUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pe3.h hVar = this.f435190d;
        java.lang.String value = ((android.widget.EditText) hVar.m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.gdp)).getText().toString();
        hVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putString("MagicBrushSclDemoDataUIC_data", value);
        java.lang.String value2 = ((android.widget.EditText) hVar.m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.gdy)).getText().toString();
        hVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value2, "value");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putString("MagicBrushSclDemoDataUIC_name", value2);
        db5.t7.h(hVar.m158354x19263085(), "saved");
        yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/scldemo/component/MagicBrushSclDemoDataUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
