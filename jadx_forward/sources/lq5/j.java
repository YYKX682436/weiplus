package lq5;

/* loaded from: classes8.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2816xed9644dc.C22936xbad5951c f402018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f402019e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.mm.p2816xed9644dc.C22936xbad5951c c22936xbad5951c, java.util.List list) {
        super(1);
        this.f402018d = c22936xbad5951c;
        this.f402019e = list;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.mm.p2816xed9644dc.C22936xbad5951c c22936xbad5951c = this.f402018d;
        c22936xbad5951c.post(new lq5.i(intValue, c22936xbad5951c, this.f402019e));
        return jz5.f0.f384359a;
    }
}
