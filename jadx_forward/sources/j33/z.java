package j33;

/* loaded from: classes5.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1730x373aa5.C15673xa51c39ca f379010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f379011e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f379012f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1730x373aa5.C15673xa51c39ca c15673xa51c39ca, float f17, float f18) {
        super(1);
        this.f379010d = c15673xa51c39ca;
        this.f379011e = f17;
        this.f379012f = f18;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        this.f379010d.setTranslationY(this.f379011e + (((java.lang.Number) obj).floatValue() * this.f379012f));
        return jz5.f0.f384359a;
    }
}
