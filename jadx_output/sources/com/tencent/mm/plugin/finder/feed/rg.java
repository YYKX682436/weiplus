package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes3.dex */
public final class rg implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f108908a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.v71 f108909b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f108910c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f108911d;

    public rg(com.tencent.mm.ui.MMActivity mMActivity, r45.v71 v71Var, zy2.i5 i5Var, zy2.i5 i5Var2) {
        this.f108908a = mMActivity;
        this.f108909b = v71Var;
        this.f108910c = i5Var;
        this.f108911d = i5Var2;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.String string;
        java.lang.String string2;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70616b;
        zy2.i5 i5Var = this.f108910c;
        r45.v71 v71Var = this.f108909b;
        boolean z17 = false;
        if (i17 == 0 && fVar.f70615a == 0) {
            r45.m70 m70Var = (r45.m70) ((r45.zr1) fVar.f70618d).getCustom(1);
            if (m70Var != null && !m70Var.getBoolean(6)) {
                z17 = true;
            }
            com.tencent.mm.ui.MMActivity mMActivity = this.f108908a;
            if (z17) {
                db5.t7.m(mMActivity, mMActivity.getString(com.tencent.mm.R.string.e0o));
            }
            r45.h32 h32Var = (r45.h32) v71Var.getCustom(1);
            java.lang.String str = (h32Var == null || (string2 = h32Var.getString(8)) == null) ? "" : string2;
            r45.h32 h32Var2 = (r45.h32) v71Var.getCustom(1);
            pq5.g l17 = new db2.b2(str, null, null, 0L, 0L, (h32Var2 == null || (string = h32Var2.getString(4)) == null) ? "" : string, 1, false, 30, null).l();
            l17.K(new com.tencent.mm.plugin.finder.feed.qg(this.f108911d, v71Var, i5Var, mMActivity));
            l17.f(mMActivity);
            return l17;
        }
        r45.h32 h32Var3 = (r45.h32) v71Var.getCustom(1);
        if (!(h32Var3 != null && h32Var3.getInteger(7) == 1)) {
            r45.h32 h32Var4 = (r45.h32) v71Var.getCustom(1);
            if (!(h32Var4 != null && h32Var4.getInteger(7) == 3)) {
                com.tencent.mm.plugin.finder.feed.jh.f107104d = 0;
                i5Var.a(java.lang.Integer.valueOf(com.tencent.mm.plugin.finder.feed.jh.f107104d));
                return jz5.f0.f302826a;
            }
        }
        com.tencent.mm.plugin.finder.feed.jh jhVar = com.tencent.mm.plugin.finder.feed.jh.f107101a;
        r45.h32 h32Var5 = (r45.h32) v71Var.getCustom(1);
        if (h32Var5 != null && h32Var5.getInteger(7) == 1) {
            z17 = true;
        }
        int i18 = z17 ? 3 : 10;
        com.tencent.mm.plugin.finder.feed.jh.f107104d = i18;
        i5Var.a(java.lang.Integer.valueOf(i18));
        i5Var.a(java.lang.Integer.valueOf(com.tencent.mm.plugin.finder.feed.jh.f107104d));
        return jz5.f0.f302826a;
    }
}
