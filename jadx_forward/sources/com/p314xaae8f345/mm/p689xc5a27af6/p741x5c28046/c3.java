package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes13.dex */
public final class c3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f147733d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147734e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147735f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f147736g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147737h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147738i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4 f147739m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(android.content.Context context, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4 c4Var) {
        super(0);
        this.f147733d = context;
        this.f147734e = str;
        this.f147735f = str2;
        this.f147736g = i17;
        this.f147737h = str3;
        this.f147738i = str4;
        this.f147739m = c4Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17;
        n22.i iVar = n22.j.f415826a;
        android.content.Context context = this.f147733d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (iVar.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiWecoinTool", "[launchWecoinPurchase] show EmojiStoreWecoinTutorialDialog");
            iVar.e(true);
            iVar.b(context).C();
            z17 = false;
        } else {
            z17 = true;
        }
        if (z17) {
            java.lang.String productId = this.f147734e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(productId, "productId");
            java.lang.String priceType = this.f147735f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(priceType, "priceType");
            java.lang.String priceNum = this.f147737h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(priceNum, "priceNum");
            java.lang.String goodName = this.f147738i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(goodName, "goodName");
            java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bwd);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{goodName}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_product_id", productId);
            intent.putExtra("key_currency_type", priceType);
            intent.putExtra("key_pay_type", 6);
            intent.putExtra("key_wecoin_price", java.lang.String.valueOf(this.f147736g));
            intent.putExtra("key_price", iVar.c(priceNum));
            intent.putExtra("key_desc", format);
            intent.putExtra("key_product_title_insufficient", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bx7));
            intent.setClassName(context, "com.tencent.mm.plugin.wallet_index.ui.WecoinIapUI");
            ((p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c) context).mo2507xfe541f5f().e(productId, new h.f(), new com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b3(this.f147739m, productId, goodName)).a(intent, null);
        }
        return jz5.f0.f384359a;
    }
}
