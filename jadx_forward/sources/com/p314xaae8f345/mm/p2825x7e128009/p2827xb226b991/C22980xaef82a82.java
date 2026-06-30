package com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\nJ\t\u0010\u0003\u001a\u00020\u0002H\u0082 J\u0011\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 J\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 J\u0011\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/xeffect/effect/EffectProfileData;", "", "", "nGetCreatePAGFile", "", "ptr", "nGetCreatePAGSurface", "nGetRenderPAG", "Ljz5/f0;", "nReset", "uq5/h", "renderlib_release"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.tencent.mm.xeffect.effect.EffectProfileData */
/* loaded from: classes10.dex */
public final class C22980xaef82a82 {

    /* renamed from: a, reason: collision with root package name */
    public final long f296340a;

    public C22980xaef82a82(long j17) {
        this.f296340a = j17;
    }

    /* renamed from: nGetCreatePAGFile */
    private final native long[] m83817x51b7636e();

    /* renamed from: nGetCreatePAGSurface */
    private final native long[] m83818x309d617b(long ptr);

    /* renamed from: nGetRenderPAG */
    private final native long[] m83819xf32c13f8(long ptr);

    /* renamed from: nReset */
    private final native void m83820xc0684181(long j17);

    public final uq5.h a(long[] jArr) {
        uq5.h hVar = new uq5.h(0, 0, 0L, 7, null);
        if (jArr.length >= 3) {
            hVar.f511769a = (int) jArr[0];
            hVar.f511770b = (int) jArr[1];
            hVar.f511771c = jArr[2];
        }
        return hVar;
    }

    public final uq5.h b() {
        return this.f296340a == 0 ? new uq5.h(0, 0, 0L, 7, null) : a(m83817x51b7636e());
    }

    public final uq5.h c() {
        long j17 = this.f296340a;
        return j17 == 0 ? new uq5.h(0, 0, 0L, 7, null) : a(m83819xf32c13f8(j17));
    }
}
