package dk2;

/* loaded from: classes3.dex */
public final class a7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f314715d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f314716e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314717f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ce2.i f314718g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7(java.util.LinkedList linkedList, java.lang.String str, ce2.i iVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f314716e = linkedList;
        this.f314717f = str;
        this.f314718g = iVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dk2.a7(this.f314716e, this.f314717f, this.f314718g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((dk2.a7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f314715d;
        java.lang.String str = this.f314717f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            dk2.u7 u7Var = dk2.u7.f315714a;
            this.f314715d = 1;
            obj = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new dk2.s7(this.f314716e, str, this.f314718g, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        ce2.i iVar = (ce2.i) dk2.u7.f315718e.get(str);
        if (!booleanValue || iVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderLiveGiftLoader", "checkAndDownloadMultiAnimation id:" + str + " failed, succ:" + booleanValue + ", lastestGiftInfo:" + iVar);
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).Oj().mo11260x413cb2b4(iVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftLoader", "checkAndDownloadMultiAnimation id:" + str + " succ");
        }
        return jz5.f0.f384359a;
    }
}
