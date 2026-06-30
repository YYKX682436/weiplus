package rn2;

/* loaded from: classes10.dex */
public final class t0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f479378d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rn2.c1 f479379e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f479380f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f479381g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f479382h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(rn2.c1 c1Var, java.lang.String str, int i17, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f479379e = c1Var;
        this.f479380f = str;
        this.f479381g = i17;
        this.f479382h = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rn2.t0(this.f479379e, this.f479380f, this.f479381g, this.f479382h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rn2.t0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object s17;
        java.lang.Object obj2;
        int i17 = this.f479381g;
        pz5.a aVar = pz5.a.f440719d;
        int i18 = this.f479378d;
        rn2.c1 c1Var = this.f479379e;
        int i19 = 1;
        if (i18 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f479378d = 1;
            s17 = c1Var.s(this);
            if (s17 == aVar) {
                return aVar;
            }
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            s17 = obj;
        }
        java.util.List list = (java.util.List) s17;
        if (list == null) {
            list = kz5.p0.f395529d;
        }
        boolean isEmpty = list.isEmpty();
        jz5.f0 f0Var = jz5.f0.f384359a;
        java.lang.String str = this.f479382h;
        if (isEmpty) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(c1Var.f479198e, "[AI Prefill] applyGiftPrefill: gift pool empty");
            pm0.v.X(new rn2.q0(str));
            return f0Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(this.f479380f);
            int length = jSONArray.length();
            int i27 = 0;
            while (i27 < length) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i27);
                if (jSONObject != null) {
                    java.lang.String optString = jSONObject.optString("product_id", "");
                    int optInt = jSONObject.optInt("count", i19);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                    if ((optString.length() == 0 ? i19 : 0) == 0) {
                        java.util.Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((rn2.y2) obj2).f479462d.m75945x2fec8307(0), optString)) {
                                break;
                            }
                        }
                        rn2.y2 y2Var = (rn2.y2) obj2;
                        if (y2Var != null) {
                            y2Var.f479459a = true;
                            y2Var.f479461c.set(1, java.lang.Integer.valueOf(optInt));
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c1Var.f479198e, "[AI Prefill] applyGiftPrefill: matched product_id=" + optString + ", count=" + optInt);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(c1Var.f479198e, "[AI Prefill] applyGiftPrefill: product_id=" + optString + " NOT found in pool");
                            c0Var.f391645d = true;
                        }
                    }
                }
                i27++;
                i19 = 1;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj3 : list) {
                if (((rn2.y2) obj3).f479459a) {
                    arrayList.add(obj3);
                }
            }
            if (!arrayList.isEmpty()) {
                c1Var.C(new java.lang.Integer(i17), arrayList);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c1Var.f479198e, "[AI Prefill] applyGiftPrefill: applied " + arrayList.size() + " gifts, distributeType=" + i17);
            }
            pm0.v.X(new rn2.s0(c1Var, c0Var, str));
            return f0Var;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(c1Var.f479198e, "[AI Prefill] applyGiftPrefill: parse error: " + e17.getMessage());
            pm0.v.X(new rn2.r0(str, e17));
            return f0Var;
        }
    }
}
