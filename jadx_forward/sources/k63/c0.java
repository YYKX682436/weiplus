package k63;

/* loaded from: classes14.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k63.m0 f386066d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(k63.m0 m0Var) {
        super(0);
        this.f386066d = m0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        k63.m0 m0Var = this.f386066d;
        m0Var.f386089g.m(true);
        os0.a aVar = m0Var.f386089g.f412484g;
        if (aVar != null) {
            aVar.f429539o = true;
        }
        int i17 = m0Var.f386091i;
        int i18 = m0Var.f386092m;
        ft0.h hVar = m0Var.f386090h;
        hVar.e(null, i17, i18);
        is0.c c17 = hVar.c();
        if (c17 != null) {
            int i19 = m0Var.f386091i;
            int i27 = m0Var.f386092m;
            c17.f375933m = i19;
            c17.f375934n = i27;
        }
        int i28 = m0Var.f386091i;
        int i29 = m0Var.f386092m;
        k63.w wVar = new k63.w(i28, i29, i28, i29, 2, 1);
        wVar.f429539o = false;
        wVar.f429540p = true;
        m0Var.f386094o = wVar;
        yz5.a aVar2 = m0Var.f386098s;
        if (aVar2 != null) {
            ((k63.e0) aVar2).mo152xb9724478();
        }
        return jz5.f0.f384359a;
    }
}
