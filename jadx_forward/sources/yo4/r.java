package yo4;

/* loaded from: classes10.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18794x5f9cad3a f545838d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18794x5f9cad3a c18794x5f9cad3a) {
        super(2);
        this.f545838d = c18794x5f9cad3a;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        if (intValue != intValue2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18794x5f9cad3a c18794x5f9cad3a = this.f545838d;
            java.lang.Object obj3 = c18794x5f9cad3a.H.f257263d.get(intValue);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "get(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.u0 u0Var = c18794x5f9cad3a.H;
            u0Var.f257263d.remove(intValue);
            u0Var.f257263d.add(intValue2, (java.lang.String) obj3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiVideoFullScreenPluginLayout", "user change image index from:" + intValue + " to:" + intValue2);
        }
        return jz5.f0.f384359a;
    }
}
