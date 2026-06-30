package mz0;

/* loaded from: classes4.dex */
public final class u2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f414602d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(java.util.ArrayList arrayList, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f414602d = arrayList;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mz0.u2(this.f414602d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        mz0.u2 u2Var = (mz0.u2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        u2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 : this.f414602d) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("md5", kk.k.e(abstractC15633xee433078.f219963e));
            jSONObject.put(ya.b.f77502x92235c1b, 2);
            boolean z17 = abstractC15633xee433078 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b;
            jSONObject.put("dur", z17 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) abstractC15633xee433078).f219979x : 0);
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p2015x36f002.C17096x4dad80a5 c17096x4dad80a5 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p2015x36f002.C17096x4dad80a5.f237984a;
                java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) abstractC15633xee433078).f219963e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getOriginalPath(...)");
                qc0.d1 b17 = c17096x4dad80a5.b(str);
                jSONObject.put("height", b17 != null ? b17.f442897b : 0);
                jSONObject.put("width", b17 != null ? b17.f442896a : 0);
            } else {
                android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(abstractC15633xee433078.f219963e);
                jSONObject.put("height", n07 != null ? n07.outHeight : 0);
                jSONObject.put("width", n07 != null ? n07.outWidth : 0);
            }
            jSONArray.put(jSONObject);
        }
        java.lang.String jSONArray2 = jSONArray.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray2, "toString(...)");
        dx1.f.n(dx1.g.f326022a, "SnsTemplate", "mediadetail", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONArray2, null, false, null, null, 208, null);
        return jz5.f0.f384359a;
    }
}
