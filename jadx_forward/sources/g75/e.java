package g75;

/* loaded from: classes10.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g75.f f350893d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g75.f fVar) {
        super(1);
        this.f350893d = fVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        g75.z state = (g75.z) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        g75.f fVar = this.f350893d;
        if (dVar != null && (dVar instanceof g75.w)) {
            g75.f.k(fVar, ((g75.w) dVar).f350936b, false, 2, null);
        }
        j75.d dVar2 = state.f379599d;
        if (dVar2 != null) {
            java.lang.reflect.Method method = (java.lang.reflect.Method) ((java.util.HashMap) ((jz5.n) fVar.f350896b).mo141623x754a37bb()).get(dVar2.getClass().getName());
            if (method != null) {
                java.lang.Object invoke = method.invoke(fVar, state, dVar2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(invoke, "null cannot be cast to non-null type com.tencent.mm.sdk.statecenter.BaseStateAction");
                g75.f.k(fVar, (j75.b) invoke, false, 2, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
