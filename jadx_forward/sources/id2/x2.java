package id2;

/* loaded from: classes.dex */
public final class x2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f372408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f372409e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s f372410f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(int i17, long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar) {
        super(1);
        this.f372408d = i17;
        this.f372409e = j17;
        this.f372410f = sVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        cl0.g gVar = new cl0.g();
        gVar.r("statusChanged", booleanValue);
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[openReplaySettingSheet] callback jsonStr:");
        sb6.append(gVar2);
        sb6.append(" callbackId:");
        int i17 = this.f372408d;
        sb6.append(i17);
        sb6.append(" instanceId:");
        long j17 = this.f372409e;
        sb6.append(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePersonalCente", sb6.toString());
        this.f372410f.c(j17, i17, gVar2);
        return jz5.f0.f384359a;
    }
}
