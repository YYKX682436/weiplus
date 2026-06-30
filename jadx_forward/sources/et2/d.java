package et2;

/* loaded from: classes4.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f f338113d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ et2.e f338114e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f338115f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f, et2.e eVar, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f338113d = activityC21401x6ce6f73f;
        this.f338114e = eVar;
        this.f338115f = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new et2.d(this.f338113d, this.f338114e, this.f338115f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        et2.d dVar = (et2.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        dVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = this.f338113d;
        int taskId = activityC21401x6ce6f73f.getTaskId();
        java.lang.Integer num = new java.lang.Integer(taskId);
        et2.e eVar = this.f338114e;
        eVar.f338118b.put(new java.lang.Integer(this.f338115f), num);
        eVar.getClass();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(activityC21401x6ce6f73f.getClass().getSimpleName(), "FinderHomeAffinityUI")) {
            eVar.f338121e = taskId;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderJumpDataManager", "[getTaskIdAsync] taskId=" + taskId + ", finderTaskId=" + eVar.f338121e);
        return jz5.f0.f384359a;
    }
}
