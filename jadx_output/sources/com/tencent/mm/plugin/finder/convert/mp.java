package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class mp implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.rp f104021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104022e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.i f104023f;

    public mp(com.tencent.mm.plugin.finder.convert.rp rpVar, in5.s0 s0Var, so2.i iVar) {
        this.f104021d = rpVar;
        this.f104022e = s0Var;
        this.f104023f = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderMsgConvert$onBindViewHolder$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.convert.rp.q(this.f104021d, this.f104022e.f293121e, 1L, this.f104023f.f410411d);
        com.tencent.mm.autogen.events.FinderMentionListStatusUpdateEvent finderMentionListStatusUpdateEvent = new com.tencent.mm.autogen.events.FinderMentionListStatusUpdateEvent();
        finderMentionListStatusUpdateEvent.f54305g.f7138a = 1;
        finderMentionListStatusUpdateEvent.e();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderMsgConvert$onBindViewHolder$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
