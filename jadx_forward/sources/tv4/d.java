package tv4;

/* loaded from: classes12.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tv4.e f503897d;

    public d(tv4.e eVar) {
        this.f503897d = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/websearch/teach/global/view/FTSGlobalTeachSettingButton$bindData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tv4.e eVar = this.f503897d;
        eVar.f503898b.a();
        ((qv4.r0) eVar.f503898b.f482094b).i();
        yj0.a.h(this, "com/tencent/mm/plugin/websearch/teach/global/view/FTSGlobalTeachSettingButton$bindData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
