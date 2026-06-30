package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class fj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.oj f103390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103391e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f103392f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f103393g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gx2.q f103394h;

    public fj(com.tencent.mm.plugin.finder.convert.oj ojVar, in5.s0 s0Var, com.tencent.mm.protocal.protobuf.FinderObject finderObject, kotlin.jvm.internal.c0 c0Var, gx2.q qVar) {
        this.f103390d = ojVar;
        this.f103391e = s0Var;
        this.f103392f = finderObject;
        this.f103393g = c0Var;
        this.f103394h = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert$showRelJumpTipsConfirmDrawer$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f103391e.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f103390d.z(context, this.f103392f, false);
        this.f103393g.f310112d = true;
        com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.b(this.f103394h, false, null, false, null, 15, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert$showRelJumpTipsConfirmDrawer$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
