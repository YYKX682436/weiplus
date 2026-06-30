package az0;

/* loaded from: classes5.dex */
public final class ac implements com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnTaskProgress {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u26.r0 f96866a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96867b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f96868c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f96869d;

    public ac(u26.r0 r0Var, java.lang.String str, boolean z17, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f96866a = r0Var;
        this.f96867b = str;
        this.f96868c = z17;
        this.f96869d = qVar;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnTaskProgress
    /* renamed from: onTaskProgress */
    public final void mo9321xda309251(float f17, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4090xe7a30da3 c4090xe7a30da3) {
        java.lang.Object e17 = ((u26.x) this.f96866a).e(java.lang.Float.valueOf(f17));
        if (e17 instanceof u26.b0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String str = this.f96867b;
            sb6.append(str);
            sb6.append(" try send error ");
            sb6.append(f17);
            sb6.append(", ");
            sb6.append(u26.c0.a(e17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MaasFuncUtils", sb6.toString());
            if (this.f96868c && (u26.c0.a(e17) instanceof java.util.concurrent.CancellationException)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MaasFuncUtils", str + " handleCancelExceptionOnProgress");
                p3325xe03a0797.p3326xc267989b.p.a(this.f96869d, null, 1, null);
            }
        }
    }
}
