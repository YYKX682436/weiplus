package n22;

/* loaded from: classes9.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final n22.i f415826a = new n22.i(null);

    /* renamed from: b, reason: collision with root package name */
    public static int f415827b = -1;

    public static final void a(android.content.Context context, java.lang.String productId, java.lang.String priceType, int i17, java.lang.String priceNum, java.lang.String goodName) {
        n22.i iVar = f415826a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(productId, "productId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(priceType, "priceType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(priceNum, "priceNum");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(goodName, "goodName");
        if (iVar.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiWecoinTool", "[launchWecoinPurchase] show EmojiStoreWecoinTutorialDialog");
            iVar.b(context).C();
            return;
        }
        java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bwd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{goodName}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_product_id", productId);
        intent.putExtra("key_currency_type", priceType);
        intent.putExtra("key_pay_type", 6);
        intent.putExtra("key_wecoin_price", java.lang.String.valueOf(i17));
        intent.putExtra("key_price", iVar.c(priceNum));
        intent.putExtra("key_desc", format);
        intent.putExtra("key_product_title_insufficient", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bx7));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiWecoinTool", "[launchWecoinPurchase] enter wecoin pay");
        j45.l.n(context, "wallet_index", ".ui.WecoinIapUI", intent, 2001);
    }
}
