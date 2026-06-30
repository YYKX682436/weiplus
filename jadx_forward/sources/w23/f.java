package w23;

/* loaded from: classes8.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.C15638x5a203cd0 f524136d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.C15638x5a203cd0 c15638x5a203cd0) {
        super(3);
        this.f524136d = c15638x5a203cd0;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.util.LinkedList data = (java.util.LinkedList) obj2;
        long longValue = ((java.lang.Number) obj3).longValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (booleanValue) {
            java.util.List V0 = kz5.n0.V0(data);
            java.util.regex.Pattern pattern = pm0.v.f438335a;
            pm0.v.T(km5.u.d(), new w23.e(longValue, V0, this.f524136d));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GalleryPickerFragment", "[onActivityCreated] onLoad failure!");
        }
        return jz5.f0.f384359a;
    }
}
