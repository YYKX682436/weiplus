package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes11.dex */
public final class l1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f92637d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f92638e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f92639f;

    /* renamed from: g, reason: collision with root package name */
    public int f92640g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.p1 f92641h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f92642i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f92643m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(com.tencent.mm.plugin.backup.roambackup.p1 p1Var, java.util.Map map, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f92641h = p1Var;
        this.f92642i = map;
        this.f92643m = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.backup.roambackup.l1(this.f92641h, this.f92642i, this.f92643m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.backup.roambackup.l1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x010b  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.backup.roambackup.l1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
