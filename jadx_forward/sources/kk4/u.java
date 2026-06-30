package kk4;

/* loaded from: classes15.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk4.v f390106d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(kk4.v vVar) {
        super(0);
        this.f390106d = vVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        kk4.v vVar = this.f390106d;
        if (vVar.f390114f instanceof ck4.b) {
            kk4.c cVar = vVar.f390110b;
            long mo100915xddd35a52 = cVar != null ? ((kk4.f0) cVar).mo100915xddd35a52() : 0L;
            kk4.c cVar2 = vVar.f390110b;
            long mo100920x21a0b6d0 = cVar2 != null ? ((kk4.f0) cVar2).mo100920x21a0b6d0() : 0L;
            kk4.c cVar3 = vVar.f390110b;
            long mo100915xddd35a522 = mo100920x21a0b6d0 - (cVar3 != null ? ((kk4.f0) cVar3).mo100915xddd35a52() : 0L);
            kk4.c cVar4 = vVar.f390110b;
            long mo100917x37a7fa50 = cVar4 != null ? ((kk4.f0) cVar4).mo100917x37a7fa50() : 0L;
            nk4.s sVar = vVar.f390121m;
            if (sVar != null) {
                dn.o oVar = vVar.f390114f;
                ck4.b bVar = oVar instanceof ck4.b ? (ck4.b) oVar : null;
                long j17 = 1000;
                ((kw2.m0) sVar).v(new nk4.r(bVar != null ? bVar.f124067d2 : 0L, mo100915xddd35a52 / j17, mo100917x37a7fa50 / j17, mo100915xddd35a522, android.os.SystemClock.uptimeMillis(), null, 32, null));
            }
        }
        return jz5.f0.f384359a;
    }
}
