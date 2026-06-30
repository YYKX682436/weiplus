package pr;

/* loaded from: classes15.dex */
public final class w0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pr.a1 f439327d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(pr.a1 a1Var) {
        super(0);
        this.f439327d = a1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        while (true) {
            pr.a1 a1Var = this.f439327d;
            if (a1Var.f439222a.size() <= 0) {
                break;
            }
            java.util.HashMap hashMap = a1Var.f439223b;
            if (hashMap.size() >= 3) {
                break;
            }
            pr.u0 u0Var = (pr.u0) a1Var.f439222a.removeFirst();
            java.lang.String mo42933xb5885648 = u0Var.f439325a.mo42933xb5885648();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo42933xb5885648, "getMd5(...)");
            hashMap.put(mo42933xb5885648, u0Var);
            zq.h.f556505a.c(u0Var.f439325a, a1Var.f439225d);
        }
        return jz5.f0.f384359a;
    }
}
