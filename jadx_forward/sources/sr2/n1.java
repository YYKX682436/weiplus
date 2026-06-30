package sr2;

/* loaded from: classes2.dex */
public final class n1 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sr2.o1 f493175a;

    public n1(sr2.o1 o1Var) {
        this.f493175a = o1Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        android.widget.TextView textView;
        jz5.l[] lVarArr = new jz5.l[3];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
        java.lang.String str4 = "";
        if (c19783xd9a946b7 == null || (str2 = c19783xd9a946b7.m76327x23a7af9b()) == null) {
            str2 = "";
        }
        jz5.l lVar = new jz5.l("finder_post_sessionid", str2);
        boolean z17 = false;
        lVarArr[0] = lVar;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b72 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
        lVarArr[1] = new jz5.l("enter_scene", c19783xd9a946b72 != null ? java.lang.Integer.valueOf(c19783xd9a946b72.m76275xbcc8608a()) : "");
        sr2.o1 o1Var = this.f493175a;
        android.view.View view = o1Var.f493186d;
        if (view != null && (textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f568959vi4)) != null && textView.getVisibility() == 0) {
            z17 = true;
        }
        if (z17 && (str3 = o1Var.f493194o) != null) {
            str4 = str3;
        }
        lVarArr[2] = new jz5.l("cover_link_title", str4);
        return kz5.c1.l(lVarArr);
    }
}
