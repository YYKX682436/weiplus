package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes2.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.extension.reddot.s0 f105835d = new com.tencent.mm.plugin.finder.extension.reddot.s0();

    public s0() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.f03 it = (r45.f03) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(kotlin.jvm.internal.o.b(it.f373892i, "WxMessageEntry") || kotlin.jvm.internal.o.b(it.f373892i, "WxMessageLike") || kotlin.jvm.internal.o.b(it.f373892i, "WxMessageComment"));
    }
}
