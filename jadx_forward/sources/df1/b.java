package df1;

/* loaded from: classes15.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12273x1a8cfd10 f311172d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12273x1a8cfd10 c12273x1a8cfd10) {
        this.f311172d = c12273x1a8cfd10;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12273x1a8cfd10 c12273x1a8cfd10 = this.f311172d;
        int paddingLeft = (((android.widget.FrameLayout.LayoutParams) c12273x1a8cfd10.f165163g.getLayoutParams()).leftMargin - c12273x1a8cfd10.f165164h.getPaddingLeft()) - (((c12273x1a8cfd10.mo51410x5853ad3() - c12273x1a8cfd10.f165164h.getPaddingLeft()) - c12273x1a8cfd10.f165164h.getPaddingRight()) / 2);
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) c12273x1a8cfd10.f165164h.getLayoutParams();
        layoutParams.leftMargin = paddingLeft;
        c12273x1a8cfd10.f165164h.setLayoutParams(layoutParams);
    }
}
