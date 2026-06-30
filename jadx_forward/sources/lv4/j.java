package lv4;

/* loaded from: classes12.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lv4.m f403056d;

    public j(lv4.m mVar) {
        this.f403056d = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem$bindData$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        lv4.m mVar = this.f403056d;
        rv4.h hVar = (rv4.h) mVar.f403060b;
        hVar.f482005a.f413208b.c(hVar.h(ov4.d.f430747p, "不再展示"));
        kv4.m mVar2 = mVar.f403059a;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = ((qv4.r0) mVar2).f448541b;
        db5.e1.C(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o4g), ((qv4.r0) mVar2).f448541b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o4h), ((qv4.r0) mVar2).f448541b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o4f), ((qv4.r0) mVar2).f448541b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), true, new lv4.h(mVar), lv4.i.f403055d);
        yj0.a.h(this, "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem$bindData$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
