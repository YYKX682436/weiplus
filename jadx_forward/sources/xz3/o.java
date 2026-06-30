package xz3;

/* loaded from: classes15.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f539773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xz3.p f539774e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.fv5 f539775f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f539776g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f539777h;

    public o(int i17, xz3.p pVar, r45.fv5 fv5Var, java.util.List list, java.lang.String str) {
        this.f539773d = i17;
        this.f539774e = pVar;
        this.f539775f = fv5Var;
        this.f539776g = list;
        this.f539777h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.LinkedList<r45.qi> linkedList;
        java.util.Iterator it;
        int i17 = this.f539773d;
        xz3.p pVar = this.f539774e;
        long j17 = pVar.f539778e;
        sz3.p pVar2 = pVar.f539779f;
        sz3.x0 x0Var = new sz3.x0(i17, j17, pVar2.f495477a, pVar2.f495481e);
        r45.fv5 response = this.f539775f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        java.util.ArrayList arrayList = x0Var.f495684e;
        arrayList.clear();
        x0Var.f495686g = response.f76492x92037252.f458492d;
        java.util.LinkedList linkedList2 = response.f456158d;
        if (linkedList2 != null) {
            java.util.Iterator it6 = linkedList2.iterator();
            while (it6.hasNext()) {
                r45.ri riVar = (r45.ri) it6.next();
                if (riVar != null && (linkedList = riVar.f466418h) != null) {
                    for (r45.qi qiVar : linkedList) {
                        if (qiVar != null) {
                            sz3.w0 w0Var = new sz3.w0();
                            w0Var.f495666d = x0Var.f495682c;
                            java.lang.String str = qiVar.f465542g;
                            if (str == null) {
                                str = "";
                            }
                            w0Var.f495672j = str;
                            w0Var.f495671i = qiVar.f465539d;
                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19798x64b97615 c19798x64b97615 = qiVar.f465540e;
                            if (c19798x64b97615 == null || c19798x64b97615.f38932x64a572f <= 0.0f || c19798x64b97615.f38931x64a5720 <= 0.0f) {
                                it = it6;
                            } else {
                                it = it6;
                                w0Var.f495673k = new android.graphics.RectF(c19798x64b97615.f38935x7e02c1f9, c19798x64b97615.f38936x7e02c1fa, c19798x64b97615.f38933x7e02a527, c19798x64b97615.f38934x7e02a528);
                            }
                            w0Var.f495678p = response.f456161g;
                            w0Var.f495679q = qiVar.f465543h;
                            java.lang.String str2 = riVar.f466416f;
                            w0Var.f495674l = str2 != null ? str2 : "";
                            w0Var.f495677o = riVar.f466415e;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanProductRecognizeResult", "convertFromUploadResponse reqKey: %s, trackId: %s, scanImageType: %s, goodsRect: %s, needPoi: %s, action: %s", w0Var.f495672j, java.lang.Integer.valueOf(w0Var.f495671i), java.lang.Integer.valueOf(w0Var.f495666d), w0Var.f495673k, java.lang.Boolean.valueOf(response.f456160f), w0Var.f495678p);
                            arrayList.add(w0Var);
                            it6 = it;
                        }
                    }
                }
            }
        }
        x0Var.f495685f = pVar2.f495478b.f495497f;
        x0Var.f495687h = pVar2.f495483g;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f240383h = false;
        boolean z17 = !arrayList.isEmpty();
        int i18 = this.f539773d;
        if (!z17) {
            java.util.Iterator it7 = this.f539776g.iterator();
            while (it7.hasNext()) {
                int intValue = ((java.lang.Number) it7.next()).intValue();
                sz3.w0 w0Var2 = new sz3.w0();
                pVar.a(pVar2, w0Var2);
                w0Var2.f495671i = intValue;
                w0Var2.f495670h = 3;
                arrayList.add(w0Var2);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AiScanImageUploadTask", "onUploadSuccessWrapper failed because of no req key, source: %d, scanImageType: %s, requestTrackIdList: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(pVar2.f495477a), kz5.n0.g0(this.f539776g, ",", null, null, 0, null, null, 62, null));
            if (pVar.f539781h) {
                return;
            }
            pVar.f539780g.d(x0Var, this.f539773d, pVar.f539778e, 4, -1, this.f539777h);
            return;
        }
        java.util.Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            sz3.w0 w0Var3 = (sz3.w0) it8.next();
            pVar.a(pVar2, w0Var3);
            w0Var3.f495670h = 2;
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.c cVar = x0Var.f495685f;
            if (cVar != null) {
                java.lang.String str3 = w0Var3.f495678p;
                cVar.f240364h = (str3 == null || !str3.equals("retrieval_by_req_key_circle_search")) ? 1 : 2;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanImageUploadTask", "onUploadSuccess source: %d, scanImageType: %s, requestTrackIdList: %s, isCancelled: %b", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(pVar2.f495477a), kz5.n0.g0(this.f539776g, ",", null, null, 0, null, null, 62, null), java.lang.Boolean.valueOf(pVar.f539781h));
        if (pVar.f539781h) {
            return;
        }
        pVar.f539780g.c(x0Var);
    }
}
