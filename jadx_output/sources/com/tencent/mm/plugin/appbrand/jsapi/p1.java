package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class p1 extends com.tencent.mm.plugin.appbrand.jsapi.o0 {
    public static final int CTRL_INDEX = 590;
    public static final java.lang.String NAME = "onKeyboardHeightChange";

    public final void x(int i17, com.tencent.mm.plugin.appbrand.e9 service, com.tencent.mm.plugin.appbrand.page.v5 page, java.lang.Integer num) {
        kotlin.jvm.internal.o.g(service, "service");
        kotlin.jvm.internal.o.g(page, "page");
        s("height", java.lang.Integer.valueOf(ik1.w.e(i17)));
        if (num != null) {
            s("inputId", java.lang.Integer.valueOf(num.intValue()));
        }
        u(service);
        m();
        u(page);
        m();
    }
}
