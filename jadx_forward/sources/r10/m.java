package r10;

/* loaded from: classes9.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.x7 f450116d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(bw5.x7 x7Var) {
        super(3);
        this.f450116d = x7Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        y02.h0 service = (y02.h0) obj;
        pq.a context = (pq.a) obj2;
        yz5.l doneCallback = (yz5.l) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(doneCallback, "doneCallback");
        y02.d0 c17 = r10.j.c(context);
        bw5.x7 jumpInfo = this.f450116d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        byte[] mo14344x5f01b1f6 = jumpInfo.mo14344x5f01b1f6();
        y02.o1 o1Var = new y02.o1();
        o1Var.f540154g = doneCallback;
        long m105978x2737f10 = ((y02.j0) service).m105978x2737f10();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo14344x5f01b1f6);
        p3380x6a61f93.p3387xf51c6630.C30621x21b27191.m170325x21b35e34(m105978x2737f10, mo14344x5f01b1f6, c17, o1Var);
        return jz5.f0.f384359a;
    }
}
