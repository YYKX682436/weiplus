package wt3;

/* loaded from: classes5.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f531018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wt3.t0 f531019e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f531020f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(wt3.t0 t0Var, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f531019e = t0Var;
        this.f531020f = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new wt3.r0(this.f531019e, this.f531020f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((wt3.r0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.r2 r2Var;
        byte[] bArr;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f531018d;
        wt3.t0 t0Var = this.f531019e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.r2 r2Var2 = t0Var.f531034v;
            if ((r2Var2 != null && r2Var2.a()) && (r2Var = t0Var.f531034v) != null) {
                this.f531018d = 1;
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewLifeGetImageListRecommendAudioTask", "getMusicListResultCgi: classifyResultDatas.size=" + ((java.util.ArrayList) t0Var.f531033u).size());
        wt3.v0 v0Var = t0Var.f531031s;
        java.util.List<r45.iz6> list = t0Var.f531033u;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (r45.iz6 iz6Var : list) {
            r45.gb gbVar = new r45.gb();
            if (iz6Var == null || (bArr = pm0.v.D(iz6Var)) == null) {
                bArr = new byte[0];
            }
            gbVar.f456599e = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bArr, 0, bArr.length);
            arrayList.add(gbVar);
        }
        java.util.LinkedList linkedList = new java.util.LinkedList(arrayList);
        boolean z17 = this.f531020f;
        if (z17) {
            v0Var.f531052f = null;
        } else {
            v0Var.getClass();
        }
        ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
        int m76275xbcc8608a = c19783xd9a946b7 != null ? c19783xd9a946b7.m76275xbcc8608a() : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("GetListenVideoBgmList: type:");
        sb6.append(v0Var.f531050d);
        sb6.append(" loadFirstPage:");
        sb6.append(z17);
        sb6.append(", enterScene:");
        sb6.append(m76275xbcc8608a);
        sb6.append(" templateId:");
        sb6.append(v0Var.f531053g);
        sb6.append(" cgiSessionBuffer:");
        sb6.append(v0Var.f531052f != null);
        sb6.append(" idList:");
        sb6.append((java.lang.Object) null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewLifeGetListenVideoBgmListHelper", sb6.toString());
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            jSONObject.put("enter_scene", m76275xbcc8608a);
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jSONObject.put("template_id", v0Var.f531053g));
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        pq5.g l17 = new jv3.a(v0Var.f531050d, v0Var.f531048b, v0Var.f531052f, v0Var.f531049c, null, linkedList, null, jSONObject.toString(), null, null, 0, 0, 0, null, 16144, null).l();
        if (l17 != null) {
            l17.f(v0Var.f531047a);
            l17.h(new wt3.u0(v0Var, z17));
        }
        return jz5.f0.f384359a;
    }
}
