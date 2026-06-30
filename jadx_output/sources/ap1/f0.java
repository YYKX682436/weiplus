package ap1;

/* loaded from: classes5.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap1.i0 f12660d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(ap1.i0 i0Var) {
        super(1);
        this.f12660d = i0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ap1.c2 state = (ap1.c2) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        java.util.HashSet hashSet = state.f12630n;
        if (dVar != null && (dVar instanceof ap1.h2)) {
            ap1.h2 h2Var = (ap1.h2) dVar;
            if (state.f12628i && this.f12660d.f12685f != null) {
                boolean z17 = h2Var.f12677a;
                ap1.a0 a0Var = h2Var.f12678b;
                if (z17) {
                    state.f12631o += a0Var.f12602c;
                    hashSet.add(a0Var.f12600a);
                } else if (hashSet.remove(a0Var.f12600a)) {
                    state.f12631o -= a0Var.f12602c;
                }
            }
        }
        j75.d dVar2 = state.f298066d;
        if (dVar2 != null && (dVar2 instanceof ap1.a)) {
            ap1.a aVar = (ap1.a) dVar2;
            java.util.List value = aVar.f12598a;
            kotlin.jvm.internal.o.g(value, "value");
            state.f12628i = true;
            state.f12629m = value;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : aVar.f12598a) {
                if (state.d(((ap1.a0) obj2).f12600a)) {
                    arrayList.add(obj2);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            long j17 = 0;
            while (it.hasNext()) {
                j17 += ((ap1.a0) it.next()).f12602c;
            }
            hashSet.clear();
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                hashSet.add(((ap1.a0) it6.next()).f12600a);
            }
            state.f12631o = j17;
        }
        return jz5.f0.f302826a;
    }
}
