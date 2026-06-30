package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public class e6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f171214d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.f6 f171215e;

    public e6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.f6 f6Var, yz5.a aVar) {
        this.f171215e = f6Var;
        this.f171214d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.f6 f6Var = this.f171215e;
        f6Var.setVisibility(8);
        if (f6Var.getParent() != null) {
            ((android.view.ViewGroup) f6Var.getParent()).removeView(f6Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.kd kdVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.kd) f6Var.f171238y;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.y yVar = kdVar.f171371m;
        if (yVar != null) {
            yVar.stop();
        }
        kdVar.removeAllViews();
        kdVar.f171365d = null;
        yz5.a aVar = this.f171214d;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
