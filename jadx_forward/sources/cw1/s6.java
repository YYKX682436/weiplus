package cw1;

/* loaded from: classes12.dex */
public class s6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public volatile int f304849d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f304850e = new boolean[3];

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView[] f304851f = new android.widget.TextView[3];

    /* renamed from: g, reason: collision with root package name */
    public final int[] f304852g = new int[3];

    /* renamed from: h, reason: collision with root package name */
    public final int[] f304853h = {100, 100, 100};

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13122x435a878b f304854i;

    public s6(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13122x435a878b activityC13122x435a878b, cw1.n6 n6Var) {
        this.f304854i = activityC13122x435a878b;
    }

    public void a(int i17) {
        this.f304850e[i17] = true;
        int i18 = 0;
        while (true) {
            boolean[] zArr = this.f304850e;
            if (i18 >= zArr.length || !zArr[i18]) {
                break;
            } else {
                i18++;
            }
        }
        this.f304849d = i18;
        run();
    }

    public void b(int i17, int i18, int i19) {
        if (i18 < 0) {
            i18 = 0;
        } else if (i18 > i19) {
            i18 = i19;
        }
        int[] iArr = this.f304852g;
        iArr[i17] = java.lang.Math.max(i18, iArr[i17]);
        this.f304853h[i17] = i19;
        if (i17 == this.f304849d) {
            ((ku5.t0) ku5.t0.f394148d).B(this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f304849d == 0) {
            this.f304851f[this.f304849d].setText(this.f304854i.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b7w, java.lang.Integer.valueOf((this.f304852g[this.f304849d] * 100) / this.f304853h[this.f304849d])));
        }
    }
}
