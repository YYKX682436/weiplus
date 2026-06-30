package ff1;

/* loaded from: classes15.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e f343167d;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e abstractC12278xb84f839e) {
        this.f343167d = abstractC12278xb84f839e;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e abstractC12278xb84f839e = this.f343167d;
        android.widget.LinearLayout linearLayout = abstractC12278xb84f839e.f165214i;
        if (linearLayout == null || linearLayout.getVisibility() == 0) {
            return;
        }
        abstractC12278xb84f839e.f165214i.setVisibility(0);
    }
}
