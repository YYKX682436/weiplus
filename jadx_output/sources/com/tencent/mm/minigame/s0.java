package com.tencent.mm.minigame;

/* loaded from: classes7.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.zip.ZipInputStream f69142d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(java.util.zip.ZipInputStream zipInputStream) {
        super(0);
        this.f69142d = zipInputStream;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f69142d.getNextEntry();
    }
}
