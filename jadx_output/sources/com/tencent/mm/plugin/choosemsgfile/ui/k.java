package com.tencent.mm.plugin.choosemsgfile.ui;

/* loaded from: classes8.dex */
public class k implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.choosemsgfile.ui.l f95624a;

    public k(com.tencent.mm.plugin.choosemsgfile.ui.l lVar) {
        this.f95624a = lVar;
    }

    @Override // zb0.a0
    public void a(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileShowUI chooseMsgFileShowUI = this.f95624a.f95625d.f95626a;
        dp.a.makeText(chooseMsgFileShowUI, chooseMsgFileShowUI.getString(com.tencent.mm.R.string.jzm, q75.c.c(str2)), 1).show();
    }

    @Override // zb0.a0
    public void b(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileShowUI chooseMsgFileShowUI = this.f95624a.f95625d.f95626a;
        dp.a.makeText(chooseMsgFileShowUI, chooseMsgFileShowUI.getString(com.tencent.mm.R.string.jzl), 1).show();
    }
}
