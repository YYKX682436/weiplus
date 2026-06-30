package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca;

/* loaded from: classes15.dex */
public class k implements com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.m {

    /* renamed from: a, reason: collision with root package name */
    public boolean f147310a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.l f147311b;

    public k(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.l lVar, com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.i iVar) {
        this.f147311b = lVar;
    }

    public void a(boolean z17) {
        if (this.f147310a) {
            throw new java.lang.IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
        }
        this.f147310a = true;
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.l lVar = this.f147311b;
        int i17 = lVar.f147313b - 1;
        lVar.f147313b = i17;
        boolean z18 = z17 | lVar.f147314c;
        lVar.f147314c = z18;
        if (i17 != 0 || z18) {
            return;
        }
        lVar.f147315d.a(lVar.f147312a);
    }
}
