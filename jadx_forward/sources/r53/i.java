package r53;

/* loaded from: classes8.dex */
public class i implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f474201a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5578x677d556e f474202b;

    public i(float f17, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5578x677d556e c5578x677d556e) {
        this.f474201a = f17;
        this.f474202b = c5578x677d556e;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5578x677d556e c5578x677d556e = this.f474202b;
        am.ue ueVar = c5578x677d556e.f135900g;
        ueVar.f89611a = 2;
        ueVar.f89612b = str;
        c5578x677d556e.e();
        if (bVar == null) {
            return;
        }
        int i17 = bVar.f441065b;
        if (bVar.f441064a != 0 || bVar.f441067d == null) {
            if (i17 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(858L, 14L, 1L, false);
            }
        } else if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(858L, 13L, 1L, false);
        }
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        android.graphics.Bitmap bitmap = bVar.f441067d;
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        float f17 = this.f474201a;
        if (f17 <= 0.0f) {
            return null;
        }
        android.graphics.Bitmap s07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(bVar.f441067d, true, r1.getWidth() * f17);
        if (s07 != null) {
            return s07;
        }
        return null;
    }
}
