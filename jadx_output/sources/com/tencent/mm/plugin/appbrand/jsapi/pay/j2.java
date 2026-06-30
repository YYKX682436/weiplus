package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes.dex */
public class j2 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.da f82615a;

    public j2(com.tencent.mm.plugin.appbrand.jsapi.pay.k2 k2Var, com.tencent.mm.ui.da daVar) {
        this.f82615a = daVar;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        this.f82615a.mmOnActivityResult(i17, i18, intent);
        return true;
    }
}
