package aj5;

/* loaded from: classes.dex */
public final class t0 implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.flow.i2 f5516d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aj5.g1 f5517e;

    public t0(aj5.g1 g1Var, wi5.z request, kotlinx.coroutines.flow.i2 searchFlow, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(searchFlow, "searchFlow");
        this.f5517e = g1Var;
        this.f5516d = searchFlow;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        boolean z17;
        com.tencent.mm.sdk.coroutines.LifecycleScope O6;
        if (vVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactAddressBookSearchUIC", "onFTSSearchEnd " + vVar.f351157b.hashCode());
            aj5.g1 g1Var = this.f5517e;
            java.util.Iterator it = g1Var.f5433f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = false;
                    break;
                } else if (kotlin.jvm.internal.o.b((p13.c) it.next(), vVar.f351157b)) {
                    z17 = true;
                    break;
                }
            }
            if ((z17 ? vVar : null) == null || vVar.f351158c != 0 || (O6 = g1Var.O6()) == null) {
                return;
            }
            v65.i.b(O6, null, new aj5.s0(this, vVar, null), 1, null);
        }
    }
}
