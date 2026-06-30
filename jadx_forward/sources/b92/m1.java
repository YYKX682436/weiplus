package b92;

/* loaded from: classes10.dex */
public final class m1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b92.v1 f100012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f100013e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(b92.v1 v1Var, java.lang.String str) {
        super(0);
        this.f100012d = v1Var;
        this.f100013e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        b92.v1 v1Var = this.f100012d;
        long j17 = v1Var.f100066r;
        java.lang.String str = this.f100013e;
        java.lang.String wi6 = b92.v1.wi(v1Var, str, "getSimpleDns");
        if ((wi6.length() > 0) && j17 == v1Var.f100066r) {
            v1Var.f100058g.put(str, wi6);
            pm0.v.H(v1Var.f100059h, new b92.l1(str));
        }
        return jz5.f0.f384359a;
    }
}
