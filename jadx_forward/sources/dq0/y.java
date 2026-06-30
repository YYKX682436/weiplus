package dq0;

/* loaded from: classes16.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f323876d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(1);
        this.f323876d = h0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject it = (org.json.JSONObject) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.a0 mo20599xaaa148a0 = com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.b0.f149474h.mo20599xaaa148a0();
        java.lang.String optString = it.optString("type");
        optString.getClass();
        mo20599xaaa148a0.f149462d |= 1;
        mo20599xaaa148a0.f149463e = optString;
        mo20599xaaa148a0.m20881x7bb163d5();
        org.json.JSONObject optJSONObject = it.optJSONObject("rect");
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.x mo20599xaaa148a02 = com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.y.f149638m.mo20599xaaa148a0();
        double optDouble = optJSONObject != null ? optJSONObject.optDouble("x", 0.0d) : 0.0d;
        mo20599xaaa148a02.f149633d |= 1;
        mo20599xaaa148a02.f149634e = optDouble;
        mo20599xaaa148a02.m20881x7bb163d5();
        double optDouble2 = optJSONObject != null ? optJSONObject.optDouble("y", 0.0d) : 0.0d;
        mo20599xaaa148a02.f149633d |= 2;
        mo20599xaaa148a02.f149635f = optDouble2;
        mo20599xaaa148a02.m20881x7bb163d5();
        double optDouble3 = optJSONObject != null ? optJSONObject.optDouble("w", 0.0d) : 0.0d;
        mo20599xaaa148a02.f149633d |= 4;
        mo20599xaaa148a02.f149636g = optDouble3;
        mo20599xaaa148a02.m20881x7bb163d5();
        double optDouble4 = optJSONObject != null ? optJSONObject.optDouble("h", 0.0d) : 0.0d;
        mo20599xaaa148a02.f149633d |= 8;
        mo20599xaaa148a02.f149637h = optDouble4;
        mo20599xaaa148a02.m20881x7bb163d5();
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.y mo20557x85702333 = mo20599xaaa148a02.mo20557x85702333();
        if (!mo20557x85702333.mo20562xf582434a()) {
            throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
        }
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = mo20599xaaa148a0.f149465g;
        if (t9Var == null) {
            mo20599xaaa148a0.f149464f = mo20557x85702333;
            mo20599xaaa148a0.m20881x7bb163d5();
        } else {
            t9Var.i(mo20557x85702333);
        }
        mo20599xaaa148a0.f149462d |= 2;
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.b0 mo20557x857023332 = mo20599xaaa148a0.mo20557x85702333();
        if (!mo20557x857023332.mo20562xf582434a()) {
            throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x857023332);
        }
        ((java.util.List) this.f323876d.f391656d).add(mo20557x857023332);
        return jz5.f0.f384359a;
    }
}
