package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd;

/* loaded from: classes7.dex */
public class d extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b f128867b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m mVar) {
        super(mVar);
        this.f128867b = bVar;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: readLibSync */
    public java.lang.String m32092xddc7d04a(java.lang.String str) {
        return android.text.TextUtils.isEmpty(str) ? "" : this.f128867b.x().M(str);
    }

    @android.webkit.JavascriptInterface
    /* renamed from: readLibXWebScriptSync */
    public java.lang.String m32093x92cde9d1(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar = this.f128867b;
        return !(bVar.Q1() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a) ? "" : ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a) bVar.Q1()).O().b(str);
    }
}
