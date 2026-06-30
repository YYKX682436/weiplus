package com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143;

/* renamed from: com.tencent.mapsdk.vector.VectorMapDelegateProxy */
/* loaded from: classes13.dex */
public class C4431xd7db370 implements com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.InterfaceC4363x6b3e72e1<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne, com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu> {

    /* renamed from: mMapDelegate */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr f17556xb1e1dc54;

    public C4431xd7db370(android.content.Context context, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 c25966x7e4576a7, android.view.ViewGroup viewGroup) {
        this.f17556xb1e1dc54 = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr(context, c25966x7e4576a7, viewGroup);
    }

    /* renamed from: getMapId */
    private int m37475x74cb6de1() {
        if (mo36069x2de760a9() != null) {
            return mo36069x2de760a9().K;
        }
        return -1;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.InterfaceC4363x6b3e72e1
    /* renamed from: getMapRenderView */
    public java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu> mo36070x17867021() {
        return this.f17556xb1e1dc54.mo36070x17867021();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy
    /* renamed from: isOpaque */
    public boolean mo36640xebeef5eb() {
        return this.f17556xb1e1dc54.mo36640xebeef5eb();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy
    /* renamed from: isTouchable */
    public boolean mo36641x5bf1ff0f() {
        return this.f17556xb1e1dc54.mo36641x5bf1ff0f();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy
    /* renamed from: onCreated */
    public void mo36642x8cf48009() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.D, m37475x74cb6de1());
        this.f17556xb1e1dc54.mo36642x8cf48009();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.D, m37475x74cb6de1());
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy
    /* renamed from: onDestroy */
    public void mo36643xac79a11b() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.f131790J, m37475x74cb6de1());
        this.f17556xb1e1dc54.mo36643xac79a11b();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy
    /* renamed from: onPause */
    public void mo36644xb01dfb57() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.G, m37475x74cb6de1());
        this.f17556xb1e1dc54.mo36644xb01dfb57();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.G, m37475x74cb6de1());
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy
    /* renamed from: onRestart */
    public void mo36645x91109f30() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.H, m37475x74cb6de1());
        this.f17556xb1e1dc54.mo36645x91109f30();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.H, m37475x74cb6de1());
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy
    /* renamed from: onResume */
    public void mo36646x57429eec() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.F, m37475x74cb6de1());
        this.f17556xb1e1dc54.mo36646x57429eec();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.F, m37475x74cb6de1());
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy
    /* renamed from: onSizeChanged */
    public void mo36647x6521d014(int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.L, m37475x74cb6de1());
        this.f17556xb1e1dc54.mo36647x6521d014(i17, i18, i19, i27);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.L, m37475x74cb6de1());
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy
    /* renamed from: onStart */
    public void mo36648xb05099c3() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.E, m37475x74cb6de1());
        this.f17556xb1e1dc54.mo36648xb05099c3();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.E, m37475x74cb6de1());
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy
    /* renamed from: onStop */
    public void mo36649xc39f8281() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.I, m37475x74cb6de1());
        this.f17556xb1e1dc54.mo36649xc39f8281();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.I, m37475x74cb6de1());
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy
    /* renamed from: onSurfaceChanged */
    public void mo36650xd8f18906(java.lang.Object obj, int i17, int i18) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.M, m37475x74cb6de1());
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.M, "width", java.lang.Integer.valueOf(i17), m37475x74cb6de1());
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.M, "height", java.lang.Integer.valueOf(i18), m37475x74cb6de1());
        this.f17556xb1e1dc54.mo36650xd8f18906(obj, i17, i18);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.M, m37475x74cb6de1());
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy
    /* renamed from: onTouchEvent */
    public boolean mo37007x667eb1da(android.view.MotionEvent motionEvent) {
        return this.f17556xb1e1dc54.mo37007x667eb1da(motionEvent);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy
    /* renamed from: onUpdateOptions */
    public void mo36651x8f6b05f6(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 c25966x7e4576a7) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.K, m37475x74cb6de1());
        this.f17556xb1e1dc54.mo36651x8f6b05f6(c25966x7e4576a7);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.K, m37475x74cb6de1());
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy
    /* renamed from: setOnTop */
    public void mo36652x537b3bb4(boolean z17) {
        this.f17556xb1e1dc54.mo36652x537b3bb4(z17);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy
    /* renamed from: setOpaque */
    public void mo36653x1c0e5b23(boolean z17) {
        this.f17556xb1e1dc54.mo36653x1c0e5b23(z17);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.InterfaceC4363x6b3e72e1
    /* renamed from: createMap, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 mo36066x23aa1ac0(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar) {
        return this.f17556xb1e1dc54.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr) neVar);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.InterfaceC4363x6b3e72e1
    /* renamed from: createMapView, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu mo36067xb7c76985(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar, android.view.ViewGroup viewGroup) {
        return this.f17556xb1e1dc54.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr) neVar, viewGroup);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.InterfaceC4363x6b3e72e1, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy
    /* renamed from: getMap */
    public com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 mo36068xb5885626() {
        return (com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f17556xb1e1dc54.e_;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.InterfaceC4363x6b3e72e1
    /* renamed from: getMapContext */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne mo36069x2de760a9() {
        return (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne) this.f17556xb1e1dc54.d_;
    }
}
