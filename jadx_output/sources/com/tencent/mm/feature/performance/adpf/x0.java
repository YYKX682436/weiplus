package com.tencent.mm.feature.performance.adpf;

/* loaded from: classes12.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f67504a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f67505b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f67506c;

    public x0(int i17, java.lang.String source, java.lang.String reason) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(reason, "reason");
        this.f67504a = i17;
        this.f67505b = source;
        this.f67506c = reason;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.feature.performance.adpf.x0)) {
            return false;
        }
        com.tencent.mm.feature.performance.adpf.x0 x0Var = (com.tencent.mm.feature.performance.adpf.x0) obj;
        return this.f67504a == x0Var.f67504a && kotlin.jvm.internal.o.b(this.f67505b, x0Var.f67505b) && kotlin.jvm.internal.o.b(this.f67506c, x0Var.f67506c);
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f67504a) * 31) + this.f67505b.hashCode()) * 31) + this.f67506c.hashCode();
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Signal(");
        int i17 = this.f67504a;
        if (i17 == 0) {
            str = com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase.CONNTECTSTATE_INIT;
        } else if (i17 == 1) {
            str = "RED";
        } else if (i17 == 2) {
            str = "GREEN";
        } else {
            if (i17 != 3) {
                throw new java.lang.IllegalStateException(("Unknown signal: " + i17).toString());
            }
            str = "YELLOW";
        }
        sb6.append(str);
        sb6.append(", source='");
        sb6.append(this.f67505b);
        sb6.append("', reason='");
        sb6.append(this.f67506c);
        sb6.append("')");
        return sb6.toString();
    }

    public /* synthetic */ x0(int i17, java.lang.String str, java.lang.String str2, int i18, kotlin.jvm.internal.i iVar) {
        this(i17, str, (i18 & 4) != 0 ? "" : str2);
    }
}
