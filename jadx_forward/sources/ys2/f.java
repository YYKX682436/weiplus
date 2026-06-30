package ys2;

/* loaded from: classes3.dex */
public final class f implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f546684d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f546685e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Vibrator f546686f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f546687g;

    /* renamed from: h, reason: collision with root package name */
    public float f546688h;

    /* renamed from: i, reason: collision with root package name */
    public float f546689i;

    public f(java.lang.ref.WeakReference controller) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        this.f546684d = controller;
        this.f546685e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("vibrator");
        this.f546686f = systemService instanceof android.os.Vibrator ? (android.os.Vibrator) systemService : null;
        this.f546687g = new ys2.e(this);
    }

    public final boolean a() {
        ys2.h hVar = (ys2.h) this.f546684d.get();
        return hVar != null && hVar.f546698s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
    
        if (r11 != 3) goto L52;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ys2.f.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
