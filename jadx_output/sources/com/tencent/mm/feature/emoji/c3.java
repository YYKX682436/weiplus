package com.tencent.mm.feature.emoji;

/* loaded from: classes13.dex */
public final class c3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f66200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66201e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66202f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f66203g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66204h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66205i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.emoji.c4 f66206m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(android.content.Context context, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, com.tencent.mm.feature.emoji.c4 c4Var) {
        super(0);
        this.f66200d = context;
        this.f66201e = str;
        this.f66202f = str2;
        this.f66203g = i17;
        this.f66204h = str3;
        this.f66205i = str4;
        this.f66206m = c4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        n22.i iVar = n22.j.f334293a;
        android.content.Context context = this.f66200d;
        kotlin.jvm.internal.o.g(context, "context");
        if (iVar.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiWecoinTool", "[launchWecoinPurchase] show EmojiStoreWecoinTutorialDialog");
            iVar.e(true);
            iVar.b(context).C();
            z17 = false;
        } else {
            z17 = true;
        }
        if (z17) {
            java.lang.String productId = this.f66201e;
            kotlin.jvm.internal.o.g(productId, "productId");
            java.lang.String priceType = this.f66202f;
            kotlin.jvm.internal.o.g(priceType, "priceType");
            java.lang.String priceNum = this.f66204h;
            kotlin.jvm.internal.o.g(priceNum, "priceNum");
            java.lang.String goodName = this.f66205i;
            kotlin.jvm.internal.o.g(goodName, "goodName");
            java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.bwd);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{goodName}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_product_id", productId);
            intent.putExtra("key_currency_type", priceType);
            intent.putExtra("key_pay_type", 6);
            intent.putExtra("key_wecoin_price", java.lang.String.valueOf(this.f66203g));
            intent.putExtra("key_price", iVar.c(priceNum));
            intent.putExtra("key_desc", format);
            intent.putExtra("key_product_title_insufficient", com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.bx7));
            intent.setClassName(context, "com.tencent.mm.plugin.wallet_index.ui.WecoinIapUI");
            ((androidx.activity.ComponentActivity) context).getActivityResultRegistry().e(productId, new h.f(), new com.tencent.mm.feature.emoji.b3(this.f66206m, productId, goodName)).a(intent, null);
        }
        return jz5.f0.f302826a;
    }
}
