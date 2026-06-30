package lx;

/* loaded from: classes7.dex */
public final class b2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f403228d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qc0.m1 f403229e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lx.i2 f403230f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f403231g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(qc0.m1 m1Var, lx.i2 i2Var, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f403229e = m1Var;
        this.f403230f = i2Var;
        this.f403231g = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new lx.b2(this.f403229e, this.f403230f, this.f403231g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((lx.b2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f403228d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 != 0) {
            if (i17 == 1) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            if (i17 == 2) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.util.List list = this.f403229e.f442946d;
        if (list != null) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                qc0.l1 l1Var = (qc0.l1) obj2;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l1Var.f442929b) && com.p314xaae8f345.mm.vfs.w6.j(l1Var.f442929b)) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = null;
        }
        boolean z17 = arrayList == null || arrayList.isEmpty();
        yz5.l lVar = this.f403231g;
        lx.i2 i2Var = this.f403230f;
        if (z17) {
            lx.i2.a(i2Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizMediaPlugin", "chooseMediaFromCamera: user cancelled or no result");
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            lx.z1 z1Var = new lx.z1(lVar, null);
            this.f403228d = 1;
            return p3325xe03a0797.p3326xc267989b.l.g(g3Var, z1Var, this) == aVar ? aVar : f0Var;
        }
        java.lang.String str = ((qc0.l1) arrayList.get(0)).f442929b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        java.lang.String str2 = zw.a.f558019b;
        if (!com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            com.p314xaae8f345.mm.vfs.w6.u(str2);
        }
        zw.v vVar = zw.v.f558076a;
        java.lang.String b17 = vVar.b(str);
        java.lang.String c17 = vVar.c(b17);
        java.lang.String str3 = zw.v.f558079d + c17;
        vVar.a(str, c17);
        if (!com.p314xaae8f345.mm.vfs.w6.j(str3)) {
            str3 = str;
        }
        i2Var.getClass();
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.p314xaae8f345.mm.p786x600aa8b.e.d(str3, options);
        android.graphics.Point point = new android.graphics.Point(options.outWidth, options.outHeight);
        java.lang.String b18 = q75.g.b(s46.c.c(r26.n0.u0(str3).toString()));
        com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30 m43587xb5c99c46 = com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43587xb5c99c46(str);
        com.p314xaae8f345.p2845xc516c4b6.biz.C23226xb46742f1 c23226xb46742f1 = new com.p314xaae8f345.p2845xc516c4b6.biz.C23226xb46742f1(b17.concat("_camera"), new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str3)).o(), null, new java.lang.Long(point.x), new java.lang.Long(point.y), new com.p314xaae8f345.p2845xc516c4b6.biz.C23190x983c4c70(m43587xb5c99c46 != null ? new java.lang.Double(m43587xb5c99c46.f27815xaa2bac6c) : null, m43587xb5c99c46 != null ? new java.lang.Double(m43587xb5c99c46.f27817x83009af) : null, null, null, null, null, null, null, null, null, null, 2044, null), b18, 4, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizMediaPlugin", "chooseMediaFromCamera success: path=" + c23226xb46742f1.m85483xfb83cc9b());
        p3325xe03a0797.p3326xc267989b.p0 p0Var2 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var2 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        lx.a2 a2Var = new lx.a2(lVar, c23226xb46742f1, null);
        this.f403228d = 2;
        return p3325xe03a0797.p3326xc267989b.l.g(g3Var2, a2Var, this) == aVar ? aVar : f0Var;
    }
}
