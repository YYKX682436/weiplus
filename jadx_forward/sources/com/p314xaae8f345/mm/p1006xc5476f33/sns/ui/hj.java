package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public final class hj extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f250041d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.jj f250042e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f250043f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableString f250044g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f250045h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f250046i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.jj jjVar, java.lang.CharSequence charSequence, android.text.SpannableString spannableString, java.lang.String str, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f250041d = z17;
        this.f250042e = jjVar;
        this.f250043f = charSequence;
        this.f250044g = spannableString;
        this.f250045h = str;
        this.f250046i = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1$3");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.hj hjVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.hj(this.f250041d, this.f250042e, this.f250043f, this.f250044g, this.f250045h, this.f250046i, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1$3");
        return hjVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1$3");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1$3");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.hj hjVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.hj) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        hjVar.mo150x989b7ca4(f0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1$3");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1$3");
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeSuspend", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1$3");
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        boolean z17 = this.f250041d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.jj jjVar = this.f250042e;
        if (z17) {
            int a17 = ym5.x.a(jjVar.getContext(), 4.0f);
            android.widget.TextView textView = jjVar.f248698d.f249719c;
            textView.setPadding(textView.getPaddingLeft(), jjVar.f248698d.f249719c.getPaddingTop(), jjVar.f248698d.f249719c.getPaddingRight(), a17);
        }
        android.widget.ImageView imageView = jjVar.f248698d.f249717a;
        android.content.Context context = jjVar.getContext();
        java.lang.CharSequence charSequence = this.f250043f;
        imageView.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j9d, charSequence));
        jjVar.f248698d.f249718b.setText(this.f250044g);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f250045h)) {
            jjVar.f248698d.f249718b.setVisibility(8);
        }
        jjVar.f248698d.f249719c.setText(charSequence);
        if (jjVar.f248707p) {
            jjVar.f248698d.f249720d.setVisibility(0);
            jjVar.f248698d.f249720d.setText(this.f250046i);
        } else {
            jjVar.f248698d.f249720d.setVisibility(8);
        }
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1$3");
        return f0Var;
    }
}
