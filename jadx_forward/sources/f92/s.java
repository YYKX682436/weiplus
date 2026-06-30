package f92;

/* loaded from: classes10.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f92.t f341806d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(f92.t tVar) {
        super(0);
        this.f341806d = tVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        m92.h hVar = new m92.h();
        r92.a aVar = (r92.a) ((jz5.n) this.f341806d.f341812i).mo141623x754a37bb();
        aVar.getClass();
        m92.e eVar = new m92.e();
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            java.io.InputStream C = com.p314xaae8f345.mm.vfs.w6.C(aVar.f474982a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(C, "openRead(...)");
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(eVar.mo11468x92b714fd(vz5.a.c(C)));
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        hVar.f406515e = eVar;
        pm0.v.X(new m92.g(hVar, eVar));
        return hVar;
    }
}
