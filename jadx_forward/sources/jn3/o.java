package jn3;

/* loaded from: classes8.dex */
public final class o extends jm0.g {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f382325f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb f382326g;

    /* renamed from: h, reason: collision with root package name */
    public r45.f03 f382327h;

    /* renamed from: i, reason: collision with root package name */
    public long f382328i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(jm0.o service) {
        super(service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
    }

    @Override // jm0.g
    public void P6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        O6(new jn3.n(this));
    }

    public final void T6(java.lang.String str, long j17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewLife.NewLifeRedDotReportFSC", "reportRedDotUnExp uuid:" + str + " exposeTime:" + j17 + " source:" + i17);
        if (this.f382326g == null) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("inner_version", 2);
        hashMap.put("expose_time", java.lang.Long.valueOf(j17));
        ((nn3.f) ((ra0.x) i95.n0.c(ra0.x.class))).Ui("view_unexp", this.f382326g, this.f382327h, hashMap, false, i17);
    }
}
