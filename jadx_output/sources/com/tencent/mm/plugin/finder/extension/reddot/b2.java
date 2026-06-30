package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes2.dex */
public final class b2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f105409d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db2.b3 f105410e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f105411f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.jb f105412g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(long j17, db2.b3 b3Var, int i17, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar) {
        super(0);
        this.f105409d = j17;
        this.f105410e = b3Var;
        this.f105411f = i17;
        this.f105412g = jbVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("redDotFeedId = ");
        sb6.append(pm0.v.u(this.f105409d));
        sb6.append(", requestFeedId=");
        db2.b3 b3Var = this.f105410e;
        sb6.append(pm0.v.u(b3Var.getLong(12)));
        sb6.append(", tabType = ");
        sb6.append(this.f105411f);
        sb6.append(", findPageRedDotTipsId = ");
        sb6.append(this.f105412g.field_tipsId);
        sb6.append(", requestRedDotTipsId = ");
        sb6.append(b3Var.f227909e);
        return sb6.toString();
    }
}
