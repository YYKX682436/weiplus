package gx0;

/* loaded from: classes5.dex */
public final class kd extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f358166d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 f358167e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv0.c7 f358168f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f358169g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3, rv0.c7 c7Var, gx0.bf bfVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358167e = c4181x2248e1a3;
        this.f358168f = c7Var;
        this.f358169g = bfVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.kd(this.f358167e, this.f358168f, this.f358169g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.kd) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4136x636f12b7 c4136x636f12b7;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f358166d;
        boolean z17 = true;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            rv0.c7 c7Var = this.f358168f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c7Var, "<this>");
            int ordinal = c7Var.ordinal();
            if (ordinal != 0) {
                boolean z18 = false;
                if (ordinal == 1) {
                    c4136x636f12b7 = new java.lang.Object(z18, z18) { // from class: com.tencent.maas.moviecomposing.ComposingDefines$ClipSkimOptions

                        /* renamed from: a, reason: collision with root package name */
                        public final int f129901a;

                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            this.f129901a = z18 ? (z18 ? 1 : 0) | 2 : z18;
                        }

                        /* renamed from: useAssetAspectRatio */
                        public boolean m34031x745ae52a() {
                            return (this.f129901a & 1) != 0;
                        }

                        /* renamed from: useTimelineVideoSettings */
                        public boolean m34032x90ebabb6() {
                            return (this.f129901a & 2) != 0;
                        }
                    };
                } else if (ordinal == 2) {
                    c4136x636f12b7 = new java.lang.Object(z17, z18) { // from class: com.tencent.maas.moviecomposing.ComposingDefines$ClipSkimOptions

                        /* renamed from: a, reason: collision with root package name */
                        public final int f129901a;

                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            this.f129901a = z18 ? (z17 ? 1 : 0) | 2 : z17;
                        }

                        /* renamed from: useAssetAspectRatio */
                        public boolean m34031x745ae52a() {
                            return (this.f129901a & 1) != 0;
                        }

                        /* renamed from: useTimelineVideoSettings */
                        public boolean m34032x90ebabb6() {
                            return (this.f129901a & 2) != 0;
                        }
                    };
                } else {
                    if (ordinal != 3) {
                        throw new jz5.j();
                    }
                    c4136x636f12b7 = new java.lang.Object(z18, z17) { // from class: com.tencent.maas.moviecomposing.ComposingDefines$ClipSkimOptions

                        /* renamed from: a, reason: collision with root package name */
                        public final int f129901a;

                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            this.f129901a = z17 ? (z18 ? 1 : 0) | 2 : z18;
                        }

                        /* renamed from: useAssetAspectRatio */
                        public boolean m34031x745ae52a() {
                            return (this.f129901a & 1) != 0;
                        }

                        /* renamed from: useTimelineVideoSettings */
                        public boolean m34032x90ebabb6() {
                            return (this.f129901a & 2) != 0;
                        }
                    };
                }
            } else {
                c4136x636f12b7 = new java.lang.Object(z17, z17) { // from class: com.tencent.maas.moviecomposing.ComposingDefines$ClipSkimOptions

                    /* renamed from: a, reason: collision with root package name */
                    public final int f129901a;

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.f129901a = z17 ? (z17 ? 1 : 0) | 2 : z17;
                    }

                    /* renamed from: useAssetAspectRatio */
                    public boolean m34031x745ae52a() {
                        return (this.f129901a & 1) != 0;
                    }

                    /* renamed from: useTimelineVideoSettings */
                    public boolean m34032x90ebabb6() {
                        return (this.f129901a & 2) != 0;
                    }
                };
            }
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = this.f358167e;
            c4181x2248e1a3.getClass();
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4181x2248e1a3.D();
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4170x5817ebc8 X0 = D != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.X0(c4181x2248e1a3, c4136x636f12b7, D) : null;
            if (X0 == null) {
                return java.lang.Boolean.FALSE;
            }
            gx0.bf bfVar = this.f358169g;
            oz5.l lVar = bfVar.f357785s;
            gx0.jd jdVar = new gx0.jd(bfVar, X0, c4181x2248e1a3, null);
            this.f358166d = 1;
            obj = p3325xe03a0797.p3326xc267989b.l.g(lVar, jdVar, this);
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
