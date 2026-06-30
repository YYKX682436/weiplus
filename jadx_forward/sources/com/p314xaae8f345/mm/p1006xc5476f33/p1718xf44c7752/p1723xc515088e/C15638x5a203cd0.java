package com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0002¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/gallery/picker/GalleryPickerFragment;", "Landroidx/fragment/app/Fragment;", "", "Ld33/s0;", "Lcom/tencent/mm/plugin/gallery/model/GalleryItem$MediaItem;", "plugin-gallery_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.gallery.picker.GalleryPickerFragment */
/* loaded from: classes10.dex */
public final class C15638x5a203cd0 extends com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6 implements d33.s0 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f219985h = 0;

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f219986d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.C15648xa9786f1e f219987e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f219988f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f219989g;

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onActivityCreated */
    public void mo7495x78cb4fa(android.os.Bundle bundle) {
        super.mo7495x78cb4fa(bundle);
        t23.x1 x1Var = a33.c.f82589a;
        t23.x1 x1Var2 = new t23.x1();
        a33.c.f82589a = x1Var2;
        x1Var2.g(3);
        t23.x1 x1Var3 = a33.c.f82589a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(x1Var3);
        a33.b bVar = a33.c.f82590b;
        x1Var3.b(bVar);
        t23.x1 x1Var4 = a33.c.f82589a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(x1Var4);
        a33.a aVar = a33.c.f82591c;
        x1Var4.f496825a.add(aVar);
        w23.f fVar = new w23.f(this);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str = a33.c.f82593e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183 c15630x7d8d0183 = new com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183(str, 0);
        bVar.f82588e = fVar;
        bVar.f82587d = currentTimeMillis;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183 c15630x7d8d01832 = a33.c.f82592d;
        java.lang.String str2 = c15630x7d8d0183.f219948d;
        boolean z17 = c15630x7d8d01832 == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c15630x7d8d01832.f219948d, str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PickerDataLoader", "[onLoad] ticket=" + currentTimeMillis + " isNeed=" + z17);
        if (!z17) {
            fVar.mo147xb9724478(java.lang.Boolean.FALSE, new java.util.LinkedList(), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, str)) {
            t23.x1 x1Var5 = a33.c.f82589a;
            if (x1Var5 != null) {
                x1Var5.e("", 3, currentTimeMillis);
            }
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, a33.c.f82594f)) {
            t23.x1 x1Var6 = a33.c.f82589a;
            if (x1Var6 != null) {
                x1Var6.e("", 2, currentTimeMillis);
            }
        } else {
            t23.x1 x1Var7 = a33.c.f82589a;
            if (x1Var7 != null) {
                x1Var7.e(str2, c15630x7d8d0183.f219953i.mo63659xfb85f7b0(), currentTimeMillis);
            }
        }
        a33.c.f82592d = c15630x7d8d0183;
        w23.h hVar = new w23.h(this);
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PickerDataLoader", "[onLoadFolder] ticket=" + currentTimeMillis2);
        aVar.f82586e = hVar;
        aVar.f82585d = currentTimeMillis2;
        t23.x1 x1Var8 = a33.c.f82589a;
        if (x1Var8 != null) {
            x1Var8.d();
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inflater, "inflater");
        android.view.View inflate = inflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bdn, viewGroup, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.gig);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f219986d = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.l3x);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.C15648xa9786f1e c15648xa9786f1e = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.C15648xa9786f1e) findViewById2;
        this.f219987e = c15648xa9786f1e;
        c15648xa9786f1e.getLayoutParams().height = (int) ((m7460x893a2f6f().getDisplayMetrics().widthPixels * 3.5f) / 3.0f);
        c15648xa9786f1e.requestLayout();
        c15648xa9786f1e.setOnClickListener(new w23.d(this));
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f567547jv2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById3;
        this.f219988f = imageView;
        imageView.setBackground(null);
        android.widget.ImageView imageView2 = this.f219988f;
        if (imageView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("multiSelectedIcon");
            throw null;
        }
        imageView2.setOnClickListener(new w23.b(this));
        android.widget.ImageView imageView3 = this.f219988f;
        if (imageView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("multiSelectedIcon");
            throw null;
        }
        imageView3.setVisibility(8);
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1725x31c90fad.C15640x214e188 c15640x214e188 = new com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1725x31c90fad.C15640x214e188(mo7438x76847179(), 4);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f219986d;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("galleryView");
            throw null;
        }
        c1163xf1deaba4.mo7967x900dcbe1(c15640x214e188);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f219986d;
        if (c1163xf1deaba42 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("galleryView");
            throw null;
        }
        c1163xf1deaba42.mo7960x6cab2c8d(null);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.f219986d;
        if (c1163xf1deaba43 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("galleryView");
            throw null;
        }
        c1163xf1deaba43.N(new w23.a(this));
        w23.c cVar = new w23.c();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba44 = this.f219986d;
        if (c1163xf1deaba44 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("galleryView");
            throw null;
        }
        c1163xf1deaba44.m7964x8d4ad49c(cVar);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba45 = this.f219986d;
        if (c1163xf1deaba45 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("galleryView");
            throw null;
        }
        c1163xf1deaba45.m7963x830bc99d(true);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.y2 y2Var = new p012xc85e97e9.p103xe821e364.p104xd1075a44.y2();
        y2Var.e(1, 80);
        y2Var.e(2, 60);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba46 = this.f219986d;
        if (c1163xf1deaba46 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("galleryView");
            throw null;
        }
        c1163xf1deaba46.m7971xa810ec34(y2Var);
        c15640x214e188.m8091xc21abdf5(true);
        c15640x214e188.f93414u = 30;
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        t23.x1 x1Var = a33.c.f82589a;
        a33.c.f82592d = null;
        t23.x1 x1Var2 = a33.c.f82589a;
        if (x1Var2 != null) {
            java.util.HashSet hashSet = x1Var2.f496825a;
            if (hashSet != null) {
                hashSet.clear();
            }
            java.util.HashSet hashSet2 = x1Var2.f496827c;
            if (hashSet2 != null) {
                hashSet2.clear();
            }
            java.util.HashSet hashSet3 = x1Var2.f496828d;
            if (hashSet3 != null) {
                hashSet3.clear();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onPause */
    public void mo7512xb01dfb57() {
        super.mo7512xb01dfb57();
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.C15648xa9786f1e c15648xa9786f1e = this.f219987e;
        if (c15648xa9786f1e != null) {
            c15648xa9786f1e.m63677x4ee17f0a().e();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("previewContainer");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        super.mo7517x57429eec();
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.C15648xa9786f1e c15648xa9786f1e = this.f219987e;
        if (c15648xa9786f1e != null) {
            c15648xa9786f1e.m63677x4ee17f0a().g();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("previewContainer");
            throw null;
        }
    }
}
