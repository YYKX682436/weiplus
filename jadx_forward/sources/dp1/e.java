package dp1;

/* loaded from: classes14.dex */
public class e implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dp1.k f323659d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f323660e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d f323661f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dp1.l f323662g;

    public e(dp1.l lVar, dp1.k kVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        this.f323662g = lVar;
        this.f323659d = kVar;
        this.f323660e = i17;
        this.f323661f = c12886x91aa2b6d;
    }

    @Override // l01.u
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f323661f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallMenuAdapter", "onLoadFailed, iconResId:%s, iconUrl:%s", java.lang.Integer.valueOf(c12886x91aa2b6d.f174593u), c12886x91aa2b6d.f174590r);
        this.f323662g.z(this.f323659d, this.f323660e, c12886x91aa2b6d);
    }

    @Override // l01.u
    public void d() {
        this.f323662g.z(this.f323659d, this.f323660e, this.f323661f);
    }

    @Override // l01.i0
    public java.lang.String key() {
        return "FloatMenuIcon#" + this.f323661f.e();
    }

    @Override // l01.u
    /* renamed from: onBitmapLoaded */
    public void mo1040x5481b993(android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        dp1.k kVar = this.f323659d;
        kVar.f323672g.setVisibility(8);
        kVar.f323671f.setVisibility(0);
        kVar.f323671f.setImageBitmap(bitmap);
    }
}
