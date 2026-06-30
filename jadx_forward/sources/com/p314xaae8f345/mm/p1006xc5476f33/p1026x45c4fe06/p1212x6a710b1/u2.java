package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public final class u2 implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f172107d;

    public u2(java.lang.String str, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f172107d = qVar;
    }

    @Override // l01.u
    public void b() {
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f172107d.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.io.IOException("Load fail"))));
    }

    @Override // l01.u
    public void d() {
    }

    @Override // l01.i0
    public java.lang.String key() {
        return ik1.i0.a(this);
    }

    @Override // l01.u
    /* renamed from: onBitmapLoaded */
    public void mo1040x5481b993(android.graphics.Bitmap bitmap) {
        p3325xe03a0797.p3326xc267989b.q qVar = this.f172107d;
        if (bitmap != null) {
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(bitmap));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.IconAttacher", "onBitmapLoaded, bitmap is null");
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.io.IOException("Unexpected null bitmap"))));
    }
}
