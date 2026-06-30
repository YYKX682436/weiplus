package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca;

/* loaded from: classes15.dex */
public class q extends android.view.inputmethod.BaseInputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.text.Editable f147319a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.s sVar, android.view.View view, boolean z17, android.text.Editable editable) {
        super(view, z17);
        this.f147319a = editable;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public android.text.Editable getEditable() {
        return this.f147319a;
    }
}
