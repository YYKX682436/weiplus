package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes.dex */
public final class f6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.extension.reddot.f6 f105517d = new com.tencent.mm.plugin.finder.extension.reddot.f6();

    public f6() {
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
        return java.lang.Float.valueOf((i18 * 2.0f) / 3);
    }
}
