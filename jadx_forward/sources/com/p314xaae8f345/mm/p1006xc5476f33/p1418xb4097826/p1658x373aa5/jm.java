package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class jm implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.km f213983d;

    public jm(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.km kmVar) {
        this.f213983d = kmVar;
    }

    @Override // f25.f
    public void c(boolean z17) {
        kk4.b player = this.f213983d.f214045t.getPlayer();
        if (player != null) {
            ((kk4.v) player).C(true);
        }
    }

    @Override // f25.f
    /* renamed from: onResume */
    public void mo44161x57429eec() {
        kk4.b player = this.f213983d.f214045t.getPlayer();
        if (player != null) {
            ((kk4.v) player).C(false);
        }
    }

    @Override // f25.f
    /* renamed from: onStop */
    public void mo44162xc39f8281() {
        kk4.b player = this.f213983d.f214045t.getPlayer();
        if (player != null) {
            ((kk4.v) player).C(true);
        }
    }
}
