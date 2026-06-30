package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* loaded from: classes11.dex */
public class z implements com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21545xcb424ea5 f279393a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb f279394b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.a0 f279395c;

    public z(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.a0 a0Var, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21545xcb424ea5 c21545xcb424ea5, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        this.f279395c = a0Var;
        this.f279393a = c21545xcb424ea5;
        this.f279394b = c21560x1fce98fb;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.o
    public void a(boolean z17) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var;
        android.content.SharedPreferences sharedPreferences;
        if (z17) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.a0 a0Var = this.f279395c;
            a0Var.f279324d.f39408x5b2a3d2 = true;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21545xcb424ea5 c21545xcb424ea5 = this.f279393a;
            if (c21545xcb424ea5.f279318v) {
                sharedPreferences = a0Var.f279324d.f279295sp;
                sharedPreferences.edit().putString(this.f279394b.f279313q, c21545xcb424ea5.P).commit();
            }
            h0Var = a0Var.f279324d.f39403xbb6ca34f;
            h0Var.notifyDataSetChanged();
        }
    }
}
