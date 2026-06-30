package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class oj extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f195292d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm f195293e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj(java.util.ArrayList arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar) {
        super(1);
        this.f195292d = arrayList;
        this.f195293e = hmVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object obj2;
        ce2.i it = (ce2.i) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        boolean z17 = !this.f195292d.contains(it.f67814x2c488eb6);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar = this.f195293e;
        java.util.Iterator it6 = ((java.util.ArrayList) ((je2.t) hmVar.P0(je2.t.class)).P6()).iterator();
        while (true) {
            if (!it6.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it6.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.oq1) obj2).f463975e, it.f67814x2c488eb6)) {
                break;
            }
        }
        boolean z18 = obj2 != null;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hmVar.f194364r, "getCacheGiftList remove:" + it.f67814x2c488eb6 + ", notExistInTab");
        }
        return java.lang.Boolean.valueOf(z17 && !z18);
    }
}
