package ut2;

/* loaded from: classes3.dex */
public final class z0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f512699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f512700e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk2.e f512701f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f512702g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(ut2.s3 s3Var, gk2.e eVar, cm2.m0 m0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f512700e = s3Var;
        this.f512701f = eVar;
        this.f512702g = m0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ut2.z0(this.f512700e, this.f512701f, this.f512702g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ut2.z0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object j17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f512699d;
        cm2.m0 m0Var = this.f512702g;
        ut2.s3 s3Var = this.f512700e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r45.y23 y23Var = m0Var.f124901v;
            this.f512699d = 1;
            int i18 = ut2.s3.f512602l1;
            s3Var.getClass();
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            r45.ld2 ld2Var = new r45.ld2();
            gk2.e eVar = this.f512701f;
            ld2Var.set(3, ((mm2.c1) eVar.a(mm2.c1.class)).f410385o);
            r45.ee1 ee1Var = new r45.ee1();
            ee1Var.set(0, ((mm2.c1) eVar.a(mm2.c1.class)).f410385o);
            ee1Var.set(1, java.lang.Long.valueOf(((mm2.e1) eVar.a(mm2.e1.class)).f410516m));
            ee1Var.set(2, hc2.b.a(y23Var));
            ee1Var.set(3, 0);
            ke2.o0 o0Var = new ke2.o0("/cgi-bin/mmbiz-bin/finderliveaddproducttoshopbag", 8726, ee1Var, ld2Var, null);
            android.content.Context context = s3Var.f3639x46306858.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            az2.j.u(o0Var, context, null, 500L, 2, null);
            o0Var.l().K(new ut2.m1(rVar));
            j17 = rVar.j();
            if (j17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            j17 = obj;
        }
        jz5.l lVar = (jz5.l) j17;
        if (((java.lang.Boolean) lVar.f384366d).booleanValue()) {
            s3Var.Q(m0Var);
        } else {
            java.lang.CharSequence charSequence = (java.lang.CharSequence) lVar.f384367e;
            if (charSequence.length() == 0) {
                charSequence = s3Var.f3639x46306858.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dq_);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(charSequence, "getString(...)");
            }
            db5.t7.g(s3Var.f3639x46306858.getContext(), (java.lang.String) charSequence);
        }
        return jz5.f0.f384359a;
    }
}
