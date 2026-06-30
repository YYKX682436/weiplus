package df2;

/* loaded from: classes3.dex */
public final class ko extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.to f312125d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko(df2.to toVar) {
        super(2);
        this.f312125d = toVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        r45.h32 noticeInfo = (r45.h32) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeInfo, "noticeInfo");
        df2.to.a7(this.f312125d, booleanValue, noticeInfo);
        return jz5.f0.f384359a;
    }
}
