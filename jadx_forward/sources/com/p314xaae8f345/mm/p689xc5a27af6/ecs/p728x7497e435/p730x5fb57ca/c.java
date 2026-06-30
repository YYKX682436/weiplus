package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca;

/* loaded from: classes14.dex */
public class c implements android.view.View.OnApplyWindowInsetsListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.C10536x56760921 f147264d;

    public c(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.C10536x56760921 c10536x56760921, com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.b bVar) {
        this.f147264d = c10536x56760921;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.C10536x56760921 c10536x56760921 = this.f147264d;
        c10536x56760921.f28830x373aa5 = view;
        if (c10536x56760921.f28829x413429ba) {
            c10536x56760921.f28828x75a18cbc = windowInsets;
            c10536x56760921.f28829x413429ba = false;
        }
        return c10536x56760921.f28824x42ab1b5e ? android.view.WindowInsets.CONSUMED : view.onApplyWindowInsets(windowInsets);
    }
}
