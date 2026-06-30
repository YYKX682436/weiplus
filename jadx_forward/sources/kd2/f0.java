package kd2;

/* loaded from: classes3.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f388275d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f388276e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1467x822d9a5b.C14146x2a22facc f388277f;

    public f0(android.graphics.Bitmap bitmap, android.widget.ImageView imageView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1467x822d9a5b.C14146x2a22facc c14146x2a22facc) {
        this.f388275d = bitmap;
        this.f388276e = imageView;
        this.f388277f = c14146x2a22facc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Bitmap bitmap = this.f388275d;
        pm0.v.X(new kd2.e0(this.f388276e, this.f388277f, com.p314xaae8f345.mm.sdk.p2603x2137b148.x.S(bitmap, bitmap.getHeight(), (int) (bitmap.getHeight() / (com.p314xaae8f345.mm.ui.bk.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y / com.p314xaae8f345.mm.ui.bk.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x)), true, false)));
    }
}
