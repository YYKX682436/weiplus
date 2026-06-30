package com.tencent.mm.feature.ecs.share;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.feature.ecs.share.o f65997d = new com.tencent.mm.feature.ecs.share.o(null);

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.feature.ecs.share.b f65998a;

    /* renamed from: b, reason: collision with root package name */
    public final org.json.JSONObject f65999b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f66000c;

    public p(com.tencent.mm.feature.ecs.share.b menuItem, org.json.JSONObject jSONObject, boolean z17) {
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        this.f65998a = menuItem;
        this.f65999b = jSONObject;
        this.f66000c = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.feature.ecs.share.p)) {
            return false;
        }
        com.tencent.mm.feature.ecs.share.p pVar = (com.tencent.mm.feature.ecs.share.p) obj;
        return this.f65998a == pVar.f65998a && kotlin.jvm.internal.o.b(this.f65999b, pVar.f65999b) && this.f66000c == pVar.f66000c;
    }

    public int hashCode() {
        int hashCode = this.f65998a.hashCode() * 31;
        org.json.JSONObject jSONObject = this.f65999b;
        return ((hashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f66000c);
    }

    public java.lang.String toString() {
        return "EcsShareMenuItem(menuItem=" + this.f65998a + ", customItem=" + this.f65999b + ", disable=" + this.f66000c + ')';
    }

    public /* synthetic */ p(com.tencent.mm.feature.ecs.share.b bVar, org.json.JSONObject jSONObject, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        this(bVar, (i17 & 2) != 0 ? null : jSONObject, (i17 & 4) != 0 ? false : z17);
    }
}
