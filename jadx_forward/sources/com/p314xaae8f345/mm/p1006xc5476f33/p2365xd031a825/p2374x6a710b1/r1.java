package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1;

/* loaded from: classes9.dex */
public class r1 implements com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.x1 f262505a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.yt5 f262506b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f262507c;

    public r1(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.x1 x1Var, r45.yt5 yt5Var, android.content.Context context) {
        this.f262505a = x1Var;
        this.f262506b = yt5Var;
        this.f262507c = context;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.c7
    public void a(android.view.View view) {
        android.content.Context context = this.f262507c;
        r45.yt5 yt5Var = this.f262506b;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.x1 x1Var = this.f262505a;
        if (x1Var == null || x1Var.b(yt5Var, view)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.c(context, yt5Var, null);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.c(context, yt5Var, null);
            x1Var.a(yt5Var, view);
        }
    }
}
