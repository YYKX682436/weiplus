package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes3.dex */
public final class gh extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f106840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.v71 f106841e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f106842f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f106843g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f106844h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f106845i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f106846m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh(com.tencent.mm.ui.MMActivity mMActivity, r45.v71 v71Var, java.lang.String str, java.lang.String str2, java.lang.String str3, zy2.i5 i5Var, zy2.i5 i5Var2) {
        super(0);
        this.f106840d = mMActivity;
        this.f106841e = v71Var;
        this.f106842f = str;
        this.f106843g = str2;
        this.f106844h = str3;
        this.f106845i = i5Var;
        this.f106846m = i5Var2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        java.lang.String username;
        com.tencent.mm.plugin.finder.feed.jh jhVar = com.tencent.mm.plugin.finder.feed.jh.f107101a;
        com.tencent.mm.ui.MMActivity mMActivity = this.f106840d;
        java.lang.String str = this.f106842f;
        java.lang.String str2 = this.f106843g;
        java.lang.String str3 = this.f106844h;
        zy2.i5 i5Var = this.f106845i;
        zy2.i5 i5Var2 = this.f106846m;
        r45.v71 v71Var = this.f106841e;
        r45.h32 h32Var = (r45.h32) v71Var.getCustom(1);
        if (h32Var != null) {
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) v71Var.getCustom(3);
            java.lang.String str4 = (finderContact == null || (username = finderContact.getUsername()) == null) ? "" : username;
            if (h32Var.getInteger(1) == 1) {
                com.tencent.mm.plugin.finder.feed.jh.f107104d = 5;
                i17 = 1;
            } else {
                com.tencent.mm.plugin.finder.feed.jh.f107104d = 8;
                i17 = 2;
            }
            if (i17 == 1) {
                jhVar.a(mMActivity, v71Var, i17, str, str2, str3, i5Var, i5Var2);
                ml2.i5 i5Var3 = ml2.i5.f327571f;
                r45.aa2 aa2Var = (r45.aa2) v71Var.getCustom(2);
                long j17 = aa2Var != null ? aa2Var.getLong(2) : 0L;
                r45.aa2 aa2Var2 = (r45.aa2) v71Var.getCustom(2);
                int i18 = ((aa2Var2 == null || aa2Var2.getInteger(3) != 2) ? 0 : 1) ^ 1;
                java.lang.String string = h32Var.getString(4);
                jhVar.d(i5Var3, str4, j17, i18, str, string == null ? "" : string, str2);
                com.tencent.mm.plugin.finder.feed.jh.f107104d = 6;
            } else {
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) mMActivity.getContext(), 1, true);
                k0Var.f211872n = new com.tencent.mm.plugin.finder.feed.yg(mMActivity);
                k0Var.f211881s = new com.tencent.mm.plugin.finder.feed.zg(mMActivity, v71Var, i17, str, str2, str3, i5Var, i5Var2, str4, h32Var);
                k0Var.v();
            }
        }
        return jz5.f0.f302826a;
    }
}
