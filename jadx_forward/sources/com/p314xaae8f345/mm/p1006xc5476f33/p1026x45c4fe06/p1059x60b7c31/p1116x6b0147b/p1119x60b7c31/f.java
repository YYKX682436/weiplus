package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31;

/* loaded from: classes13.dex */
public class f implements oe1.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f165150a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31.g f165151b;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, final oe1.r1 r1Var) {
        this.f165151b = gVar;
        this.f165150a = lVar;
        final p012xc85e97e9.p093xedfae76a.y mo50358x95c7fa5f = lVar.mo50358x95c7fa5f();
        if (mo50358x95c7fa5f != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.f$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31.f fVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31.f.this;
                    fVar.getClass();
                    mo50358x95c7fa5f.mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.x(fVar, r1Var, this) { // from class: com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.JsApiLoadVideoResource$1$1

                        /* renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ oe1.r1 f165127d;

                        /* renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ oe1.d1 f165128e;

                        {
                            this.f165127d = r2;
                            this.f165128e = r3;
                        }

                        @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
                        /* renamed from: onDestroyed */
                        public void m51408x7495d2fa() {
                            oe1.d1 d1Var;
                            ((oe1.z1) this.f165127d).getClass();
                            try {
                                if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12261x637f42fb.f165057d == null || (d1Var = this.f165128e) == null) {
                                    return;
                                }
                                java.util.Iterator it = new java.util.LinkedList(((java.util.concurrent.ConcurrentHashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12261x637f42fb.f165056c).values()).iterator();
                                while (it.hasNext()) {
                                    oe1.a aVar = (oe1.a) it.next();
                                    if (d1Var == aVar.f426225e) {
                                        aVar.f426225e = null;
                                    }
                                }
                            } catch (java.lang.Exception unused) {
                            }
                        }
                    });
                }
            });
        }
    }

    public void a(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLoadVideoResource", "leonlad downloadVideo onPreLoadSucc save_path = %s, url = %s", str2, str);
        this.f165151b.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("resource", str);
        java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
        xe1.m mVar = new xe1.m();
        mVar.p(this.f165150a);
        mVar.r(jSONObject);
        mVar.m();
    }
}
