package rm;

/* loaded from: classes7.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f478926d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rm.a0 f478927e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar, rm.a0 a0Var) {
        super(2);
        this.f478926d = rVar;
        this.f478927e = a0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b) obj;
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar2 = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b) obj2;
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f478926d;
        if (bVar == null || bVar2 == null) {
            java.lang.String str2 = (bVar == null && bVar2 == null) ? "fetch both biz and photo failed" : bVar == null ? "fetch biz failed" : "fetch photo failed";
            if (rVar != null) {
                rVar.a(new com.p314xaae8f345.mm.p646xf2865d2e.C10320x67f7455e(false, "", 0, str2, null, false, null, 112, null));
            }
        } else {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                rm.a0 a0Var = this.f478927e;
                jSONArray.put(rm.a0.a(a0Var, 1, bVar));
                jSONArray.put(rm.a0.a(a0Var, 2, bVar2));
                str = jSONArray.toString();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GetPersonalCenterBizTask", "Failed to create biz list JSON", e17);
                str = "[]";
            }
            java.lang.String str3 = str;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
            com.p314xaae8f345.mm.p646xf2865d2e.C10320x67f7455e c10320x67f7455e = new com.p314xaae8f345.mm.p646xf2865d2e.C10320x67f7455e(true, "", 0, "", str3, false, null, 96, null);
            if (rVar != null) {
                rVar.a(c10320x67f7455e);
            }
        }
        return jz5.f0.f384359a;
    }
}
