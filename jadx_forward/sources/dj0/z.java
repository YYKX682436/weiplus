package dj0;

/* loaded from: classes14.dex */
public final class z implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f {

    /* renamed from: d, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f314422d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Activity f314423e;

    /* renamed from: f, reason: collision with root package name */
    public dj0.i f314424f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f314425g;

    /* renamed from: h, reason: collision with root package name */
    public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 f314426h;

    public final void a(double d17) {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = this.f314422d;
        if (c28688xe8dbe4c2 != null) {
            c28688xe8dbe4c2.m138438xd8c5c779("didScroll", java.lang.Double.valueOf(d17));
        }
    }

    public final android.view.View b(android.view.ViewGroup viewGroup, java.lang.Class cls) {
        android.view.View b17;
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            if (cls.isInstance(childAt)) {
                return (android.view.View) cls.cast(childAt);
            }
            if ((childAt instanceof android.view.ViewGroup) && (b17 = b((android.view.ViewGroup) childAt, cls)) != null) {
                return b17;
            }
        }
        return null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        dj0.i iVar;
        android.view.Window window;
        android.view.Window window2;
        android.view.Window window3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f314423e = binding.mo137508x19263085();
        android.view.ViewConfiguration.get(binding.mo137508x19263085()).getScaledTouchSlop();
        android.app.Activity activity = this.f314423e;
        r1 = null;
        android.view.View view = null;
        if (!(((activity == null || (window3 = activity.getWindow()) == null) ? null : window3.getDecorView()) instanceof android.view.ViewGroup)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("attach decor view error, decor view is ");
            android.app.Activity activity2 = this.f314423e;
            if (activity2 != null && (window2 = activity2.getWindow()) != null) {
                view = window2.getDecorView();
            }
            sb6.append(view);
            io.p3284xd2ae381c.Log.w("NativeScrollViewPlugin", sb6.toString());
            return;
        }
        android.app.Activity activity3 = this.f314423e;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((activity3 == null || (window = activity3.getWindow()) == null) ? null : window.getDecorView());
        if (viewGroup != null) {
            io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 c28553x45ef20c1 = this.f314426h;
            if (c28553x45ef20c1 == null) {
                c28553x45ef20c1 = (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1) b(viewGroup, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1.class);
            }
            this.f314426h = c28553x45ef20c1;
        }
        if (this.f314424f == null) {
            android.content.Context applicationContext = binding.mo137508x19263085().getApplicationContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(applicationContext, "getApplicationContext(...)");
            dj0.i iVar2 = new dj0.i(applicationContext);
            this.f314424f = iVar2;
            iVar2.f314369n = this;
            iVar2.f314362d.i(true);
            dj0.i iVar3 = this.f314424f;
            if (iVar3 != null) {
                iVar3.A = this.f314426h;
            }
            io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 c28553x45ef20c12 = this.f314426h;
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) (c28553x45ef20c12 != null ? c28553x45ef20c12.getParent() : null);
            if (viewGroup2 != null) {
                int indexOfChild = viewGroup2.indexOfChild(this.f314426h);
                dj0.i iVar4 = this.f314424f;
                int i17 = indexOfChild + 1;
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 c28553x45ef20c13 = this.f314426h;
                viewGroup2.addView(iVar4, i17, c28553x45ef20c13 != null ? c28553x45ef20c13.getLayoutParams() : null);
            }
            if (!this.f314425g || (iVar = this.f314424f) == null) {
                return;
            }
            iVar.B = true;
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(binding.m137983x3b5b91dc(), "nativeScroll");
        this.f314422d = c28688xe8dbe4c2;
        c28688xe8dbe4c2.m138441xdf757329(new dj0.y(this));
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        this.f314423e = null;
        this.f314426h = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        dj0.i iVar = this.f314424f;
        if (iVar != null) {
            iVar.f314364f = 0;
            iVar.f314363e.forceFinished(true);
            iVar.f314365g = 0;
            android.view.VelocityTracker velocityTracker = iVar.f314377v;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            iVar.f314377v = null;
        }
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = this.f314422d;
        if (c28688xe8dbe4c2 != null) {
            c28688xe8dbe4c2.m138441xdf757329(null);
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }
}
