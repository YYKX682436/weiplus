package b50;

/* loaded from: classes11.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.lr4 f99506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23468x660624ff f99507e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p746x19f64be5.p747xd2ae381c.p748x633fb29.C10601x91d05935 f99508f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.k97 f99509g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(r45.lr4 lr4Var, com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23468x660624ff c23468x660624ff, com.p314xaae8f345.mm.p689xc5a27af6.p746x19f64be5.p747xd2ae381c.p748x633fb29.C10601x91d05935 c10601x91d05935, r45.k97 k97Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f99506d = lr4Var;
        this.f99507e = c23468x660624ff;
        this.f99508f = c10601x91d05935;
        this.f99509g = k97Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new b50.o0(this.f99506d, this.f99507e, this.f99508f, this.f99509g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        b50.o0 o0Var = (b50.o0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        o0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        com.p314xaae8f345.mm.p689xc5a27af6.p746x19f64be5.p747xd2ae381c.p748x633fb29.C10601x91d05935 c10601x91d05935 = this.f99508f;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        cs1.a aVar2 = cs1.b.f303590a;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23468x660624ff c23468x660624ff = this.f99507e;
        java.lang.Long m86550x7235c680 = c23468x660624ff.m86550x7235c680();
        int longValue = m86550x7235c680 != null ? (int) m86550x7235c680.longValue() : 0;
        java.lang.String m86556x6bf53a6c = c23468x660624ff.m86556x6bf53a6c();
        if (m86556x6bf53a6c == null) {
            m86556x6bf53a6c = "";
        }
        java.lang.String m86554x7531c8a2 = c23468x660624ff.m86554x7531c8a2();
        this.f99506d.set(1, aVar2.a(context, longValue, m86556x6bf53a6c, m86554x7531c8a2 != null ? m86554x7531c8a2 : ""));
        byte[] bArr = null;
        try {
            bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.G(c23468x660624ff.m86548x37b3d7da());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(c10601x91d05935.f148594d, e17, "onMinimizeArticle", new java.lang.Object[0]);
            bitmap = null;
        }
        byte[] mo14344x5f01b1f6 = this.f99509g.mo14344x5f01b1f6();
        java.lang.String m86555xb5887639 = c23468x660624ff.m86555xb5887639();
        if (m86555xb5887639 != null) {
            bArr = m86555xb5887639.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bArr, "getBytes(...)");
        }
        java.lang.String str = c23468x660624ff.m86551x51f8f5b0() + '_' + kk.k.g(bArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c10601x91d05935.f148594d, "addTaskInfoByBitmap, id = " + str);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0.class))).Ai(str, 2, this.f99506d, bitmap, mo14344x5f01b1f6, new mk3.a(null, false, false, 7, null));
        return jz5.f0.f384359a;
    }
}
