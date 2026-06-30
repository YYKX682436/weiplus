package nm4;

/* loaded from: classes3.dex */
public final class r implements ff0.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f420041a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18738x2b7fba04 f420042b;

    public r(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18738x2b7fba04 c18738x2b7fba04) {
        this.f420041a = z17;
        this.f420042b = c18738x2b7fba04;
    }

    @Override // ff0.v
    public void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, boolean z17) {
        if (!this.f420041a || !z17 || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        if (str == null) {
            str = "";
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18738x2b7fba04.f256415g;
        this.f420042b.a(str, bitmap);
    }
}
