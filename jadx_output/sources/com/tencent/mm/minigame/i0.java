package com.tencent.mm.minigame;

/* loaded from: classes7.dex */
public final class i0 implements com.tencent.mm.app.h4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f69079d;

    public i0(com.tencent.mm.vfs.r6 r6Var) {
        this.f69079d = r6Var;
    }

    @Override // com.tencent.mm.app.h4
    public void a(java.lang.Thread crashThread, java.lang.String str, java.lang.Throwable thr) {
        kotlin.jvm.internal.o.g(crashThread, "crashThread");
        kotlin.jvm.internal.o.g(thr, "thr");
        com.tencent.mm.minigame.j0.a(com.tencent.mm.minigame.j0.f69083a, this.f69079d);
    }

    @Override // com.tencent.mm.app.h4
    public void e(int i17, java.lang.String str) {
        com.tencent.mm.minigame.j0.a(com.tencent.mm.minigame.j0.f69083a, this.f69079d);
    }
}
