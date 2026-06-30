package du3;

/* loaded from: classes.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.q f325201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f f325202e;

    public o(du3.q qVar, com.p314xaae8f345.mm.p944x882e457a.f fVar) {
        this.f325201d = qVar;
        this.f325202e = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        du3.q qVar = this.f325201d;
        qVar.f325214f.clear();
        java.util.ArrayList arrayList = qVar.f325214f;
        java.util.LinkedList<r45.y6> m75941xfb821914 = ((r45.pg7) ((r45.z86) this.f325202e.f152151d).m75936x14adae67(1)).m75941xfb821914(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getAiImgEditTags(...)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
        for (r45.y6 y6Var : m75941xfb821914) {
            du3.a aVar = du3.b.f325046e;
            java.lang.String m75945x2fec8307 = y6Var.m75945x2fec8307(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75945x2fec8307, "getId(...)");
            java.lang.String m75945x2fec83072 = y6Var.m75945x2fec8307(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75945x2fec83072, "getTagName(...)");
            java.lang.String m75945x2fec83073 = y6Var.m75945x2fec8307(2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75945x2fec83073, "getHostUrl(...)");
            arrayList2.add(new du3.b(du3.b.f325052k, m75945x2fec8307, m75945x2fec83072, m75945x2fec83073));
        }
        arrayList.addAll(arrayList2);
        arrayList.add(du3.b.f325046e.b());
        qVar.m8146xced61ae5();
    }
}
