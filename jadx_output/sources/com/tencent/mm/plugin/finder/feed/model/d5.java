package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class d5 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.jt4 f107792d;

    /* renamed from: e, reason: collision with root package name */
    public final long f107793e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f107794f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f107795g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f107796h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Integer f107797i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f107798m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Long f107799n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f107800o;

    public d5(r45.jt4 dramaInfo) {
        r45.it4 it4Var;
        kotlin.jvm.internal.o.g(dramaInfo, "dramaInfo");
        this.f107792d = dramaInfo;
        r45.uj2 uj2Var = (r45.uj2) dramaInfo.getCustom(1);
        this.f107793e = uj2Var != null ? uj2Var.getLong(0) : 0L;
        r45.uj2 uj2Var2 = (r45.uj2) dramaInfo.getCustom(1);
        this.f107794f = uj2Var2 != null ? uj2Var2.getString(3) : null;
        r45.uj2 uj2Var3 = (r45.uj2) dramaInfo.getCustom(1);
        this.f107795g = uj2Var3 != null ? uj2Var3.getString(2) : null;
        r45.uj2 uj2Var4 = (r45.uj2) dramaInfo.getCustom(1);
        this.f107796h = uj2Var4 != null ? uj2Var4.getString(4) : null;
        r45.uj2 uj2Var5 = (r45.uj2) dramaInfo.getCustom(1);
        if (uj2Var5 != null) {
            uj2Var5.getString(5);
        }
        r45.uj2 uj2Var6 = (r45.uj2) dramaInfo.getCustom(1);
        this.f107797i = uj2Var6 != null ? java.lang.Integer.valueOf(uj2Var6.getInteger(6)) : null;
        r45.uj2 uj2Var7 = (r45.uj2) dramaInfo.getCustom(1);
        this.f107798m = uj2Var7 != null ? uj2Var7.getString(7) : null;
        r45.uj2 uj2Var8 = (r45.uj2) dramaInfo.getCustom(1);
        this.f107799n = (uj2Var8 == null || (it4Var = (r45.it4) uj2Var8.getCustom(13)) == null) ? null : java.lang.Long.valueOf(it4Var.getLong(0));
        r45.uj2 uj2Var9 = (r45.uj2) dramaInfo.getCustom(1);
        this.f107800o = uj2Var9 != null ? uj2Var9.getString(9) : null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        if (!(obj instanceof com.tencent.mm.plugin.finder.feed.model.d5)) {
            return -1;
        }
        r45.uj2 uj2Var = (r45.uj2) ((com.tencent.mm.plugin.finder.feed.model.d5) obj).f107792d.getCustom(1);
        java.lang.Long valueOf = uj2Var != null ? java.lang.Long.valueOf(uj2Var.getLong(0)) : null;
        r45.uj2 uj2Var2 = (r45.uj2) this.f107792d.getCustom(1);
        return kotlin.jvm.internal.o.b(valueOf, uj2Var2 != null ? java.lang.Long.valueOf(uj2Var2.getLong(0)) : null) ? 0 : -1;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f107793e;
    }

    @Override // in5.c
    public int h() {
        return com.tencent.mm.plugin.finder.feed.model.d5.class.hashCode();
    }
}
