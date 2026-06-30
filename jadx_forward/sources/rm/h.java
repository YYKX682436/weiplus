package rm;

/* loaded from: classes8.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f478909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f478910e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f478911f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f478912g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f478913h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.iam.biz.g f478914i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.iam.biz.v1 f478915m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i17, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar, boolean z17, boolean z18, com.p314xaae8f345.p3133xd0ce8b26.iam.biz.g gVar, com.p314xaae8f345.p3133xd0ce8b26.iam.biz.v1 v1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f478910e = i17;
        this.f478911f = rVar;
        this.f478912g = z17;
        this.f478913h = z18;
        this.f478914i = gVar;
        this.f478915m = v1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rm.h(this.f478910e, this.f478911f, this.f478912g, this.f478913h, this.f478914i, this.f478915m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rm.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object f17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f478909d;
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f478911f;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                rm.g gVar = new rm.g(this.f478914i, this.f478915m, null);
                this.f478909d = 1;
                f17 = p3325xe03a0797.p3326xc267989b.z0.f(gVar, this);
                if (f17 == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                f17 = obj;
            }
            jz5.l lVar = (jz5.l) f17;
            boolean booleanValue = ((java.lang.Boolean) lVar.f384366d).booleanValue();
            com.p314xaae8f345.p3133xd0ce8b26.iam.biz.w1 w1Var = (com.p314xaae8f345.p3133xd0ce8b26.iam.biz.w1) lVar.f384367e;
            java.lang.String str = w1Var != null ? w1Var.f299337f[1] ? w1Var.f299335d : "" : null;
            java.lang.String str2 = str == null ? "" : str;
            java.lang.String str3 = w1Var != null ? w1Var.f299337f[2] ? w1Var.f299336e : "" : null;
            java.lang.String str4 = str3 == null ? "" : str3;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkCanCreatePhotoAccount done, scene=");
            sb6.append(this.f478910e);
            sb6.append(", sceneEnabled=");
            sb6.append(booleanValue);
            sb6.append(", registerLen=");
            sb6.append(str2.length());
            sb6.append(", switchLen=");
            sb6.append(str4.length());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckCanCreatePhotoAccountTask", sb6.toString());
            if (rVar != null) {
                rVar.a(new com.p314xaae8f345.mm.p646xf2865d2e.C10318x1cf69000(true, this.f478912g, this.f478913h, booleanValue, str2, str4, ""));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CheckCanCreatePhotoAccountTask", e17, "checkCanCreatePhotoAccount exception", new java.lang.Object[0]);
            if (rVar != null) {
                boolean z17 = this.f478912g;
                boolean z18 = this.f478913h;
                java.lang.String message = e17.getMessage();
                if (message == null) {
                    message = "exception";
                }
                rVar.a(new com.p314xaae8f345.mm.p646xf2865d2e.C10318x1cf69000(false, z17, z18, false, "", "", message));
            }
        }
        return jz5.f0.f384359a;
    }
}
