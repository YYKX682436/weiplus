package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes15.dex */
public class a implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f97885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f97886e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f97887f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f97888g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI f97889h;

    public a(com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI baseEmojiStoreUI, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f97889h = baseEmojiStoreUI;
        this.f97885d = str;
        this.f97886e = str2;
        this.f97887f = str3;
        this.f97888g = str4;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.String str = this.f97885d;
        java.lang.String str2 = this.f97886e;
        java.lang.String str3 = this.f97887f;
        java.lang.String str4 = this.f97888g;
        com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI baseEmojiStoreUI = this.f97889h;
        baseEmojiStoreUI.getClass();
        baseEmojiStoreUI.D = new z12.l(str, str2, str3, null, str4);
        baseEmojiStoreUI.getClass();
        gm0.j1.n().f273288b.g(baseEmojiStoreUI.D);
        java.lang.String str5 = this.f97885d;
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.BaseEmojiStoreUI", "Retry doScene ExchangeEmotionPackNetScene productId:%s", str5);
        baseEmojiStoreUI.r7(str5, 0);
    }
}
