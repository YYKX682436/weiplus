package zl2;

/* loaded from: classes3.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f555361d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f555362e;

    /* renamed from: f, reason: collision with root package name */
    public int f555363f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f555364g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f555364g = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zl2.j(this.f555364g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((zl2.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f555363f;
        java.lang.String str2 = this.f555364g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            mn2.n nVar = new mn2.n(str2, null, 2, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9 e9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a;
            java.lang.String str3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183674j + nVar.f411598m;
            if (com.p314xaae8f345.mm.vfs.w6.j(str3)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveCoverEditHelper", "downloadProfileAvatarToLocal: use cache " + str3);
                return str3;
            }
            java.lang.String r17 = com.p314xaae8f345.mm.vfs.w6.r(str3);
            com.p314xaae8f345.mm.vfs.w6.u(r17);
            com.p314xaae8f345.mm.vfs.w6.t(r17);
            this.f555361d = str3;
            this.f555362e = str2;
            this.f555363f = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            n11.a b17 = n11.a.b();
            o11.f fVar = new o11.f();
            fVar.f423615f = str3;
            fVar.f423611b = false;
            b17.d(str2, fVar.a(), new zl2.i(rVar));
            java.lang.Object j17 = rVar.j();
            if (j17 == aVar) {
                return aVar;
            }
            str = str3;
            obj = j17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) this.f555361d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue() && com.p314xaae8f345.mm.vfs.w6.j(str)) {
            return str;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveCoverEditHelper", "downloadProfileAvatarToLocal: failed " + str2);
        return null;
    }
}
