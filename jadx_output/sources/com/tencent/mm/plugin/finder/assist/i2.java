package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class i2 {

    /* renamed from: b, reason: collision with root package name */
    public static r45.w11 f102247b;

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.i2 f102246a = new com.tencent.mm.plugin.finder.assist.i2();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.List f102248c = kz5.c0.i(1, 2, 5, 9, 11);

    public final void a(r45.xb1 resp) {
        r45.w11 w11Var;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.util.LinkedList list = resp.getList(30);
        kotlin.jvm.internal.o.f(list, "getFinder_config_item(...)");
        java.util.Iterator it = list.iterator();
        while (true) {
            w11Var = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((r45.yy0) obj).getString(0), "enhance_config")) {
                    break;
                }
            }
        }
        r45.yy0 yy0Var = (r45.yy0) obj;
        if (yy0Var != null) {
            w11Var = new r45.w11();
            com.tencent.mm.protobuf.g byteString = yy0Var.getByteString(1);
            if (byteString != null) {
                w11Var.parseFrom(byteString.g());
            }
        }
        f102247b = w11Var;
        com.tencent.mars.xlog.Log.i("FinderEnhanceUtils", "initEnhanceConfig liveRefreshConfig: " + f102247b);
    }
}
