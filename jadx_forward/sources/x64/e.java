package x64;

/* loaded from: classes3.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f533806d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f533807e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x64.f f533808f;

    public e(x64.f fVar, int i17, java.lang.String str) {
        this.f533808f = fVar;
        this.f533806d = i17;
        this.f533807e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt$4");
        try {
            int i17 = this.f533806d;
            java.lang.String str = this.f533807e;
            x64.f fVar = this.f533808f;
            if (i17 == 0) {
                android.content.Context b17 = x64.f.b(fVar);
                if (android.text.TextUtils.isEmpty(str)) {
                    str = x64.f.b(fVar).getString(com.p314xaae8f345.mm.R.C30867xcad56011.j6q);
                }
                db5.t7.h(b17, str);
            } else {
                android.content.Context b18 = x64.f.b(fVar);
                if (android.text.TextUtils.isEmpty(str)) {
                    str = x64.f.b(fVar).getString(com.p314xaae8f345.mm.R.C30867xcad56011.j6p);
                }
                db5.t7.g(b18, str);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt$4");
    }
}
