package a82;

/* loaded from: classes12.dex */
public final class d1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f83517d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(long j17) {
        super(0);
        this.f83517d = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object obj;
        java.util.LinkedList list = a82.j1.f83579b.f455702d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "list");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.eb4) obj).f454749d == this.f83517d) {
                break;
            }
        }
        r45.eb4 eb4Var = (r45.eb4) obj;
        if (eb4Var != null) {
            eb4Var.C++;
            eb4Var.f454754i = 3;
            a82.j1.f83578a.j();
        }
        return jz5.f0.f384359a;
    }
}
