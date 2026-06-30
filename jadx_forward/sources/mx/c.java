package mx;

/* loaded from: classes11.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.lr4 f413341d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23468x660624ff f413342e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mx.e f413343f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ byte[] f413344g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r45.lr4 lr4Var, com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23468x660624ff c23468x660624ff, mx.e eVar, byte[] bArr, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f413341d = lr4Var;
        this.f413342e = c23468x660624ff;
        this.f413343f = eVar;
        this.f413344g = bArr;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx.c(this.f413341d, this.f413342e, this.f413343f, this.f413344g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        mx.c cVar = (mx.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        cVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        ak3.c cVar;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        cs1.a aVar2 = cs1.b.f303590a;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23468x660624ff c23468x660624ff = this.f413342e;
        java.lang.Long m86550x7235c680 = c23468x660624ff.m86550x7235c680();
        int longValue = m86550x7235c680 != null ? (int) m86550x7235c680.longValue() : 0;
        java.lang.String m86556x6bf53a6c = c23468x660624ff.m86556x6bf53a6c();
        if (m86556x6bf53a6c == null) {
            m86556x6bf53a6c = "";
        }
        java.lang.String m86554x7531c8a2 = c23468x660624ff.m86554x7531c8a2();
        java.lang.String a17 = aVar2.a(context, longValue, m86556x6bf53a6c, m86554x7531c8a2 != null ? m86554x7531c8a2 : "");
        r45.lr4 lr4Var = this.f413341d;
        lr4Var.set(1, a17);
        android.graphics.Bitmap bitmap2 = null;
        try {
            bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.G(c23468x660624ff.m86546x4e14d9c2());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BizMultiTaskHelper", e17, "onMinimizeArticle", new java.lang.Object[0]);
            bitmap = null;
        }
        try {
            bitmap2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.G(c23468x660624ff.m86548x37b3d7da());
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BizMultiTaskHelper", e18, "onMinimizeArticle", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23512x5d662177 m86547x20d4f6c6 = c23468x660624ff.m86547x20d4f6c6();
        mx.e eVar = this.f413343f;
        if (m86547x20d4f6c6 != null && bitmap != null && (cVar = eVar.f381644d) != null) {
            com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23512x5d662177 m86547x20d4f6c62 = c23468x660624ff.m86547x20d4f6c6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m86547x20d4f6c62);
            java.lang.Double m86759xfb82087d = m86547x20d4f6c62.m86759xfb82087d();
            int doubleValue = m86759xfb82087d != null ? (int) m86759xfb82087d.doubleValue() : 0;
            com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23512x5d662177 m86547x20d4f6c63 = c23468x660624ff.m86547x20d4f6c6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m86547x20d4f6c63);
            java.lang.Double m86761xb588721f = m86547x20d4f6c63.m86761xb588721f();
            int doubleValue2 = m86761xb588721f != null ? (int) m86761xb588721f.doubleValue() : 0;
            com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23512x5d662177 m86547x20d4f6c64 = c23468x660624ff.m86547x20d4f6c6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m86547x20d4f6c64);
            java.lang.Double m86760x75156866 = m86547x20d4f6c64.m86760x75156866();
            int doubleValue3 = m86760x75156866 != null ? (int) m86760x75156866.doubleValue() : 0;
            com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23512x5d662177 m86547x20d4f6c65 = c23468x660624ff.m86547x20d4f6c6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m86547x20d4f6c65);
            java.lang.Double m86758x12a4bd21 = m86547x20d4f6c65.m86758x12a4bd21();
            ((ak3.i) cVar).s(new android.graphics.Rect(doubleValue, doubleValue2, doubleValue3, m86758x12a4bd21 != null ? (int) m86758x12a4bd21.doubleValue() : 0), bitmap);
        }
        eVar.f381650j = new mx.b(eVar, bitmap2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = eVar.f381610a;
        if (c16601x7ed0e40c != null) {
            c16601x7ed0e40c.f66790x225a93cf = this.f413344g;
        }
        if (c16601x7ed0e40c != null) {
            c16601x7ed0e40c.f66792x98981ec = lr4Var;
        }
        eVar.V(true, 9, jk3.c.f381614e);
        return jz5.f0.f384359a;
    }
}
