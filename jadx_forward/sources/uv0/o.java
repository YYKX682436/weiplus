package uv0;

/* loaded from: classes5.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uv0.u f512875d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(uv0.u uVar) {
        super(1);
        this.f512875d = uVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        uv0.u uVar = this.f512875d;
        uv0.i iVar = uVar.U;
        boolean z17 = false;
        if (iVar != null) {
            uv0.h hVar = (uv0.h) iVar;
            if (uVar.m160994x67ad68cc()) {
                gx0.kh q76 = hVar.f512867b.q7();
                java.lang.String string = uVar.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lm6);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                q76.r7(string, null);
            }
            uVar.D = false;
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
