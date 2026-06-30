package aj4;

/* loaded from: classes10.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f86888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86889e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86890f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f86891g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f86892h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f86893i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f86894m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(java.lang.String str, java.lang.String str2, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, java.util.concurrent.atomic.AtomicBoolean atomicBoolean2, yz5.l lVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f86889e = str;
        this.f86890f = str2;
        this.f86891g = atomicBoolean;
        this.f86892h = atomicBoolean2;
        this.f86893i = lVar;
        this.f86894m = u3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new aj4.q(this.f86889e, this.f86890f, this.f86891g, this.f86892h, this.f86893i, this.f86894m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((aj4.q) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f86888d;
        java.lang.String str2 = this.f86889e;
        try {
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TextStatusFlutterMediaProvider", th6, "handleLivePhotoFromGallery: remux failed, fallback origin", new java.lang.Object[0]);
            str = null;
        }
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            aj4.v vVar = aj4.v.f86910a;
            this.f86888d = 1;
            obj = aj4.v.a(vVar, str2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        str = (java.lang.String) obj;
        java.lang.String str3 = str == null ? str2 : str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatusFlutterMediaProvider", "handleLivePhotoFromGallery: remux done, origin=" + str2 + ", remuxed=" + str + ", final=" + str3 + ", cover=" + this.f86890f);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        aj4.p pVar = new aj4.p(this.f86891g, this.f86892h, this.f86893i, str3, this.f86890f, this.f86894m, null);
        this.f86888d = 2;
        if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, pVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
