package zf0;

/* loaded from: classes12.dex */
public final class l implements zf0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f553997a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vf0.j1 f553998b;

    public l(zf0.v0 v0Var, vf0.j1 j1Var) {
        this.f553997a = v0Var;
        this.f553998b = j1Var;
    }

    @Override // zf0.a
    public boolean a(int i17) {
        java.lang.Integer d17 = this.f553997a.d(false);
        if (d17 == null) {
            return false;
        }
        d17.intValue();
        this.f553998b.f517731b.put("e_gen_compress_video_failed", "cancel");
        return true;
    }
}
