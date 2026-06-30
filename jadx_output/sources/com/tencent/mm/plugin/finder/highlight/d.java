package com.tencent.mm.plugin.finder.highlight;

/* loaded from: classes2.dex */
public final class d implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.gb1 f111427d;

    public d(r45.gb1 info) {
        kotlin.jvm.internal.o.g(info, "info");
        this.f111427d = info;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return -1;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.o.b(com.tencent.mm.plugin.finder.highlight.d.class, obj.getClass())) {
            return false;
        }
        r45.gb1 gb1Var = this.f111427d;
        int integer = gb1Var.getInteger(0);
        r45.gb1 gb1Var2 = ((com.tencent.mm.plugin.finder.highlight.d) obj).f111427d;
        return integer == gb1Var2.getInteger(0) && gb1Var.getInteger(1) == gb1Var2.getInteger(1) && kotlin.jvm.internal.o.b(gb1Var.getString(2), gb1Var2.getString(2)) && kotlin.jvm.internal.o.b(gb1Var.getString(3), gb1Var2.getString(3));
    }

    @Override // in5.c
    public long getItemId() {
        return super.hashCode();
    }

    @Override // in5.c
    public int h() {
        return com.tencent.mm.plugin.finder.highlight.d.class.getName().hashCode();
    }

    public int hashCode() {
        return super.hashCode();
    }
}
