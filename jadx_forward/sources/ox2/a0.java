package ox2;

/* loaded from: classes10.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15409xe873dc34 f431175d;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15409xe873dc34 c15409xe873dc34) {
        this.f431175d = c15409xe873dc34;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15409xe873dc34 c15409xe873dc34 = this.f431175d;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = c15409xe873dc34.f213923g;
        if (c22789xd23e9a9b != null) {
            c22789xd23e9a9b.getLocationInWindow(c15409xe873dc34.f213930q);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15408x626e05e c15408x626e05e = c15409xe873dc34.f213922f;
            if (c15408x626e05e != null) {
                int[] iArr = c15409xe873dc34.f213930q;
                c15408x626e05e.d(iArr[0] + (c22789xd23e9a9b.getWidth() / 2), iArr[1] + (c22789xd23e9a9b.getHeight() / 2));
            }
        }
    }
}
