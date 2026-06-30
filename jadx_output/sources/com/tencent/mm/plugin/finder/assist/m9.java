package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes3.dex */
public final class m9 {

    /* renamed from: a, reason: collision with root package name */
    public final int f102388a;

    /* renamed from: b, reason: collision with root package name */
    public final int f102389b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f102390c;

    public m9(int i17, int i18, java.lang.String topic) {
        kotlin.jvm.internal.o.g(topic, "topic");
        this.f102388a = i17;
        this.f102389b = i18;
        this.f102390c = topic;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.assist.m9)) {
            return false;
        }
        com.tencent.mm.plugin.finder.assist.m9 m9Var = (com.tencent.mm.plugin.finder.assist.m9) obj;
        return this.f102388a == m9Var.f102388a && this.f102389b == m9Var.f102389b && kotlin.jvm.internal.o.b(this.f102390c, m9Var.f102390c);
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f102388a) * 31) + java.lang.Integer.hashCode(this.f102389b)) * 31) + this.f102390c.hashCode();
    }

    public java.lang.String toString() {
        return "TopicStringInfo(start=" + this.f102388a + ", count=" + this.f102389b + ", topic=" + this.f102390c + ')';
    }
}
