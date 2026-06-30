package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class uk implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.vk f229044d;

    public uk(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.vk vkVar) {
        this.f229044d = vkVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeItemDetailDecorationDefaultUIC$updateConfirmBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPickEnvelopeItemDetailUI", "click confirmbtn");
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.vk vkVar = this.f229044d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = vkVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeItemDetailUINew");
        intent.putExtra("key_source_materialId", ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16389xdab6e25f) m158354x19263085).f228038f);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = vkVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630852, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeItemDetailUINew");
        intent.putExtra("key_source_material_flag", ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16389xdab6e25f) m158354x192630852).f228039g);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630853 = vkVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630853, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeItemDetailUINew");
        intent.putExtra("key_source_timelimit_promo_signature", ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16389xdab6e25f) m158354x192630853).f228040h);
        vkVar.m158354x19263085().setResult(-1, intent);
        vkVar.m158354x19263085().finish();
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeItemDetailDecorationDefaultUIC$updateConfirmBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
