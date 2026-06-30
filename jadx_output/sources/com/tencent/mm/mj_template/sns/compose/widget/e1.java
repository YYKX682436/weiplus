package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f69938a;

    /* renamed from: b, reason: collision with root package name */
    public final long f69939b;

    public e1(java.lang.Object obj, long j17) {
        this.f69938a = obj;
        this.f69939b = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.mj_template.sns.compose.widget.e1)) {
            return false;
        }
        com.tencent.mm.mj_template.sns.compose.widget.e1 e1Var = (com.tencent.mm.mj_template.sns.compose.widget.e1) obj;
        return kotlin.jvm.internal.o.b(this.f69938a, e1Var.f69938a) && this.f69939b == e1Var.f69939b;
    }

    public int hashCode() {
        java.lang.Object obj = this.f69938a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + java.lang.Long.hashCode(this.f69939b);
    }

    public java.lang.String toString() {
        return "MusicSearchDataWrapper(data=" + this.f69938a + ", recId=" + this.f69939b + ')';
    }
}
