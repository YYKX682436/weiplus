package wf2;

/* loaded from: classes10.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f527098d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wf2.j f527099e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(wf2.j jVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f527099e = jVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new wf2.c(this.f527099e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((wf2.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        p3325xe03a0797.p3326xc267989b.r2 r2Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f527098d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        boolean z17 = true;
        wf2.j jVar = this.f527099e;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShotEventSubscribeController", "#fetchAndCacheFrames fetching stream frame");
                this.f527098d = 1;
                obj = wf2.j.a7(jVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            bitmap = (android.graphics.Bitmap) obj;
            r2Var = jVar.f527122r;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FinderLiveScreenShotEventSubscribeController", e17, "#fetchAndCacheFrames failed", new java.lang.Object[0]);
            java.lang.String str = wf2.j.f527116v;
            jVar.b7();
        }
        if (!(r2Var != null && r2Var.a())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShotEventSubscribeController", "#fetchAndCacheFrames fetch stream frame done but job is not active");
            return f0Var;
        }
        jVar.f527119o = bitmap;
        dk2.u4 u4Var = ((mm2.o4) jVar.m56788xbba4bfc0(mm2.o4.class)).Z;
        java.lang.Integer num = u4Var != null ? new java.lang.Integer(u4Var.f315691e) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShotEventSubscribeController", "#fetchAndCacheFrames battleStatus=" + num);
        if (num != null && num.intValue() == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShotEventSubscribeController", "#fetchAndCacheFrames fetching pk frame");
            jVar.f527120p = wf2.j.Z6(jVar);
        }
        jVar.f527121q = null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#fetchAndCacheFrames success, streamFrame=");
        sb6.append(jVar.f527119o != null);
        sb6.append(", pkFrame=");
        if (jVar.f527120p == null) {
            z17 = false;
        }
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShotEventSubscribeController", sb6.toString());
        return f0Var;
    }
}
