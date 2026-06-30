package com.tencent.mm.booter;

/* loaded from: classes12.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.booter.j0 f63403d = new com.tencent.mm.booter.j0();

    public j0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (mm.k.j(mm.k.V, null, 1, null)) {
            return new com.tencent.mars.comm.MMWakerLock(com.tencent.mm.sdk.platformtools.x2.f193071a, "MicroMsg:PushToMain");
        }
        return null;
    }
}
