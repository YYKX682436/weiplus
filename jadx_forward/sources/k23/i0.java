package k23;

/* loaded from: classes12.dex */
public final class i0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k23.v0 f385116d;

    public i0(k23.v0 v0Var) {
        this.f385116d = v0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        k23.v0 v0Var = this.f385116d;
        z21.e eVar = v0Var.f385241c;
        if (eVar == null) {
            return true;
        }
        int mo48281x67ad3875 = eVar.mo48281x67ad3875();
        k23.x xVar = v0Var.f385248j;
        if (xVar != null) {
            xVar.m141840xefb9e266(mo48281x67ad3875);
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recognizingPanel");
        throw null;
    }
}
