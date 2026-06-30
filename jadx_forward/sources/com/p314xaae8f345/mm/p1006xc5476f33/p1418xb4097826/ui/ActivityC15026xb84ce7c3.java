package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

@db5.a(m123858x6ac9171 = 16)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderCropAvatarUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-publish_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderCropAvatarUI */
/* loaded from: classes8.dex */
public final class ActivityC15026xb84ce7c3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa {
    public static final /* synthetic */ int H = 0;
    public android.app.Dialog F;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f210089u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f210090v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.C15652xb39b5f9d f210091w;

    /* renamed from: z, reason: collision with root package name */
    public int f210094z;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f210088t = "Finder.FinderCropAvatarUI";

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f210092x = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.k4(this));

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f210093y = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.l4(this));
    public final double A = 1.7777777777777777d;
    public final jz5.g B = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.y4(this));
    public final jz5.g C = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.x4(this));
    public final jz5.g D = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.m4(this));
    public final jz5.g E = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.j4(this));
    public final java.lang.Runnable G = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.w4(this);

    public final android.graphics.RectF c7() {
        android.graphics.Point h17 = com.p314xaae8f345.mm.ui.bk.h(mo55332x76847179());
        float dimension = h17.x - mo55332x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df);
        float f17 = (h17.y - dimension) / 2;
        return new android.graphics.RectF(mo55332x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz), f17, mo55332x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz) + dimension, dimension + f17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.afw;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        float f17;
        float f18;
        float f19;
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f568245m81);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.C15652xb39b5f9d c15652xb39b5f9d = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.C15652xb39b5f9d) findViewById;
        this.f210091w = c15652xb39b5f9d;
        c15652xb39b5f9d.m63710x2dc94f8b(false);
        jz5.g gVar = this.f210092x;
        if (((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.C15652xb39b5f9d c15652xb39b5f9d2 = this.f210091w;
            if (c15652xb39b5f9d2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("roundCropLayout");
                throw null;
            }
            c15652xb39b5f9d2.f(c7(), ru3.o.f481296d);
        } else if (((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue() == 1) {
            if (((java.lang.Number) ((jz5.n) this.f210093y).mo141623x754a37bb()).intValue() == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.C15652xb39b5f9d c15652xb39b5f9d3 = this.f210091w;
                if (c15652xb39b5f9d3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("roundCropLayout");
                    throw null;
                }
                float dimension = mo55332x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
                float dimension2 = mo55332x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
                float f27 = 2;
                float f28 = mo55332x76847179().getResources().getDisplayMetrics().heightPixels / f27;
                float f29 = mo55332x76847179().getResources().getDisplayMetrics().widthPixels - (f27 * dimension);
                float f37 = ((float) (this.A / 2)) * f29;
                if (f28 >= f37 + dimension2) {
                    dimension2 = f28 - f37;
                    f19 = f28 + f37;
                } else {
                    f19 = mo55332x76847179().getResources().getDisplayMetrics().heightPixels - dimension2;
                }
                c15652xb39b5f9d3.f(new android.graphics.RectF(dimension, dimension2, f29 + dimension, f19), ru3.o.f481298f);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.C15652xb39b5f9d c15652xb39b5f9d4 = this.f210091w;
                if (c15652xb39b5f9d4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("roundCropLayout");
                    throw null;
                }
                c15652xb39b5f9d4.f(c7(), ru3.o.f481298f);
            }
        } else if (((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue() == 2) {
            float dimension3 = mo55332x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.C15652xb39b5f9d c15652xb39b5f9d5 = this.f210091w;
            if (c15652xb39b5f9d5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("roundCropLayout");
                throw null;
            }
            float f38 = 2;
            float c17 = r4.c(null) - (f38 * dimension3);
            float f39 = (1.0f * c17) / f38;
            float a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e8.f183664a.a() / 2;
            if (f39 + dimension3 > a17) {
                f18 = (r4 * 2) - dimension3;
                f17 = dimension3;
            } else {
                f17 = a17 - f39;
                f18 = f39 + a17;
            }
            c15652xb39b5f9d5.f(new android.graphics.RectF(dimension3, f17, c17 + dimension3, f18), ru3.o.f481298f);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.C15652xb39b5f9d c15652xb39b5f9d6 = this.f210091w;
            if (c15652xb39b5f9d6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("roundCropLayout");
                throw null;
            }
            c15652xb39b5f9d6.f(c7(), ru3.o.f481297e);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.C15652xb39b5f9d c15652xb39b5f9d7 = this.f210091w;
        if (c15652xb39b5f9d7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("roundCropLayout");
            throw null;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str = this.f210089u;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.C15652xb39b5f9d.g(c15652xb39b5f9d7, currentTimeMillis, str, true, null, null, 24, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        getWindow().setFlags(201327616, 201327616);
        m78568xd7114f24();
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.cmu);
        findViewById.setPadding(0, 0, 0, com.p314xaae8f345.mm.ui.bl.c(mo55332x76847179()));
        findViewById.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.n4(findViewById, this));
        mo64405x4dab7448(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        this.f210089u = getIntent().getStringExtra("key_source_img_path");
        this.f210090v = getIntent().getStringExtra("key_result_file_name");
        this.f210094z = getIntent().getIntExtra("key_crop_source", 0);
        mo54450xbf7c1df6("");
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77625x1f52c6));
        mo43517x10010bd5();
        jz5.g gVar = this.D;
        android.widget.Button button = (android.widget.Button) ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(button, "<get-finishBtn>(...)");
        com.p314xaae8f345.mm.ui.fk.a(button);
        ((android.widget.Button) ((jz5.n) gVar).mo141623x754a37bb()).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.q4(this));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.r4(this));
        ((android.view.View) ((jz5.n) this.C).mo141623x754a37bb()).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.s4(this));
        jz5.g gVar2 = this.E;
        android.widget.Button button2 = (android.widget.Button) ((jz5.n) gVar2).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(button2, "<get-cancelBtn>(...)");
        com.p314xaae8f345.mm.ui.fk.a(button2);
        ((android.widget.Button) ((jz5.n) gVar2).mo141623x754a37bb()).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.t4(this));
        ((android.view.View) ((jz5.n) this.B).mo141623x754a37bb()).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.u4(this));
    }
}
