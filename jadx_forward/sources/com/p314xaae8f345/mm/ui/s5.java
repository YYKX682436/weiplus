package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class s5 implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5863x4343d0ad f291299a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f291300b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5578x677d556e f291301c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21370x5ce6d0c6 f291302d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f291303e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f291304f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f291305g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f291306h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f291307i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21357x5e7365bb f291308j;

    public s5(com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5863x4343d0ad c5863x4343d0ad, boolean z17, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5578x677d556e c5578x677d556e, com.p314xaae8f345.mm.ui.C21370x5ce6d0c6 c21370x5ce6d0c6, int i17, long j17, java.lang.String str, boolean z18, java.lang.String str2) {
        this.f291308j = c21357x5e7365bb;
        this.f291299a = c5863x4343d0ad;
        this.f291300b = z17;
        this.f291301c = c5578x677d556e;
        this.f291302d = c21370x5ce6d0c6;
        this.f291303e = i17;
        this.f291304f = j17;
        this.f291305g = str;
        this.f291306h = z18;
        this.f291307i = str2;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p5(this));
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
        android.graphics.Bitmap bitmap;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5578x677d556e c5578x677d556e = this.f291301c;
        am.ue ueVar = c5578x677d556e.f135900g;
        ueVar.f89611a = 2;
        ueVar.f89612b = str;
        c5578x677d556e.e();
        if (bVar == null) {
            return;
        }
        int i17 = bVar.f441065b;
        if (bVar.f441064a != 0 || (bitmap = bVar.f441067d) == null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.r5(this, i17));
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.q5(this, bitmap, i17));
        }
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        android.graphics.Bitmap s07;
        android.graphics.Bitmap bitmap = bVar.f441067d;
        if (bitmap == null || bitmap.isRecycled() || !this.f291300b || (s07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(bVar.f441067d, true, ym5.x.a(this.f291308j.mo78409x676b27cd(), 2.0f))) == null) {
            return null;
        }
        return s07;
    }
}
