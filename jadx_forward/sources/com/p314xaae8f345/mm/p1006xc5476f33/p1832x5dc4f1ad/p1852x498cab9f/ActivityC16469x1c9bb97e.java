package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1852x498cab9f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/wemagic/WeMagicSclCommonStarterDemoUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "<init>", "()V", "mb-samples_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.magicbrush.wemagic.WeMagicSclCommonStarterDemoUI */
/* loaded from: classes8.dex */
public final class ActivityC16469x1c9bb97e extends com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f229725g = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f229726d = "WeMagicSclCommonStarterDemoUI";

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f229727e;

    /* renamed from: f, reason: collision with root package name */
    public df3.h f229728f;

    public static final void U6(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1852x498cab9f.ActivityC16469x1c9bb97e activityC16469x1c9bb97e) {
        final kw5.b bVar;
        df3.h hVar = activityC16469x1c9bb97e.f229728f;
        if (hVar != null && (bVar = hVar.f313556d) != null) {
            final sw5.a aVar = hVar.f313555c;
            aVar.getClass();
            qw5.b a17 = aVar.a(bVar, null);
            if (a17 != null) {
                com.p314xaae8f345.p3178x498cab9f.p3179xf7e5dd3b.p3181xc5476f33.scl.p3182xe480f708.b.f301575b.d(a17.f448764b);
            }
            yz5.a aVar2 = (yz5.a) ((java.util.LinkedHashMap) aVar.f495023b).get(bVar);
            if (aVar2 != null) {
                double d17 = ((ow5.a) aVar2.mo152xb9724478()).f430970i;
                if (d17 == 0.0d) {
                    aVar.b(bVar);
                } else if (d17 > 0.0d) {
                    java.util.Map map = aVar.f495025d;
                    java.lang.Runnable runnable = (java.lang.Runnable) ((java.util.LinkedHashMap) map).get(bVar);
                    android.os.Handler handler = aVar.f495024c;
                    if (runnable != null) {
                        handler.removeCallbacks(runnable);
                    }
                    java.lang.Runnable runnable2 = new java.lang.Runnable() { // from class: sw5.a$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            sw5.a this$0 = sw5.a.this;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(this$0, "this$0");
                            kw5.b handle = bVar;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handle, "$handle");
                            this$0.b(handle);
                        }
                    };
                    map.put(bVar, runnable2);
                    handler.postDelayed(runnable2, (long) (d17 * 1000));
                }
            }
        }
        activityC16469x1c9bb97e.f229728f = null;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.doh;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54450xbf7c1df6("MagicSclCommonStarterDemoUI");
        mo54448x9c8c0d33(new df3.v(this));
        df3.n nVar = (df3.n) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.t4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.t4.class));
        synchronized (nVar) {
            if (!nVar.f313560d) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3154x5dc4f1ad.d dVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3154x5dc4f1ad.d.f298913b;
                android.content.res.AssetManager assets = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(assets, "getAssets(...)");
                com.p314xaae8f345.p3133xd0ce8b26.p3171x498cab9f.C27664x7e05edb.m119310xb90145c7(assets);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3154x5dc4f1ad.c cVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3154x5dc4f1ad.c();
                cVar.f298910g = fe3.l.b() + "/mbpkgs";
                boolean[] zArr = cVar.f298912i;
                zArr[4] = true;
                cVar.f298909f = "";
                zArr[3] = true;
                cVar.f298907d = com.p314xaae8f345.mm.vfs.w6.i(com.p314xaae8f345.mm.vfs.q7.c("magicFilesBiz"), true);
                cVar.f298912i[1] = true;
                cVar.f298908e = com.p314xaae8f345.mm.vfs.w6.i(com.p314xaae8f345.mm.vfs.q7.c("magicFilesSys"), true);
                cVar.f298912i[2] = true;
                cVar.f298911h = com.p314xaae8f345.mm.vfs.w6.i(com.p314xaae8f345.mm.vfs.q7.c("magicCache"), true);
                cVar.f298912i[5] = true;
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3154x5dc4f1ad.b bVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3154x5dc4f1ad.b();
                bVar.f298903d = cVar;
                bVar.f298906g[1] = true;
                bVar.f298904e = nVar.wi();
                bVar.f298906g[2] = true;
                dVar.a(bVar);
                synchronized (com.p314xaae8f345.p3178x498cab9f.p3183xaf3f29eb.C27729x662ce60d.f301597a) {
                    if (!com.p314xaae8f345.p3178x498cab9f.p3183xaf3f29eb.C27729x662ce60d.f301598b) {
                        com.p314xaae8f345.p3178x498cab9f.net.C27739x27f2e3c5.f60647x4fbc8495.m119838x316510();
                        com.p314xaae8f345.p3178x498cab9f.p3183xaf3f29eb.p3185xe480f708.d.f301620a = new uw5.C30642x2e755d();
                        com.p314xaae8f345.p3178x498cab9f.p3183xaf3f29eb.C27729x662ce60d.f301598b = true;
                    }
                }
                uw5.f fVar = uw5.f.f513301a;
                df3.m mVar = df3.m.f313559d;
                if (uw5.f.f513302b == null) {
                    synchronized (fVar) {
                        if (uw5.f.f513302b == null) {
                            uw5.f.f513302b = mVar;
                        }
                    }
                }
                nVar.Ai();
                nVar.f313560d = true;
            }
        }
        this.f229727e = (android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.r5k);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.ngb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        ((android.widget.Button) findViewById).setOnClickListener(new df3.p(this));
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.j2h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        ((android.widget.Button) findViewById2).setOnClickListener(new df3.q(this));
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.rdq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        ((android.widget.Button) findViewById3).setOnClickListener(new df3.r(this));
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.nja);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        ((android.widget.Button) findViewById4).setOnClickListener(new df3.s(this));
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.cki);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        ((android.widget.Button) findViewById5).setOnClickListener(new df3.t(this));
        android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.r8o);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        ((android.widget.Button) findViewById6).setOnClickListener(new df3.u(this));
    }
}
