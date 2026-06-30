package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes10.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16682xd79fb962 f233437d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kp4.a f233438e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16682xd79fb962 c16682xd79fb962, kp4.a aVar) {
        super(2);
        this.f233437d = c16682xd79fb962;
        this.f233438e = aVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16682xd79fb962 c16682xd79fb962 = this.f233437d;
        java.lang.String str = c16682xd79fb962.f233130d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setTrackInfo: ");
        sb6.append(longValue);
        sb6.append(", ");
        rm5.k kVar = c16682xd79fb962.f233143t;
        int i17 = 0;
        sb6.append(kVar != null ? kVar.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        for (java.lang.Object obj3 : this.f233438e.f392610g) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (((kp4.m) obj3).f392657a == longValue && i17 >= 0) {
                java.util.LinkedList linkedList = c16682xd79fb962.f233133g;
                if (i17 < linkedList.size()) {
                    linkedList.set(i17, bitmap);
                    c16682xd79fb962.postInvalidate();
                }
            }
            i17 = i18;
        }
        return jz5.f0.f384359a;
    }
}
