package com.tencent.mm.plugin.choosemsgfile.ui;

/* loaded from: classes5.dex */
public class g implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileShowUI.AnonymousClass1 f95621a;

    public g(com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileShowUI.AnonymousClass1 anonymousClass1) {
        this.f95621a = anonymousClass1;
    }

    @Override // zb0.a0
    public void a(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileShowUI chooseMsgFileShowUI = com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileShowUI.this;
        dp.a.makeText(chooseMsgFileShowUI, chooseMsgFileShowUI.getString(com.tencent.mm.R.string.jzm, q75.c.c(str2)), 1).show();
    }

    @Override // zb0.a0
    public void b(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileShowUI chooseMsgFileShowUI = com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileShowUI.this;
        dp.a.makeText(chooseMsgFileShowUI, chooseMsgFileShowUI.getString(com.tencent.mm.R.string.jzl), 1).show();
    }
}
