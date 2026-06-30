package pr;

/* loaded from: classes15.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pr.k0 f439238d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(pr.k0 k0Var) {
        super(0);
        this.f439238d = k0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.Iterator it = this.f439238d.f439271k.iterator();
        while (it.hasNext()) {
            ((pr.e0) it.next()).a(0);
        }
        return jz5.f0.f384359a;
    }
}
