package rf2;

/* loaded from: classes3.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f476327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.q f476328e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s71.b f476329f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.f02 f476330g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(rf2.q qVar, s71.b bVar, r45.f02 f02Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f476328e = qVar;
        this.f476329f = bVar;
        this.f476330g = f02Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rf2.l(this.f476328e, this.f476329f, this.f476330g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rf2.l) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object e17;
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f476327d;
        s71.b bVar = this.f476329f;
        rf2.q qVar = this.f476328e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            on2.l3 l3Var = on2.l3.f428499a;
            long j17 = ((mm2.e1) qVar.f476387e.m56788xbba4bfc0(mm2.e1.class)).f410516m;
            byte[] bArr = ((mm2.e1) qVar.f476387e.m56788xbba4bfc0(mm2.e1.class)).f410518o;
            android.content.Context context = qVar.f476386d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            java.lang.String str = "claim addr:" + bVar.f485509m;
            r45.p30 p30Var = new r45.p30();
            p30Var.set(0, bVar.f485510n);
            p30Var.set(1, bVar.f485511o);
            p30Var.set(2, l3Var.d(bVar));
            java.lang.String str2 = this.f476330g.f455411d;
            this.f476327d = 1;
            e17 = l3Var.e(j17, bArr, context, str, p30Var, str2, this);
            if (e17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            e17 = obj;
        }
        r45.ul4 ul4Var = (r45.ul4) e17;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (ul4Var != null) {
            pm0.v.X(new rf2.k(qVar, ul4Var));
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(qVar.f476388f, "claim addr:" + bVar.f485509m + " but resp is null!");
        }
        return f0Var2;
    }
}
