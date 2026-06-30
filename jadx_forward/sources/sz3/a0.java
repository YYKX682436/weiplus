package sz3;

/* loaded from: classes15.dex */
public final class a0 implements com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.e1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f495484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.RectF f495485e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f495486f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f495487g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f495488h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ sz3.x0 f495489i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ tz3.c f495490m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ sz3.a1 f495491n;

    public a0(byte[] bArr, android.graphics.RectF rectF, int i17, int i18, int i19, sz3.x0 x0Var, tz3.c cVar, sz3.a1 a1Var) {
        this.f495484d = bArr;
        this.f495485e = rectF;
        this.f495486f = i17;
        this.f495487g = i18;
        this.f495488h = i19;
        this.f495489i = x0Var;
        this.f495490m = cVar;
        this.f495491n = a1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.RectF rectF;
        sz3.x0 x0Var;
        if (!sz3.d0.f495530g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanGoodsNoModelDetectManager", "decodeFullImage not inited");
            return;
        }
        byte[] bArr = this.f495484d;
        if (bArr == null || (rectF = this.f495485e) == null) {
            tz3.c cVar = sz3.d0.f495536m;
            if (cVar != null) {
                cVar.b(null);
                return;
            }
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("decodeFullImage localTrackId: ");
        int i17 = this.f495486f;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanGoodsNoModelDetectManager", sb6.toString());
        sz3.c1 i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.i(i17, rectF, bArr, this.f495487g, this.f495488h);
        if (i18 != null) {
            if (i18.f495517k == sz3.d1.f495540e) {
                i18.f495520n = true;
                i18.f495518l = 2;
            }
            i18.f495507a = 3;
            i18.f495508b = java.lang.System.currentTimeMillis();
            i18.f495509c = 1002;
            i18.f495510d = 3;
            java.util.ArrayList arrayList = i18.f495514h;
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                x0Var = this.f495489i;
                if (!hasNext) {
                    break;
                }
                sz3.a1 a1Var = (sz3.a1) it.next();
                sz3.a1 a1Var2 = this.f495491n;
                sz3.y0 y0Var = a1Var2.f495496e;
                y0Var.f495699g = a1Var.f495496e.f495699g;
                sz3.b1 b1Var = a1Var2.f495495d;
                a1Var.f495494c = b1Var;
                a1Var.f495495d = b1Var;
                a1Var.f495496e = y0Var;
                a1Var.f495497f = x0Var.f495685f;
            }
            java.util.Iterator it6 = x0Var.f495684e.iterator();
            int i19 = 0;
            while (it6.hasNext()) {
                java.lang.Object next = it6.next();
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                sz3.w0 w0Var = (sz3.w0) next;
                sz3.a1 a1Var3 = (sz3.a1) kz5.n0.a0(arrayList, i19);
                if (a1Var3 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17282x335f2f60 c17282x335f2f60 = a1Var3.f495492a;
                    w0Var.f495671i = c17282x335f2f60.getId();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanGoodsNoModelDetectManager", "decodeFullImage set origin trackId: %s", java.lang.Integer.valueOf(c17282x335f2f60.getId()));
                }
                i19 = i27;
            }
            i18.f495519m = x0Var;
            if (i18.f495515i == null) {
                i18.f495515i = i18.a();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.o(false);
        tz3.c cVar2 = this.f495490m;
        if (cVar2 != null) {
            cVar2.a();
        }
        tz3.c cVar3 = sz3.d0.f495536m;
        if (cVar3 != null) {
            cVar3.b(i18);
        }
    }
}
