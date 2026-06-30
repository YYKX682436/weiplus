package e82;

@j95.b
/* loaded from: classes8.dex */
public class e extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public volatile i82.b f331618d = null;

    /* renamed from: e, reason: collision with root package name */
    public volatile h82.i f331619e = null;

    public i82.b Ai() {
        gm0.j1.b().c();
        if (this.f331618d == null) {
            synchronized (this) {
                if (this.f331618d == null) {
                    this.f331618d = new i82.b(gm0.j1.u().f354686f);
                }
            }
        }
        return this.f331618d;
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        wi();
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        super.mo836xb8969aab(context);
        if (this.f331619e != null) {
            h82.i iVar = this.f331619e;
            iVar.getClass();
            gm0.j1.n().d(iVar.f361076e);
            this.f331619e = null;
        }
    }

    public h82.i wi() {
        gm0.j1.b().c();
        if (this.f331619e == null) {
            synchronized (this) {
                if (this.f331619e == null) {
                    this.f331619e = new h82.i();
                }
            }
        }
        return this.f331619e;
    }
}
