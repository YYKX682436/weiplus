package et4;

/* loaded from: classes9.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.C19128xb2665675 f338172d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.C19128xb2665675 c19128xb2665675) {
        this.f338172d = c19128xb2665675;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.C19128xb2665675 c19128xb2665675 = this.f338172d;
        android.text.Layout layout = c19128xb2665675.f261726f.getLayout();
        if (layout == null || layout.getLineCount() <= 1) {
            return;
        }
        c19128xb2665675.f261726f.setMaxWidth((int) layout.getLineWidth(0));
    }
}
