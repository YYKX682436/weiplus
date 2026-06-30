package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4;

/* loaded from: classes4.dex */
public class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i f251297d;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar) {
        this.f251297d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$25");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$25", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) view.getTag();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineClickListener", "localId " + str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.s(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.m(str));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.r(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.m(str));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Nj().d();
            this.f251297d.B();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2100", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2100", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$25", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$25");
    }
}
