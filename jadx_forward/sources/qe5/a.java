package qe5;

/* loaded from: classes12.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.b f443601d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(qe5.b bVar) {
        super(1);
        this.f443601d = bVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        kd5.e state = (kd5.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        kd5.i iVar = (kd5.i) state.a(kd5.i.class);
        qe5.b bVar = this.f443601d;
        if (iVar != null) {
            bVar.V6(iVar.f388430b);
        }
        if (((kd5.h) state.a(kd5.h.class)) != null) {
            bVar.getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().add(bVar);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().n0(bVar, android.os.Looper.getMainLooper());
        }
        return jz5.f0.f384359a;
    }
}
