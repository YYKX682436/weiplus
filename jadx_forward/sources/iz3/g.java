package iz3;

/* loaded from: classes12.dex */
public final class g implements f04.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ iz3.j f377610a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f377611b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ry3.p f377612c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry3.r f377613d;

    public g(iz3.j jVar, long j17, ry3.p pVar, ry3.r rVar) {
        this.f377610a = jVar;
        this.f377611b = j17;
        this.f377612c = pVar;
        this.f377613d = rVar;
    }

    public final void a(boolean z17, byte[] bArr) {
        if (!z17 || bArr == null) {
            long j17 = this.f377611b;
            int i17 = this.f377612c.f483061b;
            ry3.r rVar = this.f377613d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseAiImageUploader", "onScanFailed session: %d, errCode: %d, errMsg: %s", java.lang.Long.valueOf(j17), 101, "decode image failed");
            ry3.q qVar = new ry3.q();
            qVar.f483076a = j17;
            qVar.f483077b = false;
            qVar.f483078c = 3;
            qVar.f483079d = 101;
            qVar.f483080e = "decode image failed";
            ((ku5.t0) ku5.t0.f394148d).B(new iz3.t(rVar, j17, qVar));
            return;
        }
        iz3.j jVar = this.f377610a;
        ry3.p pVar = jVar.f377617a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(pVar);
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = java.lang.Integer.valueOf(bArr.length);
        objArr[1] = java.lang.Long.valueOf(pVar.f483060a);
        objArr[2] = java.lang.Integer.valueOf(pVar.f483067h);
        objArr[3] = java.lang.Boolean.valueOf(pVar.f483071l);
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.api.C17266x8cecd44e c17266x8cecd44e = pVar.f483070k;
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = null;
        objArr[4] = c17266x8cecd44e != null ? c17266x8cecd44e.f37914x64c7d9e : null;
        objArr[5] = c17266x8cecd44e != null ? c17266x8cecd44e.f37915x1444495a : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiImageDefaultUploader", "uploadImageDefault imageData: %d, session: %s, mode: %d, needPHash: %s, pHash: %s, %s", objArr);
        int i18 = pVar.f483061b;
        if (i18 == 1) {
            m1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.v(bArr, pVar.f483060a, pVar.f483066g, pVar.f483067h, 0, pVar.f483068i, pVar.f483069j, pVar.f483070k, null, null, null, "");
        } else if (i18 == 3) {
            m1Var = new kz3.x(bArr, pVar.f483060a, pVar.f483073n, 0, null, null, null, 112, null);
        }
        if (m1Var != null) {
            jVar.f377618b = m1Var.hashCode();
            gm0.j1.d().g(m1Var);
        }
    }
}
