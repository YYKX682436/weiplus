package b92;

/* loaded from: classes10.dex */
public final class p1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b92.v1 f100033d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(b92.v1 v1Var) {
        super(0);
        this.f100033d = v1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        b92.v1 v1Var = this.f100033d;
        if (v1Var.f100060i.compareAndSet(false, true)) {
            v1Var.Zi("processBackground");
        }
        return jz5.f0.f384359a;
    }
}
