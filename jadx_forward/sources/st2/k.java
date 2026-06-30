package st2;

/* loaded from: classes3.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f493914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f493915e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f493916f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(st2.h1 h1Var, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f493915e = h1Var;
        this.f493916f = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new st2.k(this.f493915e, this.f493916f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((st2.k) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object Ni;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f493914d;
        st2.h1 h1Var = this.f493915e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.z5 z5Var = (com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.z5.class);
            android.content.Context context = h1Var.f493866d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            gk2.e eVar = h1Var.f493868f;
            this.f493914d = 1;
            Ni = z5Var.Ni(context, 0L, eVar, 1, true, false, this);
            if (Ni == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            Ni = obj;
        }
        r45.s42 s42Var = (r45.s42) Ni;
        java.util.LinkedList<r45.q42> m75941xfb821914 = s42Var != null ? s42Var.m75941xfb821914(1) : null;
        if ((m75941xfb821914 == null || m75941xfb821914.isEmpty()) || !h1Var.z()) {
            h1Var.r();
        } else {
            h1Var.i().setVisibility(0);
            if (h1Var.f493865J == null) {
                android.content.Context context2 = h1Var.f493866d.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                xt2.u1 u1Var = new xt2.u1(context2, 0L, 1, new st2.i(h1Var, null));
                h1Var.i().removeAllViews();
                h1Var.i().addView(u1Var.d(), -1, -2);
                h1Var.h().m59104xb04b60de(new st2.j(h1Var));
                h1Var.f493865J = u1Var;
            }
            xt2.u1 u1Var2 = h1Var.f493865J;
            if (u1Var2 != null) {
                u1Var2.f(s42Var);
            }
            if (this.f493916f) {
                h1Var.getClass();
                for (r45.q42 q42Var : m75941xfb821914) {
                    i95.m c17 = i95.n0.c(ml2.r0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    ml2.r0 r0Var = (ml2.r0) c17;
                    ml2.f4 f4Var = ml2.f4.Q;
                    java.lang.String u17 = pm0.v.u(q42Var.m75942xfb822ef2(1));
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("cur_page_type", 1);
                    jSONObject.put("bubble_type", q42Var.m75939xb282bd08(2));
                    ml2.r0.Dj(r0Var, f4Var, null, u17, null, null, null, 0, 0L, jSONObject, null, null, null, false, null, 16120, null);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
