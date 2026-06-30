package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2;

/* loaded from: classes8.dex */
public class x0 implements l53.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m33.j1 f223502a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f223503b;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0 p0Var, m33.j1 j1Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var) {
        this.f223502a = j1Var;
        this.f223503b = u3Var;
    }

    @Override // l53.a
    public void a(java.lang.String str) {
        m33.j1 j1Var = this.f223502a;
        if (j1Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.u5) j1Var).a(str);
        }
        final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f223503b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.b(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.game.x0$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.this.dismiss();
            }
        });
    }

    @Override // l53.a
    public void b(java.lang.String str, java.lang.String str2) {
        m33.j1 j1Var = this.f223502a;
        if (j1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.u5 u5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.u5) j1Var;
            u5Var.f221283a.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("uploadMiniGameVideoToShare", "gamelog.jsapi, web , uploadMiniGameVideoToShare, error videoId = " + u5Var.f221284b + ", videoUrl = " + str + ", thumbUrl = " + str2);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("videoUrl", str);
            jSONObject.put("thumbUrl", str2);
            u5Var.f221285c.a(null, jSONObject);
        }
    }

    @Override // l53.a
    public void c() {
        final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f223503b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.b(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.game.x0$$b
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.this.dismiss();
            }
        });
    }

    @Override // l53.a
    /* renamed from: onCancel */
    public void mo64831x3d6f0539() {
        m33.j1 j1Var = this.f223502a;
        if (j1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.u5 u5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.u5) j1Var;
            u5Var.f221283a.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("uploadMiniGameVideoToShare", "gamelog.jsapi, web , uploadMiniGameVideoToShare, user cancel");
            u5Var.f221285c.a("user cancel", null);
        }
    }

    @Override // l53.a
    /* renamed from: onSuccess */
    public void mo64832xe05b4124() {
    }
}
