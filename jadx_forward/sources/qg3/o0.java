package qg3;

/* loaded from: classes2.dex */
public final class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f444370d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f444371e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f444372f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f444373g;

    public o0(byte[] bArr, byte[] bArr2, byte[] bArr3, int i17, yz5.l lVar) {
        this.f444370d = bArr;
        this.f444371e = bArr2;
        this.f444372f = bArr3;
        this.f444373g = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] finderObject = this.f444370d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
        byte[] lastBuffer = this.f444371e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lastBuffer, "lastBuffer");
        byte[] relatedListLastBuffer = this.f444372f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(relatedListLastBuffer, "relatedListLastBuffer");
        yz5.l callback = this.f444373g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        try {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725().mo11468x92b714fd(finderObject);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderObject");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) mo11468x92b714fd;
            jz5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.ea.f189366d;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.ea) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.ea.f189368f).mo141623x754a37bb()).a(c19792x256d2725.m76784x5db1b11(), c19792x256d2725.m76803x6c285d75(), null, pm0.b0.h(lastBuffer), pm0.b0.h(relatedListLastBuffer), new qg3.p0(callback, c19792x256d2725));
        } catch (java.lang.Exception unused) {
            byte[] mo14344x5f01b1f6 = new bw5.kd0().mo14344x5f01b1f6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
            callback.mo146xb9724478(mo14344x5f01b1f6);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NativeCgiJavaStatic", "fetchContinuePlayNextFeed but finderObject invalid");
        }
    }
}
