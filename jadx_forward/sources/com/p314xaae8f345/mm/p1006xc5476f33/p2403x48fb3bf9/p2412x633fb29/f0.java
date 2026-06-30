package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes8.dex */
public class f0 implements kv.e0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264398d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f264399e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h0 f264400f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264401g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264402h;

    public f0(java.lang.String str, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h0 h0Var, java.lang.String str2, java.lang.String str3) {
        this.f264398d = str;
        this.f264399e = context;
        this.f264400f = h0Var;
        this.f264401g = str2;
        this.f264402h = str3;
    }

    @Override // kv.e0
    public void U(java.lang.String str) {
        java.lang.String str2 = this.f264398d;
        if (str2.equals(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewShrotcutManager", "notifyChanged avatar(%s).", str);
            ((java.util.LinkedList) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j0.f264482a).remove(this);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().q(this);
            android.content.Context context = this.f264399e;
            android.graphics.Bitmap f17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j0.f(context, str2);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h0 h0Var = this.f264400f;
            if (f17 == null || f17.isRecycled()) {
                if (h0Var != null) {
                    h0Var.a(str2, false);
                    return;
                }
                return;
            }
            android.content.Intent c17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j0.c(this.f264399e, this.f264398d, this.f264401g, this.f264402h, f17, true);
            if (c17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebviewShrotcutManager", "intent is null");
                if (h0Var != null) {
                    h0Var.a(str2, false);
                    return;
                }
                return;
            }
            ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).getClass();
            xp1.c.a(context, c17, null, null, false);
            if (h0Var != null) {
                h0Var.a(str2, true);
            }
        }
    }
}
