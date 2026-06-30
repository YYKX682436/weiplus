package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes8.dex */
public final class k6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f102316d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f102317e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.kv2 f102318f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f102319g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f102320h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f102321i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f102322m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f102323n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f102324o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f102325p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f102326q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(com.tencent.mm.plugin.finder.storage.FinderItem finderItem, r45.kv2 kv2Var, androidx.appcompat.app.AppCompatActivity appCompatActivity, boolean z17, yz5.l lVar, yz5.l lVar2, boolean z18, boolean z19, int i17, r45.qt2 qt2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f102317e = finderItem;
        this.f102318f = kv2Var;
        this.f102319g = appCompatActivity;
        this.f102320h = z17;
        this.f102321i = lVar;
        this.f102322m = lVar2;
        this.f102323n = z18;
        this.f102324o = z19;
        this.f102325p = i17;
        this.f102326q = qt2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.assist.k6(this.f102317e, this.f102318f, this.f102319g, this.f102320h, this.f102321i, this.f102322m, this.f102323n, this.f102324o, this.f102325p, this.f102326q, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.assist.k6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0107, code lost:
    
        if (r2 != 5) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0089  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.assist.k6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
