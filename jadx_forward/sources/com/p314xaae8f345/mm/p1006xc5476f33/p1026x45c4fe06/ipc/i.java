package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc;

/* loaded from: classes7.dex */
public class i implements wd0.p1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f159945a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.j f159946b;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.j jVar) {
        this.f159946b = jVar;
    }

    @Override // wd0.p1
    public void a() {
        b(-2);
        this.f159946b.f159947d.T6(null);
    }

    public final void b(int i17) {
        if (this.f159945a) {
            return;
        }
        this.f159945a = true;
        p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c c0050x5b3754c = (p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c) this.f159946b.f159947d.getIntent().getParcelableExtra("key_result_receiver");
        if (c0050x5b3754c != null) {
            c0050x5b3754c.b(i17, null);
        }
    }

    @Override // wd0.p1
    /* renamed from: onSuccess */
    public void mo977xe05b4124() {
        b(-1);
        this.f159946b.f159947d.T6(null);
    }
}
