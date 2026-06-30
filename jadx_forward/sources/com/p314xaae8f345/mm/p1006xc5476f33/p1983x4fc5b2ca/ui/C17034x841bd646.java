package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\r"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/FakeVideoViewLayer;", "Landroid/widget/RelativeLayout;", "Lru3/c;", "Ldm/rb;", "videoEditData", "Ljz5/f0;", "setFakeVideoInfo", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.recordvideo.ui.FakeVideoViewLayer */
/* loaded from: classes10.dex */
public final class C17034x841bd646 extends android.widget.RelativeLayout implements ru3.c {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f237418s = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f237419d;

    /* renamed from: e, reason: collision with root package name */
    public r45.hi0 f237420e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 f237421f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a f237422g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f237423h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f237424i;

    /* renamed from: m, reason: collision with root package name */
    public zv3.g f237425m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f237426n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f237427o;

    /* renamed from: p, reason: collision with root package name */
    public int f237428p;

    /* renamed from: q, reason: collision with root package name */
    public int f237429q;

    /* renamed from: r, reason: collision with root package name */
    public int f237430r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17034x841bd646(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f237419d = "MicroMsg.FakeVideoViewLayer";
    }

    public final void a(zv3.g gVar) {
        boolean z17 = this.f237426n;
        java.lang.String str = this.f237419d;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "requestLoopFakeFrame stop");
            return;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar, this.f237425m)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "requestLoopFakeFrame frameRetriever not match");
            return;
        }
        r45.hi0 hi0Var = this.f237420e;
        if ((hi0Var != null && hi0Var.f457731y) || !this.f237427o) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "requestLoopFakeFrame local capture video or not useFakeImage");
            return;
        }
        zv3.a a17 = gVar.a();
        android.widget.ImageView imageView = this.f237424i;
        if (imageView != null) {
            imageView.setImageBitmap(a17 != null ? a17.f557960a : null);
        }
        android.widget.ImageView imageView2 = this.f237424i;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (a17 != null) {
            java.lang.Long valueOf = java.lang.Long.valueOf(a17.f557961b);
            long longValue = valueOf.longValue();
            java.lang.Long l17 = ((1L > longValue ? 1 : (1L == longValue ? 0 : -1)) <= 0 && (longValue > 1001L ? 1 : (longValue == 1001L ? 0 : -1)) < 0) && this.f237426n && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar, this.f237425m) ? valueOf : null;
            if (l17 != null) {
                long longValue2 = l17.longValue();
                android.widget.ImageView imageView3 = this.f237424i;
                if (imageView3 != null) {
                    imageView3.postDelayed(new ru3.b(this, gVar), longValue2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0025 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    @Override // ru3.c
    /* renamed from: setFakeVideoInfo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo68062xa62b12b2(dm.rb r10) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.C17034x841bd646.mo68062xa62b12b2(dm.rb):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17034x841bd646(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f237419d = "MicroMsg.FakeVideoViewLayer";
    }
}
