package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes.dex */
public class a5 implements android.content.DialogInterface.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12641x975e69aa f171035d;

    public a5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12641x975e69aa activityC12641x975e69aa) {
        this.f171035d = activityC12641x975e69aa;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(android.content.DialogInterface dialogInterface, int i17, android.view.KeyEvent keyEvent) {
        if (4 != i17) {
            return false;
        }
        if (1 == keyEvent.getAction()) {
            jx3.f.INSTANCE.d(14750, 4, "");
            this.f171035d.finish();
        }
        return true;
    }
}
