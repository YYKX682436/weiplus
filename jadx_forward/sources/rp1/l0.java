package rp1;

/* loaded from: classes14.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12922xc01b5b27 f480002d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f480003e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f480004f;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12922xc01b5b27 c12922xc01b5b27, android.graphics.Bitmap bitmap, java.lang.String str) {
        this.f480002d = c12922xc01b5b27;
        this.f480003e = bitmap;
        this.f480004f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12922xc01b5b27.f174992p;
        this.f480002d.c(this.f480003e, this.f480004f);
    }
}
