package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9;

/* loaded from: classes.dex */
public class r implements vz.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.C11960x923e642d f160502a;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.C11960x923e642d c11960x923e642d) {
        this.f160502a = c11960x923e642d;
    }

    @Override // vz.z1
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.C11960x923e642d c11960x923e642d = this.f160502a;
        if (jSONObject == null) {
            c11960x923e642d.f160352z = true;
            return;
        }
        c11960x923e642d.B = jSONObject.optInt("download_id", -1);
        if (c11960x923e642d.B <= 0) {
            c11960x923e642d.f160352z = true;
        } else {
            c11960x923e642d.f160352z = false;
        }
    }
}
