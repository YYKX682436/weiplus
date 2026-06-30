package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class qv implements e51.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f195583a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f195584b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f195585c;

    public qv(android.graphics.Bitmap bitmap, boolean z17, float f17) {
        this.f195583a = bitmap;
        this.f195584b = z17;
        this.f195585c = f17;
    }

    @Override // e51.f
    public final f51.b a(java.util.Random random) {
        uo0.a aVar = new uo0.a(this.f195583a, this.f195584b ? 0.5f : 1.0f);
        aVar.R = this.f195585c;
        return aVar;
    }
}
