package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc;

/* loaded from: classes7.dex */
public class m implements android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f159952d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9 f159953e;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9 activityC11883xd41f5bb9, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.AnonymousClass1 anonymousClass1) {
        this.f159953e = activityC11883xd41f5bb9;
    }

    public final void a(int i17) {
        if (this.f159952d) {
            return;
        }
        this.f159952d = true;
        p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c c0050x5b3754c = (p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c) this.f159953e.getIntent().getParcelableExtra("key_result_receiver");
        if (c0050x5b3754c != null) {
            c0050x5b3754c.b(i17, null);
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        a(i17);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        a(-2);
        this.f159953e.T6(null);
    }
}
