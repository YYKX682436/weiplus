package com.tencent.mm.feature.ecs.nirvana.input;

/* loaded from: classes15.dex */
public class q extends android.view.inputmethod.BaseInputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.text.Editable f65786a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.feature.ecs.nirvana.input.s sVar, android.view.View view, boolean z17, android.text.Editable editable) {
        super(view, z17);
        this.f65786a = editable;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public android.text.Editable getEditable() {
        return this.f65786a;
    }
}
