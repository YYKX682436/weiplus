package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class e8 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.e8 f102131a = new com.tencent.mm.plugin.finder.assist.e8();

    public final int a() {
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i17 = b17.x;
        int i18 = b17.y;
        if (d()) {
            return i18;
        }
        if (i18 >= i17) {
            i17 = i18;
        }
        return i17;
    }

    public final int b(android.content.Context context) {
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        int c17 = com.tencent.mm.ui.bl.c(context);
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i17 = b17.x;
        int i18 = b17.y;
        if (d()) {
            return i18 - c17;
        }
        if (i18 >= i17) {
            i17 = i18;
        }
        return i17 - c17;
    }

    public final int c(android.content.Context context) {
        int i17;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(context);
        boolean d17 = d();
        int i18 = a17.f197135a;
        return (!d17 && i18 > (i17 = a17.f197136b)) ? i17 : i18;
    }

    public final boolean d() {
        java.lang.System.nanoTime();
        boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return z17;
    }
}
