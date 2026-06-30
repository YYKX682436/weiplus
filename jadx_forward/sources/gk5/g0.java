package gk5;

/* loaded from: classes9.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f354187d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f354188e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk5.r0 f354189f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f354190g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(java.lang.String str, gk5.r0 r0Var, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f354188e = str;
        this.f354189f = r0Var;
        this.f354190g = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gk5.g0(this.f354188e, this.f354189f, this.f354190g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gk5.g0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f354187d;
        gk5.r0 r0Var = this.f354189f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            oc0.b bVar = new oc0.b();
            java.lang.String str = this.f354188e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
            bVar.f425659e = str;
            ((zs3.z) ((mc0.k) i95.n0.c(mc0.k.class))).getClass();
            bVar.f425661g = new bt3.g0();
            ym5.a1.f(new gk5.d0(r0Var));
            mc0.k kVar = (mc0.k) i95.n0.c(mc0.k.class);
            this.f354187d = 1;
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
        ym5.a1.f(new gk5.e0(r0Var));
        if (cVar.f425664a == oc0.d.f425666d) {
            try {
                ym5.a1.f(new gk5.f0(this.f354190g, cVar));
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
