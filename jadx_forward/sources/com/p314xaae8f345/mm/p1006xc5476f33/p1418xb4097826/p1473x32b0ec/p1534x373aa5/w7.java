package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class w7 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14337xdaa7e550 f198307a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f198308b;

    public w7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14337xdaa7e550 c14337xdaa7e550, android.content.Context context) {
        this.f198307a = c14337xdaa7e550;
        this.f198308b = context;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public final void mo2289xd6191dc1(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14337xdaa7e550 c14337xdaa7e550 = this.f198307a;
        if (!z17) {
            p3325xe03a0797.p3326xc267989b.l.d(v65.m.a(c14337xdaa7e550), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v7(this.f198308b, c14337xdaa7e550, null), 3, null);
            return;
        }
        yz5.a showEditPanel = c14337xdaa7e550.getShowEditPanel();
        if (showEditPanel != null) {
            showEditPanel.mo152xb9724478();
        }
    }
}
