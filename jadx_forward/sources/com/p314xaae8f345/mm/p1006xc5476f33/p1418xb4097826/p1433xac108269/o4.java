package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes2.dex */
public final class o4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f183960d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        super(1);
        this.f183960d = abstractC14490x69736cb5;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f183960d;
        if (it instanceof org.json.JSONObject) {
            try {
                int optInt = ((org.json.JSONObject) it).optInt("warnFlag");
                java.lang.String optString = ((org.json.JSONObject) it).optString("warningWording");
                bu2.j jVar = bu2.j.f106067a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = jVar.h(abstractC14490x69736cb5.mo2128x1ed62e84());
                if (h17 != null) {
                    h17.getFeedObject().m76931x9432f194(optInt);
                    h17.getFeedObject().m76932x9db6f970(optString);
                    jVar.n(h17, bu2.i.f106062j);
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3();
                    c5445x963cab3.f135785g.f88451a = h17.f66939xc8a07680;
                    c5445x963cab3.e();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMenuUtil", "[finishSetWarningWording] warnFlag:" + optInt + " warningWording:" + optString);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderMenuUtil", java.lang.String.valueOf(e17.getMessage()));
            }
        }
        return jz5.f0.f384359a;
    }
}
