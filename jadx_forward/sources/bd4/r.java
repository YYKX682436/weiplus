package bd4;

/* loaded from: classes4.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18267x4e51b446 f100916d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18267x4e51b446 c18267x4e51b446) {
        this.f100916d = c18267x4e51b446;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 h17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$inflateXml$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/view/ImproveContentView$inflateXml$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18267x4e51b446.E;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$singleContentJumpUI", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18267x4e51b446 c18267x4e51b446 = this.f100916d;
        c18267x4e51b446.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("singleContentJumpUI", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        android.content.Intent intent = new android.content.Intent();
        xc4.p pVar = c18267x4e51b446.f250664w;
        intent.putExtra("sns_text_show", (pVar == null || (h17 = pVar.h1()) == null) ? null : h17.f39013x4c306a8a);
        xc4.p pVar2 = c18267x4e51b446.f250664w;
        intent.putExtra("sns_local_id", pVar2 != null ? pVar2.W0() : null);
        intent.putExtra("sns_content_source", 1);
        intent.setClass(c18267x4e51b446.getContext(), com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18111x49668b66.class);
        android.content.Context context = c18267x4e51b446.getContext();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/improve/view/ImproveContentView", "singleContentJumpUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveContentView", "singleContentJumpUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("singleContentJumpUI", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$singleContentJumpUI", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveContentView$inflateXml$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$inflateXml$3");
    }
}
