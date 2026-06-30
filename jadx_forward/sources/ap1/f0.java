package ap1;

/* loaded from: classes5.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap1.i0 f94193d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(ap1.i0 i0Var) {
        super(1);
        this.f94193d = i0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ap1.c2 state = (ap1.c2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        java.util.HashSet hashSet = state.f94163n;
        if (dVar != null && (dVar instanceof ap1.h2)) {
            ap1.h2 h2Var = (ap1.h2) dVar;
            if (state.f94161i && this.f94193d.f94218f != null) {
                boolean z17 = h2Var.f94210a;
                ap1.a0 a0Var = h2Var.f94211b;
                if (z17) {
                    state.f94164o += a0Var.f94135c;
                    hashSet.add(a0Var.f94133a);
                } else if (hashSet.remove(a0Var.f94133a)) {
                    state.f94164o -= a0Var.f94135c;
                }
            }
        }
        j75.d dVar2 = state.f379599d;
        if (dVar2 != null && (dVar2 instanceof ap1.a)) {
            ap1.a aVar = (ap1.a) dVar2;
            java.util.List value = aVar.f94131a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
            state.f94161i = true;
            state.f94162m = value;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : aVar.f94131a) {
                if (state.d(((ap1.a0) obj2).f94133a)) {
                    arrayList.add(obj2);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            long j17 = 0;
            while (it.hasNext()) {
                j17 += ((ap1.a0) it.next()).f94135c;
            }
            hashSet.clear();
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                hashSet.add(((ap1.a0) it6.next()).f94133a);
            }
            state.f94164o = j17;
        }
        return jz5.f0.f384359a;
    }
}
