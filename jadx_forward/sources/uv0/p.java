package uv0;

/* loaded from: classes5.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uv0.u f512876d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(uv0.u uVar) {
        super(1);
        this.f512876d = uVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        uv0.u uVar = this.f512876d;
        uv0.i iVar = uVar.U;
        if (iVar != null) {
            uv0.h hVar = (uv0.h) iVar;
            if (uVar.m160994x67ad68cc()) {
                hVar.f512867b.m7().c(vv0.b.f521904d, hVar.f512869d);
            }
            uVar.H();
            z17 = true;
        } else {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
