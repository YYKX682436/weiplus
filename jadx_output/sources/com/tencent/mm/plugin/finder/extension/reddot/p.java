package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes4.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.hx0 f105762d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f105763e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f105764f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r45.hx0 hx0Var, int i17, int i18) {
        super(0);
        this.f105762d = hx0Var;
        this.f105763e = i17;
        this.f105764f = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cmdId=");
        r45.hx0 hx0Var = this.f105762d;
        sb6.append(hx0Var.getInteger(0));
        sb6.append(" selector=");
        sb6.append(this.f105763e);
        sb6.append(" scene=");
        sb6.append(this.f105764f);
        sb6.append(", ");
        sb6.append(hx0Var.getString(2));
        return sb6.toString();
    }
}
