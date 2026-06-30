package ra3;

/* loaded from: classes9.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f475074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f475075e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(long j17, java.lang.String str) {
        super(1);
        this.f475074d = j17;
        this.f475075e = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String m65346x5462dac5;
        java.lang.String path = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        return (!r26.i0.y(path, "liteappLocalId://", false) || (m65346x5462dac5 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65346x5462dac5(this.f475074d, this.f475075e, path)) == null) ? path : m65346x5462dac5;
    }
}
