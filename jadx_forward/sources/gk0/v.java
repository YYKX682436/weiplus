package gk0;

/* loaded from: classes12.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk0.w f353990d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(gk0.w wVar) {
        super(1);
        this.f353990d = wVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        g75.z state = (g75.z) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        gk0.w wVar = this.f353990d;
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof gk0.s)) {
            gk0.u uVar = new gk0.u((gk0.s) dVar, state, wVar);
            if (state.e("Common_MakeSureUIThread", false)) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.c4.f274029b.f274030a.d(uVar);
            } else {
                ((ku5.t0) ku5.t0.f394148d).B(uVar);
            }
        }
        return jz5.f0.f384359a;
    }
}
