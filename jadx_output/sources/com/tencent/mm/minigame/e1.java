package com.tencent.mm.minigame;

/* loaded from: classes7.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f69062a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f69063b;

    /* renamed from: c, reason: collision with root package name */
    public final int f69064c;

    /* renamed from: d, reason: collision with root package name */
    public final long f69065d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f69066e;

    public e1(boolean z17, java.lang.String pkgPath, int i17, long j17, boolean z18) {
        kotlin.jvm.internal.o.g(pkgPath, "pkgPath");
        this.f69062a = z17;
        this.f69063b = pkgPath;
        this.f69064c = i17;
        this.f69065d = j17;
        this.f69066e = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.minigame.e1)) {
            return false;
        }
        com.tencent.mm.minigame.e1 e1Var = (com.tencent.mm.minigame.e1) obj;
        return this.f69062a == e1Var.f69062a && kotlin.jvm.internal.o.b(this.f69063b, e1Var.f69063b) && this.f69064c == e1Var.f69064c && this.f69065d == e1Var.f69065d && this.f69066e == e1Var.f69066e;
    }

    public int hashCode() {
        return (((((((java.lang.Boolean.hashCode(this.f69062a) * 31) + this.f69063b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f69064c)) * 31) + java.lang.Long.hashCode(this.f69065d)) * 31) + java.lang.Boolean.hashCode(this.f69066e);
    }

    public java.lang.String toString() {
        return "ModulePkgResult(exists=" + this.f69062a + ", pkgPath=" + this.f69063b + ", pkgVersion=" + this.f69064c + ", pkgSize=" + this.f69065d + ", hasOldVersion=" + this.f69066e + ')';
    }

    public /* synthetic */ e1(boolean z17, java.lang.String str, int i17, long j17, boolean z18, int i18, kotlin.jvm.internal.i iVar) {
        this(z17, (i18 & 2) != 0 ? "" : str, (i18 & 4) != 0 ? 0 : i17, (i18 & 8) != 0 ? 0L : j17, (i18 & 16) != 0 ? false : z18);
    }
}
