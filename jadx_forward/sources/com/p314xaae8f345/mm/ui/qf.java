package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class qf implements ki.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21427xe5bb8a3 f291088d;

    public qf(com.p314xaae8f345.mm.ui.C21427xe5bb8a3 c21427xe5bb8a3) {
        this.f291088d = c21427xe5bb8a3;
    }

    @Override // ki.a
    public void a(int i17) {
        if (ih.a.h("clicfg_matrix_trim_memory_chattingtab_prepared_bitmap", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "systemTrim: recyclePrepareBitmap");
            this.f291088d.p();
        }
    }

    @Override // ki.a
    public void b() {
        if (ih.a.h("clicfg_matrix_trim_memory_chattingtab_prepared_bitmap", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "backgroundTrim: recyclePrepareBitmap");
            this.f291088d.p();
        }
    }
}
