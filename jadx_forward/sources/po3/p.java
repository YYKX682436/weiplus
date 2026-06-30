package po3;

@j95.b
/* loaded from: classes15.dex */
public class p extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public volatile po3.k f438872d = null;

    /* renamed from: e, reason: collision with root package name */
    public volatile po3.o f438873e = null;

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.ui.a Ai(int i17) {
        if (i17 == 2 && wi().Di() != null) {
            return wi().Di().f233977b;
        }
        if (i17 != 1 || wi().Bi() == null) {
            return null;
        }
        return wi().Bi().f233977b;
    }

    public static po3.p wi() {
        return (po3.p) i95.n0.c(po3.p.class);
    }

    public po3.k Bi() {
        if (this.f438872d == null) {
            synchronized (this) {
                if (this.f438872d == null) {
                    this.f438872d = new po3.k();
                }
            }
        }
        return this.f438872d;
    }

    public po3.o Di() {
        if (this.f438873e == null) {
            synchronized (this) {
                if (this.f438873e == null) {
                    this.f438873e = new po3.o();
                }
            }
        }
        return this.f438873e;
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        c01.m8 f17 = c01.d9.f();
        int b17 = ip.l.b();
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) f17).getClass();
        com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.h0.d(b17);
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).getClass();
        com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.h0.c(false);
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).getClass();
        com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.h0.d(0);
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).getClass();
        com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.h0.c(true);
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        super.mo8845x3e5a77bb(context);
    }
}
