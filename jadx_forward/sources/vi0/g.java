package vi0;

/* loaded from: classes2.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f518786d;

    /* renamed from: e, reason: collision with root package name */
    public int f518787e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f518788f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f518789g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f518790h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f518791i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f518788f = str;
        this.f518789g = str2;
        this.f518790h = str3;
        this.f518791i = str4;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vi0.g(this.f518788f, this.f518789g, this.f518790h, this.f518791i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vi0.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f518787e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getImageFile(");
            java.lang.String username = this.f518788f;
            sb6.append(username);
            sb6.append(", ");
            java.lang.String str2 = this.f518789g;
            sb6.append(str2);
            sb6.append(", ");
            java.lang.String str3 = this.f518790h;
            sb6.append(str3);
            sb6.append(", ");
            java.lang.String str4 = this.f518791i;
            sb6.append(str4);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderDataSource", sb6.toString());
            r45.mb4 mb4Var = new r45.mb4();
            mb4Var.set(9, com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(str2));
            mb4Var.set(0, str2);
            mb4Var.set(18, str3);
            mb4Var.set(17, str4);
            mb4Var.set(1, str2);
            mb4Var.set(19, str3);
            java.lang.String m75945x2fec8307 = mb4Var.m75945x2fec8307(1);
            if (m75945x2fec8307 == null || (str = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(m75945x2fec8307.getBytes())) == null) {
                str = "";
            }
            mb4Var.set(46, str);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            ya2.l lVar = ya2.l.f542035a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 y90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
            mn2.u0 u0Var = new mn2.u0(mb4Var, y90Var, username);
            this.f518786d = u0Var;
            this.f518787e = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(u0Var);
            vi0.e eVar = new vi0.e(rVar);
            a17.getClass();
            a17.f529409g = eVar;
            a17.f529412j = new vi0.f(rVar);
            a17.d();
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}
