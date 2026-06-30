package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lio/flutter/embedding/engine/FlutterEngine;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: io.flutter.embedding.engine.MMFlutterEngineGroup$createAndRunEngineAsync$spawnEngine$1 */
/* loaded from: classes11.dex */
public final class C28599x4662bcad extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: $automaticallyRegisterPlugins */
    final /* synthetic */ boolean f70994xa483137e;

    /* renamed from: $context */
    final /* synthetic */ android.content.Context f70995xd461850b;

    /* renamed from: $dartEntrypoint */
    final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f70996x247a6e61;

    /* renamed from: $dartEntrypointArgs */
    final /* synthetic */ java.util.List<java.lang.String> f70997x6b099ade;

    /* renamed from: $initialRoute */
    final /* synthetic */ pi0.m1 f70998x714b3f89;

    /* renamed from: $options */
    final /* synthetic */ io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28591xc5594961.Options f70999x5130d5fa;

    /* renamed from: this$0 */
    final /* synthetic */ io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28591xc5594961 f71000xcbdd23aa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28599x4662bcad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28591xc5594961 c28591xc5594961, android.content.Context context, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, pi0.m1 m1Var, java.util.List<java.lang.String> list, boolean z17, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28591xc5594961.Options options) {
        super(0);
        this.f71000xcbdd23aa = c28591xc5594961;
        this.f70995xd461850b = context;
        this.f70996x247a6e61 = h0Var;
        this.f70998x714b3f89 = m1Var;
        this.f70997x6b099ade = list;
        this.f70994xa483137e = z17;
        this.f70999x5130d5fa = options;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e mo152xb9724478() {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e = this.f71000xcbdd23aa.m137789x177a50d5().get(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c28580x69eec95e);
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e2 = c28580x69eec95e;
        android.content.Context context = this.f70995xd461850b;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint dartEntrypoint = (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint) this.f70996x247a6e61.f391656d;
        pi0.m1 m1Var = this.f70998x714b3f89;
        java.lang.String a17 = m1Var != null ? m1Var.a() : null;
        if (a17 == null) {
            a17 = "";
        }
        return c28580x69eec95e2.m137461x688f37b(context, dartEntrypoint, a17, this.f70997x6b099ade, new io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97(), this.f70994xa483137e, false, this.f70999x5130d5fa.getShareIsolateMode(), this.f70999x5130d5fa.getAutoRunEngine());
    }
}
