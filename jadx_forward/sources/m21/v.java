package m21;

/* loaded from: classes4.dex */
public class v implements m21.u {

    /* renamed from: a, reason: collision with root package name */
    public r45.km6 f404534a = new r45.km6();

    public static java.lang.String b(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720) {
        r45.a90 a90Var;
        java.util.LinkedList linkedList;
        java.lang.String str = null;
        r45.jj4 jj4Var = (c19807x593d1720 == null || (a90Var = c19807x593d1720.f39014x86965dde) == null || (linkedList = a90Var.f451373h) == null || linkedList.size() <= 0) ? null : (r45.jj4) c19807x593d1720.f39014x86965dde.f451373h.get(0);
        if (jj4Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jj4Var.f459391g)) {
            str = jj4Var.f459391g;
        }
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || str.startsWith("http")) ? str : "";
    }

    @Override // m21.u
    public java.lang.String a() {
        qk.i9 i9Var = (qk.i9) i95.n0.c(qk.i9.class);
        r45.km6 shareObj = this.f404534a;
        ((ef0.l4) i9Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareObj, "shareObj");
        return cl4.g.a(shareObj);
    }
}
