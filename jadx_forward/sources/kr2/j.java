package kr2;

/* loaded from: classes2.dex */
public final class j implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23893x7d8d59f8 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f392844d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23890x9b353789 f392845e;

    public j(java.lang.ref.WeakReference delegate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        this.f392844d = delegate;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23893x7d8d59f8.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23893x7d8d59f8.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23893x7d8d59f8.Companion.m88522x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
        this.f392845e = new com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23890x9b353789(m137983x3b5b91dc2, null, 2, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23893x7d8d59f8
    /* renamed from: onClickNPS */
    public void mo88519xdb213f48(byte[] questionBuffer, byte[] answerBuffer, java.lang.String inputText, java.util.List mutliAnswerIDs) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(questionBuffer, "questionBuffer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(answerBuffer, "answerBuffer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputText, "inputText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mutliAnswerIDs, "mutliAnswerIDs");
        com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new r45.zk2().mo11468x92b714fd(questionBuffer);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderNpsSurveyQuestion");
        r45.zk2 zk2Var = (r45.zk2) mo11468x92b714fd;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd2 = new r45.xk2().mo11468x92b714fd(answerBuffer);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderNpsSurveyAnswer");
        r45.xk2 xk2Var = (r45.xk2) mo11468x92b714fd2;
        kr2.k kVar = (kr2.k) this.f392844d.get();
        if (kVar != null) {
            kVar.T(zk2Var, xk2Var, inputText, mutliAnswerIDs);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23893x7d8d59f8
    /* renamed from: onCloseNPS */
    public void mo88520xe63d10d8() {
        kr2.k kVar = (kr2.k) this.f392844d.get();
        if (kVar != null) {
            kVar.mo62280xe63d10d8();
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23893x7d8d59f8.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23893x7d8d59f8.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23893x7d8d59f8.Companion.m88522x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        this.f392845e = null;
    }
}
