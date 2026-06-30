package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public final class g2 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.da f83146a;

    public g2(com.tencent.mm.ui.da daVar) {
        this.f83146a = daVar;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        if (com.tencent.mm.plugin.appbrand.jsapi.share.i2.f83162a != i17) {
            return false;
        }
        this.f83146a.mmOnActivityResult(i17, i18, intent);
        return true;
    }
}
