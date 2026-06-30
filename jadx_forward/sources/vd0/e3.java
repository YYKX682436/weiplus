package vd0;

/* loaded from: classes8.dex */
public final class e3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f516930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vd0.l3 f516931e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f516932f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f516933g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, vd0.l3 l3Var, java.lang.String str, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f516930d = activityC0065xcd7aa112;
        this.f516931e = l3Var;
        this.f516932f = str;
        this.f516933g = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vd0.e3(this.f516930d, this.f516931e, this.f516932f, this.f516933g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vd0.e3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f516930d;
        p012xc85e97e9.p093xedfae76a.n b17 = activityC0065xcd7aa112.mo273xed6858b4().b();
        p012xc85e97e9.p093xedfae76a.n nVar = p012xc85e97e9.p093xedfae76a.n.DESTROYED;
        jz5.f0 f0Var = jz5.f0.f384359a;
        final int i17 = this.f516933g;
        final java.lang.String str = this.f516932f;
        final vd0.l3 l3Var = this.f516931e;
        if (b17 == nVar) {
            vd0.l3.Bi(l3Var, str, new java.lang.Integer(i17));
            return f0Var;
        }
        activityC0065xcd7aa112.mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.f() { // from class: com.tencent.mm.feature.setting.SettingSearchFeatureService$bindLifecycleOnMain$2$1
            @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
            /* renamed from: onDestroy */
            public void mo7795xac79a11b(p012xc85e97e9.p093xedfae76a.y owner) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
                vd0.l3.Bi(vd0.l3.this, str, java.lang.Integer.valueOf(i17));
                owner.mo273xed6858b4().c(this);
            }
        });
        return f0Var;
    }
}
