package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public class j6 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.m6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f163410a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f163411b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f163412c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f163413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f163414e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f163415f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f163416g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f163417h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f163418i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.n6 f163419j;

    public j6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.n6 n6Var, java.lang.String[] strArr, java.util.ArrayList arrayList, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str, org.json.JSONObject jSONObject, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i18) {
        this.f163419j = n6Var;
        this.f163410a = strArr;
        this.f163411b = arrayList;
        this.f163412c = context;
        this.f163413d = v5Var;
        this.f163414e = str;
        this.f163415f = jSONObject;
        this.f163416g = i17;
        this.f163417h = e9Var;
        this.f163418i = i18;
    }

    public void a() {
        synchronized (this.f163419j.f163487m) {
            if (!this.f163419j.f163486i.isEmpty()) {
                int i17 = 0;
                for (java.lang.String str : this.f163410a) {
                    if (this.f163419j.f163486i.containsKey(str)) {
                        this.f163410a[i17] = (java.lang.String) this.f163419j.f163486i.get(str);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPreviewMedia", "path:%s, replace url:%s", this.f163410a[i17], str);
                    }
                    i17++;
                }
                java.util.Iterator it = this.f163411b.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p859x62f6fe4.p866x633fb29.C10902xf7e1f39 c10902xf7e1f39 = (com.p314xaae8f345.mm.p859x62f6fe4.p866x633fb29.C10902xf7e1f39) it.next();
                    java.lang.String str2 = c10902xf7e1f39.f150468g;
                    if (this.f163419j.f163486i.containsKey(str2)) {
                        java.lang.String str3 = (java.lang.String) this.f163419j.f163486i.get(str2);
                        c10902xf7e1f39.f150468g = str3;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPreviewMedia", "path:%s, replace thumbUrl:%s", str3, str2);
                    }
                }
            }
        }
        this.f163417h.a(this.f163418i, this.f163419j.C(this.f163412c, this.f163413d, this.f163414e, this.f163415f, this.f163410a, this.f163416g, this.f163411b));
    }
}
