package i06;

/* loaded from: classes16.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i06.k0 f368198d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(i06.k0 k0Var) {
        super(0);
        this.f368198d = k0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17;
        java.util.List mo128635x99879e0 = this.f368198d.mo128635x99879e0();
        if (!mo128635x99879e0.isEmpty()) {
            java.util.Iterator it = mo128635x99879e0.iterator();
            while (it.hasNext()) {
                if (i06.o4.h(((i06.u2) ((f06.o) it.next())).i())) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
