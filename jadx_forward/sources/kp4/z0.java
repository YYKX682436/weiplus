package kp4;

/* loaded from: classes10.dex */
public final class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18814xdf4aba0 f392698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f392699e;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18814xdf4aba0 c18814xdf4aba0, int i17) {
        this.f392698d = c18814xdf4aba0;
        this.f392699e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18814xdf4aba0 c18814xdf4aba0 = this.f392698d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16543xabefc23a seekSlider = c18814xdf4aba0.getSeekSlider();
        int i17 = this.f392699e;
        if (seekSlider != null) {
            seekSlider.f(true, (c18814xdf4aba0.f257599s + (((float) c18814xdf4aba0.f257596p) * c18814xdf4aba0.f257598r)) - i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16543xabefc23a seekSlider2 = c18814xdf4aba0.getSeekSlider();
        if (seekSlider2 != null) {
            seekSlider2.f(false, (c18814xdf4aba0.f257599s + (((float) c18814xdf4aba0.f257597q) * c18814xdf4aba0.f257598r)) - i17);
        }
        c18814xdf4aba0.f257606z = true;
    }
}
