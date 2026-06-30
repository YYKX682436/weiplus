package j33;

/* loaded from: classes10.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f379000d;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f379001e;

    /* renamed from: f, reason: collision with root package name */
    public final int f379002f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f379003g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f379004h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f379005i;

    /* renamed from: m, reason: collision with root package name */
    public e06.k f379006m;

    /* renamed from: n, reason: collision with root package name */
    public e06.k f379007n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Set f379008o;

    public x(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de layoutManager, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutManager, "layoutManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        this.f379000d = layoutManager;
        this.f379001e = recyclerView;
        this.f379002f = i17;
        this.f379003g = "MicroMsg.AlbumScrollPerformanceUIC.ResumeGalleryVisibleBindHolderTask[" + hashCode() + ']';
        this.f379008o = new java.util.LinkedHashSet();
    }

    @Override // java.lang.Runnable
    public void run() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = this.f379000d;
        int w17 = c1162x665295de.w();
        int y17 = c1162x665295de.y();
        int i17 = y17 - w17;
        int max = (java.lang.Math.max(this.f379002f, i17) - i17) / 2;
        int b17 = h3.a.b(w17 - max, 0, w17);
        int b18 = h3.a.b(max + y17, y17, c1162x665295de.m8020x7e414b06() - 1);
        this.f379006m = new e06.k(b17, w17 - 1);
        this.f379007n = new e06.k(y17 + 1, b18);
        this.f379008o.clear();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f379003g, "resumeAdapterBind: visible:[" + w17 + ", " + y17 + "], todo: [" + b17 + ',' + b18 + "], upRecheckPosRange=" + this.f379006m + ", downRecheckPosRange=" + this.f379007n);
        if (w17 <= y17) {
            while (!this.f379004h) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f379001e;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = c1163xf1deaba4.p0(w17);
                if (p07 != null && (mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19()) != null) {
                    mo7946xf939df19.mo864xe5e2e48d(p07, w17);
                }
                if (w17 == y17) {
                    break;
                } else {
                    w17++;
                }
            }
        }
        this.f379005i = true;
    }
}
