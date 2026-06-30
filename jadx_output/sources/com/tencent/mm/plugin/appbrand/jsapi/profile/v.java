package com.tencent.mm.plugin.appbrand.jsapi.profile;

/* loaded from: classes9.dex */
public class v implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.xc f82840a;

    public v(com.tencent.mm.plugin.appbrand.jsapi.profile.y yVar, com.tencent.mm.ui.xc xcVar) {
        this.f82840a = xcVar;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        this.f82840a.mmOnActivityResult(i17, i18, intent);
        return true;
    }
}
