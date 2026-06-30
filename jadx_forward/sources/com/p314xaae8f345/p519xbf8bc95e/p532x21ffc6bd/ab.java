package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class ab {

    /* renamed from: a, reason: collision with root package name */
    public static final int f130301a = 0;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai f130302b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.SnapshotReadyCallback f130303c = null;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f130304d = new android.os.Handler(android.os.Looper.getMainLooper()) { // from class: com.tencent.mapsdk.internal.ab.1
        @Override // android.os.Handler
        public final void handleMessage(android.os.Message message) {
            if (message == null || message.what != 0) {
                return;
            }
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.SnapshotReadyCallback snapshotReadyCallback = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab.this.f130303c;
            if (snapshotReadyCallback != null) {
                snapshotReadyCallback.mo99173x79b9f2a0((android.graphics.Bitmap) message.obj);
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab.this.f130303c = null;
        }
    };

    public ab(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar) {
        this.f130302b = null;
        this.f130302b = aiVar;
    }

    private static /* synthetic */ com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.SnapshotReadyCallback b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar) {
        abVar.f130303c = null;
        return null;
    }

    private void c() {
        if (this.f130302b != null) {
            this.f130302b = null;
        }
    }

    private float d() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return -1.0f;
        }
        return aiVar.b();
    }

    private float e() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return -1.0f;
        }
        return aiVar.c();
    }

    private void f() {
    }

    private void g() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return;
        }
        aiVar.d();
    }

    private int h() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return 1000;
        }
        return aiVar.A();
    }

    private int i() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return -1;
        }
        return aiVar.f();
    }

    private boolean j() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return false;
        }
        return aiVar.h();
    }

    private void k() {
    }

    private void l() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return;
        }
        aiVar.j();
    }

    private void m() {
    }

    private void n() {
    }

    private void o() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return;
        }
        aiVar.n();
    }

    private void p() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return;
        }
        aiVar.m();
    }

    private java.lang.String q() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        return aiVar == null ? "" : aiVar.o();
    }

    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26040xa3acf778 r() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        return aiVar != null ? aiVar.p() : com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26040xa3acf778.zh;
    }

    private int s() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar != null) {
            return aiVar.r();
        }
        return -1;
    }

    private java.lang.String[] t() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar != null) {
            return aiVar.s();
        }
        return null;
    }

    private boolean u() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return false;
        }
        return aiVar.w();
    }

    private java.lang.String v() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return null;
        }
        return aiVar.z();
    }

    private void f(int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar != null) {
            aiVar.c(i17);
        }
    }

    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e a() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return null;
        }
        return aiVar.a();
    }

    public final void b(int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return;
        }
        aiVar.e(i17);
    }

    private void c(int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return;
        }
        aiVar.f(i17);
    }

    private void d(int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return;
        }
        aiVar.a(i17);
    }

    private void e(int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return;
        }
        aiVar.b(i17);
    }

    private void g(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar != null) {
            aiVar.h(z17);
        }
    }

    private void h(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return;
        }
        aiVar.i(z17);
    }

    private void b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26085x16ab0426 interfaceC26085x16ab0426) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return;
        }
        aiVar.b(interfaceC26085x16ab0426);
    }

    private void f(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar != null) {
            aiVar.g(z17);
        }
    }

    public final void a(int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return;
        }
        aiVar.d(i17);
    }

    private void c(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar != null) {
            aiVar.c(z17);
        }
    }

    private void d(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return;
        }
        aiVar.e(z17);
    }

    private void e(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return;
        }
        aiVar.f(z17);
    }

    private void b(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return;
        }
        aiVar.b(z17);
    }

    public final int a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25950xd5528c6e c25950xd5528c6e) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return Integer.MIN_VALUE;
        }
        return aiVar.a(c25950xd5528c6e);
    }

    private void b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMapLoadedCallback onMapLoadedCallback) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar != null) {
            aiVar.b(onMapLoadedCallback);
        }
    }

    public final int a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25950xd5528c6e c25950xd5528c6e, long j17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.CancelableCallback cancelableCallback) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return Integer.MIN_VALUE;
        }
        return aiVar.a(c25950xd5528c6e, j17, cancelableCallback);
    }

    private float a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d262) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return -1.0f;
        }
        return aiVar.a(c26041x873d1d26, c26041x873d1d262);
    }

    private void b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26040xa3acf778 enumC26040xa3acf778) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar != null) {
            aiVar.a(enumC26040xa3acf778);
        }
    }

    private void a(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return;
        }
        aiVar.a(z17);
    }

    @java.lang.Deprecated
    private java.lang.String b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26034x15ff5647 u17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null || (u17 = aiVar.u()) == null) {
            return null;
        }
        if (u17.m99467xf1b25d0() != null && c26041x873d1d26 != null) {
            c26041x873d1d26.f49501xaa2bac6c = u17.m99467xf1b25d0().f49501xaa2bac6c;
            c26041x873d1d26.f49502x83009af = u17.m99467xf1b25d0().f49502x83009af;
        }
        return u17.m99468x266119d5();
    }

    private void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMapClickListener onMapClickListener) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return;
        }
        aiVar.a(onMapClickListener);
    }

    private void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMapLongClickListener onMapLongClickListener) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return;
        }
        aiVar.a(onMapLongClickListener);
    }

    private void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnCameraChangeListener onCameraChangeListener) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return;
        }
        aiVar.a(onCameraChangeListener);
    }

    public final boolean b() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar != null) {
            return aiVar.x();
        }
        return false;
    }

    private void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnScaleViewChangedListener onScaleViewChangedListener) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return;
        }
        aiVar.a(onScaleViewChangedListener);
    }

    private int b(java.lang.String str) {
        if (this.f130302b == null || com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(str)) {
            return -1;
        }
        return this.f130302b.b(str);
    }

    private void a(android.os.Handler handler, android.graphics.Bitmap.Config config, int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return;
        }
        aiVar.a(handler, config, i17);
    }

    private void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.SnapshotReadyCallback snapshotReadyCallback, android.graphics.Bitmap.Config config, int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null || snapshotReadyCallback == null) {
            return;
        }
        this.f130303c = snapshotReadyCallback;
        android.os.Handler handler = this.f130304d;
        if (aiVar != null) {
            aiVar.a(handler, config, i17);
        }
    }

    private java.lang.String a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return null;
        }
        return aiVar.a(c26041x873d1d26);
    }

    private void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26085x16ab0426 interfaceC26085x16ab0426) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return;
        }
        aiVar.a(interfaceC26085x16ab0426);
    }

    private void a(int i17, int i18) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return;
        }
        aiVar.a(i17, i18);
    }

    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e a(java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ez> list, java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> list2, int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return null;
        }
        return aiVar.a(list, list2, i17, i18, i19, i27);
    }

    private void a(float f17, float f18, boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return;
        }
        aiVar.a(f17, f18, z17);
    }

    private void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnCompassClickedListener onCompassClickedListener) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar != null) {
            aiVar.a(onCompassClickedListener);
        }
    }

    private void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMapLoadedCallback onMapLoadedCallback) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar != null) {
            aiVar.a(onMapLoadedCallback);
        }
    }

    private void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnIndoorStateChangeListener onIndoorStateChangeListener) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return;
        }
        aiVar.a(onIndoorStateChangeListener);
    }

    private void a(java.lang.String str) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return;
        }
        aiVar.a(str);
    }

    private void a(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        this.f130302b.a(str, str2);
    }

    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26040xa3acf778 enumC26040xa3acf778) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar != null) {
            aiVar.b(enumC26040xa3acf778);
        }
    }

    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26088xb80c71a2 a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26089x9c7ff29c c26089x9c7ff29c) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return null;
        }
        return aiVar.a(c26089x9c7ff29c);
    }

    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26018xf8628040 a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26019xdcd7d63e c26019xdcd7d63e) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return null;
        }
        return aiVar.a(c26019xdcd7d63e);
    }

    private void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b c26042xcb530b7b, int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return;
        }
        aiVar.a(c26042xcb530b7b, i17);
    }

    private void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnTrafficEventClickListener onTrafficEventClickListener) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.f130302b;
        if (aiVar == null) {
            return;
        }
        aiVar.a(onTrafficEventClickListener);
    }
}
