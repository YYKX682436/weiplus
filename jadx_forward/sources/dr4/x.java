package dr4;

/* loaded from: classes14.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.c0 f324292d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(dr4.c0 c0Var) {
        super(0);
        this.f324292d = c0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        dr4.c0 c0Var = this.f324292d;
        dr4.q1 q1Var = c0Var.f324135e;
        if (q1Var != null) {
            if (c0Var.f324148r == 2) {
                if (q1Var.C == null) {
                    q1Var.C = new cr4.c();
                }
                q1Var.G = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipRenderProcExternalTexture", "render YT face-beauty algorithm");
            } else {
                ar4.c cVar = ar4.c.f94934a;
                if (ar4.c.f94935b != null) {
                    if (q1Var.C == null) {
                        q1Var.C = new cr4.c();
                    }
                    q1Var.G = false;
                } else {
                    q1Var.G = false;
                }
            }
            q1Var.f429529e = 2;
        }
        return jz5.f0.f384359a;
    }
}
