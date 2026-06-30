package ir;

/* loaded from: classes15.dex */
public final class y extends lr.s0 {

    /* renamed from: f, reason: collision with root package name */
    public final ir.h f375447f;

    /* renamed from: g, reason: collision with root package name */
    public final p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1076xfbb92cd0 f375448g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f375449h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f375450i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f375451m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y(android.view.ViewGroup r4, lr.k0 r5, ir.h r6) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131494463(0x7f0c063f, float:1.8612435E38)
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            java.lang.String r0 = "inflate(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r0)
            r3.<init>(r4, r5)
            r3.f375447f = r6
            android.view.View r4 = r3.f3639x46306858
            r5 = 2131303534(0x7f091c6e, float:1.8225185E38)
            android.view.View r4 = r4.findViewById(r5)
            androidx.constraintlayout.widget.Guideline r4 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1076xfbb92cd0) r4
            r3.f375448g = r4
            android.view.View r4 = r3.f3639x46306858
            r5 = 2131303529(0x7f091c69, float:1.8225175E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            android.view.View r5 = r3.f3639x46306858
            r6 = 2131303530(0x7f091c6a, float:1.8225177E38)
            android.view.View r5 = r5.findViewById(r6)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            android.view.View r6 = r3.f3639x46306858
            r0 = 2131303531(0x7f091c6b, float:1.822518E38)
            android.view.View r6 = r6.findViewById(r0)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r0 = 3
            android.widget.ImageView[] r0 = new android.widget.ImageView[r0]
            r0[r2] = r4
            r4 = 1
            r0[r4] = r5
            r4 = 2
            r0[r4] = r6
            java.util.List r4 = kz5.c0.i(r0)
            r3.f375449h = r4
            android.view.View r4 = r3.f3639x46306858
            r5 = 2131303532(0x7f091c6c, float:1.8225181E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.f375450i = r4
            android.view.View r4 = r3.f3639x46306858
            r5 = 2131303527(0x7f091c67, float:1.822517E38)
            android.view.View r4 = r4.findViewById(r5)
            r3.f375451m = r4
            android.view.View r5 = r3.f3639x46306858
            r6 = 0
            r5.setOnClickListener(r6)
            ir.x r5 = new ir.x
            r5.<init>(r3)
            r4.setOnClickListener(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.y.<init>(android.view.ViewGroup, lr.k0, ir.h):void");
    }

    @Override // lr.s0
    public void i(ir.u0 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.i(item);
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1076xfbb92cd0 c1076xfbb92cd0 = this.f375448g;
        android.view.ViewGroup.LayoutParams layoutParams = c1076xfbb92cd0.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams2 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams;
        android.view.ViewGroup.LayoutParams layoutParams3 = this.f375451m.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams4 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams3;
        ir.h hVar = this.f375447f;
        if (hVar != null && hVar.f375388n) {
            layoutParams2.f92412a = i65.a.b(c1076xfbb92cd0.getContext(), 120);
            layoutParams4.f92432k = 0;
            layoutParams4.f92428i = -1;
        } else {
            layoutParams2.f92412a = i65.a.b(c1076xfbb92cd0.getContext(), 48);
            layoutParams4.f92432k = -1;
            layoutParams4.f92428i = com.p314xaae8f345.mm.R.id.dcp;
        }
        c1076xfbb92cd0.setLayoutParams(layoutParams2);
        ir.w wVar = (ir.w) this.f402114e;
        if (wVar != null) {
            yo0.f fVar = new yo0.f();
            fVar.f545611b = true;
            yo0.i a17 = fVar.a();
            vo0.e eVar = vo0.e.f520000a;
            vo0.a aVar = vo0.e.f520001b;
            ir.v vVar = wVar.f375443b;
            wo0.c a18 = aVar.a(vVar.f375442c.d());
            a18.f529405c = a17;
            android.widget.ImageView imageView = this.f375450i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
            ((wo0.b) a18).c(imageView);
            int i17 = 0;
            for (java.lang.Object obj : this.f375449h) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                android.widget.ImageView imageView2 = (android.widget.ImageView) obj;
                com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247 c21051xbc71d247 = (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247) kz5.n0.a0(vVar.f375442c.f375438c, i17);
                if (c21051xbc71d247 != null) {
                    imageView2.setVisibility(0);
                    vo0.e eVar2 = vo0.e.f520000a;
                    vo0.a aVar2 = vo0.e.f520001b;
                    java.lang.String str = c21051xbc71d247.f68389xc8eaa935;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getGrayPackIconUrl(...)");
                    wo0.c a19 = aVar2.a(str);
                    a19.f529405c = a17;
                    ((wo0.b) a19).c(imageView2);
                } else {
                    imageView2.setVisibility(8);
                }
                i17 = i18;
            }
        }
    }
}
