package ju3;

/* loaded from: classes10.dex */
public final class u1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17025x1dde6f4e f383556d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17025x1dde6f4e c17025x1dde6f4e) {
        super(2);
        this.f383556d = c17025x1dde6f4e;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String tag = (java.lang.String) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        at0.n recordController = this.f383556d.getRecordController();
        if (recordController != null) {
            recordController.f95127b.i(tag, intValue);
        }
        return jz5.f0.f384359a;
    }
}
