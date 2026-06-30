package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class hu implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.ku f103617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103618e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ms2.c f103619f;

    public hu(com.tencent.mm.plugin.finder.convert.ku kuVar, in5.s0 s0Var, ms2.c cVar) {
        this.f103617d = kuVar;
        this.f103618e = s0Var;
        this.f103619f = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderProfileTingAudioPatchItemConvert$addToListenLaterLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View itemView = this.f103618e.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        com.tencent.mm.plugin.finder.convert.ku.o(this.f103617d, itemView, this.f103619f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderProfileTingAudioPatchItemConvert$addToListenLaterLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
