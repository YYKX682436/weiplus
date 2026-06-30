package i06;

/* loaded from: classes15.dex */
public final class l2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i06.n2 f368223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i06.q2 f368224e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(i06.n2 n2Var, i06.q2 q2Var) {
        super(0);
        this.f368223d = n2Var;
        this.f368224e = q2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        h16.c cVar;
        t06.g a17 = i06.n2.a(this.f368223d);
        if (a17 == null || (cVar = a17.f496070b) == null) {
            str = null;
        } else {
            str = cVar.f359762a == h16.b.f359759o ? cVar.f359767f : null;
        }
        if (str == null) {
            return null;
        }
        if (str.length() > 0) {
            return this.f368224e.f368261e.getClassLoader().loadClass(r26.i0.u(str, '/', '.', false, 4, null));
        }
        return null;
    }
}
