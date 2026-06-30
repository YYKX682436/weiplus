package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes11.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f65377a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f65378b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f65379c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f65380d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f65381e;

    public c2(yz5.l run, yz5.l lVar, yz5.l lVar2, yz5.l lVar3, yz5.l lVar4) {
        kotlin.jvm.internal.o.g(run, "run");
        this.f65377a = run;
        this.f65378b = lVar;
        this.f65379c = lVar2;
        this.f65380d = lVar3;
        this.f65381e = lVar4;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.feature.chatrecordstts.c2)) {
            return false;
        }
        com.tencent.mm.feature.chatrecordstts.c2 c2Var = (com.tencent.mm.feature.chatrecordstts.c2) obj;
        return kotlin.jvm.internal.o.b(this.f65377a, c2Var.f65377a) && kotlin.jvm.internal.o.b(this.f65378b, c2Var.f65378b) && kotlin.jvm.internal.o.b(this.f65379c, c2Var.f65379c) && kotlin.jvm.internal.o.b(this.f65380d, c2Var.f65380d) && kotlin.jvm.internal.o.b(this.f65381e, c2Var.f65381e);
    }

    public int hashCode() {
        int hashCode = this.f65377a.hashCode() * 31;
        yz5.l lVar = this.f65378b;
        int hashCode2 = (hashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        yz5.l lVar2 = this.f65379c;
        int hashCode3 = (hashCode2 + (lVar2 == null ? 0 : lVar2.hashCode())) * 31;
        yz5.l lVar3 = this.f65380d;
        int hashCode4 = (hashCode3 + (lVar3 == null ? 0 : lVar3.hashCode())) * 31;
        yz5.l lVar4 = this.f65381e;
        return hashCode4 + (lVar4 != null ? lVar4.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "Task(run=" + this.f65377a + ", pause=" + this.f65378b + ", resume=" + this.f65379c + ", interrupt=" + this.f65380d + ", runWithPause=" + this.f65381e + ')';
    }
}
