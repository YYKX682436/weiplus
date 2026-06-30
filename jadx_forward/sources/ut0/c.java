package ut0;

/* loaded from: classes7.dex */
public final class c implements com.p314xaae8f345.mm.p874xaefb6cc9.f1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ut0.d f512332a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f512333b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f512334c;

    public c(ut0.d dVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var) {
        this.f512332a = dVar;
        this.f512333b = i17;
        this.f512334c = c0Var;
    }

    @Override // com.p314xaae8f345.mm.p874xaefb6cc9.f1
    public void a(com.p314xaae8f345.mm.p874xaefb6cc9.e1 result) {
        jc1.d dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("invoke: onResult exists=");
        boolean z17 = result.f150595a;
        sb6.append(z17);
        sb6.append(",pkgPath=");
        sb6.append(result.f150596b);
        sb6.append(", version=");
        int i17 = result.f150597c;
        sb6.append(i17);
        sb6.append(", size=");
        long j17 = result.f150598d;
        sb6.append(j17);
        sb6.append(", hasOldVersion=");
        boolean z18 = result.f150599e;
        sb6.append(z18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiGetLocalWVAPackageInfo", sb6.toString());
        ut0.d dVar2 = this.f512332a;
        dVar2.getClass();
        if (!z17 && j17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("JsApiGetLocalWVAPackageInfo", "handleFinalResult: invalid pkgSize=" + j17);
            dVar = jc1.f.f380448d;
        } else if (z17 || fp.i.a(j17)) {
            dVar = jc1.f.f380445a;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("JsApiGetLocalWVAPackageInfo", "handleFinalResult: storage insufficient, pkgSize=" + j17);
            dVar = jc1.e.f380442e;
        }
        java.util.Map e17 = kz5.b1.e(new jz5.l("hasOldVersion", java.lang.Boolean.valueOf(z18)));
        java.util.Map l17 = kz5.c1.l(new jz5.l("exists", java.lang.Boolean.valueOf(z17)), new jz5.l("version", java.lang.Integer.valueOf(i17)), new jz5.l("size", java.lang.Long.valueOf(j17)));
        l17.putAll(e17);
        this.f512334c.a(this.f512333b, dVar2.r(null, dVar, new org.json.JSONObject(l17)));
    }
}
