package t93;

/* loaded from: classes8.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t93.a0 f498115d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(t93.a0 a0Var) {
        super(4);
        this.f498115d = a0Var;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        r45.nw1 m76794xd0557130;
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        java.lang.String str = (java.lang.String) obj3;
        r45.z61 resp = (r45.z61) obj4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.util.HashMap hashMap = new java.util.HashMap();
        t93.a0 a0Var = this.f498115d;
        if (intValue == 0 && intValue2 == 0) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) resp.m75936x14adae67(1);
            hashMap.put("isLiving", java.lang.Boolean.valueOf((c19792x256d2725 == null || (m76794xd0557130 = c19792x256d2725.m76794xd0557130()) == null || m76794xd0557130.m75939xb282bd08(2) != 1) ? false : true));
            s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) resp.m75936x14adae67(1);
            hashMap.put("isCharge", java.lang.Boolean.valueOf(((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var).hk(c19792x256d27252 != null ? c19792x256d27252.m76794xd0557130() : null)));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsapiGetLiveInfo", "LiteAppJsapiGetLiveInfo return is living = " + hashMap.get("isLiving") + ", isCharge = " + hashMap.get("isCharge"));
            a0Var.f224976f.b(hashMap);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsapiGetLiveInfo", "get last object failed, errType = " + intValue + ", errCode = " + intValue2 + ", errMsg = " + str);
            a0Var.f224976f.a("request failed");
        }
        return jz5.f0.f384359a;
    }
}
