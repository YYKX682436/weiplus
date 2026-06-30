package oe1;

/* loaded from: classes15.dex */
public class m implements oe1.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a f426252a;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a) {
        this.f426252a = c12262x4a2a25a;
    }

    public void a(int i17, int i18) {
        if (i18 <= 0) {
            return;
        }
        if (i17 < 0) {
            i17 = 0;
        }
        if (i17 > i18) {
            i17 = i18;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a = this.f426252a;
        int width = (i17 * c12262x4a2a25a.f165078v.getWidth()) / i18;
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) c12262x4a2a25a.f165077u.getLayoutParams();
        layoutParams.width = width;
        c12262x4a2a25a.f165077u.setLayoutParams(layoutParams);
        c12262x4a2a25a.f165077u.requestLayout();
    }
}
