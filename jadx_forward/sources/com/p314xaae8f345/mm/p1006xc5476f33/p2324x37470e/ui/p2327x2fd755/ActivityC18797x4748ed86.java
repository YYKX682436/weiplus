package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2327x2fd755;

@db5.a(m123858x6ac9171 = 3)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/fake/VLogFakePlayActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.vlog.ui.fake.VLogFakePlayActivity */
/* loaded from: classes10.dex */
public final class ActivityC18797x4748ed86 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f257442g = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 f257443d;

    /* renamed from: e, reason: collision with root package name */
    public zv3.f f257444e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc f257445f = new com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc();

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f571131d41;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        float[] fArr;
        mo2550x7c2abd06(1);
        super.onCreate(bundle);
        m78583x85ccfe01(8);
        ai3.d.f86640a = true;
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("composition_proto");
        r45.h70 h70Var = new r45.h70();
        if (byteArrayExtra != null) {
            try {
                h70Var.mo11468x92b714fd(byteArrayExtra);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.x.d(h70Var, this.f257445f);
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.f0.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.n(), h70Var, false, new zo4.b(this), 2, null);
        android.graphics.Rect rect = new android.graphics.Rect();
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.x.f(h70Var.f457435i.f458311g, rect);
        d17.t(rect);
        lt3.n nVar = lt3.n.f402793a;
        java.util.LinkedList baseItemData = h70Var.f457437n.f456472e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(baseItemData, "baseItemData");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.util.ArrayList c17 = nVar.c(baseItemData, context);
        java.util.LinkedList values = h70Var.f457437n.f456471d.f469883d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "values");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(values, 10));
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Float.valueOf(((java.lang.Integer) it.next()).intValue()));
        }
        float[] P0 = kz5.n0.P0(arrayList);
        r45.vl5 vl5Var = h70Var.f457437n.f456474g;
        if (vl5Var != null) {
            java.util.LinkedList values2 = vl5Var.f469883d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values2, "values");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(values2, 10));
            java.util.Iterator it6 = values2.iterator();
            while (it6.hasNext()) {
                arrayList2.add(java.lang.Float.valueOf(((java.lang.Integer) it6.next()).intValue()));
            }
            fArr = kz5.n0.P0(arrayList2);
        } else {
            fArr = null;
        }
        r45.i70 i70Var = h70Var.f457435i;
        zv3.f fVar = new zv3.f(P0, fArr, c17, i70Var.f458309e, i70Var.f458310f);
        this.f257444e = fVar;
        d17.p(fVar);
        zv3.f fVar2 = this.f257444e;
        if (fVar2 != null) {
            fVar2.e();
        }
        com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 textureViewSurfaceTextureListenerC22778x581fb68 = (com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68) findViewById(com.p314xaae8f345.mm.R.id.p4g);
        this.f257443d = textureViewSurfaceTextureListenerC22778x581fb68;
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) (textureViewSurfaceTextureListenerC22778x581fb68 != null ? textureViewSurfaceTextureListenerC22778x581fb68.getLayoutParams() : null);
        if (layoutParams != null) {
            layoutParams.B = java.lang.String.valueOf((rect.width() * 1.0f) / rect.height());
            com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 textureViewSurfaceTextureListenerC22778x581fb682 = this.f257443d;
            if (textureViewSurfaceTextureListenerC22778x581fb682 != null) {
                textureViewSurfaceTextureListenerC22778x581fb682.setLayoutParams(layoutParams);
            }
        }
        com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 textureViewSurfaceTextureListenerC22778x581fb683 = this.f257443d;
        if (textureViewSurfaceTextureListenerC22778x581fb683 != null) {
            textureViewSurfaceTextureListenerC22778x581fb683.o(d17.e());
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        zv3.f fVar = this.f257444e;
        if (fVar != null) {
            fVar.a();
        }
        this.f257445f.k();
    }
}
