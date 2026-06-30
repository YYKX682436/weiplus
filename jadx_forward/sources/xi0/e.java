package xi0;

/* loaded from: classes4.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f536207d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f536208e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f536209f;

    /* renamed from: g, reason: collision with root package name */
    public int f536210g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f536211h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f536212i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f536213m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f536214n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f536211h = str;
        this.f536212i = str2;
        this.f536213m = str3;
        this.f536214n = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xi0.e(this.f536211h, this.f536212i, this.f536213m, this.f536214n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xi0.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.jj4 jj4Var;
        int i17;
        r45.a90 a90Var;
        java.util.LinkedList linkedList;
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f440719d;
        int i18 = this.f536210g;
        if (i18 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getImageFile(");
            java.lang.String str = this.f536211h;
            sb6.append(str);
            sb6.append(", ");
            java.lang.String str2 = this.f536212i;
            sb6.append(str2);
            sb6.append(", ");
            java.lang.String str3 = this.f536213m;
            sb6.append(str3);
            sb6.append("), requestThumb:");
            boolean z17 = this.f536214n;
            sb6.append(z17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsDataSource", sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(str);
            if (k17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsDataSource", "Couldn't find SnsInfo, localId=" + str);
                return null;
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = k17.m70371x485d7();
            if (m70371x485d7 == null || (a90Var = m70371x485d7.f39014x86965dde) == null || (linkedList = a90Var.f451373h) == null) {
                jj4Var = null;
            } else {
                java.util.Iterator it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.jj4) obj2).f459388d, str3)) {
                        break;
                    }
                }
                jj4Var = (r45.jj4) obj2;
            }
            if (jj4Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsDataSource", "Couldn't find media, localId=" + str + ", mediaId=" + str3);
                return null;
            }
            java.lang.String i19 = com.p314xaae8f345.mm.vfs.w6.i(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), jj4Var.f459388d) + (z17 ? ca4.z0.U(jj4Var) : ca4.z0.J(jj4Var)), false);
            if (com.p314xaae8f345.mm.vfs.w6.j(i19) && ca4.z0.f(ca4.z0.o(i19))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsDataSource", "photo has already been downloaded: " + i19);
                return i19;
            }
            ca4.s0 s0Var = new ca4.s0(jj4Var);
            if (z17) {
                s0Var.d(1);
                i17 = jj4Var.f459389e == 6 ? 5 : 1;
            } else {
                s0Var.d(3);
                i17 = 2;
            }
            s0Var.e(jj4Var.f459388d);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m0 Cj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsDataSource", "start downloading mediaId=" + jj4Var.f459388d + ", snsId=" + str2);
            Cj.d(jj4Var, i17, s0Var, com.p314xaae8f345.mm.p2621x8fb0427b.s7.f276836g);
            this.f536207d = jj4Var;
            this.f536208e = i19;
            this.f536209f = Cj;
            this.f536210g = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            xi0.d dVar = new xi0.d(jj4Var, i19, Cj, rVar);
            Cj.c(dVar);
            rVar.m(new xi0.c(Cj, dVar));
            obj = rVar.j();
            pz5.a aVar2 = pz5.a.f440719d;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}
