package i81;

/* loaded from: classes7.dex */
public final class y implements java.util.function.Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f371162a;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        this.f371162a = c11510xdd90c2f2;
    }

    @Override // java.util.function.Function
    public java.lang.Object apply(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 it = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        i81.a0 a0Var = new i81.a0(null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f371162a;
        i81.x xVar = new i81.x(c11510xdd90c2f2, a0Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c11510xdd90c2f2, "<this>");
        java.lang.String str = c11510xdd90c2f2.f156336n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getAppId(...)");
        cf.m mVar = new cf.m(str);
        xVar.mo146xb9724478(mVar);
        c11510xdd90c2f2.N.a(mVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f22 = this.f371162a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = i81.a0.f371051e;
        java.lang.String str2 = c11510xdd90c2f22.f156336n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getAppId(...)");
        concurrentHashMap.put(str2, c11510xdd90c2f22);
        return a0Var;
    }
}
