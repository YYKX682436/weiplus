package re5;

/* loaded from: classes12.dex */
public class h0 extends fg3.v {

    /* renamed from: z, reason: collision with root package name */
    public final mf3.p f476109z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(mf3.p apiCenter) {
        super(apiCenter);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiCenter, "apiCenter");
        this.f476109z = apiCenter;
    }

    @Override // fg3.v, mf3.e, mf3.n
    public mf3.p G() {
        return this.f476109z;
    }

    @Override // fg3.v, ig3.d
    public void I(ig3.c state) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        gg3.c cVar = this.f343996w;
        if (cVar != null) {
            if (state == ig3.c.f372955m) {
                fg3.h hVar = (fg3.h) this.f476109z.a(fg3.h.class);
                if (hVar != null) {
                    hVar.s(true);
                }
                android.content.Context K = K();
                pf5.z zVar = pf5.z.f435481a;
                if (!(K instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((re5.x) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) K).a(re5.x.class)).V6(true, cVar);
            } else {
                fg3.h hVar2 = (fg3.h) g(fg3.h.class);
                if (hVar2 != null) {
                    hVar2.s(false);
                }
                android.content.Context K2 = K();
                pf5.z zVar2 = pf5.z.f435481a;
                if (!(K2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((re5.x) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) K2).a(re5.x.class)).V6(false, cVar);
                super.I(state);
            }
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            super.I(state);
        }
    }
}
