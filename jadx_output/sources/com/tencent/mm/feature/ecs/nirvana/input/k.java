package com.tencent.mm.feature.ecs.nirvana.input;

/* loaded from: classes15.dex */
public class k implements com.tencent.mm.feature.ecs.nirvana.input.m {

    /* renamed from: a, reason: collision with root package name */
    public boolean f65777a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.nirvana.input.l f65778b;

    public k(com.tencent.mm.feature.ecs.nirvana.input.l lVar, com.tencent.mm.feature.ecs.nirvana.input.i iVar) {
        this.f65778b = lVar;
    }

    public void a(boolean z17) {
        if (this.f65777a) {
            throw new java.lang.IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
        }
        this.f65777a = true;
        com.tencent.mm.feature.ecs.nirvana.input.l lVar = this.f65778b;
        int i17 = lVar.f65780b - 1;
        lVar.f65780b = i17;
        boolean z18 = z17 | lVar.f65781c;
        lVar.f65781c = z18;
        if (i17 != 0 || z18) {
            return;
        }
        lVar.f65782d.a(lVar.f65779a);
    }
}
