package kp4;

/* loaded from: classes10.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18807xe5ec60d0 f392677d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kp4.a f392678e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18807xe5ec60d0 c18807xe5ec60d0, kp4.a aVar) {
        super(2);
        this.f392677d = c18807xe5ec60d0;
        this.f392678e = aVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18807xe5ec60d0 c18807xe5ec60d0 = this.f392677d;
        java.lang.String str = c18807xe5ec60d0.f257534d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setTrackInfo: ");
        sb6.append(longValue);
        sb6.append(", ");
        rm5.k kVar = c18807xe5ec60d0.f257551x;
        int i17 = 0;
        sb6.append(kVar != null ? kVar.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        for (java.lang.Object obj3 : this.f392678e.f392610g) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (((kp4.m) obj3).f392657a == longValue && i17 >= 0) {
                java.util.LinkedList linkedList = c18807xe5ec60d0.f257537g;
                if (i17 < linkedList.size()) {
                    linkedList.set(i17, bitmap);
                    c18807xe5ec60d0.postInvalidate();
                }
            }
            i17 = i18;
        }
        return jz5.f0.f384359a;
    }
}
