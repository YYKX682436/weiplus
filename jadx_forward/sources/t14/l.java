package t14;

/* loaded from: classes11.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t14.q f496115d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(t14.q qVar) {
        super(1);
        this.f496115d = qVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        t14.s state = (t14.s) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof t14.z)) {
            t14.z zVar = (t14.z) dVar;
            java.lang.String selectInfo = zVar.f496138c;
            if (!(selectInfo == null || r26.n0.N(selectInfo))) {
                java.lang.String viewId = zVar.f496137b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectInfo, "selectInfo");
                java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) state.f496125e;
                java.lang.Object obj2 = linkedHashMap.get(viewId);
                if (obj2 == null) {
                    obj2 = new t14.u(viewId);
                    linkedHashMap.put(viewId, obj2);
                }
                t14.u uVar = (t14.u) obj2;
                uVar.f496128c = selectInfo;
                if (uVar.f496127b == null) {
                    uVar.f496127b = selectInfo;
                }
            }
        }
        j75.d dVar2 = state.f379599d;
        if (dVar2 != null && (dVar2 instanceof t14.t)) {
        }
        return jz5.f0.f384359a;
    }
}
