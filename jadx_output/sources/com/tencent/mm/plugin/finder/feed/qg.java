package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes3.dex */
public final class qg implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f108819a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.v71 f108820b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f108821c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f108822d;

    public qg(zy2.i5 i5Var, r45.v71 v71Var, zy2.i5 i5Var2, com.tencent.mm.ui.MMActivity mMActivity) {
        this.f108819a = i5Var;
        this.f108820b = v71Var;
        this.f108821c = i5Var2;
        this.f108822d = mMActivity;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70616b;
        r45.v71 v71Var = this.f108820b;
        if (i17 == 0 && fVar.f70615a == 0) {
            r45.m70 m70Var = (r45.m70) ((r45.o62) fVar.f70618d).getCustom(1);
            if (m70Var != null) {
                pm0.v.X(new com.tencent.mm.plugin.finder.feed.pg(this.f108822d, m70Var, v71Var));
                this.f108819a.a(java.lang.Integer.valueOf(com.tencent.mm.plugin.finder.feed.jh.f107104d));
            }
        } else {
            r45.h32 h32Var = (r45.h32) v71Var.getCustom(1);
            boolean z17 = h32Var != null && h32Var.getInteger(7) == 1;
            zy2.i5 i5Var = this.f108821c;
            if (!z17) {
                r45.h32 h32Var2 = (r45.h32) v71Var.getCustom(1);
                if (!(h32Var2 != null && h32Var2.getInteger(7) == 3)) {
                    com.tencent.mm.plugin.finder.feed.jh.f107104d = 0;
                    i5Var.a(java.lang.Integer.valueOf(com.tencent.mm.plugin.finder.feed.jh.f107104d));
                }
            }
            com.tencent.mm.plugin.finder.feed.jh jhVar = com.tencent.mm.plugin.finder.feed.jh.f107101a;
            r45.h32 h32Var3 = (r45.h32) v71Var.getCustom(1);
            int i18 = h32Var3 != null && h32Var3.getInteger(7) == 1 ? 3 : 10;
            com.tencent.mm.plugin.finder.feed.jh.f107104d = i18;
            i5Var.a(java.lang.Integer.valueOf(i18));
            i5Var.a(java.lang.Integer.valueOf(com.tencent.mm.plugin.finder.feed.jh.f107104d));
        }
        return jz5.f0.f302826a;
    }
}
