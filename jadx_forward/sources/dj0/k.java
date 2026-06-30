package dj0;

/* loaded from: classes11.dex */
public class k implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.StreamHandler, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f314383d;

    /* renamed from: e, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529 f314384e;

    /* renamed from: f, reason: collision with root package name */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding f314385f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f314386g;

    /* renamed from: h, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink f314387h;

    /* renamed from: i, reason: collision with root package name */
    public int f314388i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.ViewTreeObserver.OnGlobalLayoutListener f314389m = new dj0.j(this);

    public final void a(android.app.Activity activity, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2) {
        if (this.f314384e == null) {
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529 c28681x6bf9b529 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529(interfaceC28679x1b8c77f2, "keyboard_util");
            this.f314384e = c28681x6bf9b529;
            c28681x6bf9b529.m138415x95b45268(this);
        }
        if (activity == null) {
            return;
        }
        android.app.Activity activity2 = this.f314383d;
        if (activity2 == null || !activity2.equals(activity)) {
            android.view.View view = this.f314386g;
            android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f314389m;
            if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.f314383d = activity;
            android.view.View findViewById = activity.findViewById(android.R.id.content);
            this.f314386g = findViewById;
            if (findViewById != null) {
                findViewById.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 interfaceC28627xb16524e3) {
        if (this.f314385f != null) {
            a(interfaceC28627xb16524e3.mo137508x19263085(), this.f314385f.m137983x3b5b91dc());
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding) {
        this.f314385f = flutterPluginBinding;
        a(null, flutterPluginBinding.m137983x3b5b91dc());
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.StreamHandler
    /* renamed from: onCancel */
    public void mo14279x3d6f0539(java.lang.Object obj) {
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        this.f314383d = null;
        android.view.View view = this.f314386g;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f314389m);
            this.f314386g = null;
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        mo262x262a05ea();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding) {
        this.f314385f = null;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529 c28681x6bf9b529 = this.f314384e;
        if (c28681x6bf9b529 != null) {
            c28681x6bf9b529.m138415x95b45268(null);
        }
        this.f314384e = null;
        this.f314387h = null;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.StreamHandler
    /* renamed from: onListen */
    public void mo14280x4d3de486(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink eventSink) {
        this.f314387h = eventSink;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 interfaceC28627xb16524e3) {
        mo260x9f807ad(interfaceC28627xb16524e3);
    }
}
