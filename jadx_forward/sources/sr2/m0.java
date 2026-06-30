package sr2;

/* loaded from: classes2.dex */
public final class m0 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sr2.w0 f493165a;

    public m0(sr2.w0 w0Var) {
        this.f493165a = w0Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String str2;
        jz5.l[] lVarArr = new jz5.l[6];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
        sr2.w0 w0Var = this.f493165a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e17 = iyVar.e(w0Var.m158354x19263085());
        lVarArr[0] = new jz5.l("behaviour_session_id", e17 != null ? e17.f216918q : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e18 = iyVar.e(w0Var.m158354x19263085());
        lVarArr[1] = new jz5.l("finder_context_id", e18 != null ? e18.f216915p : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e19 = iyVar.e(w0Var.m158354x19263085());
        lVarArr[2] = new jz5.l("finder_tab_context_id", e19 != null ? e19.f216919r : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e27 = iyVar.e(w0Var.m158354x19263085());
        lVarArr[3] = new jz5.l("comment_scene", e27 != null ? java.lang.Integer.valueOf(e27.f216913n) : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
        if (c19783xd9a946b7 == null || (str2 = c19783xd9a946b7.m76327x23a7af9b()) == null) {
            str2 = "";
        }
        lVarArr[4] = new jz5.l("finder_post_sessionid", str2);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b72 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
        lVarArr[5] = new jz5.l("enter_scene", java.lang.Integer.valueOf(c19783xd9a946b72 != null ? c19783xd9a946b72.m76275xbcc8608a() : 0));
        return kz5.c1.k(lVarArr);
    }
}
