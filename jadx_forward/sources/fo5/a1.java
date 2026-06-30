package fo5;

/* loaded from: classes11.dex */
public final class a1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f346484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f346485e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f346486f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 f346487g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(yz5.l lVar, android.content.Context context, com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 c10716x931597c6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f346485e = lVar;
        this.f346486f = context;
        this.f346487g = c10716x931597c6;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new fo5.a1(this.f346485e, this.f346486f, this.f346487g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((fo5.a1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        android.content.Intent intent;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f346484d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            android.content.Intent intent2 = fo5.q2.f346610m;
            if (intent2 != null) {
                this.f346485e.mo146xb9724478(intent2);
                return jz5.f0.f384359a;
            }
            fo5.q2 q2Var = fo5.q2.f346604d;
            this.f346484d = 1;
            if (fo5.q2.b(q2Var, "", true, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                intent = (android.content.Intent) obj;
                this.f346485e.mo146xb9724478(intent);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        fo5.q2 q2Var2 = fo5.q2.f346604d;
        q2Var2.f().q();
        pi0.l1 l1Var = q2Var2.c().f346678b;
        if (l1Var == null) {
            intent = null;
            this.f346485e.mo146xb9724478(intent);
            return jz5.f0.f384359a;
        }
        android.content.Context context = this.f346486f;
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 c10716x931597c6 = this.f346487g;
        this.f346484d = 2;
        obj = pi0.l1.n(l1Var, context, c10716x931597c6, com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.ActivityC18916xbd02f08a.class, null, null, this, 24, null);
        if (obj == aVar) {
            return aVar;
        }
        intent = (android.content.Intent) obj;
        this.f346485e.mo146xb9724478(intent);
        return jz5.f0.f384359a;
    }
}
