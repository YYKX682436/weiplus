package lv4;

/* loaded from: classes12.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lv4.m f403057d;

    public k(lv4.m mVar) {
        this.f403057d = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem$bindData$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        lv4.m mVar = this.f403057d;
        rv4.h hVar = (rv4.h) mVar.f403060b;
        hVar.f482016l = true;
        hVar.l(true);
        hVar.f482005a.f413208b.c(hVar.h(ov4.d.f430745n, "删除"));
        kv4.m mVar2 = mVar.f403059a;
        ((qv4.r0) mVar2).j();
        jv4.i iVar = ((qv4.r0) mVar2).f448543d;
        if (iVar != null) {
            ((jv4.e) ((jv4.p) iVar).f383795e).f383768a.k();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem$bindData$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
