package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes.dex */
public final class m2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.brandservice.ui.timeline.preload.m2 f94360d = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.m2();

    public m2() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.o4.M("__webview_command").o("prefetchTestMode", 0) == 1);
    }
}
