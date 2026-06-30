package et4;

/* loaded from: classes9.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.C19128xb2665675 f338167d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.C19128xb2665675 c19128xb2665675) {
        this.f338167d = c19128xb2665675;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.C19128xb2665675 c19128xb2665675 = this.f338167d;
        int width = c19128xb2665675.f261724d.getWidth();
        if (c19128xb2665675.f261725e.getVisibility() != 8) {
            width += com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.C19128xb2665675.f261722i;
        }
        if (c19128xb2665675.f261727g.getVisibility() != 8) {
            width += com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.C19128xb2665675.f261723m;
        }
        c19128xb2665675.f261726f.setMaxWidth(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.C19128xb2665675.f261721h - width);
    }
}
