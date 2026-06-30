package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class j4 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.at2 f105607a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f105608b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f105609c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f105610d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f105611e;

    public j4(r45.at2 at2Var, boolean z17, boolean z18, boolean z19, boolean z27) {
        this.f105607a = at2Var;
        this.f105608b = z17;
        this.f105609c = z18;
        this.f105610d = z19;
        this.f105611e = z27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.extension.reddot.j4)) {
            return false;
        }
        com.tencent.mm.plugin.finder.extension.reddot.j4 j4Var = (com.tencent.mm.plugin.finder.extension.reddot.j4) obj;
        return kotlin.jvm.internal.o.b(this.f105607a, j4Var.f105607a) && this.f105608b == j4Var.f105608b && this.f105609c == j4Var.f105609c && this.f105610d == j4Var.f105610d && this.f105611e == j4Var.f105611e;
    }

    public int hashCode() {
        r45.at2 at2Var = this.f105607a;
        return ((((((((at2Var == null ? 0 : at2Var.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f105608b)) * 31) + java.lang.Boolean.hashCode(this.f105609c)) * 31) + java.lang.Boolean.hashCode(this.f105610d)) * 31) + java.lang.Boolean.hashCode(this.f105611e);
    }

    public java.lang.String toString() {
        return "ServerSyncConfigInfo(serverFreqConfig=" + this.f105607a + ", needUpdateFreqConfig=" + this.f105608b + ", needCleanXStrategy=" + this.f105609c + ", needUpdateXStrategy=" + this.f105610d + ", needUpdateBizXStrategy=" + this.f105611e + ')';
    }
}
