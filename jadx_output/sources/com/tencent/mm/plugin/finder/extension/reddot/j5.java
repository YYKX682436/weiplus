package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes4.dex */
public final class j5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.rc4 f105612d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(r45.rc4 rc4Var) {
        super(0);
        this.f105612d = rc4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        r45.rc4 rc4Var = this.f105612d;
        sb6.append(rc4Var.getString(2));
        sb6.append(',');
        r45.vs2 vs2Var = (r45.vs2) rc4Var.getCustom(3);
        sb6.append(vs2Var != null ? vs2Var.f388503x : null);
        return sb6.toString();
    }
}
