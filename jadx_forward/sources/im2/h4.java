package im2;

/* loaded from: classes3.dex */
public final class h4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f373888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ im2.p4 f373889e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yl2.k f373890f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(im2.p4 p4Var, yl2.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f373889e = p4Var;
        this.f373890f = kVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new im2.h4(this.f373889e, this.f373890f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((im2.h4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        android.content.Intent intent;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f373888d;
        im2.p4 p4Var = this.f373889e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            yl2.g1 g1Var = p4Var.f374030q;
            yl2.k kVar = this.f373890f;
            this.f373888d = 1;
            obj = yl2.g1.t(g1Var, kVar, false, this, 2, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        yl2.a0 a0Var = (yl2.a0) obj;
        if (a0Var instanceof yl2.x) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p4Var.f374020d, "startLiveCheck failed, errCode:" + ((yl2.x) a0Var).f544614a);
        } else if (a0Var instanceof yl2.z) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p4Var.f374020d, "startLiveCheck continueLive");
            p4Var.f374030q.d(((yl2.z) a0Var).f544620a);
        } else if (a0Var instanceof yl2.y) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p4Var.f374020d, "startLiveCheck success");
            android.content.Intent intent2 = p4Var.f374032s;
            if (intent2 != null) {
                intent = new android.content.Intent();
                intent.putExtras(intent2);
            } else {
                intent = null;
            }
            p4Var.f374030q.h(intent, ((yl2.y) a0Var).f544616a, false);
        }
        return jz5.f0.f384359a;
    }
}
