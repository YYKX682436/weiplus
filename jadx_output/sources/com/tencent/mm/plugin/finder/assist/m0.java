package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes3.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f102375a;

    /* renamed from: b, reason: collision with root package name */
    public final int f102376b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f102377c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.FinderContact f102378d;

    public m0(int i17, int i18, java.lang.String atNickname, com.tencent.mm.protocal.protobuf.FinderContact finderContact) {
        kotlin.jvm.internal.o.g(atNickname, "atNickname");
        kotlin.jvm.internal.o.g(finderContact, "finderContact");
        this.f102375a = i17;
        this.f102376b = i18;
        this.f102377c = atNickname;
        this.f102378d = finderContact;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.assist.m0)) {
            return false;
        }
        com.tencent.mm.plugin.finder.assist.m0 m0Var = (com.tencent.mm.plugin.finder.assist.m0) obj;
        return this.f102375a == m0Var.f102375a && this.f102376b == m0Var.f102376b && kotlin.jvm.internal.o.b(this.f102377c, m0Var.f102377c) && kotlin.jvm.internal.o.b(this.f102378d, m0Var.f102378d);
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f102375a) * 31) + java.lang.Integer.hashCode(this.f102376b)) * 31) + this.f102377c.hashCode()) * 31) + this.f102378d.hashCode();
    }

    public java.lang.String toString() {
        return "AtStringInfo(start=" + this.f102375a + ", end=" + this.f102376b + ", atNickname=" + this.f102377c + ", finderContact=" + this.f102378d + ')';
    }

    public /* synthetic */ m0(int i17, int i18, java.lang.String str, com.tencent.mm.protocal.protobuf.FinderContact finderContact, int i19, kotlin.jvm.internal.i iVar) {
        this(i17, i18, str, (i19 & 8) != 0 ? new com.tencent.mm.protocal.protobuf.FinderContact() : finderContact);
    }
}
