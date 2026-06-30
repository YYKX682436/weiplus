package ph1;

/* loaded from: classes7.dex */
public final class l implements android.content.DialogInterface {

    /* renamed from: d, reason: collision with root package name */
    public r.a f435870d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f435871e;

    /* renamed from: f, reason: collision with root package name */
    public fl1.a2 f435872f;

    /* renamed from: g, reason: collision with root package name */
    public fl1.b2 f435873g;

    /* renamed from: h, reason: collision with root package name */
    public android.content.DialogInterface.OnCancelListener f435874h;

    /* renamed from: i, reason: collision with root package name */
    public int f435875i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f435876m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f435877n = false;

    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, boolean z17) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new ph1.j(this, c11510xdd90c2f2));
            return;
        }
        if (z17) {
            this.f435873g = new ph1.a(c11510xdd90c2f2.f156328d, c11510xdd90c2f2.m0().g() ? -15132391 : -1);
            ((fl1.c0) c11510xdd90c2f2.m48801x784fb1e3()).c(this.f435873g);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new ph1.k(this, c11510xdd90c2f2), false);
        this.f435871e = b4Var;
        b4Var.c(500L, 500L);
    }

    @Override // android.content.DialogInterface
    public void cancel() {
        this.f435876m = true;
        fl1.a2 a2Var = this.f435872f;
        if (a2Var != null) {
            a2Var.cancel();
        } else {
            android.content.DialogInterface.OnCancelListener onCancelListener = this.f435874h;
            if (onCancelListener != null) {
                onCancelListener.onCancel(this);
            }
        }
        fl1.b2 b2Var = this.f435873g;
        if (b2Var != null) {
            ((ph1.a) b2Var).dismiss();
        }
    }

    @Override // android.content.DialogInterface
    public void dismiss() {
        this.f435877n = true;
        fl1.a2 a2Var = this.f435872f;
        if (a2Var != null) {
            ((fl1.g1) a2Var).dismiss();
        }
        fl1.b2 b2Var = this.f435873g;
        if (b2Var != null) {
            ((ph1.a) b2Var).dismiss();
        }
    }
}
