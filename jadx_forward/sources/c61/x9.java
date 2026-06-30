package c61;

/* loaded from: classes11.dex */
public final class x9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f120940d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c61.da f120941e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f120942f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f120943g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f120944h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(c61.da daVar, java.lang.String str, boolean z17, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f120941e = daVar;
        this.f120942f = str;
        this.f120943g = z17;
        this.f120944h = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new c61.x9(this.f120941e, this.f120942f, this.f120943g, this.f120944h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((c61.x9) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f120940d;
        yz5.l lVar = this.f120944h;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                c61.da daVar = this.f120941e;
                java.lang.String str = this.f120942f;
                boolean z17 = this.f120943g;
                this.f120940d = 1;
                obj = c61.da.a(daVar, str, z17, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813((com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24541x5ec521c7) obj)));
        } catch (java.lang.Exception e17) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(e17))));
        }
        return jz5.f0.f384359a;
    }
}
