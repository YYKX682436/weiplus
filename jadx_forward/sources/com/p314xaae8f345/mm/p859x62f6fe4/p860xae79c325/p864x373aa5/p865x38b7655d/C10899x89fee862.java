package com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.p865x38b7655d;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u000b\bB\u001b\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\r¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/media/camera/view/control/CameraFocusAndMeteringView;", "Landroid/widget/RelativeLayout;", "Lxr0/b;", "setting", "Ljz5/f0;", "setCameraAbilitySetting", "Lxr0/i;", "setCameraUISetting", "Lcs0/b;", "callback", "setTouchCallback", "Lcs0/a;", "setExpoDataCallback", "", "orientation", "setCurrentOrientation", "getCurrentExpo", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-camera_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView */
/* loaded from: classes14.dex */
public final class C10899x89fee862 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public cs0.b f150414d;

    /* renamed from: e, reason: collision with root package name */
    public long f150415e;

    /* renamed from: f, reason: collision with root package name */
    public float f150416f;

    /* renamed from: g, reason: collision with root package name */
    public int f150417g;

    /* renamed from: h, reason: collision with root package name */
    public cs0.i f150418h;

    /* renamed from: i, reason: collision with root package name */
    public float f150419i;

    /* renamed from: m, reason: collision with root package name */
    public float f150420m;

    /* renamed from: n, reason: collision with root package name */
    public float f150421n;

    /* renamed from: o, reason: collision with root package name */
    public float f150422o;

    /* renamed from: p, reason: collision with root package name */
    public android.util.Range f150423p;

    /* renamed from: q, reason: collision with root package name */
    public int f150424q;

    /* renamed from: r, reason: collision with root package name */
    public int f150425r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f150426s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f150427t;

    /* renamed from: u, reason: collision with root package name */
    public cs0.a f150428u;

    /* renamed from: v, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f150429v;

    /* renamed from: w, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f150430w;

    /* renamed from: x, reason: collision with root package name */
    public int f150431x;

    /* renamed from: y, reason: collision with root package name */
    public xr0.b f150432y;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.GestureDetector f150433z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10899x89fee862(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f150416f = -1.0f;
        this.f150427t = true;
        this.f150429v = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.q1.f392103c));
        this.f150432y = new xr0.b(false, false, false, false, false, 31, null);
        android.view.GestureDetector gestureDetector = new android.view.GestureDetector(getContext(), new cs0.g(this));
        this.f150433z = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
    }

    public final boolean a() {
        android.util.Range range;
        if (this.f150432y.f537685c && (range = this.f150423p) != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(range);
            int intValue = ((java.lang.Number) range.getUpper()).intValue();
            android.util.Range range2 = this.f150423p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(range2);
            java.lang.Object lower = range2.getLower();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lower, "getLower(...)");
            if (intValue - ((java.lang.Number) lower).intValue() > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: getCurrentExpo, reason: from getter */
    public final int getF150425r() {
        return this.f150425r;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.p865x38b7655d.C10899x89fee862.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.View, com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.tencent.mm.media.camera.view.control.ImproveCameraFocusView] */
    /* renamed from: setCameraAbilitySetting */
    public final void m46839xa17643cd(xr0.b bVar) {
        if (bVar != null) {
            this.f150432y = bVar;
            com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.p865x38b7655d.C10900x6687a5d8 c10901x74919f80 = bVar.f537685c ? new com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.p865x38b7655d.C10901x74919f80(getContext()) : new com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.p865x38b7655d.C10900x6687a5d8(getContext());
            this.f150418h = c10901x74919f80;
            addView(c10901x74919f80);
            int b17 = i65.a.b(getContext(), 120);
            c10901x74919f80.c(b17, b17);
            this.f150419i = b17 / 4.0f;
        }
    }

    /* renamed from: setCameraUISetting */
    public final void m46840x982daed5(xr0.i iVar) {
        cs0.i iVar2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraFocusAndMeteringView", "setCameraUISetting:" + iVar);
        if (iVar == null || (iVar2 = this.f150418h) == null) {
            return;
        }
        iVar2.mo46845xdcc3376d(iVar.f537705a);
    }

    /* renamed from: setCurrentOrientation */
    public final void m46841x2627ce99(int i17) {
        int i18 = (i17 + com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
        cs0.i iVar = this.f150418h;
        if (iVar != null) {
            iVar.mo46846x1a6eb00e(i18);
        }
        if (this.f150431x != i18) {
            this.f150431x = i18;
        }
    }

    /* renamed from: setExpoDataCallback */
    public final void m46842xf3b6d9a3(cs0.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f150428u = callback;
    }

    /* renamed from: setTouchCallback */
    public final void m46843x73ebd762(cs0.b bVar) {
        this.f150414d = bVar;
    }
}
