package ku3;

/* loaded from: classes3.dex */
public final class e4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.m4 f393756d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(ku3.m4 m4Var) {
        super(2);
        this.f393756d = m4Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.C16996x6c653a3a item = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.C16996x6c653a3a) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        ku3.m4 m4Var = this.f393756d;
        int i17 = m4Var.f393861q;
        int i18 = item.f237237e;
        if (i18 != i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMenuFilterPlugin", "select type >> " + i18);
            ou3.h hVar = ou3.h.f430477e;
            boolean z17 = i18 != 0;
            zt3.a aVar = m4Var.f393851d;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("PARAM_1_PARCELABLE", item);
            zt3.a.V6(aVar, 5, z17, bundle, false, false, 24, null);
            m4Var.f393861q = i18;
        }
        return jz5.f0.f384359a;
    }
}
