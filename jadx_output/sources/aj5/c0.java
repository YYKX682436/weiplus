package aj5;

/* loaded from: classes.dex */
public final class c0 implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.flow.i2 f5404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aj5.r0 f5405e;

    public c0(aj5.r0 r0Var, wi5.z request, kotlinx.coroutines.flow.i2 searchFlow, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(searchFlow, "searchFlow");
        this.f5405e = r0Var;
        this.f5404d = searchFlow;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        boolean z17;
        com.tencent.mm.sdk.coroutines.LifecycleScope O6;
        if (vVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactAddressBookSearchUIC", "onFTSSearchEnd " + vVar.f351157b.hashCode());
            aj5.r0 r0Var = this.f5405e;
            java.util.Iterator it = r0Var.f5505f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = false;
                    break;
                } else if (kotlin.jvm.internal.o.b((p13.c) it.next(), vVar.f351157b)) {
                    z17 = true;
                    break;
                }
            }
            if ((z17 ? vVar : null) == null || vVar.f351158c != 0 || (O6 = r0Var.O6()) == null) {
                return;
            }
            v65.i.b(O6, null, new aj5.b0(this, vVar, null), 1, null);
        }
    }
}
