package jk3;

/* loaded from: classes8.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jk3.v f381619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f381620e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f381621f;

    public i(jk3.v vVar, boolean z17, android.graphics.Bitmap bitmap) {
        this.f381619d = vVar;
        this.f381620e = z17;
        this.f381621f = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jk3.v vVar = this.f381619d;
        jk3.f fVar = vVar.f381658r;
        if (fVar != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new pk3.j((pk3.l) fVar, !java.lang.Boolean.valueOf(vVar.f381654n).booleanValue() || java.lang.Boolean.valueOf(vVar.f381654n) == null, java.lang.Boolean.valueOf(vVar.f381654n).booleanValue(), new jk3.h(this.f381620e, vVar, this.f381621f)));
        }
    }
}
