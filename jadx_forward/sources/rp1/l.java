package rp1;

/* loaded from: classes14.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 f480000d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f480001e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7, int i17) {
        super(1);
        this.f480000d = c12917x19ac03e7;
        this.f480001e = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        float intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7 = this.f480000d;
        int m54115x95ba554c = (int) (intValue - ((c12917x19ac03e7.m54115x95ba554c() - this.f480001e) / 2.0f));
        rp1.h hVar = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7.T;
        android.graphics.Point point = c12917x19ac03e7.B;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(point);
        int i17 = point.y - qp1.c0.f447234j;
        int i18 = qp1.c0.f447235k;
        return java.lang.Boolean.valueOf(m54115x95ba554c == java.lang.Math.max(java.lang.Math.min(m54115x95ba554c, i17 - i18), i18));
    }
}
