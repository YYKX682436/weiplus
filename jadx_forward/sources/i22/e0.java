package i22;

/* loaded from: classes15.dex */
public final class e0 extends i22.m {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f369488f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f369489g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f369490h;

    /* renamed from: i, reason: collision with root package name */
    public final int f369491i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e0(android.content.Context r1, android.view.View r2, i22.o0 r3, yz5.a r4, int r5, p3321xbce91901.jvm.p3324x21ffc6bd.i r6) {
        /*
            r0 = this;
            r4 = r5 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r4 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r4)
            java.lang.String r4 = "itemView"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r4)
            r0.<init>(r2, r3)
            java.lang.String r3 = "MicroMsg.EmojiStoreV3SingleProductHolder"
            r0.f369488f = r3
            r3 = 2131310917(0x7f093945, float:1.824016E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0.f369489g = r3
            r3 = 2131310952(0x7f093968, float:1.824023E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r0.f369490h = r2
            r2 = 2131166924(0x7f0706cc, float:1.7948107E38)
            int r1 = i65.a.h(r1, r2)
            r0.f369491i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i22.e0.<init>(android.content.Context, android.view.View, i22.o0, yz5.a, int, kotlin.jvm.internal.i):void");
    }

    @Override // i22.m
    public void i(i22.n0 dataItem, java.util.List payloads) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataItem, "dataItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        super.i(dataItem, payloads);
        i22.c1 c1Var = dataItem instanceof i22.c1 ? (i22.c1) dataItem : null;
        r45.ri0 ri0Var = c1Var != null ? c1Var.f369485a : null;
        java.lang.String str = this.f369488f;
        if (ri0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onBind Failed, EmojiInfo null");
            return;
        }
        this.f369490h.setText(ri0Var.f466434v);
        android.widget.ImageView imageView = this.f369489g;
        imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f77983xe490a197);
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ri0Var.f466421f);
        int i17 = this.f369491i;
        if (!K0) {
            java.lang.String d17 = rr.s.f480682a.d(ri0Var.f466419d);
            n11.a b17 = n11.a.b();
            java.lang.String str2 = ri0Var.f466421f;
            b17.h(str2, imageView, y12.f.a(str2, d17, i17, new java.lang.Object[0]));
            imageView.setImportantForAccessibility(1);
            imageView.setContentDescription(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.bvt));
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ri0Var.f466420e)) {
            imageView.setImportantForAccessibility(4);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "this emoji has no thumb url and url. download faild");
            return;
        }
        java.lang.String p17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.p(n22.m.g(), "", ri0Var.f466419d);
        n11.a Di = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).Di();
        java.lang.String str3 = ri0Var.f466420e;
        Di.h(str3, imageView, y12.f.a(str3, p17, i17, new java.lang.Object[0]));
        imageView.setImportantForAccessibility(1);
        imageView.setContentDescription(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.bvt));
    }
}
