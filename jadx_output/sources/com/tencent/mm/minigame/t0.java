package com.tencent.mm.minigame;

/* loaded from: classes7.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.minigame.t0 f69145d = new com.tencent.mm.minigame.t0();

    public t0() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.zip.ZipEntry it = (java.util.zip.ZipEntry) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(it.isDirectory());
    }
}
