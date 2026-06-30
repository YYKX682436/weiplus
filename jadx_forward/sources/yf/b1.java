package yf;

/* loaded from: classes7.dex */
public class b1 implements zf.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yf.i0 f542843a;

    public b1(yf.i0 i0Var) {
        this.f542843a = i0Var;
    }

    @Override // zf.b
    public void b(java.lang.String str, java.lang.String str2) {
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2);
        yf.i0 i0Var = this.f542843a;
        if (!K0) {
            final java.lang.String a17 = kk.w.a(str2, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.x(), "convertBackgroundImageToLocalPath, targetPath:%s", a17);
            i0Var.G(new java.lang.Runnable() { // from class: yf.b1$$a
                @Override // java.lang.Runnable
                public final void run() {
                    yf.i0 i0Var2 = yf.b1.this.f542843a;
                    if (i0Var2.f542895i != null) {
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15505x57568ce2, a17);
                        i0Var2.f542895i.g(bundle);
                    }
                }
            });
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.x(), "convertBackgroundImageToLocalPath, url: %s, localPath: %s", str, str2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            if (str == null) {
                return;
            }
            i0Var.G(new java.lang.Runnable() { // from class: yf.b1$$b
                @Override // java.lang.Runnable
                public final void run() {
                    yf.b1 b1Var = yf.b1.this;
                    b1Var.getClass();
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15505x57568ce2, "");
                    b1Var.f542843a.f542895i.g(bundle);
                }
            });
        } else if (i0Var.f542897n != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("url", str);
            ((bg1.q) i0Var.f542897n).b(i0Var.f334030d, jc1.g.f380474m, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54055x82c2d261, "load background image fail", hashMap);
        }
    }
}
