package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class sx extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f190545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz f190546e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sx(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar) {
        super(1);
        this.f190545d = abstractC14490x69736cb5;
        this.f190546e = pzVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f190545d;
        if (abstractC14490x69736cb5.getFeedObject().m59311x25315bf4()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.String str = "";
            if (list != null) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    str = str + ((java.lang.String) it.next()) + ';';
                }
            }
            if (r26.i0.o(str, ";", false, 2, null)) {
                str = str.substring(0, str.length() - 1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "substring(...)");
            }
            jSONObject.put("share_username", str);
            vs5.a aVar = vs5.a.f521457a;
            r45.nw1 m59258xd0557130 = abstractC14490x69736cb5.getFeedObject().m59258xd0557130();
            aVar.a(java.lang.String.valueOf(m59258xd0557130 != null ? java.lang.Long.valueOf(m59258xd0557130.m75942xfb822ef2(0)) : null), java.lang.String.valueOf(abstractC14490x69736cb5.getFeedObject().getFeedObject().m76784x5db1b11()), abstractC14490x69736cb5.getFeedObject().getFeedObject().m76836x6c03c64c(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf.D1, "1", "0", jSONObject, abstractC14490x69736cb5.g0());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.L(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.f183939a, this.f190546e.f190288g, 0L, 2, null);
        return jz5.f0.f384359a;
    }
}
