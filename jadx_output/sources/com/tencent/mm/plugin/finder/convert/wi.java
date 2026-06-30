package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class wi extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.convert.wi f104876d = new com.tencent.mm.plugin.finder.convert.wi();

    public wi() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i17 = b17.x;
        int i18 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!z17) {
            if (i18 >= i17) {
                i17 = i18;
            }
            i18 = i17;
        }
        return java.lang.Integer.valueOf(i18);
    }
}
