package hw0;

/* loaded from: classes5.dex */
public final class s implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw0.p f367013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hw0.z f367014e;

    public s(hw0.p pVar, hw0.z zVar) {
        this.f367013d = pVar;
        this.f367014e = zVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        bu0.a u76;
        kw0.e eVar = (kw0.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
        this.f367013d.m134220x3b8cf669(eVar);
        hw0.z zVar = this.f367014e;
        zVar.getClass();
        kw0.k kVar = eVar.f394336c;
        if (((kVar instanceof kw0.h) || (kVar instanceof kw0.j)) && (u76 = zVar.u7()) != null) {
            kw0.a b17 = fv0.e.b(eVar);
            if (zu0.i.f557209f == (b17 != null ? b17.f394322b : null)) {
                java.lang.String str = b17.f394321a.f129757b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getMaterialID(...)");
                if (!u76.c(str)) {
                    return;
                } else {
                    zVar.s7();
                }
            }
            zVar.G7();
        }
    }
}
