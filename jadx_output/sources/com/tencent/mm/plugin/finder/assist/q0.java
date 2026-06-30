package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f102472a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f102473b;

    /* renamed from: c, reason: collision with root package name */
    public final int f102474c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f102475d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Boolean f102476e;

    public q0(long j17, java.lang.String str, int i17, java.lang.ref.WeakReference weakReference, java.lang.Boolean bool, int i18, kotlin.jvm.internal.i iVar) {
        i17 = (i18 & 4) != 0 ? 1 : i17;
        weakReference = (i18 & 8) != 0 ? null : weakReference;
        bool = (i18 & 16) != 0 ? java.lang.Boolean.FALSE : bool;
        this.f102472a = j17;
        this.f102473b = str;
        this.f102474c = i17;
        this.f102475d = weakReference;
        this.f102476e = bool;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.assist.q0)) {
            return false;
        }
        com.tencent.mm.plugin.finder.assist.q0 q0Var = (com.tencent.mm.plugin.finder.assist.q0) obj;
        return this.f102472a == q0Var.f102472a && kotlin.jvm.internal.o.b(this.f102473b, q0Var.f102473b) && this.f102474c == q0Var.f102474c && kotlin.jvm.internal.o.b(this.f102475d, q0Var.f102475d) && kotlin.jvm.internal.o.b(this.f102476e, q0Var.f102476e);
    }

    public int hashCode() {
        int hashCode = java.lang.Long.hashCode(this.f102472a) * 31;
        java.lang.String str = this.f102473b;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f102474c)) * 31;
        java.lang.ref.WeakReference weakReference = this.f102475d;
        int hashCode3 = (hashCode2 + (weakReference == null ? 0 : weakReference.hashCode())) * 31;
        java.lang.Boolean bool = this.f102476e;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "ClickExtra(feedId=" + this.f102472a + ", dupFlag=" + this.f102473b + ", topicType=" + this.f102474c + ", contextRef=" + this.f102475d + ", isTopicTag=" + this.f102476e + ')';
    }
}
