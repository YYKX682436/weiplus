package uf;

/* loaded from: classes7.dex */
public final class w1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.oc {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uf.c2 f508652c;

    public w1(uf.c2 c2Var) {
        this.f508652c = c2Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.oc
    public boolean a(android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (1 == event.getAction()) {
            return false;
        }
        uf.c2 c2Var = this.f508652c;
        uf.c2.b(c2Var, null, 0);
        c2Var.f();
        return true;
    }
}
