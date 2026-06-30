package aw2;

/* loaded from: classes10.dex */
public final class y implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aw2.c0 f96352a;

    public y(aw2.c0 c0Var) {
        this.f96352a = c0Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[4];
        aw2.c0 c0Var = this.f96352a;
        boolean z17 = c0Var.f96266p;
        lVarArr[0] = new jz5.l("highlight_topic_name", z17 ? c0Var.f96265o : null);
        java.lang.String str2 = z17 ? c0Var.f96265o : null;
        lVarArr[1] = new jz5.l("shoot_together_state", java.lang.Integer.valueOf(str2 == null || str2.length() == 0 ? 1 : 2));
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
        lVarArr[2] = new jz5.l("finder_post_sessionid", c19783xd9a946b7 != null ? c19783xd9a946b7.m76327x23a7af9b() : null);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b72 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
        lVarArr[3] = new jz5.l("enter_scene", c19783xd9a946b72 != null ? java.lang.Integer.valueOf(c19783xd9a946b72.m76275xbcc8608a()) : null);
        return kz5.c1.k(lVarArr);
    }
}
