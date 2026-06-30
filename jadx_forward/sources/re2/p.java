package re2;

/* loaded from: classes2.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f475994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f475995e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ re2.w f475996f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f475997g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.p f475998h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(java.lang.String str, re2.w wVar, yz5.l lVar, yz5.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f475995e = str;
        this.f475996f = wVar;
        this.f475997g = lVar;
        this.f475998h = pVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new re2.p(this.f475995e, this.f475996f, this.f475997g, this.f475998h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((re2.p) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f475994d;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                zl2.r4 r4Var = zl2.r4.f555483a;
                java.lang.String str2 = this.f475995e;
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                this.f475994d = 1;
                obj = r4Var.p3(str2, context, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            str = (java.lang.String) obj;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.CoLiveAvatarMerger", "doUpload: upLoadImg threw: " + th6.getMessage());
            str = null;
        }
        this.f475996f.f476031d.post(new re2.o(str, this.f475997g, this.f475998h));
        return jz5.f0.f384359a;
    }
}
