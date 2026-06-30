package df2;

/* loaded from: classes3.dex */
public final class rt implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f312799a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f312800b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f312801c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.wt f312802d;

    public rt(int i17, r45.h32 h32Var, java.lang.String str, df2.wt wtVar) {
        this.f312799a = i17;
        this.f312800b = h32Var;
        this.f312801c = str;
        this.f312802d = wtVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cgiBack: errCode=");
        sb6.append(fVar.f152149b);
        sb6.append(", errType=");
        sb6.append(fVar.f152148a);
        sb6.append(", opType=");
        int i17 = this.f312799a;
        sb6.append(i17);
        sb6.append(", noticeId=");
        r45.h32 h32Var = this.f312800b;
        sb6.append(h32Var.m75945x2fec8307(4));
        sb6.append(", anchorUsername=");
        java.lang.String str = this.f312801c;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveReserveNoticeGuideController", sb6.toString());
        int i18 = fVar.f152149b;
        df2.wt wtVar = this.f312802d;
        if (i18 != 0 || fVar.f152148a != 0) {
            db5.t7.m123882x26a183b(wtVar.O6(), com.p314xaae8f345.mm.R.C30867xcad56011.f81514xe34e69a8, 0).show();
            return jz5.f0.f384359a;
        }
        h32Var.set(1, java.lang.Integer.valueOf(i17 == 1 ? 0 : 1));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1 i1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1.f189463a;
        java.lang.String m75945x2fec8307 = h32Var.m75945x2fec8307(4);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        r45.h32 e17 = i1Var.e(str, m75945x2fec8307);
        if (e17 != null) {
            e17.set(1, java.lang.Integer.valueOf(h32Var.m75939xb282bd08(1)));
        } else {
            java.lang.String m75945x2fec83072 = h32Var.m75945x2fec8307(4);
            if (m75945x2fec83072 != null) {
                i1Var.a(str, m75945x2fec83072, h32Var);
            }
        }
        if (i17 == 1) {
            wtVar.p7(true);
            android.content.Context O6 = wtVar.O6();
            int i19 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(O6);
            e4Var.f293309c = wtVar.O6().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e0j);
            return e4Var.c();
        }
        wtVar.p7(false);
        android.content.Context O62 = wtVar.O6();
        int i27 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(O62);
        e4Var2.b(com.p314xaae8f345.mm.R.raw.f80084xebd378da);
        e4Var2.f293309c = wtVar.O6().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mo8);
        return e4Var2.c();
    }
}
