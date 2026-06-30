package dk2;

/* loaded from: classes3.dex */
public final class yc extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f315922d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc(long j17) {
        super(0);
        this.f315922d = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("liveId:");
        sb6.append(this.f315922d);
        sb6.append(", looperIsFinished:");
        dk2.xg xgVar = dk2.ef.f314926k0;
        sb6.append(xgVar != null ? java.lang.Boolean.valueOf(xgVar.f315891b) : null);
        return sb6.toString();
    }
}
