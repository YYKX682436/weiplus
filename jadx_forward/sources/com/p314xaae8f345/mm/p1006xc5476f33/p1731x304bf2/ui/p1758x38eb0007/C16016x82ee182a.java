package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007;

/* renamed from: com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView */
/* loaded from: classes8.dex */
public class C16016x82ee182a extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12809xaf47a071 {

    /* renamed from: f2, reason: collision with root package name */
    public android.content.Context f223026f2;

    /* renamed from: g2, reason: collision with root package name */
    public int f223027g2;

    /* renamed from: h2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.f0 f223028h2;

    /* renamed from: i2, reason: collision with root package name */
    public kk.j f223029i2;

    /* renamed from: j2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.j1 f223030j2;

    /* renamed from: k2, reason: collision with root package name */
    public boolean f223031k2;

    /* renamed from: l2, reason: collision with root package name */
    public java.lang.String f223032l2;

    /* renamed from: m2, reason: collision with root package name */
    public java.lang.Runnable f223033m2;

    /* renamed from: n2, reason: collision with root package name */
    public boolean f223034n2;

    /* renamed from: o2, reason: collision with root package name */
    public android.os.Handler f223035o2;

    /* renamed from: p2, reason: collision with root package name */
    public java.util.LinkedList f223036p2;

    /* renamed from: q2, reason: collision with root package name */
    public final java.util.Set f223037q2;

    /* renamed from: r2, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b f223038r2;

    public C16016x82ee182a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f223036p2 = new java.util.LinkedList();
        this.f223037q2 = new java.util.HashSet();
        this.f223038r2 = new com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b() { // from class: com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView.4
            @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b
            public void c(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
                if (abstractC20979x809547d1 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5577x8d968bcb) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.C16016x82ee182a c16016x82ee182a = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.C16016x82ee182a.this;
                    c16016x82ee182a.getClass();
                    ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.v(c16016x82ee182a));
                }
            }
        };
    }

    public static void l1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.C16016x82ee182a c16016x82ee182a, java.lang.String str, boolean z17, int i17) {
        c16016x82ee182a.getClass();
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.z(c16016x82ee182a, str, z17, i17), "InteractiveMsg");
    }

    public static void m1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.C16016x82ee182a c16016x82ee182a, android.widget.ImageView imageView, java.lang.String str, float f17) {
        if (!((lt0.f) c16016x82ee182a.f223029i2).k(str)) {
            c16016x82ee182a.s1(imageView, str, f17);
            return;
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((jt0.i) c16016x82ee182a.f223029i2).get(str);
        if (bitmap == null || bitmap.isRecycled()) {
            c16016x82ee182a.s1(imageView, str, f17);
        } else {
            imageView.setImageBitmap(bitmap);
        }
    }

    public static void n1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.C16016x82ee182a c16016x82ee182a, android.widget.ImageView imageView, java.lang.String str) {
        if (!((lt0.f) c16016x82ee182a.f223029i2).k(str)) {
            c16016x82ee182a.s1(imageView, str, 0.0f);
            return;
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((jt0.i) c16016x82ee182a.f223029i2).get(str);
        if (bitmap == null || bitmap.isRecycled()) {
            c16016x82ee182a.s1(imageView, str, 0.0f);
        } else {
            imageView.setImageBitmap(bitmap);
        }
    }

    public static void q1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.C16016x82ee182a c16016x82ee182a, java.lang.String str, int i17, java.lang.String str2, int i18, int i19) {
        c16016x82ee182a.getClass();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        p33.z zVar = new p33.z();
        p33.y yVar = new p33.y();
        yVar.f433201d = str;
        yVar.f433203f = str2;
        yVar.f433205h = i19;
        yVar.f433204g = i18;
        yVar.f433202e = i17;
        zVar.f433206d = yVar;
        lVar.f152197a = zVar;
        lVar.f152198b = new p33.b0();
        lVar.f152199c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/quickcontentinteract";
        lVar.f152200d = 1670;
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.b0(c16016x82ee182a, lVar));
    }

    /* renamed from: getQuickReplyList */
    public java.util.LinkedList<java.lang.String> m64808xd7f4d431() {
        return this.f223036p2;
    }

    /* renamed from: getmAdapter */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.f0 m64809xd1852f78() {
        return this.f223028h2;
    }

    /* renamed from: getmContext */
    public android.content.Context m64810x4ecfc1d8() {
        return this.f223026f2;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b.d(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5577x8d968bcb.class.getName(), this.f223038r2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InteractiveMsgMRecycleView", "onAttachedToWindow");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b.e(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5577x8d968bcb.class.getName(), this.f223038r2);
        super.onDetachedFromWindow();
    }

    public final void s1(android.widget.ImageView imageView, java.lang.String str, float f17) {
        r53.v vVar = new r53.v();
        vVar.f474236a = false;
        vVar.f474242g = f17;
        r53.y.a().e(imageView, str, vVar.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.c0(this, str));
    }

    /* renamed from: setFromMsgId */
    public void m64811x5f9238b0(java.lang.String str) {
        this.f223032l2 = str;
    }

    /* renamed from: setQuickReplyList */
    public void m64812x9feb3c3d(java.util.LinkedList<java.lang.String> linkedList) {
        this.f223036p2 = linkedList;
    }

    /* renamed from: setmContext */
    public void m64813x498822e4(android.content.Context context) {
        this.f223026f2 = context;
    }

    /* renamed from: setmFromScene */
    public void m64814x2468bef7(int i17) {
        this.f223027g2 = i17;
        this.f223029i2 = new jt0.i(30, getClass());
        this.f223030j2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.j1(i17, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.t(this));
        android.content.Context m64810x4ecfc1d8 = m64810x4ecfc1d8();
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.y(this, m64810x4ecfc1d8), "InteractiveMsg");
    }

    public void t1() {
        if (this.f223028h2 == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.w(this), "InteractiveMsg");
    }

    public C16016x82ee182a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f223036p2 = new java.util.LinkedList();
        this.f223037q2 = new java.util.HashSet();
        this.f223038r2 = new com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b() { // from class: com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView.4
            @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b
            public void c(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
                if (abstractC20979x809547d1 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5577x8d968bcb) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.C16016x82ee182a c16016x82ee182a = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.C16016x82ee182a.this;
                    c16016x82ee182a.getClass();
                    ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.v(c16016x82ee182a));
                }
            }
        };
    }
}
