package x70;

/* loaded from: classes12.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l70.b f533947d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l70.b bVar) {
        super(0);
        this.f533947d = bVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        l70.b bVar = this.f533947d;
        l70.a aVar = bVar.f398327a.f398345m;
        if (aVar != null) {
            aVar.a(bVar);
        }
        bVar.f398327a.getClass();
        java.util.Iterator it = kz5.n0.S0((java.util.HashSet) ((jz5.n) ((v70.w) i95.n0.c(v70.w.class)).f515161p).mo141623x754a37bb()).iterator();
        while (it.hasNext()) {
            ((l70.a) it.next()).a(bVar);
        }
        java.util.Iterator it6 = kz5.n0.S0((java.util.HashSet) ((jz5.n) ((v70.w) i95.n0.c(v70.w.class)).f515162q).mo141623x754a37bb()).iterator();
        while (it6.hasNext()) {
            l70.a aVar2 = (l70.a) ((java.lang.ref.WeakReference) it6.next()).get();
            if (aVar2 != null) {
                aVar2.a(bVar);
            }
        }
        return jz5.f0.f384359a;
    }
}
