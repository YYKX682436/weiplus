package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class rl implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f104482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f104483e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.g f104484f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104485g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.sl f104486h;

    public rl(long j17, java.lang.String str, com.tencent.mm.protobuf.g gVar, in5.s0 s0Var, com.tencent.mm.plugin.finder.convert.sl slVar) {
        this.f104482d = j17;
        this.f104483e = str;
        this.f104484f = gVar;
        this.f104485g = s0Var;
        this.f104486h = slVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderLikeConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        long j17 = this.f104482d;
        intent.putExtra("feed_object_id", j17);
        intent.putExtra("feed_object_nonceId", this.f104483e);
        intent.putExtra("key_show_jump_entry", false);
        com.tencent.mm.protobuf.g gVar = this.f104484f;
        intent.putExtra("key_like_buffer", com.tencent.mm.sdk.platformtools.t8.l(gVar != null ? gVar.g() : null));
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        android.content.Context context = this.f104485g.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        i0Var.getClass();
        hc2.e0.a(intent, 0, null, 3, null);
        android.content.Intent intent2 = context instanceof android.app.Activity ? null : intent;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, com.tencent.mm.plugin.finder.ui.FinderShareFeedDetailUI.class);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderShareFeedDetailUI2", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderShareFeedDetailUI2", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        this.f104486h.getClass();
        com.tencent.mars.xlog.Log.i("Finder.FinderLikeConvert", "go detail, jumpFeedId:" + j17);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderLikeConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
