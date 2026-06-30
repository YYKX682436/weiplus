package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes12.dex */
public final class gt implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.ht f103513d;

    public gt(com.tencent.mm.plugin.finder.convert.ht htVar) {
        this.f103513d = htVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderProfileEmojiAllPackConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        lk5.s.e(intent, true);
        intent.setClassName(view.getContext(), "com.tencent.mm.plugin.emoji.ui.EmojiDesignerPackInfoUI");
        com.tencent.mm.plugin.finder.convert.ht htVar = this.f103513d;
        intent.putExtra("uin", htVar.f103613e);
        intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, htVar.f103615g);
        intent.putExtra("needStaticsInfo", htVar.f103614f);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("sdkRequestID", htVar.f103616h);
        linkedHashMap.put("emoticonEnterScene", 57);
        intent.putExtra("key_biz_passthrough_info", new cl0.g(linkedHashMap).toString());
        android.content.Context context = view.getContext();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderProfileEmojiAllPackConvert$onBindViewHolder$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/convert/FinderProfileEmojiAllPackConvert$onBindViewHolder$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderProfileEmojiAllPackConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
