package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030;

/* loaded from: classes12.dex */
public class e2 extends fi.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.d2 f149091a;

    public e2(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.d2 d2Var) {
        this.f149091a = d2Var;
    }

    @Override // fi.a, fi.b
    public boolean a(java.lang.String str, java.lang.String str2) {
        if (this.f149091a.f149085m.f149069e || com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40975xf7b3660d()) {
            return false;
        }
        if (this.f149091a.f149079d && str.contains("/files/mmkv/")) {
            return true;
        }
        if (str2.contains("w")) {
            return false;
        }
        if (this.f149091a.f149080e && str2.contains("x") && str.endsWith(".so")) {
            return true;
        }
        if (this.f149091a.f149081f && str2.contains("x") && str.endsWith(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55698xb5cf7628)) {
            return true;
        }
        if (this.f149091a.f149082g && str.endsWith("base.apk") && !str.contains("xwalk")) {
            return true;
        }
        if (this.f149091a.f149083h && str.endsWith(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55629x4d21106)) {
            return true;
        }
        return this.f149091a.f149084i && str.contains("com.tencent.mm") && str.endsWith(".apk") && !str.contains("xwalk");
    }
}
