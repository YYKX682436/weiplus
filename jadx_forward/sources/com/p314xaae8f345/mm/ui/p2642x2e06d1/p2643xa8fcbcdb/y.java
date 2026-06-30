package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* loaded from: classes11.dex */
public class y implements com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21544x57e6e063 f279390a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb f279391b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.a0 f279392c;

    public y(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.a0 a0Var, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21544x57e6e063 c21544x57e6e063, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        this.f279392c = a0Var;
        this.f279390a = c21544x57e6e063;
        this.f279391b = c21560x1fce98fb;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.k
    public void a(boolean z17) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var;
        android.content.SharedPreferences sharedPreferences;
        if (z17) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.a0 a0Var = this.f279392c;
            a0Var.f279324d.f39408x5b2a3d2 = true;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21544x57e6e063 c21544x57e6e063 = this.f279390a;
            if (c21544x57e6e063.f279318v) {
                sharedPreferences = a0Var.f279324d.f279295sp;
                sharedPreferences.edit().putString(this.f279391b.f279313q, c21544x57e6e063.L.f279362h).commit();
            }
            h0Var = a0Var.f279324d.f39403xbb6ca34f;
            h0Var.notifyDataSetChanged();
        }
    }
}
