package yf;

/* loaded from: classes7.dex */
public class j0 implements zf.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yf.i0 f542933a;

    public j0(yf.i0 i0Var) {
        this.f542933a = i0Var;
    }

    @Override // zf.b
    public void b(java.lang.String str, java.lang.String str2) {
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2);
        yf.i0 i0Var = this.f542933a;
        if (!K0) {
            final java.lang.String a17 = kk.w.a(str2, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.x(), "convertFilterImageToLocalPath, targetPath:%s", a17);
            i0Var.G(new java.lang.Runnable() { // from class: yf.j0$$a
                @Override // java.lang.Runnable
                public final void run() {
                    yf.i0 i0Var2 = yf.j0.this.f542933a;
                    if (i0Var2.f542895i != null) {
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15515x140e67ac, a17);
                        i0Var2.f542895i.g(bundle);
                    }
                }
            });
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.x(), "convertFilterImageToLocalPath, load filter image fail");
        if (i0Var.f542897n != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("url", str);
            ((bg1.q) i0Var.f542897n).b(i0Var.f334030d, jc1.g.f380474m, 10005, "load filter image fail", hashMap);
        }
    }
}
