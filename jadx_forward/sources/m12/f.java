package m12;

/* loaded from: classes2.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f404365d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f404366e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f404367f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f404368g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.util.Set set, long j17, java.util.List list, p3325xe03a0797.p3326xc267989b.q qVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f404365d = set;
        this.f404366e = j17;
        this.f404367f = list;
        this.f404368g = qVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new m12.f(this.f404365d, this.f404366e, this.f404367f, this.f404368g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        m12.f fVar = (m12.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        fVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.Long l17 = new java.lang.Long(this.f404366e);
        java.util.Set set = this.f404365d;
        set.remove(l17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("new frame encoded(");
        java.util.List list = this.f404367f;
        sb6.append(list.size() - set.size());
        sb6.append('/');
        sb6.append(list.size());
        sb6.append(')');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoEmojiGenerator", sb6.toString());
        boolean isEmpty = set.isEmpty();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (isEmpty) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            this.f404368g.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var));
        }
        return f0Var;
    }
}
