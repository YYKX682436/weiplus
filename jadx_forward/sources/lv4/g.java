package lv4;

/* loaded from: classes12.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lv4.m f403053d;

    public g(lv4.m mVar) {
        this.f403053d = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem$bindData$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        lv4.m mVar = this.f403053d;
        ((rv4.h) mVar.f403060b).g(false);
        kv4.m mVar2 = mVar.f403059a;
        db5.e1.C(((qv4.r0) mVar2).f448541b, null, ((qv4.r0) mVar2).f448541b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o4c), ((qv4.r0) mVar.f403059a).f448541b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o4d), ((qv4.r0) mVar.f403059a).f448541b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), true, new lv4.e(mVar), lv4.f.f403052d);
        yj0.a.h(this, "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem$bindData$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
