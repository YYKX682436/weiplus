package gx0;

/* loaded from: classes5.dex */
public final class kb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f358158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f358159e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ru0.e f358160f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ex0.q f358161g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.r6 f358162h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb(gx0.ac acVar, ru0.e eVar, ex0.q qVar, com.p314xaae8f345.mm.vfs.r6 r6Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358159e = acVar;
        this.f358160f = eVar;
        this.f358161g = qVar;
        this.f358162h = r6Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.kb(this.f358159e, this.f358160f, this.f358161g, this.f358162h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.kb) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f358158d;
        gx0.ac acVar = this.f358159e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ru0.e eVar = this.f358160f;
            acVar.j8(eVar.f481195a, vu0.w.f521701f);
            ex0.q qVar = this.f358161g;
            acVar.W7(qVar, eVar.f481199e);
            java.lang.String roleID = eVar.f481196b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roleID, "roleID");
            java.lang.String roleName = eVar.f481197c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roleName, "roleName");
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951 c4189xeb0c3951 = qVar.f338695q;
            c4189xeb0c3951.getClass();
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4189xeb0c3951.D();
            if (D != null) {
                com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951.A1(c4189xeb0c3951, roleID, roleName, D);
            }
            java.lang.String o17 = this.f358162h.o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
            c4189xeb0c3951.getClass();
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D2 = c4189xeb0c3951.D();
            if (D2 != null) {
                bool = com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951.O1(c4189xeb0c3951, o17, D2);
            }
            bool.booleanValue();
            this.f358158d = 1;
            if (qVar.G(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817.i(acVar.A7(), false, 1, null);
        gx0.bf c86 = acVar.c8();
        this.f358158d = 2;
        if (gx0.bf.d7(c86, null, null, false, this, 7, null) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
