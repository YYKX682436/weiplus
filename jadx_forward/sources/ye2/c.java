package ye2;

/* loaded from: classes3.dex */
public final class c extends we2.b0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
    }

    @Override // we2.b0
    public void d(java.util.LinkedList msgList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
        gk2.e eVar = this.f526749a;
        ((mm2.x4) eVar.a(mm2.x4.class)).f411064i.clear();
        ((mm2.x4) eVar.a(mm2.x4.class)).f411064i.addAll(msgList);
    }

    @Override // we2.b0
    public boolean e(r45.t12 appMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appMsg, "appMsg");
        mm2.c1 c1Var = (mm2.c1) this.f526749a.a(mm2.c1.class);
        return !c1Var.f410460z4.contains(appMsg.m75945x2fec8307(9));
    }

    @Override // we2.b0
    public int[] f() {
        return new int[]{10017};
    }
}
