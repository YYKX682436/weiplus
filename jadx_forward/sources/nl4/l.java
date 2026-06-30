package nl4;

/* loaded from: classes11.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nl4.r f419747d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f419748e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f419749f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(nl4.r rVar, long j17, float f17) {
        super(1);
        this.f419747d = rVar;
        this.f419748e = j17;
        this.f419749f = f17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        nl4.r rVar = this.f419747d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar.f419775l, "call onPrepared");
        if (rVar.f419769f || rVar.f419768e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(rVar.f419775l, "has call stop " + rVar.f419768e + ", has call pause " + rVar.f419769f);
        } else {
            yz5.l lVar = rVar.f419776m;
            if (lVar != null) {
                lVar.mo146xb9724478(rVar);
            }
            boolean z17 = rVar.f419767d;
            kk4.b bVar = rVar.f419773j;
            if (!z17) {
                long j17 = this.f419748e;
                if (j17 > 0) {
                    rVar.mo145972x35ce78(j17);
                }
                kk4.v vVar = (kk4.v) bVar;
                float f17 = this.f419749f;
                vVar.f390120l = f17;
                kk4.c cVar = vVar.f390110b;
                if (cVar != null) {
                    cVar.mo100967xd079f5a(f17);
                }
                rVar.f419767d = true;
            }
            ((kk4.v) bVar).x(0);
        }
        return jz5.f0.f384359a;
    }
}
