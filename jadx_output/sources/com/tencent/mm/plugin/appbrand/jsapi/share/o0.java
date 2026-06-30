package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public class o0 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.share.p0 f83191a;

    public o0(com.tencent.mm.plugin.appbrand.jsapi.share.p0 p0Var) {
        this.f83191a = p0Var;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.jsapi.share.p0 p0Var = this.f83191a;
        if (p0Var.f83197h.f83213i.f83225g != i17) {
            return false;
        }
        p0Var.f83194e.mmOnActivityResult(i17, i18, intent);
        return true;
    }
}
