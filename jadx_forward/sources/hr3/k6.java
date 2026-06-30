package hr3;

/* loaded from: classes4.dex */
public class k6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365246d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hr3.t6 f365247e;

    public k6(hr3.t6 t6Var, java.lang.String str) {
        this.f365247e = t6Var;
        this.f365246d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        hr3.t6 t6Var = this.f365247e;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar = t6Var.f365536e;
        if (rVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ContactWidgetBizInfo", "LazyGetAvatar screen is null");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16857xcfb990f8 c16857xcfb990f8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16857xcfb990f8) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).h("contact_info_kf_worker");
        if (c16857xcfb990f8 == null || t6Var.f365536e == null) {
            return;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
        android.graphics.Bitmap a17 = com.p314xaae8f345.mm.p943x351df9c2.g.a(this.f365246d);
        if (a17 != null) {
            c16857xcfb990f8.N = a17;
            android.widget.ImageView imageView = c16857xcfb990f8.L;
            if (imageView != null) {
                imageView.setImageBitmap(a17);
            }
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) t6Var.f365536e).notifyDataSetChanged();
        }
    }
}
