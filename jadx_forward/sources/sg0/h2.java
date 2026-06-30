package sg0;

/* loaded from: classes.dex */
public final class h2 implements su4.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f489254a = jz5.h.b(sg0.g2.f489249d);

    public java.util.List a(java.lang.String query, long j17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        java.util.ArrayList<dv4.p> arrayList = new java.util.ArrayList(((dv4.q) ((dv4.f) ((dv4.k) ((jz5.n) this.f489254a).mo141623x754a37bb())).b(query, j17, i17)).f325567c);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        for (dv4.p pVar : arrayList) {
            java.lang.String userName = pVar.f325561a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(userName, "userName");
            java.lang.String matchWord = pVar.f325562b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(matchWord, "matchWord");
            java.lang.String nickName = pVar.f325563c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(nickName, "nickName");
            java.lang.String remark = pVar.f325564d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(remark, "remark");
            java.lang.String alias = pVar.f325565e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(alias, "alias");
            java.lang.String desc = pVar.f325566f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(desc, "desc");
            arrayList2.add(new su4.r0(userName, matchWord, nickName, remark, alias, desc));
        }
        return arrayList2;
    }
}
