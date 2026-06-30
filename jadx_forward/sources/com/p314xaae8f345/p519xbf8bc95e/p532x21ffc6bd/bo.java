package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public abstract class bo<C extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn, M extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl> implements com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.InterfaceC4363x6b3e72e1<C, M, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu> {

    /* renamed from: c, reason: collision with root package name */
    public java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu> f130548c;

    /* renamed from: d, reason: collision with root package name */
    protected final android.content.Context f130549d;
    public C d_;

    /* renamed from: e, reason: collision with root package name */
    protected final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 f130550e;
    public M e_;

    /* renamed from: f, reason: collision with root package name */
    public final int f130551f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.ref.WeakReference<android.view.ViewGroup> f130552g;

    /* renamed from: h, reason: collision with root package name */
    private com.tencent.mapsdk.internal.ko.c f130553h;

    /* renamed from: i, reason: collision with root package name */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kz f130554i;

    public bo(android.content.Context context, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 c25966x7e4576a7, android.view.ViewGroup viewGroup) {
        int hashCode = hashCode();
        this.f130551f = hashCode;
        this.f130549d = context;
        this.f130552g = new java.lang.ref.WeakReference<>(viewGroup);
        this.f130550e = c25966x7e4576a7;
        if (this.f130553h == null) {
            this.f130553h = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a();
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.b();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a(this.f130553h);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kz kzVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kz(context, c25966x7e4576a7, hashCode);
        this.f130554i = kzVar;
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(hashCode, kzVar);
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kw(context, c25966x7e4576a7));
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.f131791aa, hashCode);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.C, hashCode);
        if (c25966x7e4576a7 != null) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.f131791aa, "options", c25966x7e4576a7, hashCode);
        }
    }

    private static void ad() {
    }

    private M af() {
        return this.e_;
    }

    private C ag() {
        return this.d_;
    }

    private int ah() {
        return this.f130551f;
    }

    private void c(float f17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu buVar;
        java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu> weakReference = this.f130548c;
        if (weakReference == null || (buVar = weakReference.get()) == null) {
            return;
        }
        buVar.a(f17);
    }

    public void Y() {
        C c17 = this.d_;
        if (c17 != null) {
            c17.w();
        }
    }

    public void Z() {
    }

    public final M a(C c17) {
        return mo36066x23aa1ac0(c17);
    }

    public abstract C a(android.content.Context context, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 c25966x7e4576a7);

    public void aa() {
    }

    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26058x81aff8db ab() {
        return this.d_.f130531a.m99206xf81c97c5();
    }

    public final android.view.ViewGroup ac() {
        java.lang.ref.WeakReference<android.view.ViewGroup> weakReference = this.f130552g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.InterfaceC4363x6b3e72e1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract M mo36066x23aa1ac0(C c17);

    @Override // com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.InterfaceC4363x6b3e72e1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu mo36067xb7c76985(C c17, android.view.ViewGroup viewGroup);

    @Override // com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.InterfaceC4363x6b3e72e1, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy
    /* renamed from: getMap */
    public /* bridge */ /* synthetic */ com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7 mo36068xb5885626() {
        return this.e_;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.InterfaceC4363x6b3e72e1
    /* renamed from: getMapContext */
    public /* bridge */ /* synthetic */ com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25963x17625b8 mo36069x2de760a9() {
        return this.d_;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.InterfaceC4363x6b3e72e1
    /* renamed from: getMapRenderView */
    public java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu> mo36070x17867021() {
        return this.f130548c;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy
    /* renamed from: isOpaque */
    public boolean mo36640xebeef5eb() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu buVar;
        java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu> weakReference = this.f130548c;
        if (weakReference == null || (buVar = weakReference.get()) == null) {
            return true;
        }
        return buVar.e();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy
    /* renamed from: isTouchable */
    public boolean mo36641x5bf1ff0f() {
        M m17 = this.e_;
        return m17 != null && m17.a();
    }

    public void m(boolean z17) {
        C c17 = this.d_;
        if (c17 != null) {
            c17.f130535e = z17;
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy
    /* renamed from: onCreated */
    public void mo36642x8cf48009() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.O, this.f130551f);
        this.d_ = a(this.f130549d, this.f130550e);
        Y();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.O, this.f130551f);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.P, this.f130551f);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu mo36067xb7c76985 = mo36067xb7c76985(this.d_, this.f130552g.get());
        android.view.View mo36663xfb86a31b = mo36067xb7c76985.mo36663xfb86a31b();
        mo36663xfb86a31b.setEnabled(true);
        mo36663xfb86a31b.setClickable(true);
        this.f130548c = new java.lang.ref.WeakReference<>(mo36067xb7c76985);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.P, this.f130551f);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.N, this.f130551f);
        this.e_ = mo36066x23aa1ac0(this.d_);
        Z();
        this.e_.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn.C());
        aa();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.N, this.f130551f);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.C, this.f130551f);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy
    /* renamed from: onDestroy */
    public void mo36643xac79a11b() {
        java.lang.ref.WeakReference<android.view.ViewGroup> weakReference = this.f130552g;
        if (weakReference != null) {
            android.view.ViewGroup viewGroup = weakReference.get();
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
            this.f130552g.clear();
            this.f130552g = null;
        }
        M m17 = this.e_;
        if (m17 != null) {
            m17.n();
        }
        C c17 = this.d_;
        if (c17 != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            if (bundle.size() > 0) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                bundle.writeToParcel(obtain, 0);
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.f131719d, "map-context.cache"), obtain.marshall());
                obtain.recycle();
            }
            c17.D();
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26011x93ded50c.m99332x75c480a6(c17);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.r();
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.c();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.d();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.f131790J, this.f130551f);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.f131791aa, this.f130551f);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kz kzVar = this.f130554i;
        if (kzVar != null && !kzVar.f131767d) {
            kzVar.f131767d = true;
            kzVar.f131766c = null;
            kzVar.f131768e = null;
            android.os.Handler handler = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kz.f131759f;
            if (handler != null) {
                handler.sendEmptyMessage(-102);
            }
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(this.f130551f);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy
    /* renamed from: onPause */
    public void mo36644xb01dfb57() {
        C c17 = this.d_;
        if (c17 != null) {
            c17.z();
        }
        M m17 = this.e_;
        if (m17 != null) {
            m17.k();
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy
    /* renamed from: onRestart */
    public void mo36645x91109f30() {
        M m17 = this.e_;
        if (m17 != null) {
            m17.l();
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy
    /* renamed from: onResume */
    public void mo36646x57429eec() {
        C c17 = this.d_;
        if (c17 != null) {
            c17.A();
        }
        M m17 = this.e_;
        if (m17 != null) {
            m17.j();
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy
    /* renamed from: onSizeChanged */
    public void mo36647x6521d014(int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu buVar;
        java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu> weakReference = this.f130548c;
        if (weakReference == null || (buVar = weakReference.get()) == null) {
            return;
        }
        buVar.onSizeChanged(i17, i18, i19, i27);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy
    /* renamed from: onStart */
    public void mo36648xb05099c3() {
        M m17 = this.e_;
        if (m17 != null) {
            m17.i();
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy
    /* renamed from: onStop */
    public void mo36649xc39f8281() {
        M m17 = this.e_;
        if (m17 != null) {
            m17.m();
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy
    /* renamed from: onSurfaceChanged */
    public void mo36650xd8f18906(java.lang.Object obj, int i17, int i18) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu buVar;
        java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu> weakReference = this.f130548c;
        if (weakReference == null || (buVar = weakReference.get()) == null) {
            return;
        }
        buVar.a(obj, i17, i18);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy
    /* renamed from: onUpdateOptions */
    public void mo36651x8f6b05f6(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 c25966x7e4576a7) {
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy
    /* renamed from: setOnTop */
    public void mo36652x537b3bb4(boolean z17) {
        M m17 = this.e_;
        if (m17 != null) {
            m17.a(z17);
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy
    /* renamed from: setOpaque */
    public void mo36653x1c0e5b23(boolean z17) {
        java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu> weakReference = this.f130548c;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f130548c.get().mo36664x8b17525b(z17);
    }

    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu a(C c17, android.view.ViewGroup viewGroup) {
        return mo36067xb7c76985(c17, viewGroup);
    }
}
