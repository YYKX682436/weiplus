package com.tencent.mm.feature.finder.live;

/* loaded from: classes3.dex */
public final class t4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f66933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.zc4 f66934e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f66935f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finder.live.v4 f66936g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f66937h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(r45.zc4 zc4Var, androidx.appcompat.app.AppCompatActivity appCompatActivity, com.tencent.mm.feature.finder.live.v4 v4Var, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f66934e = zc4Var;
        this.f66935f = appCompatActivity;
        this.f66936g = v4Var;
        this.f66937h = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.feature.finder.live.t4(this.f66934e, this.f66935f, this.f66936g, this.f66937h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.feature.finder.live.t4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006b  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.finder.live.t4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
