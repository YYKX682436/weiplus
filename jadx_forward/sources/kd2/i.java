package kd2;

/* loaded from: classes10.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kd2.q f388288d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(kd2.q qVar) {
        super(0);
        this.f388288d = qVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        kd2.q qVar = this.f388288d;
        qVar.f388324o = true;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.ui.C14446xd52a323f c14446xd52a323f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.ui.C14446xd52a323f(context);
        fo0.p pVar = new fo0.p(i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 8));
        c14446xd52a323f.setClipToOutline(true);
        c14446xd52a323f.setOutlineProvider(pVar);
        c14446xd52a323f.m58251x2ca9a96(new kd2.e(qVar));
        c14446xd52a323f.m58250xb0481459(new kd2.f(qVar));
        c14446xd52a323f.m58252xfd0ea2fc(new kd2.g(qVar));
        c14446xd52a323f.m58253xbdd7556e(new kd2.h(qVar));
        return c14446xd52a323f;
    }
}
