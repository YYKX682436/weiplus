package jk3;

/* loaded from: classes8.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jk3.v f381626d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f381627e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f381628f;

    public m(jk3.v vVar, int i17, android.graphics.Bitmap bitmap) {
        this.f381626d = vVar;
        this.f381627e = i17;
        this.f381628f = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Bitmap bitmap;
        int i17 = this.f381627e;
        jk3.v vVar = this.f381626d;
        if (vVar.F(i17)) {
            bitmap = vVar.P(this.f381628f, vVar.f381657q);
        } else {
            bitmap = null;
        }
        vVar.l(bitmap, false);
    }
}
