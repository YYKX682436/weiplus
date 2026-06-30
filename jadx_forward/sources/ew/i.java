package ew;

/* loaded from: classes.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f338512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ew.m f338513e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f338514f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f338515g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f338516h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f338517i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ew.m mVar, int i17, long j17, java.util.List list, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f338513e = mVar;
        this.f338514f = i17;
        this.f338515g = j17;
        this.f338516h = list;
        this.f338517i = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ew.i(this.f338513e, this.f338514f, this.f338515g, this.f338516h, this.f338517i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ew.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.List list;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f338512d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            int i18 = (int) this.f338515g;
            ew.m mVar = this.f338513e;
            android.database.Cursor b17 = ew.m.b(mVar, 0, this.f338514f, i18);
            while (true) {
                try {
                    boolean moveToNext = b17.moveToNext();
                    list = this.f338516h;
                    if (!moveToNext) {
                        break;
                    }
                    list.add(ew.m.a(mVar, b17));
                } finally {
                }
            }
            vz5.b.a(b17, null);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            ew.h hVar = new ew.h(this.f338517i, list, null);
            this.f338512d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, hVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
