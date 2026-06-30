package rn3;

/* loaded from: classes8.dex */
public class f implements k70.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16742x4f474056 f479483a;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16742x4f474056 c16742x4f474056) {
        this.f479483a = c16742x4f474056;
    }

    @Override // k70.f0
    public void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new rn3.e(this, str, (!this.f479483a.f233897h2 || bitmap == null || bitmap.isRecycled()) ? bitmap != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(bitmap, false, bitmap.getWidth() * 0.1f) : null : com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(bitmap, false, bitmap.getWidth() / 2), bitmap));
    }
}
