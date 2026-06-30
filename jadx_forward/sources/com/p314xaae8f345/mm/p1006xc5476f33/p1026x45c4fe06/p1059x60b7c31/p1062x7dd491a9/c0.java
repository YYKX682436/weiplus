package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9;

/* loaded from: classes.dex */
public class c0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f160476d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f160477e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.e0 f160478f;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.e0 e0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17) {
        this.f160478f = e0Var;
        this.f160476d = e9Var;
        this.f160477e = i17;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
        int i17 = this.f160477e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f160476d;
        if (c10756x2a5d7b2d == null || c10756x2a5d7b2d.f149939d == null) {
            e9Var.a(i17, null);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            hashMap.put("result", new org.json.JSONArray(c10756x2a5d7b2d.f149939d));
        } catch (org.json.JSONException unused) {
        }
        e9Var.a(i17, this.f160478f.p("ok", hashMap));
    }
}
