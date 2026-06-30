package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf;

/* loaded from: classes11.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lj4.d f254776d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.o f254777e;

    public n(lj4.d dVar, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.o oVar) {
        this.f254776d = dVar;
        this.f254777e = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/dowhat/DoWhatItemConvertV2$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String str = this.f254776d.f400515e;
        if (str != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.u uVar = this.f254777e.f254778e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            uVar.a(view, str);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/convert/dowhat/DoWhatItemConvertV2$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
