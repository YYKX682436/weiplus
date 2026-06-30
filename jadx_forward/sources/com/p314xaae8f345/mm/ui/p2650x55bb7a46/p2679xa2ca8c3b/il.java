package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes2.dex */
public final class il extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f285732d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725) {
        super(1);
        this.f285732d = c19792x256d2725;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
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
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f285732d;
        r45.nw1 m76794xd0557130 = c19792x256d2725.m76794xd0557130();
        aVar.a(java.lang.String.valueOf(m76794xd0557130 != null ? java.lang.Long.valueOf(m76794xd0557130.m75942xfb822ef2(0)) : null), pm0.v.u(c19792x256d2725.m76784x5db1b11()), c19792x256d2725.m76836x6c03c64c(), "6", "1", "0", (i17 & 64) != 0 ? null : jSONObject, (i17 & 128) != 0 ? "" : null);
        return jz5.f0.f384359a;
    }
}
