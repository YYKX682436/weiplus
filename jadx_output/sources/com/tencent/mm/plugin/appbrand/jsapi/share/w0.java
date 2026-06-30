package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public final class w0 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.share.a1 f83291a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.da f83292b;

    public w0(com.tencent.mm.plugin.appbrand.jsapi.share.a1 a1Var, com.tencent.mm.ui.da daVar) {
        this.f83291a = a1Var;
        this.f83292b = daVar;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        if (this.f83291a.f83107g != i17) {
            return false;
        }
        this.f83292b.mmOnActivityResult(i17, i18, intent);
        return true;
    }
}
