package bz0;

/* loaded from: classes5.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f118262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.r2 f118263e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f118264f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p3325xe03a0797.p3326xc267989b.r2 r2Var, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f118263e = r2Var;
        this.f118264f = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bz0.d(this.f118263e, this.f118264f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((bz0.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        org.json.JSONObject jSONObject;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f118262d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f118263e;
            if (r2Var != null) {
                this.f118262d = 1;
                if (r2Var.C(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6707xf4fd108e c6707xf4fd108e = bz0.f.f118270c;
        bz0.f fVar = bz0.f.f118268a;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.List list = this.f118264f;
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it.next();
            if (abstractC15633xee433078 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b c15635xf0ea441b = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) abstractC15633xee433078;
                jSONObject = new org.json.JSONObject();
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p2015x36f002.C17096x4dad80a5 c17096x4dad80a5 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p2015x36f002.C17096x4dad80a5.f237984a;
                java.lang.String str = c15635xf0ea441b.f219963e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getOriginalPath(...)");
                qc0.d1 b17 = c17096x4dad80a5.b(str);
                if (b17 != null) {
                    org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                    jSONArray2.put(b17.f442896a);
                    jSONArray2.put(b17.f442897b);
                    jSONObject.put("s", jSONArray2);
                    jSONObject.put("d", b17.f442899d);
                    jSONObject.put("f", java.lang.Float.valueOf(b17.f442898c));
                    jSONObject.put("vb", b17.f442900e);
                    jSONObject.put("ab", b17.f442903h);
                    jSONObject.put("as", b17.f442905j);
                    jSONObject.put("acc", b17.f442904i);
                    if (jSONObject.put("t", b17.f442902g ? "265" : "264") != null) {
                    }
                }
                org.json.JSONArray jSONArray3 = new org.json.JSONArray();
                jSONArray3.put(c15635xf0ea441b.f219981z);
                jSONArray3.put(c15635xf0ea441b.f219980y);
                jSONObject.put("s", jSONArray3);
                jSONObject.put("d", c15635xf0ea441b.f219979x);
                jSONObject.put("f", c15635xf0ea441b.C);
                jSONObject.put("vb", c15635xf0ea441b.A);
            } else if (abstractC15633xee433078 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15631xba892b3b) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                org.json.JSONArray jSONArray4 = new org.json.JSONArray();
                android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15631xba892b3b) abstractC15633xee433078).f219963e);
                jSONArray4.put(n07 != null ? n07.outWidth : 0);
                jSONArray4.put(n07 != null ? n07.outHeight : 0);
                jSONObject2.put("s", jSONArray4);
                jSONObject = jSONObject2;
            } else {
                jSONObject = new org.json.JSONObject();
            }
            jSONArray.put(jSONObject);
        }
        java.lang.String jSONObject3 = new org.json.JSONObject().put("d", jSONArray).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
        c6707xf4fd108e.f140464f = c6707xf4fd108e.b("importMediaInfo", r26.i0.t(jSONObject3, ",", ";", false), true);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6707xf4fd108e c6707xf4fd108e2 = bz0.f.f118270c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            if (obj2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15631xba892b3b) {
                arrayList.add(obj2);
            }
        }
        c6707xf4fd108e2.f140466h = arrayList.size();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6707xf4fd108e c6707xf4fd108e3 = bz0.f.f118270c;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj3 : list) {
            if (obj3 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) {
                arrayList2.add(obj3);
            }
        }
        c6707xf4fd108e3.f140465g = arrayList2.size();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasReport24946", "markInputMediaInfo: " + bz0.f.f118270c.f140464f);
        return jz5.f0.f384359a;
    }
}
