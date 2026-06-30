package qy0;

/* loaded from: classes5.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f449092d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f449093e;

    /* renamed from: f, reason: collision with root package name */
    public int f449094f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p918xcca2f8c0.C11004x58386388 f449095g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 f449096h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f449097i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p918xcca2f8c0.C11004x58386388 c11004x58386388, com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 c4116xf4b2c356, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f449095g = c11004x58386388;
        this.f449096h = c4116xf4b2c356;
        this.f449097i = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qy0.b(this.f449095g, this.f449096h, this.f449097i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qy0.b) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object obj2;
        gz0.h hVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f449094f;
        com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p918xcca2f8c0.C11004x58386388 c11004x58386388 = this.f449095g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ((n0.q4) c11004x58386388.f151278g).mo148714x53d8522f(this.f449096h);
            gz0.h hVar2 = c11004x58386388.f151281m;
            if (hVar2 != null) {
                this.f449094f = 1;
                if (hVar2.d(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p918xcca2f8c0.C11004x58386388 c11004x583863882 = (com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p918xcca2f8c0.C11004x58386388) this.f449093e;
                hVar = (gz0.h) this.f449092d;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                c11004x58386388 = c11004x583863882;
                c11004x58386388.f151281m = hVar;
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.util.Iterator it = c11004x58386388.f151280i.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.String.valueOf(((r45.mh4) obj2).f462041d), this.f449097i)) {
                break;
            }
        }
        r45.mh4 mh4Var = (r45.mh4) obj2;
        java.lang.String str = mh4Var != null ? mh4Var.f462044g : null;
        if (str == null) {
            str = "";
        }
        hVar = new gz0.h(str, 0L, 0L, 4, null);
        if (!((java.lang.Boolean) ((n0.q4) c11004x58386388.f151279h).mo128745x754a37bb()).booleanValue()) {
            this.f449092d = hVar;
            this.f449093e = c11004x58386388;
            this.f449094f = 2;
            if (hVar.c(this) == aVar) {
                return aVar;
            }
        }
        c11004x58386388.f151281m = hVar;
        return jz5.f0.f384359a;
    }
}
