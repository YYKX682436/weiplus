package yn2;

/* loaded from: classes2.dex */
public final class s implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yn2.u f545542a;

    public s(yn2.u uVar) {
        this.f545542a = uVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String str2;
        jz5.l[] lVarArr = new jz5.l[2];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.e eVar = this.f545542a.f545545e;
        if (eVar == null || (str2 = ((xn2.p0) eVar).f537077b) == null) {
            str2 = "";
        }
        lVarArr[0] = new jz5.l("finder_context_id", str2);
        lVarArr[1] = new jz5.l("comment_scene", 281);
        return kz5.c1.k(lVarArr);
    }
}
