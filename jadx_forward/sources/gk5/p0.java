package gk5;

/* loaded from: classes9.dex */
public final class p0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f354225d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f354226e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f354227f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gk5.r0 f354228g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f354229h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(java.lang.String str, java.util.List list, gk5.r0 r0Var, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f354226e = str;
        this.f354227f = list;
        this.f354228g = r0Var;
        this.f354229h = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gk5.p0(this.f354226e, this.f354227f, this.f354228g, this.f354229h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gk5.p0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        ot0.q v17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f354225d;
        gk5.r0 r0Var = this.f354228g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            oc0.b bVar = new oc0.b();
            java.lang.String str = this.f354226e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
            bVar.f425659e = str;
            ((zs3.z) ((mc0.k) i95.n0.c(mc0.k.class))).getClass();
            bVar.f425661g = new bt3.g0();
            ym5.a1.f(new gk5.m0(r0Var));
            mc0.k kVar = (mc0.k) i95.n0.c(mc0.k.class);
            this.f354225d = 1;
            obj = ((zs3.z) kVar).hj(bVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        oc0.c cVar = (oc0.c) obj;
        ym5.a1.f(new gk5.n0(r0Var));
        if (cVar.f425664a == oc0.d.f425666d) {
            try {
                java.util.List<java.lang.String> list = this.f354227f;
                if (list != null) {
                    for (java.lang.String str2 : list) {
                        java.lang.String str3 = cVar.f425665b;
                        r0Var.getClass();
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && (v17 = ot0.q.v(str3)) != null) {
                            ((ez.w0) ot0.j1.a()).wi(v17, v17.f430179d, v17.H, str2, "", null, true);
                        }
                    }
                }
                ym5.a1.f(new gk5.o0(this.f354229h));
            } catch (java.lang.Exception e17) {
                r0Var.V6();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ForwardNoteToWeWorkUIC", e17, "record_attach_upload_xml", new java.lang.Object[0]);
            }
        } else {
            r0Var.V6();
        }
        return jz5.f0.f384359a;
    }
}
