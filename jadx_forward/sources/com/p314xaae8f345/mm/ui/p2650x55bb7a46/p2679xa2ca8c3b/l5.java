package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class l5 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 {

    /* renamed from: i, reason: collision with root package name */
    public static final int f285923i = ((int) i65.a.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.i.a())) * 64;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.C21405x85fc1ce0 f285924b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f285925c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f285926d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f285927e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f285928f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f285929g;

    /* renamed from: h, reason: collision with root package name */
    public int f285930h = 0;

    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.l5 a(android.view.View view, boolean z17) {
        super.mo80050xaf65a0fc(view);
        this.f285929g = z17;
        this.f39500xcbecde0f = (android.widget.TextView) this.f39494xbf64baf8.findViewById(com.p314xaae8f345.mm.R.id.f565229br1);
        this.f39492x5b9aa3a3 = (android.widget.CheckBox) view.findViewById(com.p314xaae8f345.mm.R.id.bkf);
        this.f39496x10665fb1 = this.f39494xbf64baf8.findViewById(com.p314xaae8f345.mm.R.id.bpa);
        this.f39502xce2b2f8d = (android.widget.TextView) this.f39494xbf64baf8.findViewById(com.p314xaae8f345.mm.R.id.brc);
        this.f285924b = (com.p314xaae8f345.mm.ui.C21405x85fc1ce0) this.f39494xbf64baf8.findViewById(com.p314xaae8f345.mm.R.id.f564793a42);
        this.f285925c = (android.widget.TextView) this.f39494xbf64baf8.findViewById(com.p314xaae8f345.mm.R.id.f564794a43);
        this.f285926d = (android.widget.TextView) this.f39494xbf64baf8.findViewById(com.p314xaae8f345.mm.R.id.f564792a41);
        this.f285927e = (android.widget.TextView) this.f39494xbf64baf8.findViewById(com.p314xaae8f345.mm.R.id.a3z);
        this.f285928f = this.f39494xbf64baf8.findViewById(com.p314xaae8f345.mm.R.id.f564791a40);
        this.f285930h = com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.i(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        return this;
    }

    public void b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.content.Context context, ot0.q qVar, java.lang.String str) {
        m80054x4906274a(this.f39493x8ad70635, this.f285930h);
        int i17 = qVar.f430199i;
        int i18 = f285923i;
        if (i17 == 16) {
            this.f285925c.setText(qVar.f430191g);
            this.f285926d.setText(qVar.V0);
            this.f285924b.setVisibility(0);
            n11.a b17 = n11.a.b();
            java.lang.String str2 = qVar.f430267z;
            com.p314xaae8f345.mm.ui.C21405x85fc1ce0 c21405x85fc1ce0 = this.f285924b;
            o11.f fVar = new o11.f();
            fVar.f423634y = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.o5.a();
            fVar.f423619j = i18;
            fVar.f423620k = i18;
            fVar.f423624o = com.p314xaae8f345.mm.R.raw.f78435x7b83bce4;
            fVar.f423629t = true;
            b17.h(str2, c21405x85fc1ce0, fVar.a());
            return;
        }
        if (i17 != 34) {
            this.f285925c.setText(qVar.f430191g);
            this.f285926d.setText(qVar.V0);
            this.f285924b.setVisibility(0);
            n11.a b18 = n11.a.b();
            java.lang.String mj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).mj(f9Var, str, true);
            com.p314xaae8f345.mm.ui.C21405x85fc1ce0 c21405x85fc1ce02 = this.f285924b;
            o11.f fVar2 = new o11.f();
            fVar2.f423634y = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.o5.a();
            fVar2.f423618i = 1;
            fVar2.f423619j = i18;
            fVar2.f423620k = i18;
            fVar2.f423624o = com.p314xaae8f345.mm.R.raw.f78435x7b83bce4;
            fVar2.f423629t = true;
            b18.h(mj6, c21405x85fc1ce02, fVar2.a());
            return;
        }
        java.lang.String str3 = qVar.f430187f;
        if (str3 == null || str3.length() <= 0) {
            this.f285925c.setVisibility(8);
        } else {
            this.f285925c.setVisibility(0);
            this.f285925c.setText(qVar.f430187f);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f430181d1)) {
                this.f285925c.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            } else {
                this.f285925c.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f(qVar.f430181d1, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c)));
            }
        }
        this.f285926d.setMaxLines(2);
        this.f285926d.setVisibility(0);
        this.f285926d.setText(qVar.f430191g);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f430185e1)) {
            this.f285926d.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560744sz));
        } else {
            this.f285926d.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f(qVar.f430185e1, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560744sz)));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.Z0)) {
            this.f285927e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.b3b);
        } else {
            this.f285927e.setText(qVar.Z0);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f430177c1)) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            android.graphics.Bitmap m07 = m11.b1.Di().m0(f9Var, str, i65.a.g(context), false);
            if (m07 == null || m07.isRecycled()) {
                n11.a b19 = n11.a.b();
                java.lang.String str4 = qVar.f430267z;
                com.p314xaae8f345.mm.ui.C21405x85fc1ce0 c21405x85fc1ce03 = this.f285924b;
                o11.f fVar3 = new o11.f();
                fVar3.f423634y = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.o5.a();
                fVar3.f423619j = i18;
                fVar3.f423620k = i18;
                fVar3.f423624o = com.p314xaae8f345.mm.R.raw.f78435x7b83bce4;
                fVar3.f423629t = true;
                b19.h(str4, c21405x85fc1ce03, fVar3.a());
            } else {
                this.f285924b.setImageBitmap(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(m07, false, m07.getWidth() / 2));
            }
            this.f285928f.getViewTreeObserver().addOnPreDrawListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.k5(this, context, m07));
            return;
        }
        n11.a b27 = n11.a.b();
        java.lang.String str5 = qVar.f430267z;
        com.p314xaae8f345.mm.ui.C21405x85fc1ce0 c21405x85fc1ce04 = this.f285924b;
        o11.f fVar4 = new o11.f();
        fVar4.f423634y = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.o5.a();
        fVar4.f423619j = i18;
        fVar4.f423620k = i18;
        fVar4.f423624o = com.p314xaae8f345.mm.R.raw.f78435x7b83bce4;
        fVar4.f423629t = true;
        b27.h(str5, c21405x85fc1ce04, fVar4.a());
        n11.a b28 = n11.a.b();
        java.lang.String str6 = qVar.f430177c1;
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        o11.f fVar5 = new o11.f();
        fVar5.f423634y = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.o5.a();
        fVar5.f423611b = true;
        b28.i(str6, imageView, fVar5.a(), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.j5(this, context));
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0
    /* renamed from: getMainContainerView */
    public android.view.View mo79945xb0f558d7() {
        return this.f39494xbf64baf8;
    }
}
