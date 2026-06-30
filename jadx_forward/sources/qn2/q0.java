package qn2;

/* loaded from: classes3.dex */
public final class q0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f446668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qn2.v0 f446669e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s71.b f446670f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.cz1 f446671g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(qn2.v0 v0Var, s71.b bVar, r45.cz1 cz1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f446669e = v0Var;
        this.f446670f = bVar;
        this.f446671g = cz1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qn2.q0(this.f446669e, this.f446670f, this.f446671g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qn2.q0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object h17;
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f446668d;
        s71.b bVar = this.f446670f;
        qn2.v0 v0Var = this.f446669e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            on2.l3 l3Var = on2.l3.f428499a;
            long j17 = ((mm2.e1) v0Var.f446709a.P0(mm2.e1.class)).f410516m;
            byte[] bArr = ((mm2.e1) v0Var.f446709a.P0(mm2.e1.class)).f410518o;
            android.content.Context context = v0Var.f446710b.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            java.lang.String str = "claim addr:" + bVar.f485509m;
            r45.p30 p30Var = new r45.p30();
            p30Var.set(0, bVar.f485510n);
            p30Var.set(1, bVar.f485511o);
            p30Var.set(2, l3Var.d(bVar));
            r45.cz1 cz1Var = this.f446671g;
            this.f446668d = 1;
            h17 = l3Var.h(j17, bArr, context, str, p30Var, cz1Var, this);
            if (h17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            h17 = obj;
        }
        r45.yy1 yy1Var = (r45.yy1) h17;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (yy1Var != null) {
            pm0.v.X(new qn2.p0(v0Var, yy1Var));
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VisitorLotteryCardDoneWidget", "claim addr:" + bVar.f485509m + " but resp is null!");
        }
        return f0Var2;
    }
}
