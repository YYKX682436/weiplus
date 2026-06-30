package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes9.dex */
public class o implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.share.q f83190a;

    public o(com.tencent.mm.plugin.appbrand.jsapi.share.q qVar) {
        this.f83190a = qVar;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.jsapi.share.q qVar = this.f83190a;
        if (qVar.f83204m.f83173g != i17) {
            return false;
        }
        qVar.f83199e.mmOnActivityResult(i17, i18, intent);
        return true;
    }
}
