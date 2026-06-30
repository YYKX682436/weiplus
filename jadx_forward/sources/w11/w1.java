package w11;

@j95.b
/* loaded from: classes11.dex */
public class w1 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p950x112e8cc1.C11122x575f5f47 f523694d;

    public static w11.d2 wi() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.x0) ((c25.f) i95.n0.c(c25.f.class))).Ai();
    }

    public xg3.w0 Ai() {
        gm0.j1.i();
        gm0.j1.b().c();
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).nj();
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        com.p314xaae8f345.mm.p950x112e8cc1.C11122x575f5f47 c11122x575f5f47 = new com.p314xaae8f345.mm.p950x112e8cc1.C11122x575f5f47();
        this.f523694d = c11122x575f5f47;
        c11122x575f5f47.mo48813x58998cd();
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        super.mo836xb8969aab(context);
        com.p314xaae8f345.mm.p950x112e8cc1.C11122x575f5f47 c11122x575f5f47 = this.f523694d;
        if (c11122x575f5f47 != null) {
            c11122x575f5f47.f152764d.mo48814x2efc64();
            com.p314xaae8f345.mm.p950x112e8cc1.f.d().f152771d = null;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().e(c11122x575f5f47);
            ((w11.w1) i95.n0.c(w11.w1.class)).Ai().mo49775xc84af884(c11122x575f5f47);
            this.f523694d.mo48814x2efc64();
        }
    }
}
