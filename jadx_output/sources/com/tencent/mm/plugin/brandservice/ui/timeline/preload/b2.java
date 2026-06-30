package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes.dex */
public final class b2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.brandservice.ui.timeline.preload.b2 f94191d = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.b2();

    public b2() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            str = gm0.j1.u().d() + "web_preload_image/";
        } else {
            str = lp0.b.i() + "web_preload_image/";
        }
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mm.vfs.w6.u(str);
        }
        return str;
    }
}
