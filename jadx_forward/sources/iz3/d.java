package iz3;

/* loaded from: classes12.dex */
public final class d implements hz3.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f377602a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ry3.p f377603b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ry3.r f377604c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iz3.j f377605d;

    public d(long j17, ry3.p pVar, ry3.r rVar, iz3.j jVar) {
        this.f377602a = j17;
        this.f377603b = pVar;
        this.f377604c = rVar;
        this.f377605d = jVar;
    }

    public void a(int i17, int i18, java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AiImageCDNUploader", "uploadImage-cdn onError %s %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), errMsg);
        iz3.f fVar = iz3.f.f377608a;
        long j17 = this.f377602a;
        int i19 = this.f377603b.f483061b;
        ry3.r rVar = this.f377604c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseAiImageUploader", "onScanFailed session: %d, errCode: %d, errMsg: %s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i18), errMsg);
        ry3.q qVar = new ry3.q();
        qVar.f483076a = j17;
        qVar.f483077b = false;
        qVar.f483078c = i17;
        qVar.f483079d = i18;
        qVar.f483080e = errMsg;
        ((ku5.t0) ku5.t0.f394148d).B(new iz3.t(rVar, j17, qVar));
        ((ku5.t0) ku5.t0.f394148d).B(new iz3.b(this.f377602a));
    }

    public void b(java.util.ArrayList cdnList) {
        com.p314xaae8f345.mm.p944x882e457a.m1 vVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cdnList, "cdnList");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiImageCDNUploader", "uploadImage-cdn onGetCDNInfoResult list size: %s", java.lang.Integer.valueOf(cdnList.size()));
        java.util.Iterator it = cdnList.iterator();
        while (it.hasNext()) {
            r45.si siVar = (r45.si) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(siVar, "<this>");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(java.lang.String.format("BizAiScanCdnImg fileId: %s, size: [%s, %s], cdn_src: %s, cdn_status: %s", java.util.Arrays.copyOf(new java.lang.Object[]{siVar.f467279g, java.lang.Integer.valueOf(siVar.f467277e), java.lang.Integer.valueOf(siVar.f467278f), java.lang.Integer.valueOf(siVar.f467276d), java.lang.Integer.valueOf(siVar.f467281i)}, 5)), "format(...)");
        }
        ry3.p pVar = this.f377603b;
        int i17 = pVar.f483061b;
        if (i17 != 1) {
            vVar = i17 != 3 ? null : new kz3.x(null, pVar.f483060a, pVar.f483073n, 0, null, null, cdnList, 48, null);
        } else {
            long j17 = this.f377602a;
            int i18 = pVar.f483066g;
            int i19 = pVar.f483067h;
            r45.cj cjVar = pVar.f483068i;
            r45.vi viVar = pVar.f483069j;
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.api.C17266x8cecd44e c17266x8cecd44e = pVar.f483070k;
            java.lang.String chat_uuid = pVar.f483065f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(chat_uuid, "chat_uuid");
            vVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.v(null, j17, i18, i19, 0, cjVar, viVar, c17266x8cecd44e, null, null, cdnList, chat_uuid);
        }
        if (vVar != null) {
            this.f377605d.f377618b = vVar.hashCode();
            gm0.j1.d().g(vVar);
        }
        ((ku5.t0) ku5.t0.f394148d).B(new iz3.c(this.f377602a));
    }
}
