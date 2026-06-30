package dk2;

/* loaded from: classes3.dex */
public final class wc extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f315820d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc(long j17) {
        super(0);
        this.f315820d = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("liveId:");
        sb6.append(this.f315820d);
        sb6.append(", looperIsFinished:");
        dk2.xg xgVar = dk2.ef.f314924j0;
        sb6.append(xgVar != null ? java.lang.Boolean.valueOf(xgVar.f315891b) : null);
        return sb6.toString();
    }
}
