package kv4;

/* loaded from: classes12.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mv4.b f394237d;

    public j(mv4.b bVar) {
        this.f394237d = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/websearch/teach/base/box/FTSTeachAISearchViewItem$bindData$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rv4.b bVar = (rv4.b) this.f394237d;
        bVar.f481966b.f413208b.c(bVar.a(ov4.d.f430743i));
        jv4.i iVar = bVar.f481966b.f482090c;
        if (iVar != null) {
            ((jv4.e) ((jv4.p) iVar).f383795e).f383768a.a();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/websearch/teach/base/box/FTSTeachAISearchViewItem$bindData$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
