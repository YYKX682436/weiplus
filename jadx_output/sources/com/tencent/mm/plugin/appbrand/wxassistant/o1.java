package com.tencent.mm.plugin.appbrand.wxassistant;

/* loaded from: classes4.dex */
public final class o1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f92251d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f92252e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f92253f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f92254g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f92255h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f92256i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f92257m;

    /* renamed from: n, reason: collision with root package name */
    public int f92258n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.util.List f92259o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f92260p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.wxassistant.x1 f92261q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f92262r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f92263s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r45.w3 f92264t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(java.util.List list, java.lang.String str, com.tencent.mm.plugin.appbrand.wxassistant.x1 x1Var, java.lang.String str2, java.lang.String str3, r45.w3 w3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f92259o = list;
        this.f92260p = str;
        this.f92261q = x1Var;
        this.f92262r = str2;
        this.f92263s = str3;
        this.f92264t = w3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.wxassistant.o1(this.f92259o, this.f92260p, this.f92261q, this.f92262r, this.f92263s, this.f92264t, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.wxassistant.o1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bc A[Catch: Exception -> 0x00b3, TRY_LEAVE, TryCatch #3 {Exception -> 0x00b3, blocks: (B:9:0x00a7, B:31:0x0086, B:12:0x00bc), top: B:8:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00a3 -> B:8:0x00a7). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.wxassistant.o1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
