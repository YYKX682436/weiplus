package df2;

/* loaded from: classes3.dex */
public final class ot extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df2.pt f312538b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ot(df2.pt ptVar, java.lang.Class cls) {
        super(cls);
        this.f312538b = ptVar;
    }

    @Override // dk2.cb
    public void b(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        r45.wc2 result = (r45.wc2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        java.util.LinkedList m75941xfb821914 = result.m75941xfb821914(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getReddot_infos(...)");
        java.util.Iterator it = m75941xfb821914.iterator();
        while (it.hasNext()) {
            r45.vs2 vs2Var = (r45.vs2) ((r45.hq1) it.next()).m75936x14adae67(0);
            if (vs2Var != null) {
                java.lang.String str = this.f312538b.f312643m;
                java.util.LinkedList show_infos = vs2Var.f470022g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(show_infos, "show_infos");
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(show_infos, 10));
                java.util.Iterator it6 = show_infos.iterator();
                while (it6.hasNext()) {
                    arrayList.add(((r45.f03) it6.next()).f455425i);
                }
                arrayList.toString();
                zy2.fa.D(((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk(), vs2Var, "FinderLiveSync", null, true, null, 20, null);
            }
        }
    }
}
