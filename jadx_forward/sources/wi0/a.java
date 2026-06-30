package wi0;

/* loaded from: classes11.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f527664d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.C24217x3ed66034 f527665e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f527666f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.C24217x3ed66034 c24217x3ed66034, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f527665e = c24217x3ed66034;
        this.f527666f = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new wi0.a(this.f527665e, this.f527666f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((wi0.a) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.C24217x3ed66034 c24217x3ed66034 = this.f527665e;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f527664d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        yz5.l lVar = this.f527666f;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                java.lang.String m89548x6c03c64c = c24217x3ed66034.m89548x6c03c64c();
                java.lang.String m89546xb5887639 = c24217x3ed66034.m89546xb5887639();
                java.lang.String m89547x41694f40 = c24217x3ed66034.m89547x41694f40();
                java.lang.String m89545x1e2296db = c24217x3ed66034.m89545x1e2296db();
                this.f527664d = 1;
                obj = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new vi0.g(m89548x6c03c64c, m89546xb5887639, m89547x41694f40, m89545x1e2296db, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            java.lang.String str = (java.lang.String) obj;
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.C24218x9f1d5b3c(str))));
            return f0Var;
        } catch (java.lang.Exception e17) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(e17))));
            return f0Var;
        }
    }
}
