package zl2;

/* loaded from: classes3.dex */
public final class w3 implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f555549a;

    public w3(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f555549a = interfaceC29045xdcb5ca57;
    }

    @Override // fp0.p
    public void a(fp0.d task, fp0.u status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUtil", "[dealWithBgPath] upload end");
        mv2.p0 p0Var = (mv2.p0) task;
        fp0.u uVar = fp0.u.f346823f;
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f555549a;
        if (status != uVar || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p0Var.f413149h)) {
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
        } else {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p0Var.f413149h));
        }
    }
}
