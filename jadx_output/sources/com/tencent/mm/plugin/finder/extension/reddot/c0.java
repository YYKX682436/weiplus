package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes3.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f105426d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zy2.y8 f105427e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(long j17, zy2.y8 y8Var) {
        super(0);
        this.f105426d = j17;
        this.f105427e = y8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f105426d);
        sb6.append(';');
        sb6.append(this.f105427e);
        return sb6.toString();
    }
}
