package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44;

/* loaded from: classes4.dex */
public class h1 {

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.h1 f252680c = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.h1();

    /* renamed from: a, reason: collision with root package name */
    public nm0.a f252681a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f252682b = 0;

    public static com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.h1 a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInstance", "com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextViewConfig");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.h1 h1Var = f252680c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInstance", "com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextViewConfig");
        return h1Var;
    }

    public nm0.a b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTextViewConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextViewConfig");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        int b17 = i65.a.b(context, (int) (i65.a.q(context) * 15.0f));
        nm0.a aVar = this.f252681a;
        if (aVar == null || ((int) aVar.f419995l) != b17) {
            nm0.b a17 = nm0.b.a();
            a17.f419999a.f419995l = b17;
            int color = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77759x7b87af68);
            nm0.a aVar2 = a17.f419999a;
            aVar2.f419996m = color;
            aVar2.f419990g = 16;
            aVar2.f419989f = android.text.TextUtils.TruncateAt.END;
            this.f252681a = aVar2;
        }
        nm0.a aVar3 = this.f252681a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTextViewConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextViewConfig");
        return aVar3;
    }
}
