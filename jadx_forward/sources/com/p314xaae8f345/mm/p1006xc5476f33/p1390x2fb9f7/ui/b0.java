package com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.ui;

/* loaded from: classes.dex */
public class b0 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 f181357a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f181358b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.ui.c0 f181359c;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.ui.c0 c0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var2, java.util.ArrayList arrayList) {
        this.f181359c = c0Var;
        this.f181357a = c0Var2;
        this.f181358b = arrayList;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.a0
    /* renamed from: onResult */
    public void mo26363x57429edc(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var = this.f181357a;
        c0Var.d();
        java.lang.String str = (java.lang.String) this.f181358b.get(c0Var.b());
        com.tencent.mm.plugin.expt.ui.KvInfoUI kvInfoUI = this.f181359c.f181361d;
        int i17 = com.tencent.mm.plugin.expt.ui.KvInfoUI.m;
        kvInfoUI.U6(str);
    }
}
