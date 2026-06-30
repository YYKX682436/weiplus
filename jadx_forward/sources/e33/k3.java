package e33;

/* loaded from: classes10.dex */
public class k3 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.g6 {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f328838d = null;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f328839e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f328840f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e33.l3 f328841g;

    public k3(e33.l3 l3Var, java.lang.String str, int i17) {
        this.f328841g = l3Var;
        this.f328839e = str;
        this.f328840f = i17;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    public boolean a() {
        e33.l3 l3Var = this.f328841g;
        if (l3Var.f328860j != null) {
            java.lang.String str = this.f328839e;
            if (!android.text.TextUtils.isEmpty(str)) {
                if (this.f328840f == 2) {
                    this.f328838d = t23.t1.f(-1L, 2, "", this.f328839e, -1);
                }
                if (this.f328838d != null) {
                    return true;
                }
                e33.v2 v2Var = l3Var.f328860j;
                if (v2Var == null) {
                    return false;
                }
                try {
                    v2Var.getClass();
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    android.os.SystemClock.elapsedRealtime();
                    ((ee0.v4) ((fe0.o4) i95.n0.c(fe0.o4.class))).getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("decodeFileToBitmapByJavaHeap", "com.tencent.mm.feature.sns.SnsUtilService");
                    android.graphics.Bitmap o17 = ca4.z0.o(str);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("decodeFileToBitmapByJavaHeap", "com.tencent.mm.feature.sns.SnsUtilService");
                    android.os.SystemClock.elapsedRealtime();
                    this.f328838d = o17;
                    return true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ImageGalleryLazyLoader", "doInBackground loadImage error : " + th6.getMessage());
                    return false;
                }
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    public boolean b() {
        e33.l3 l3Var = this.f328841g;
        l3Var.f328861k = false;
        java.util.HashMap hashMap = l3Var.f328853c;
        java.lang.String str = this.f328839e;
        if (hashMap.containsKey(str)) {
            int intValue = ((java.lang.Integer) hashMap.get(str)).intValue();
            if (l3Var.f328856f == 0) {
                l3Var.a(intValue, this.f328838d);
            } else {
                l3Var.f328855e.put(intValue, this.f328838d);
            }
        }
        ((jt0.i) l3Var.f328857g).j(str, this.f328838d);
        this.f328838d = null;
        l3Var.d(this.f328840f);
        return false;
    }
}
