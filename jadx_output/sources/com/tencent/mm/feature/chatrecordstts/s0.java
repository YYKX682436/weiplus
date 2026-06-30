package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.feature.chatrecordstts.s0 f65531d = new com.tencent.mm.feature.chatrecordstts.s0();

    public s0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        return context == null ? java.lang.Boolean.FALSE : java.lang.Boolean.valueOf(com.tencent.mars.comm.NetStatusUtil.isConnected(context));
    }
}
