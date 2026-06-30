package com.tencent.mm.feature.ecs.nirvana.input;

/* loaded from: classes7.dex */
public class z implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.nirvana.input.c0 f65808d;

    public z(com.tencent.mm.feature.ecs.nirvana.input.c0 c0Var) {
        this.f65808d = c0Var;
    }

    @Override // com.tencent.mm.ui.tools.c5
    public void w2(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("TextInputPlugin", "onKeyboardHeightChanged %d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.feature.ecs.nirvana.input.w wVar = this.f65808d.f65735d;
        wVar.getClass();
        com.tencent.mars.xlog.Log.i("TextInputMethodDispatcher", "onKeyboardHeightChanged");
        com.tencent.mm.feature.ecs.nirvana.input.t tVar = wVar.f65802b;
        if (tVar != null) {
            ((com.tencent.mm.feature.ecs.nirvana.input.u) tVar).a("TextInputClient.onKeyboardHeightChangedEvent", kz5.b0.c(java.lang.Integer.valueOf(i17)));
        }
    }
}
