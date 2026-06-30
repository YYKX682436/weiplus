package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* loaded from: classes11.dex */
public class k0 implements com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21545xcb424ea5 f279369a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb f279370b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.l0 f279371c;

    public k0(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.l0 l0Var, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21545xcb424ea5 c21545xcb424ea5, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        this.f279371c = l0Var;
        this.f279369a = c21545xcb424ea5;
        this.f279370b = c21560x1fce98fb;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.o
    public void a(boolean z17) {
        if (z17) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.l0 l0Var = this.f279371c;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractC21556x9c39960b abstractC21556x9c39960b = l0Var.f279373d;
            java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractC21556x9c39960b.f279296i;
            abstractC21556x9c39960b.getClass();
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21545xcb424ea5 c21545xcb424ea5 = this.f279369a;
            if (c21545xcb424ea5.f279318v) {
                l0Var.f279373d.f279299f.edit().putString(this.f279370b.f279313q, c21545xcb424ea5.P).commit();
            }
            l0Var.f279373d.f279297d.notifyDataSetChanged();
        }
    }
}
