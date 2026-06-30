package gf2;

/* loaded from: classes10.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.c02 f352784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.rfx.C20942x379cf5ee f352785e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f352786f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.rfx.C20942x379cf5ee f352787g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f352788h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1485x1fb0fe64.p1486x373aa5.C14195x2dafdb49 f352789i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f352790m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(r45.c02 c02Var, com.p314xaae8f345.mm.rfx.C20942x379cf5ee c20942x379cf5ee, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b, com.p314xaae8f345.mm.rfx.C20942x379cf5ee c20942x379cf5ee2, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1485x1fb0fe64.p1486x373aa5.C14195x2dafdb49 c14195x2dafdb49, android.view.View view, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f352784d = c02Var;
        this.f352785e = c20942x379cf5ee;
        this.f352786f = c22789xd23e9a9b;
        this.f352787g = c20942x379cf5ee2;
        this.f352788h = str;
        this.f352789i = c14195x2dafdb49;
        this.f352790m = view;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gf2.a(this.f352784d, this.f352785e, this.f352786f, this.f352787g, this.f352788h, this.f352789i, this.f352790m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        gf2.a aVar = (gf2.a) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        aVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.String m75945x2fec8307 = this.f352784d.m75945x2fec8307(2);
        com.p314xaae8f345.mm.rfx.C20942x379cf5ee pagCompositionForView = this.f352785e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(pagCompositionForView, "$pagCompositionForView");
        gf2.b.a(pagCompositionForView, "customText", m75945x2fec8307);
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f352786f;
        c22789xd23e9a9b.o(true);
        c22789xd23e9a9b.mo82566x3e3ac3e8(pagCompositionForView);
        c22789xd23e9a9b.m82583xcde73672(1);
        com.p314xaae8f345.mm.rfx.C20942x379cf5ee pagCompositionForBitmap = this.f352787g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(pagCompositionForBitmap, "$pagCompositionForBitmap");
        gf2.b.a(pagCompositionForBitmap, "customText", m75945x2fec8307);
        com.p314xaae8f345.mm.rfx.C20941x51967e92 m77370x247a0e = com.p314xaae8f345.mm.rfx.C20941x51967e92.m77370x247a0e(pagCompositionForBitmap);
        int m77385x333fdfcc = m77370x247a0e.m77385x333fdfcc() - 1;
        android.graphics.Bitmap m77382x440cbe32 = m77370x247a0e.m77382x440cbe32(m77385x333fdfcc);
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Boolean.FALSE);
        arrayList.add(config);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m77382x440cbe32, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/anchormilestoneshare/view/AnchorMilestoneShareView$asyncConfigPag$1$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap copy = m77382x440cbe32.copy((android.graphics.Bitmap.Config) arrayList.get(0), ((java.lang.Boolean) arrayList.get(1)).booleanValue());
        yj0.a.e(m77382x440cbe32, copy, "com/tencent/mm/plugin/finder/live/controller/anchormilestoneshare/view/AnchorMilestoneShareView$asyncConfigPag$1$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
        boolean z17 = copy != null;
        java.lang.String str = this.f352788h;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMilestoneShareView", "get bitmap from pagView: " + c22789xd23e9a9b + ", pagUrl:" + str + ", index:" + m77385x333fdfcc);
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1485x1fb0fe64.p1486x373aa5.C14195x2dafdb49.f193104t;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1485x1fb0fe64.p1486x373aa5.C14195x2dafdb49 c14195x2dafdb49 = this.f352789i;
            android.view.View view = this.f352790m;
            c14195x2dafdb49.e(view);
            gf2.z zVar = (gf2.z) ((java.util.LinkedHashMap) c14195x2dafdb49.f193116r).get(view);
            if (zVar != null) {
                zVar.f352860b = copy;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveAnchorMilestoneShareView", "cannot get bitmap from pagView: " + c22789xd23e9a9b + ", pagUrl:" + str);
        }
        return jz5.f0.f384359a;
    }
}
