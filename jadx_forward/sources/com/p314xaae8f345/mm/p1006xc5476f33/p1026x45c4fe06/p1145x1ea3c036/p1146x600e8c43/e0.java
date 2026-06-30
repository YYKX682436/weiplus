package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43;

/* loaded from: classes7.dex */
public class e0 implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o91.b f167051d;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43.g0 g0Var, o91.b bVar) {
        this.f167051d = bVar;
    }

    @Override // l01.u
    public void b() {
        o91.b bVar = this.f167051d;
        if (bVar == null) {
            return;
        }
        bVar.a(null);
    }

    @Override // l01.u
    public void d() {
    }

    @Override // l01.i0
    public java.lang.String key() {
        return "WxaIcon" + hashCode();
    }

    @Override // l01.u
    /* renamed from: onBitmapLoaded */
    public void mo1040x5481b993(android.graphics.Bitmap bitmap) {
        o91.b bVar = this.f167051d;
        if (bVar == null) {
            return;
        }
        if (bitmap == null || bitmap.isRecycled()) {
            bVar.a(null);
        } else {
            bVar.a(bitmap);
        }
    }
}
