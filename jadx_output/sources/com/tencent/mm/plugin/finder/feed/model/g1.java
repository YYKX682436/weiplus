package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes.dex */
public final class g1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f107878d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(java.lang.String str) {
        super(1);
        this.f107878d = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.D0(((r45.h32) obj).getString(4), this.f107878d));
    }
}
