package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes5.dex */
public final class g1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f92597d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f92598e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f92599f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f92600g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f92601h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f92602i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f92603m;

    /* renamed from: n, reason: collision with root package name */
    public long f92604n;

    /* renamed from: o, reason: collision with root package name */
    public long f92605o;

    /* renamed from: p, reason: collision with root package name */
    public int f92606p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f92607q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.p1 f92608r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f92609s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f92610t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f92611u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f92612v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(com.tencent.mm.plugin.backup.roambackup.p1 p1Var, java.lang.String str, long j17, long j18, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f92608r = p1Var;
        this.f92609s = str;
        this.f92610t = j17;
        this.f92611u = j18;
        this.f92612v = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.backup.roambackup.g1 g1Var = new com.tencent.mm.plugin.backup.roambackup.g1(this.f92608r, this.f92609s, this.f92610t, this.f92611u, this.f92612v, continuation);
        g1Var.f92607q = obj;
        return g1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.backup.roambackup.g1) create((kotlinx.coroutines.flow.k) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x018c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01a0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x00ea -> B:8:0x0196). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x018a -> B:7:0x018d). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.backup.roambackup.g1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
