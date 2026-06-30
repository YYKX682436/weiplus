package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes9.dex */
public final class ls implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f107325d;

    public ls(java.lang.String str) {
        this.f107325d = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderRingtoneTimelineContract$Presenter$bindRingtoneTimelineUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ed0.v0 v0Var = (ed0.v0) i95.n0.c(ed0.v0.class);
        java.lang.String feedId = this.f107325d;
        kotlin.jvm.internal.o.f(feedId, "$feedId");
        ((dd0.o0) v0Var).getClass();
        com.tencent.mm.autogen.mmdata.rpt.ring_author_clickStruct ring_author_clickstruct = new com.tencent.mm.autogen.mmdata.rpt.ring_author_clickStruct();
        ring_author_clickstruct.f63152d = ring_author_clickstruct.b("feedid", feedId, true);
        ring_author_clickstruct.f63153e = 2L;
        ring_author_clickstruct.k();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderRingtoneTimelineContract$Presenter$bindRingtoneTimelineUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
