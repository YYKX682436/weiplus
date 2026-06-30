package kc5;

/* loaded from: classes9.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kc5.x f388120d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(kc5.x xVar) {
        super(1);
        this.f388120d = xVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r26.m m17 = (r26.m) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m17, "m");
        java.lang.String c17 = ((r26.q) m17).c();
        r26.t tVar = this.f388120d.f388122e;
        tVar.getClass();
        java.lang.String replaceAll = tVar.f450450d.matcher(c17).replaceAll("\n");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll, "replaceAll(...)");
        return replaceAll;
    }
}
