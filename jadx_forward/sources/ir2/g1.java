package ir2;

/* loaded from: classes2.dex */
public final class g1 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir2.p1 f375674d;

    public g1(ir2.p1 p1Var) {
        this.f375674d = p1Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ir2.x event = (ir2.x) obj;
        ir2.p1 p1Var = this.f375674d;
        p1Var.f375743e.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LoaderEventMachine", "transfer event:" + event + " refreshEvent:null loadMoreEvent:null");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DataMerger", "receive transferResult:" + event + " event:" + event);
        if (!(event instanceof ir2.r)) {
            ir2.p1.a(p1Var, event);
        } else if (((java.util.ArrayList) p1Var.f375739a.f375624d).isEmpty()) {
            ir2.p1.a(p1Var, event);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DataMerger", "ignore firstScreen data!");
        }
        return jz5.f0.f384359a;
    }
}
