package df2;

/* loaded from: classes3.dex */
public final class ec implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14400x1527540f f311584d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f311585e;

    public ec(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14400x1527540f c14400x1527540f, int i17) {
        this.f311584d = c14400x1527540f;
        this.f311585e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14400x1527540f c14400x1527540f = this.f311584d;
        android.view.ViewGroup.LayoutParams layoutParams = c14400x1527540f.getLayoutParams();
        layoutParams.height = this.f311585e;
        c14400x1527540f.setLayoutParams(layoutParams);
        c14400x1527540f.g();
        c14400x1527540f.m57906x5cc2687b(true);
    }
}
