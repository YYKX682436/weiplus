package sv4;

/* loaded from: classes.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2397x6920875.p2398xb5e903a3.p2399x765f0e50.ActivityC19214xb85425b2 f494924d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2397x6920875.p2398xb5e903a3.p2399x765f0e50.ActivityC19214xb85425b2 activityC19214xb85425b2) {
        this.f494924d = activityC19214xb85425b2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/websearch/teach/global/setting/FTSGlobalTeachSettingActivity$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f494924d.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/websearch/teach/global/setting/FTSGlobalTeachSettingActivity$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
