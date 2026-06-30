package n12;

/* loaded from: classes5.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f415620d;

    /* renamed from: e, reason: collision with root package name */
    public int f415621e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n12.n f415622f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f415623g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f415624h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f415625i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n12.n nVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f415622f = nVar;
        this.f415623g = h0Var;
        this.f415624h = f0Var;
        this.f415625i = f0Var2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new n12.k(this.f415622f, this.f415623g, this.f415624h, this.f415625i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((n12.k) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f415621e;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f415623g;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.String c17 = com.p314xaae8f345.mm.vfs.q7.c("emoji-editor");
            if (!com.p314xaae8f345.mm.vfs.w6.j(c17) && !com.p314xaae8f345.mm.vfs.w6.u(c17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EmoticonCustomCreatePreprocessLogic", "Failed to create emoji temp directory: " + c17);
                return f0Var;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(c17);
            sb6.append('/');
            n12.n nVar = this.f415622f;
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(nVar.f415634a));
            sb6.append("-preprocessd-");
            n12.g gVar = nVar.f415635b;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(gVar.f415609a.left);
            sb7.append('-');
            sb7.append(gVar.f415609a.right);
            sb7.append('-');
            sb7.append(gVar.f415609a.top);
            sb7.append('-');
            sb7.append(gVar.f415609a.bottom);
            sb7.append('-');
            sb7.append(gVar.f415610b);
            sb6.append(sb7.toString());
            java.lang.String sb8 = sb6.toString();
            if (com.p314xaae8f345.mm.vfs.w6.j(sb8)) {
                h0Var.f391656d = sb8;
                return f0Var;
            }
            if (!com.p314xaae8f345.mm.vfs.w6.e(sb8)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EmoticonCustomCreatePreprocessLogic", "Failed to create emoji output file: " + sb8);
                return f0Var;
            }
            n12.n nVar2 = this.f415622f;
            java.lang.String str2 = nVar2.f415634a;
            android.util.Size size = new android.util.Size(this.f415624h.f391649d, this.f415625i.f391649d);
            android.graphics.Rect rect = nVar.f415635b.f415609a;
            android.util.Range range = new android.util.Range(new java.lang.Integer(0), new java.lang.Integer(nVar.f415636c));
            this.f415620d = sb8;
            this.f415621e = 1;
            obj = n12.n.a(nVar2, str2, sb8, size, rect, range, this);
            if (obj == aVar) {
                return aVar;
            }
            str = sb8;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) this.f415620d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
            return f0Var;
        }
        h0Var.f391656d = str;
        return f0Var;
    }
}
