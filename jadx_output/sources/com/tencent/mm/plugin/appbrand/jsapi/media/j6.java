package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public class j6 implements com.tencent.mm.plugin.appbrand.jsapi.media.m6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f81877a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f81878b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f81879c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f81880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f81881e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f81882f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f81883g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f81884h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f81885i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.n6 f81886j;

    public j6(com.tencent.mm.plugin.appbrand.jsapi.media.n6 n6Var, java.lang.String[] strArr, java.util.ArrayList arrayList, android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str, org.json.JSONObject jSONObject, int i17, com.tencent.mm.plugin.appbrand.e9 e9Var, int i18) {
        this.f81886j = n6Var;
        this.f81877a = strArr;
        this.f81878b = arrayList;
        this.f81879c = context;
        this.f81880d = v5Var;
        this.f81881e = str;
        this.f81882f = jSONObject;
        this.f81883g = i17;
        this.f81884h = e9Var;
        this.f81885i = i18;
    }

    public void a() {
        synchronized (this.f81886j.f81954m) {
            if (!this.f81886j.f81953i.isEmpty()) {
                int i17 = 0;
                for (java.lang.String str : this.f81877a) {
                    if (this.f81886j.f81953i.containsKey(str)) {
                        this.f81877a[i17] = (java.lang.String) this.f81886j.f81953i.get(str);
                        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPreviewMedia", "path:%s, replace url:%s", this.f81877a[i17], str);
                    }
                    i17++;
                }
                java.util.Iterator it = this.f81878b.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.media.model.AppBrandMediaSource appBrandMediaSource = (com.tencent.mm.media.model.AppBrandMediaSource) it.next();
                    java.lang.String str2 = appBrandMediaSource.f68935g;
                    if (this.f81886j.f81953i.containsKey(str2)) {
                        java.lang.String str3 = (java.lang.String) this.f81886j.f81953i.get(str2);
                        appBrandMediaSource.f68935g = str3;
                        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPreviewMedia", "path:%s, replace thumbUrl:%s", str3, str2);
                    }
                }
            }
        }
        this.f81884h.a(this.f81885i, this.f81886j.C(this.f81879c, this.f81880d, this.f81881e, this.f81882f, this.f81877a, this.f81883g, this.f81878b));
    }
}
