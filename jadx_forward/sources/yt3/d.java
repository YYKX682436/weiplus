package yt3;

/* loaded from: classes3.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.e f546928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ju3.c0 f546929e;

    public d(yt3.e eVar, ju3.c0 c0Var) {
        this.f546928d = eVar;
        this.f546929e = c0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/ClickRegisterPlugin$setup$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ju3.d0.k(this.f546928d.f546865d, this.f546929e, null, 2, null);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/ClickRegisterPlugin$setup$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
