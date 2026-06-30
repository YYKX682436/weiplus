package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class w3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.m60 f104836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f104837e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104838f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.u4 f104839g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f104840h;

    public w3(r45.m60 m60Var, java.lang.String str, in5.s0 s0Var, com.tencent.mm.plugin.finder.convert.u4 u4Var, so2.y0 y0Var) {
        this.f104836d = m60Var;
        this.f104837e = str;
        this.f104838f = s0Var;
        this.f104839g = u4Var;
        this.f104840h = y0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$25$3$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) this.f104836d.getCustom(1);
        kotlin.jvm.internal.o.d(finderJumpInfo);
        com.tencent.mars.xlog.Log.i("Finder.FinderFeedCommentConvert", "onItemClick click, " + this.f104837e + " jumpInfo=" + hc2.g0.d(finderJumpInfo));
        xc2.y2 y2Var = xc2.y2.f453343a;
        android.content.Context context = this.f104838f.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
        p0Var.f453244f = this.f104839g.f104672g;
        p0Var.f453245g = this.f104840h.f410703d.t0();
        p0Var.f453255q = com.tencent.mars.cdn.CdnManager.kAppTypeTingImage;
        xc2.y2.i(y2Var, context, p0Var, 0, this.f104838f, 4, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$25$3$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
