package z21;

/* loaded from: classes12.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f551134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f551135e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z21.j0 f551136f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f551137g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f551138h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(int i17, int i18, z21.j0 j0Var, java.lang.String str, int i19) {
        super(0);
        this.f551134d = i17;
        this.f551135e = i18;
        this.f551136f = j0Var;
        this.f551137g = str;
        this.f551138h = i19;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = this.f551135e;
        z21.j0 j0Var = this.f551136f;
        int i18 = this.f551134d;
        if (i18 == 0 && i17 == 0) {
            z21.b bVar = j0Var.f551155e;
            if (bVar != null) {
                java.lang.String[] strArr = {j0Var.f551163m};
                z21.a0 a0Var = j0Var.f551153c;
                bVar.a(strArr, a0Var != null ? a0Var.e() : null);
            }
            if (j0Var.d()) {
                j0Var.h();
                z21.b bVar2 = j0Var.f551155e;
                if (bVar2 != null) {
                    bVar2.d(j0Var.f551164n);
                }
                j0Var.g();
            }
        } else {
            j0Var.h();
            if (i18 == 3 && i17 == -1) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputController", "getStack([ %s ]), ThreadID: %s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3(), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            }
            z21.b bVar3 = j0Var.f551155e;
            java.lang.String str = this.f551137g;
            if (str == null || !r26.i0.p(str, "SecurityCheckError", true)) {
                if (str == null || !r26.i0.p(str, "ReadFileLengthError", true)) {
                    int i19 = this.f551138h;
                    if (i19 != 0) {
                        if (bVar3 != null) {
                            bVar3.e(20, this.f551134d, i19, -1L);
                        }
                    } else if (bVar3 != null) {
                        bVar3.e(11, this.f551134d, this.f551135e, i19);
                    }
                } else if (bVar3 != null) {
                    bVar3.e(13, 133, -1, -1L);
                }
            } else if (bVar3 != null) {
                bVar3.e(13, 132, -1, -1L);
            }
        }
        return jz5.f0.f384359a;
    }
}
