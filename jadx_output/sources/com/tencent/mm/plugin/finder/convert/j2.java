package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes8.dex */
public final class j2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.vd0 f103711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.l2 f103712e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.m2 f103713f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f103714g;

    public j2(r45.vd0 vd0Var, com.tencent.mm.plugin.finder.convert.l2 l2Var, com.tencent.mm.plugin.finder.convert.m2 m2Var, int i17) {
        this.f103711d = vd0Var;
        this.f103712e = l2Var;
        this.f103713f = m2Var;
        this.f103714g = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderEmojiDesignerIPSetListConvert$onBindViewHolder$3$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qk.a0 a0Var = new qk.a0(this.f103711d);
        a0Var.f364155a = 57;
        java.lang.String str = this.f103712e.f103882d;
        kotlin.jvm.internal.o.g(str, "<set-?>");
        a0Var.f364132h = str;
        a0Var.f364133i = 60;
        com.tencent.mm.plugin.finder.convert.m2 m2Var = this.f103713f;
        a0Var.f364131g = m2Var.f103963e;
        java.util.ArrayList arrayList2 = m2Var.f103965g;
        int i17 = this.f103714g;
        java.lang.Object obj = arrayList2.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        m2Var.o((r45.vd0) obj, i17 + 1, "view_clk");
        com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
        if (p6Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FinderEmojiDesignerIPSetListConvert", "unable to get emoticon liteapp feature service");
        } else {
            ((com.tencent.mm.feature.emoji.f4) p6Var).wi(view.getContext(), a0Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderEmojiDesignerIPSetListConvert$onBindViewHolder$3$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
