package wf2;

/* loaded from: classes10.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f527096d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wf2.j f527097e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(wf2.j jVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f527097e = jVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new wf2.b(this.f527097e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((wf2.b) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f527096d;
        wf2.j jVar = this.f527097e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.r2 r2Var = jVar.f527122r;
            if (r2Var != null) {
                this.f527096d = 1;
                if (r2Var.C(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (jVar.f527119o != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShotEventSubscribeController", "#executeWork calling entrance show with cached frames");
            android.graphics.Bitmap bitmap = jVar.f527119o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap);
            android.graphics.Bitmap bitmap2 = jVar.f527120p;
            android.graphics.Bitmap bitmap3 = jVar.f527121q;
            jVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShotEventSubscribeController", "#callEntranceShow");
            wf2.a0 a0Var = (wf2.a0) jVar.m56789x25fe639c(wf2.a0.class);
            if (a0Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShotShareEntranceController", "#showEntrance bitmap.width=" + bitmap.getWidth() + " height=" + bitmap.getHeight());
                p3325xe03a0797.p3326xc267989b.r2 r2Var2 = a0Var.f527095s;
                if (r2Var2 != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var2).a()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShotShareEntranceController", "#showEntrance clickJob?.isActive, return.");
                } else {
                    a0Var.f527090n = null;
                    a0Var.f527091o = null;
                    p3325xe03a0797.p3326xc267989b.r2 r2Var3 = a0Var.f527094r;
                    if (r2Var3 != null) {
                        p3325xe03a0797.p3326xc267989b.p2.a(r2Var3, null, 1, null);
                    }
                    a0Var.f527094r = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(a0Var, null, null, new wf2.z(a0Var, bitmap2, bitmap3, bitmap, null), 3, null);
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveScreenShotEventSubscribeController", "#executeWork cachedStreamFrame is null, cannot show entrance");
        }
        return jz5.f0.f384359a;
    }
}
