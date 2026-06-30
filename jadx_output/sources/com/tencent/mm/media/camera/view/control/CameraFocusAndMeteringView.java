package com.tencent.mm.media.camera.view.control;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u000b\bB\u001b\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\r¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/media/camera/view/control/CameraFocusAndMeteringView;", "Landroid/widget/RelativeLayout;", "Lxr0/b;", "setting", "Ljz5/f0;", "setCameraAbilitySetting", "Lxr0/i;", "setCameraUISetting", "Lcs0/b;", "callback", "setTouchCallback", "Lcs0/a;", "setExpoDataCallback", "", "orientation", "setCurrentOrientation", "getCurrentExpo", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-camera_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class CameraFocusAndMeteringView extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public cs0.b f68881d;

    /* renamed from: e, reason: collision with root package name */
    public long f68882e;

    /* renamed from: f, reason: collision with root package name */
    public float f68883f;

    /* renamed from: g, reason: collision with root package name */
    public int f68884g;

    /* renamed from: h, reason: collision with root package name */
    public cs0.i f68885h;

    /* renamed from: i, reason: collision with root package name */
    public float f68886i;

    /* renamed from: m, reason: collision with root package name */
    public float f68887m;

    /* renamed from: n, reason: collision with root package name */
    public float f68888n;

    /* renamed from: o, reason: collision with root package name */
    public float f68889o;

    /* renamed from: p, reason: collision with root package name */
    public android.util.Range f68890p;

    /* renamed from: q, reason: collision with root package name */
    public int f68891q;

    /* renamed from: r, reason: collision with root package name */
    public int f68892r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f68893s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f68894t;

    /* renamed from: u, reason: collision with root package name */
    public cs0.a f68895u;

    /* renamed from: v, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f68896v;

    /* renamed from: w, reason: collision with root package name */
    public kotlinx.coroutines.r2 f68897w;

    /* renamed from: x, reason: collision with root package name */
    public int f68898x;

    /* renamed from: y, reason: collision with root package name */
    public xr0.b f68899y;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.GestureDetector f68900z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraFocusAndMeteringView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f68883f = -1.0f;
        this.f68894t = true;
        this.f68896v = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));
        this.f68899y = new xr0.b(false, false, false, false, false, 31, null);
        android.view.GestureDetector gestureDetector = new android.view.GestureDetector(getContext(), new cs0.g(this));
        this.f68900z = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
    }

    public final boolean a() {
        android.util.Range range;
        if (this.f68899y.f456152c && (range = this.f68890p) != null) {
            kotlin.jvm.internal.o.d(range);
            int intValue = ((java.lang.Number) range.getUpper()).intValue();
            android.util.Range range2 = this.f68890p;
            kotlin.jvm.internal.o.d(range2);
            java.lang.Object lower = range2.getLower();
            kotlin.jvm.internal.o.f(lower, "getLower(...)");
            if (intValue - ((java.lang.Number) lower).intValue() > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: getCurrentExpo, reason: from getter */
    public final int getF68892r() {
        return this.f68892r;
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.View, com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.tencent.mm.media.camera.view.control.ImproveCameraFocusView] */
    public final void setCameraAbilitySetting(xr0.b bVar) {
        if (bVar != null) {
            this.f68899y = bVar;
            com.tencent.mm.media.camera.view.control.CameraFocusView improveCameraFocusView = bVar.f456152c ? new com.tencent.mm.media.camera.view.control.ImproveCameraFocusView(getContext()) : new com.tencent.mm.media.camera.view.control.CameraFocusView(getContext());
            this.f68885h = improveCameraFocusView;
            addView(improveCameraFocusView);
            int b17 = i65.a.b(getContext(), 120);
            improveCameraFocusView.c(b17, b17);
            this.f68886i = b17 / 4.0f;
        }
    }

    public final void setCameraUISetting(xr0.i iVar) {
        cs0.i iVar2;
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraFocusAndMeteringView", "setCameraUISetting:" + iVar);
        if (iVar == null || (iVar2 = this.f68885h) == null) {
            return;
        }
        iVar2.setFocusColor(iVar.f456172a);
    }

    public final void setCurrentOrientation(int i17) {
        int i18 = (i17 + com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1) % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
        cs0.i iVar = this.f68885h;
        if (iVar != null) {
            iVar.setOrientation(i18);
        }
        if (this.f68898x != i18) {
            this.f68898x = i18;
        }
    }

    public final void setExpoDataCallback(cs0.a callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f68895u = callback;
    }

    public final void setTouchCallback(cs0.b bVar) {
        this.f68881d = bVar;
    }
}
