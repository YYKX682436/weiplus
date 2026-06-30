package com.tencent.mm.ipcinvoker.wx_extension;

/* loaded from: classes7.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final r45.mr5 f68420a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.js5 f68421b;

    /* renamed from: c, reason: collision with root package name */
    public r45.xw f68422c;

    public c(r45.mr5 request, r45.js5 response) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(response, "response");
        this.f68420a = request;
        this.f68421b = response;
    }

    public abstract int a();

    public abstract java.lang.String b();

    public abstract java.lang.String c();

    public java.lang.Object d(kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70666c = c();
        lVar.f70667d = a();
        lVar.f70664a = this.f68420a;
        lVar.f70665b = this.f68421b;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        im5.c cVar = new im5.c();
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).Ai(a17, new com.tencent.mm.ipcinvoker.wx_extension.a(this, rVar, cVar), cVar);
        rVar.m(new com.tencent.mm.ipcinvoker.wx_extension.b(cVar));
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }
}
