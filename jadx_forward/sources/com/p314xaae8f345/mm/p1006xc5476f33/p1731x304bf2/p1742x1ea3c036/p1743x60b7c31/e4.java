package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes8.dex */
public class e4 implements r53.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f221164a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f221165b;

    public e4(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.g4 g4Var, android.os.Bundle bundle, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f221164a = bundle;
        this.f221165b = rVar;
    }

    @Override // r53.x
    public void a(android.view.View view, android.graphics.Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.x3.i("", "", bitmap, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.d4(this));
            return;
        }
        android.os.Bundle bundle = this.f221164a;
        bundle.putBoolean(ya.b.f77504xbb80cbe3, false);
        bundle.putString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56296xc5686afb, "download fail");
        this.f221165b.a(bundle);
    }

    @Override // r53.x
    public void b(java.lang.String str, android.view.View view) {
    }
}
