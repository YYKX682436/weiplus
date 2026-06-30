package rm;

/* loaded from: classes7.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f478928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b f478929e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f478930f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(boolean z17, com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        super(0);
        this.f478928d = z17;
        this.f478929e = bVar;
        this.f478930f = rVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f478930f;
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar = this.f478929e;
        boolean z17 = this.f478928d;
        if (z17) {
            java.lang.String biz = bVar.f299422e;
            if (!(biz == null)) {
                if (rVar != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(biz, "biz");
                    boolean z18 = bVar.f299430p;
                    boolean z19 = bVar.f299427m;
                    java.lang.String jSONObject = pm0.b0.g(bVar).toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
                    rVar.a(new com.p314xaae8f345.mm.p646xf2865d2e.C10320x67f7455e(true, biz, z18 ? 1 : 0, "", null, z19, jSONObject));
                }
                return jz5.f0.f384359a;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getBizForPublish failed, ret=");
        sb6.append(z17);
        sb6.append(" resp.biz=");
        java.lang.String str = bVar.f299422e;
        if (str == null) {
            str = "null";
        }
        sb6.append(str);
        sb6.append(',');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GetPersonalCenterBizTask", sb6.toString());
        bVar.mo12245xcc313de3();
        if (rVar != null) {
            rVar.a(new com.p314xaae8f345.mm.p646xf2865d2e.C10320x67f7455e(false, "", 0, "getBiz failed", null, false, null, 112, null));
        }
        return jz5.f0.f384359a;
    }
}
