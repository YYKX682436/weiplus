package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes15.dex */
public class a implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f179418d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f179419e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f179420f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f179421g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0 f179422h;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0 abstractActivityC13270x1ac599a0, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f179422h = abstractActivityC13270x1ac599a0;
        this.f179418d = str;
        this.f179419e = str2;
        this.f179420f = str3;
        this.f179421g = str4;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.String str = this.f179418d;
        java.lang.String str2 = this.f179419e;
        java.lang.String str3 = this.f179420f;
        java.lang.String str4 = this.f179421g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0 abstractActivityC13270x1ac599a0 = this.f179422h;
        abstractActivityC13270x1ac599a0.getClass();
        abstractActivityC13270x1ac599a0.D = new z12.l(str, str2, str3, null, str4);
        abstractActivityC13270x1ac599a0.getClass();
        gm0.j1.n().f354821b.g(abstractActivityC13270x1ac599a0.D);
        java.lang.String str5 = this.f179418d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.BaseEmojiStoreUI", "Retry doScene ExchangeEmotionPackNetScene productId:%s", str5);
        abstractActivityC13270x1ac599a0.r7(str5, 0);
    }
}
