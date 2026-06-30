package xz3;

/* loaded from: classes15.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xz3.j f539758d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.cv5 f539759e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f539760f;

    public i(xz3.j jVar, r45.cv5 cv5Var, int i17) {
        this.f539758d = jVar;
        this.f539759e = cv5Var;
        this.f539760f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xz3.j jVar = this.f539758d;
        sz3.x0 x0Var = jVar.f539762f.f495608h;
        x0Var.getClass();
        r45.cv5 response = this.f539759e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        java.util.LinkedList results = response.f453387d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(results, "results");
        java.util.Iterator it = results.iterator();
        int i17 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            int i18 = 1;
            java.util.ArrayList arrayList = x0Var.f495684e;
            int i19 = 4;
            if (!hasNext) {
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    sz3.w0 productItem = (sz3.w0) it6.next();
                    sz3.n request = jVar.f539762f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(productItem, "productItem");
                    productItem.f495664b = request.f495480d;
                    productItem.f495665c = request.f495479c;
                    productItem.f495666d = request.f495477a;
                    productItem.f495667e = request.f495478b;
                    productItem.f495670h = 4;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.c cVar = x0Var.f495685f;
                    if (cVar != null) {
                        java.lang.String str = productItem.f495678p;
                        cVar.f240364h = (str == null || !str.equals("retrieval_by_req_key_circle_search")) ? 1 : 2;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanImageRetrievalTask", "onRetrievalSuccess source: %d, isCancelled: %b, requestTrackIdList: %s", java.lang.Integer.valueOf(this.f539760f), java.lang.Boolean.valueOf(jVar.f539765i), kz5.n0.g0(jVar.f539766m, ",", null, null, 0, null, null, 62, null));
                if (jVar.f539765i) {
                    return;
                }
                jVar.f539763g.h(x0Var);
                return;
            }
            java.lang.Object next = it.next();
            int i27 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.ls5 ls5Var = (r45.ls5) next;
            sz3.w0 w0Var = (sz3.w0) kz5.n0.a0(arrayList, i17);
            if (w0Var != null) {
                java.lang.String str2 = ls5Var.f461336d;
                if (str2 == null) {
                    str2 = "";
                }
                w0Var.f495674l = str2;
                java.lang.String str3 = ls5Var.f461337e;
                w0Var.f495675m = str3 != null ? str3 : "";
                int i28 = ls5Var.f461338f;
                if (i28 != 0) {
                    if (i28 != 1) {
                        i18 = 3;
                        if (i28 != 2) {
                            if (i28 != 3) {
                                i19 = 0;
                            }
                        }
                    } else {
                        i19 = 2;
                    }
                    w0Var.f495676n = i19;
                    w0Var.f495677o = ls5Var.f461339g;
                    w0Var.f495678p = response.f453389f;
                    w0Var.f495679q = ls5Var.f461340h;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanProductRecognizeResult", "updateFromRetrievalResponse scanImageType: " + w0Var.f495666d + ", " + w0Var);
                }
                i19 = i18;
                w0Var.f495676n = i19;
                w0Var.f495677o = ls5Var.f461339g;
                w0Var.f495678p = response.f453389f;
                w0Var.f495679q = ls5Var.f461340h;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanProductRecognizeResult", "updateFromRetrievalResponse scanImageType: " + w0Var.f495666d + ", " + w0Var);
            }
            i17 = i27;
        }
    }
}
