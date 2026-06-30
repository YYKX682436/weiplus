package dr4;

/* loaded from: classes14.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.h f324125d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(dr4.h hVar) {
        super(1);
        this.f324125d = hVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        is0.c cVar = (is0.c) obj;
        if (cVar != null) {
            dr4.h hVar = this.f324125d;
            dr4.r1 r1Var = hVar.f324219l;
            if (r1Var != null) {
                r1Var.F(!cVar.f375929f);
            }
            hVar.d(new dr4.m(hVar, cVar));
            hVar.i(cVar);
        }
        return jz5.f0.f384359a;
    }
}
