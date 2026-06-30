package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class rl implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f186015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186016e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.g f186017f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186018g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.sl f186019h;

    public rl(long j17, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.sl slVar) {
        this.f186015d = j17;
        this.f186016e = str;
        this.f186017f = gVar;
        this.f186018g = s0Var;
        this.f186019h = slVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderLikeConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        long j17 = this.f186015d;
        intent.putExtra("feed_object_id", j17);
        intent.putExtra("feed_object_nonceId", this.f186016e);
        intent.putExtra("key_show_jump_entry", false);
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f186017f;
        intent.putExtra("key_like_buffer", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(gVar != null ? gVar.g() : null));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
        android.content.Context context = this.f186018g.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        i0Var.getClass();
        hc2.e0.a(intent, 0, null, 3, null);
        android.content.Intent intent2 = context instanceof android.app.Activity ? null : intent;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15075xf41a1c3c.class);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderShareFeedDetailUI2", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderShareFeedDetailUI2", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        this.f186019h.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLikeConvert", "go detail, jumpFeedId:" + j17);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderLikeConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
