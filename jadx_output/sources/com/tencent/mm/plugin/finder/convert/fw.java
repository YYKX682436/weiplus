package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class fw extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f103427d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw(android.os.Bundle bundle) {
        super(0);
        this.f103427d = bundle;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f103427d.putBoolean("RequestLoadMore", true);
        return jz5.f0.f302826a;
    }
}
