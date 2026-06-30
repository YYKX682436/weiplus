package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca;

/* loaded from: classes7.dex */
public class z implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.c0 f147341d;

    public z(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.c0 c0Var) {
        this.f147341d = c0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public void w2(int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TextInputPlugin", "onKeyboardHeightChanged %d", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.w wVar = this.f147341d.f147268d;
        wVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TextInputMethodDispatcher", "onKeyboardHeightChanged");
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.t tVar = wVar.f147335b;
        if (tVar != null) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.u) tVar).a("TextInputClient.onKeyboardHeightChangedEvent", kz5.b0.c(java.lang.Integer.valueOf(i17)));
        }
    }
}
