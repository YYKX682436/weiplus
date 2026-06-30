package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes8.dex */
public class p5 {

    /* renamed from: a, reason: collision with root package name */
    public android.os.Bundle f264594a;

    public p5(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.b6 b6Var, android.os.Bundle bundle) {
        this.f264594a = bundle;
    }

    public void a(java.lang.String str, java.lang.Object obj) {
        android.os.Bundle bundle = this.f264594a;
        if (bundle != null) {
            if (obj instanceof java.lang.String) {
                bundle.putString(str, (java.lang.String) obj);
                return;
            }
            if (obj instanceof java.lang.Boolean) {
                bundle.putBoolean(str, ((java.lang.Boolean) obj).booleanValue());
            } else if (obj instanceof java.lang.Integer) {
                bundle.putInt(str, ((java.lang.Integer) obj).intValue());
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebviewReporter", "put unknow type value.");
            }
        }
    }
}
