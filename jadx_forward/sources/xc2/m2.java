package xc2;

/* loaded from: classes.dex */
public final class m2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f534741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ab0.v f534742e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f534743f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f534744g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(ab0.v vVar, boolean z17, android.content.Context context, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f534742e = vVar;
        this.f534743f = z17;
        this.f534744g = context;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xc2.m2(this.f534742e, this.f534743f, this.f534744g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xc2.m2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f534741d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.Object obj2 = this.f534742e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
            xc2.l2 l2Var = new xc2.l2(this.f534743f, this.f534744g);
            this.f534741d = 1;
            if (xg2.g.c((com.p314xaae8f345.mm.p944x882e457a.m1) obj2, l2Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
