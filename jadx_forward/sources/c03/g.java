package c03;

/* loaded from: classes2.dex */
public final class g extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23883xf443e89e {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f119187d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f119188e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23879xfb507da3 f119189f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f119190g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f119191h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.EnumC23878x4bcb0c82 f119192i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f119191h = kz5.p0.f395529d;
        this.f119192i = com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.EnumC23878x4bcb0c82.f42513x19d1382a;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23883xf443e89e
    /* renamed from: cancelHalfScreen */
    public void mo13981xc7b0f499(boolean z17) {
        gx2.q qVar;
        java.lang.ref.WeakReference weakReference = this.f119187d;
        if (weakReference == null || (qVar = (gx2.q) weakReference.get()) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1.b(qVar, false, null, false, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23883xf443e89e.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23883xf443e89e.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23883xf443e89e.Companion.m88508x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
        this.f119189f = new com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23879xfb507da3(m137983x3b5b91dc2, null, 2, 0 == true ? 1 : 0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        gx2.q qVar;
        gx2.q qVar2;
        java.lang.ref.WeakReference weakReference = this.f119187d;
        boolean z17 = false;
        if (weakReference != null && (qVar2 = (gx2.q) weakReference.get()) != null && qVar2.isDrawerOpen) {
            z17 = true;
        }
        if (!z17) {
            return super.mo2274xbdc3c5dc();
        }
        java.lang.ref.WeakReference weakReference2 = this.f119187d;
        if (weakReference2 != null && (qVar = (gx2.q) weakReference2.get()) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1.b(qVar, false, gx2.r.f358911g, false, null, 13, null);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        pi0.n1 n1Var;
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.EnumC23878x4bcb0c82 enumC23878x4bcb0c82 = com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.EnumC23878x4bcb0c82.f42513x19d1382a;
        if (enumC23878x4bcb0c82 != this.f119192i) {
            this.f119192i = enumC23878x4bcb0c82;
            java.util.Objects.toString(this.f119189f);
            com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23879xfb507da3 c23879xfb507da3 = this.f119189f;
            if (c23879xfb507da3 != null) {
                c23879xfb507da3.m88503x7668805a(enumC23878x4bcb0c82, new c03.a(this));
            }
        }
        java.lang.ref.WeakReference weakReference = this.f119188e;
        if (weakReference == null || (n1Var = (pi0.n1) weakReference.get()) == null) {
            return;
        }
        n1Var.a();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23883xf443e89e.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23883xf443e89e.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23883xf443e89e.Companion.m88508x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        this.f119189f = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onFinished */
    public void mo13982x7cf2e371() {
        pi0.n1 n1Var;
        super.mo13982x7cf2e371();
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.EnumC23878x4bcb0c82 enumC23878x4bcb0c82 = com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.EnumC23878x4bcb0c82.f42513x19d1382a;
        if (enumC23878x4bcb0c82 != this.f119192i) {
            this.f119192i = enumC23878x4bcb0c82;
            java.util.Objects.toString(this.f119189f);
            com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23879xfb507da3 c23879xfb507da3 = this.f119189f;
            if (c23879xfb507da3 != null) {
                c23879xfb507da3.m88503x7668805a(enumC23878x4bcb0c82, new c03.a(this));
            }
        }
        java.lang.ref.WeakReference weakReference = this.f119188e;
        if (weakReference == null || (n1Var = (pi0.n1) weakReference.get()) == null) {
            return;
        }
        n1Var.a();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23883xf443e89e
    /* renamed from: updateDragPreventState */
    public void mo13983xb58303d6(boolean z17) {
        this.f119190g = z17;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23883xf443e89e
    /* renamed from: updateHalfScreenContentHeight */
    public void mo13984x3e61bbb8(double d17) {
        gx2.q qVar;
        java.lang.ref.WeakReference weakReference = this.f119187d;
        if (weakReference == null || (qVar = (gx2.q) weakReference.get()) == null) {
            return;
        }
        qVar.mo62645x46e30de3(i65.a.a(m80379x76847179(), (float) d17) + qVar.m132459xc8f1ea3e().getHeight());
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23883xf443e89e
    /* renamed from: updatePreventDragArea */
    public void mo13985x7b6b4dd0(java.util.List areas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(areas, "areas");
        this.f119191h = areas;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f119191h = kz5.p0.f395529d;
        this.f119192i = com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.EnumC23878x4bcb0c82.f42513x19d1382a;
    }
}
