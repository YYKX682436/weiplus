package d33;

/* loaded from: classes10.dex */
public final class b1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.C15652xb39b5f9d f307737d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f307738e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f307739f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.C15652xb39b5f9d c15652xb39b5f9d, d33.u0 u0Var, long j17, java.lang.String str) {
        super(2);
        this.f307737d = c15652xb39b5f9d;
        this.f307738e = j17;
        this.f307739f = str;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.widget.ImageView m63694xcb16a3ea;
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.C15652xb39b5f9d c15652xb39b5f9d = this.f307737d;
        c15652xb39b5f9d.getMediaWH()[0] = intValue;
        c15652xb39b5f9d.getMediaWH()[1] = intValue2;
        android.graphics.RectF rectF = new android.graphics.RectF(c15652xb39b5f9d.f220032i);
        m63694xcb16a3ea = c15652xb39b5f9d.m63694xcb16a3ea();
        return com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.C15652xb39b5f9d.d(c15652xb39b5f9d, m63694xcb16a3ea, intValue, intValue2, rectF, this.f307738e, this.f307739f, 2);
    }
}
