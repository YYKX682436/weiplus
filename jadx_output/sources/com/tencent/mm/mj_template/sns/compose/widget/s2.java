package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public final class s2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f70222d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f70223e;

    /* renamed from: f, reason: collision with root package name */
    public int f70224f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.t2 f70225g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.k96 f70226h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(com.tencent.mm.mj_template.sns.compose.widget.t2 t2Var, r45.k96 k96Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f70225g = t2Var;
        this.f70226h = k96Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.mj_template.sns.compose.widget.s2(this.f70225g, this.f70226h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.mj_template.sns.compose.widget.s2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        gz0.h hVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f70224f;
        com.tencent.mm.mj_template.sns.compose.widget.t2 t2Var = this.f70225g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gz0.h hVar2 = t2Var.f70245r;
            if (hVar2 != null) {
                this.f70224f = 1;
                if (hVar2.d(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t2Var = (com.tencent.mm.mj_template.sns.compose.widget.t2) this.f70223e;
                hVar = (gz0.h) this.f70222d;
                kotlin.ResultKt.throwOnFailure(obj);
                t2Var.f70245r = hVar;
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.String music_url = this.f70226h.f378518e;
        kotlin.jvm.internal.o.f(music_url, "music_url");
        gz0.h hVar3 = new gz0.h(music_url, r1.f378519f, 0L, 4, null);
        yz5.p pVar = t2Var.f70236f;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        pVar.invoke(bool, bool);
        this.f70222d = hVar3;
        this.f70223e = t2Var;
        this.f70224f = 2;
        if (hVar3.c(this) == aVar) {
            return aVar;
        }
        hVar = hVar3;
        t2Var.f70245r = hVar;
        return jz5.f0.f302826a;
    }
}
