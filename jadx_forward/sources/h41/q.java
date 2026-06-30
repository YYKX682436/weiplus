package h41;

/* loaded from: classes14.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h41.x f360381d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(h41.x xVar) {
        super(1);
        this.f360381d = xVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        long longValue = ((java.lang.Number) obj).longValue();
        com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.a aVar = this.f360381d.f360417a;
        if (aVar != null) {
            aVar.U(longValue);
        }
        return jz5.f0.f384359a;
    }
}
