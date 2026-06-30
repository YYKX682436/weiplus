package z81;

/* loaded from: classes13.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f552243a = new java.util.HashMap();

    public h() {
        a(new a91.g0());
        a(new a91.s());
        a(new a91.h0());
        a(new a91.x());
        a(new a91.m());
        a(new a91.a());
        a(new a91.j());
        a(new a91.e());
        a(new a91.n());
        a(new a91.k());
        a(new a91.h());
        a(new a91.f0());
        a(new a91.l());
        a(new a91.i());
        a(new a91.c());
        a(new a91.b());
        a(new a91.i0());
        a(new a91.j0());
        a(new a91.z());
        a(new a91.c0());
        a(new a91.d0());
        a(new a91.e0());
        a(new a91.u());
        a(new a91.a0());
        a(new a91.v());
        a(new a91.w());
        a(new a91.t());
        a(new a91.b0());
        a(new a91.k0());
        a(new a91.y());
        a(new a91.r());
        a(new a91.p());
        a(new a91.m0());
        a(new a91.q());
        a(new a91.o());
        a(new a91.l0());
    }

    public final void a(a91.d dVar) {
        if (dVar == null) {
            return;
        }
        this.f552243a.put(dVar.mo869x24dcf3d7(), dVar);
    }

    public boolean b(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONObject jSONObject) {
        java.lang.String optString = jSONObject.optString(ya.b.f77491x8758c4e1);
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        a91.d dVar = (a91.d) ((java.util.HashMap) this.f552243a).get(optString);
        if (dVar == null) {
            return false;
        }
        return dVar.a(iVar, canvas, optJSONArray);
    }
}
