package com.tencent.mm.feature.ecs.nirvana.accessibility;

/* loaded from: classes14.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f65721a;

    /* renamed from: b, reason: collision with root package name */
    public final int f65722b;

    public o(android.view.View view, int i17, com.tencent.mm.feature.ecs.nirvana.accessibility.m mVar) {
        this.f65721a = view;
        this.f65722b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.feature.ecs.nirvana.accessibility.o)) {
            return false;
        }
        com.tencent.mm.feature.ecs.nirvana.accessibility.o oVar = (com.tencent.mm.feature.ecs.nirvana.accessibility.o) obj;
        return this.f65722b == oVar.f65722b && this.f65721a.equals(oVar.f65721a);
    }

    public int hashCode() {
        return ((this.f65721a.hashCode() + 31) * 31) + this.f65722b;
    }
}
