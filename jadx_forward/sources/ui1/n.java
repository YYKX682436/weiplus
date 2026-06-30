package ui1;

/* loaded from: classes7.dex */
public class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ui1.z f509597d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f509598e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ui1.o f509599f;

    public n(ui1.o oVar, ui1.z zVar, java.lang.String str) {
        this.f509599f = oVar;
        this.f509597d = zVar;
        this.f509598e = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/permission/jsauth/AppBrandJsApiUserAuth$6$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ui1.o oVar = this.f509599f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = oVar.f509601e;
        this.f509597d.h(yVar, this.f509598e, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r1) yVar.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r1.class)).r(oVar.f509601e);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/permission/jsauth/AppBrandJsApiUserAuth$6$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
