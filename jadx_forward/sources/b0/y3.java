package b0;

/* loaded from: classes14.dex */
public final class y3 extends qz5.k implements yz5.p {

    /* renamed from: e, reason: collision with root package name */
    public int f98140e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f98141f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b0.h2 f98142g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f98143h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f98144i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f98145m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(b0.h2 h2Var, yz5.l lVar, yz5.l lVar2, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f98142g = h2Var;
        this.f98143h = lVar;
        this.f98144i = lVar2;
        this.f98145m = h0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        b0.y3 y3Var = new b0.y3(this.f98142g, this.f98143h, this.f98144i, this.f98145m, interfaceC29045xdcb5ca57);
        y3Var.f98141f = obj;
        return y3Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.y3) mo148xaf65a0fc((p1.c) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f98140e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p1.c cVar = (p1.c) this.f98141f;
            this.f98140e = 1;
            obj = b0.d4.f(cVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        p1.s sVar = (p1.s) obj;
        jz5.f0 f0Var = jz5.f0.f384359a;
        b0.h2 h2Var = this.f98142g;
        if (sVar != null) {
            sVar.a();
            h2Var.f97862e = true;
            p3325xe03a0797.p3326xc267989b.p3332x361a9b.c.c(h2Var.f97864g, null, 1, null);
            this.f98143h.mo146xb9724478(new d1.e(sVar.f432414c));
            return f0Var;
        }
        h2Var.f97863f = true;
        p3325xe03a0797.p3326xc267989b.p3332x361a9b.c.c(h2Var.f97864g, null, 1, null);
        yz5.l lVar = this.f98144i;
        if (lVar == null) {
            return null;
        }
        lVar.mo146xb9724478(new d1.e(((p1.s) this.f98145m.f391656d).f432414c));
        return f0Var;
    }
}
