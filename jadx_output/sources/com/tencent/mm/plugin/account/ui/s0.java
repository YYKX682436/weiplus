package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.ChooseLanguageUI f74179d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.tencent.mm.plugin.account.ui.ChooseLanguageUI chooseLanguageUI) {
        super(0);
        this.f74179d = chooseLanguageUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f74179d.getIntent().getIntExtra("INTENT_KEY_INDEX", 2));
    }
}
