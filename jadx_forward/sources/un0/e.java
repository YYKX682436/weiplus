package un0;

/* loaded from: classes13.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f510880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ un0.h f510881e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p827xe72625ab.ServiceC10832x7101a4bb f510882f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(un0.h hVar, com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p827xe72625ab.ServiceC10832x7101a4bb serviceC10832x7101a4bb, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f510881e = hVar;
        this.f510882f = serviceC10832x7101a4bb;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new un0.e(this.f510881e, this.f510882f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((un0.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.List list;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f510880d;
        un0.h hVar = this.f510881e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            un0.s sVar = un0.s.f510950a;
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            this.f510880d = 1;
            obj = sVar.a(context, hVar, this);
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
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p827xe72625ab.ServiceC10832x7101a4bb serviceC10832x7101a4bb = this.f510882f;
        if (booleanValue) {
            serviceC10832x7101a4bb.f150094d = hVar;
            if (hVar != null && (list = hVar.f510896l) != null) {
                list.add(serviceC10832x7101a4bb.f150096f);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenCastForegroundService", "#onStartCommand workingRecorder is null");
            serviceC10832x7101a4bb.stopSelf();
        }
        return jz5.f0.f384359a;
    }
}
