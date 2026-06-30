package qi3;

/* loaded from: classes12.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f445274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f445275e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f445276f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f445277g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f445278h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f445279i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f445275e = str;
        this.f445276f = i17;
        this.f445277g = i18;
        this.f445278h = str2;
        this.f445279i = str3;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qi3.l(this.f445275e, this.f445276f, this.f445277g, this.f445278h, this.f445279i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qi3.l) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.Object b17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f445274d;
        int i18 = this.f445276f;
        java.lang.String str3 = this.f445275e;
        ?? r102 = "MicroMsg.BypSendHelper";
        java.lang.String str4 = this.f445279i;
        java.lang.String str5 = this.f445278h;
        int i19 = this.f445277g;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
                java.lang.String r17 = c01.z1.r();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getUsernameFromUserInfo(...)");
                java.lang.String str6 = this.f445275e;
                str2 = "MicroMsg.BypSendHelper";
                try {
                    com.p314xaae8f345.mm.p944x882e457a.i b18 = qi3.m.f445280a.a(new qi3.n(r17, str6, str6, this.f445276f, null, valueOf, null, 64, null), 51, new qi3.g(i19, str5, str4)).b();
                    r102 = 1;
                    this.f445274d = 1;
                    b17 = rm0.h.b(b18, this);
                    if (b17 == aVar) {
                        return aVar;
                    }
                } catch (java.lang.Exception e17) {
                    e = e17;
                    str = str2;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "send byp status notify to claw failed - toUserName: " + str3 + ", action: " + i19 + ", funcName: " + str5 + ", arg: " + str4 + ", bizType: " + i18, e);
                    return jz5.f0.f384359a;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                b17 = obj;
                str2 = "MicroMsg.BypSendHelper";
                r102 = r102;
            }
            com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) b17;
            str = str2;
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "byp status notify. toUserName: " + str3 + ", action: " + i19 + ", funcName: " + str5 + ", arg: " + str4 + ", bizType: " + i18 + ". rsp errCode:" + fVar.f152149b + ", errType: " + fVar.f152148a + ", errMsg: " + fVar.f152150c);
            } catch (java.lang.Exception e18) {
                e = e18;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "send byp status notify to claw failed - toUserName: " + str3 + ", action: " + i19 + ", funcName: " + str5 + ", arg: " + str4 + ", bizType: " + i18, e);
                return jz5.f0.f384359a;
            }
        } catch (java.lang.Exception e19) {
            e = e19;
            str = r102;
        }
        return jz5.f0.f384359a;
    }
}
