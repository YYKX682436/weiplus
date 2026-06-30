package df2;

/* loaded from: classes3.dex */
public final class yy extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f313437d;

    /* renamed from: e, reason: collision with root package name */
    public int f313438e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.lz f313439f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f313440g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yy(df2.lz lzVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f313439f = lzVar;
        this.f313440g = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.yy(this.f313439f, this.f313440g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.yy) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f313438e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            df2.lz lzVar = this.f313439f;
            java.lang.String str2 = lzVar.f312263m;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start download anim ");
            java.lang.String str3 = this.f313440g;
            sb6.append(str3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
            if (ae2.in.f85221a.a(ym5.f6.K1)) {
                rj.j a17 = nn2.d.f420204a.a();
                java.lang.String str4 = lzVar.f312263m;
                this.f313437d = str3;
                this.f313438e = 1;
                obj = ((b51.m) a17).j(str3, str4, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                rj.j a18 = nn2.d.f420204a.a();
                java.lang.String str5 = lzVar.f312263m;
                this.f313437d = str3;
                this.f313438e = 2;
                obj = ((b51.m) a18).h(str3, str5, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            str = str3;
        } else {
            if (i17 != 1 && i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) this.f313437d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return new jz5.l(str, obj);
    }
}
