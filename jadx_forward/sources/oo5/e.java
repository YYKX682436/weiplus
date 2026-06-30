package oo5;

/* loaded from: classes8.dex */
public final class e implements io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f428738d;

    /* renamed from: e, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f428739e;

    /* renamed from: f, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 f428740f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.RelativeLayout f428741g;

    /* renamed from: h, reason: collision with root package name */
    public oo5.f f428742h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f428743i;

    /* renamed from: m, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f428744m;

    /* renamed from: n, reason: collision with root package name */
    public int f428745n;

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0169, code lost:
    
        if (r2.f428748c == true) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(android.content.Context r21, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 r22, int r23, java.util.Map r24, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 r25) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oo5.e.<init>(android.content.Context, io.flutter.plugin.common.BinaryMessenger, int, java.util.Map, io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding):void");
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
    /* renamed from: dispose */
    public void mo31847x63a5261f() {
        try {
            java.lang.String str = this.f428743i;
            oo5.f fVar = this.f428742h;
            com.p314xaae8f345.p3210x3857dc.r1.a(str, fVar != null ? fVar.f428746a : null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPMP.NativePreviewFileView", "dispose finishReadFile failed", e17);
        }
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = this.f428744m;
        if (c28688xe8dbe4c2 != null) {
            c28688xe8dbe4c2.m138441xdf757329(null);
        }
        this.f428744m = null;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
    /* renamed from: getView */
    public android.view.View mo31848xfb86a31b() {
        return this.f428741g;
    }
}
