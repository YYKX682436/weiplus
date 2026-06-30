package iz3;

/* loaded from: classes12.dex */
public final class s implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f377631d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f377632e = new java.util.HashMap();

    public s() {
        gm0.j1.d().a(1100, this);
        gm0.j1.d().a(5079, this);
        gm0.j1.d().a(5131, this);
    }

    public final iz3.k a(ry3.p pVar) {
        int i17 = pVar.f483061b;
        if (i17 == 1 || i17 == 3) {
            return iz3.f.f377608a;
        }
        if (i17 == 2) {
            return iz3.i.f377616a;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AiScanImageSceneUploader", "uploadImage unknown opImageType: %d", java.lang.Integer.valueOf(i17));
        return null;
    }

    public final void b(long j17, int i17, int i18, int i19, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AiScanImageSceneUploader", "onScanFailed session: %d, opImageType: %s, errType: %s, errCode: %d, errMsg: %s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        ry3.q qVar = new ry3.q();
        qVar.f483076a = j17;
        qVar.f483077b = false;
        qVar.f483078c = i18;
        qVar.f483079d = i19;
        qVar.f483080e = str;
        ((ku5.t0) ku5.t0.f394148d).B(new iz3.n(this, j17, qVar));
    }

    public final void c(long j17, ry3.q qVar, yz5.l lVar) {
        ((ku5.t0) ku5.t0.f394148d).B(new iz3.r(this, j17, lVar, qVar));
    }

    public final void d(long j17, ry3.p pVar, ry3.r callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (pVar == null) {
            return;
        }
        iz3.j jVar = new iz3.j();
        jVar.f377617a = pVar;
        this.f377632e.put(java.lang.Long.valueOf(j17), callback);
        this.f377631d.put(java.lang.Long.valueOf(j17), jVar);
        iz3.k a17 = a(pVar);
        if (a17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanImageSceneUploader", "uploadImage session: %s, opImageType: %s, useCdnOpt: %s, useCache: %s, uploader: %s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(pVar.f483061b), java.lang.Boolean.valueOf(pVar.f483072m), java.lang.Boolean.TRUE, a17);
            a17.a(jVar, callback);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x020e  */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r19, int r20, java.lang.String r21, com.p314xaae8f345.mm.p944x882e457a.m1 r22) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: iz3.s.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
