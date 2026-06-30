package mz0;

/* loaded from: classes5.dex */
public final class s0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f414572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f414573e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(yz5.l lVar, mz0.b2 b2Var) {
        super(1);
        this.f414572d = lVar;
        this.f414573e = b2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        this.f414572d.mo146xb9724478(java.lang.Boolean.valueOf(booleanValue));
        if (!booleanValue) {
            android.app.Activity context = this.f414573e.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b) ((dz0.l) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(dz0.l.class))).f151322m.f326589g = "";
        }
        return jz5.f0.f384359a;
    }
}
