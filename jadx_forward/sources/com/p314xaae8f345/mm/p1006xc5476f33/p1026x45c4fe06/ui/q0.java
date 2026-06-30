package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes9.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f171474d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb f171475e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f171476f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.vb f171477g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f171478h;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257 activityC12636x4eed9257, boolean z17, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb, boolean z18, r45.vb vbVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar) {
        this.f171474d = z17;
        this.f171475e = c21560x1fce98fb;
        this.f171476f = z18;
        this.f171477g = vbVar;
        this.f171478h = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f171474d;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar = this.f171478h;
        r45.vb vbVar = this.f171477g;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb = this.f171475e;
        boolean z18 = this.f171476f;
        if (z17) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) c21560x1fce98fb).O(z18);
            vbVar.f469593f = z18 ? 1 : 2;
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).notifyDataSetChanged();
        } else {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) c21560x1fce98fb).O(!z18);
            vbVar.f469593f = z18 ? 2 : 1;
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).notifyDataSetChanged();
        }
    }
}
