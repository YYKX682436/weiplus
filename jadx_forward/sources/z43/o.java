package z43;

/* loaded from: classes8.dex */
public class o extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.e eVar = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.g.f220937b;
        eVar.a();
        eVar.getClass();
        hashMap.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, (java.lang.String) com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.g.f220938c.b(eVar, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.e.f220935a[0]));
        long optLong = jSONObject.optLong(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52923xbc17776f);
        java.lang.String url = jSONObject.optString("url");
        jSONObject.optString("liteAppPath");
        java.lang.String extInfo = jSONObject.optString("liteAppReportExtInfoDict");
        if (!"".equals(extInfo)) {
            e53.e eVar2 = e53.e.f331165a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
            e53.e.f331168d.put(url, extInfo);
        }
        jd.c cVar = this.f224975e;
        long j17 = cVar.f380557a;
        e53.e.f331170f = j17;
        java.util.List list = e53.e.f331169e;
        java.util.Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            long j18 = cVar.f380559c;
            if (hasNext) {
                e53.d dVar = (e53.d) it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar.f331159a, str) && dVar.f331163e == j17 && dVar.f331164f == j18) {
                    dVar.f331160b = java.lang.System.currentTimeMillis();
                    break;
                }
            } else {
                e53.d dVar2 = new e53.d();
                dVar2.f331159a = str;
                dVar2.f331163e = j17;
                dVar2.f331164f = j18;
                dVar2.f331160b = java.lang.System.currentTimeMillis();
                dVar2.f331161c = optLong;
                dVar2.f331162d = url;
                ((java.util.LinkedList) list).add(dVar2);
                if (e53.e.f331166b == null) {
                    final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
                    e53.e.f331166b = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5678x3e538b48>(a0Var) { // from class: com.tencent.mm.plugin.game.luggage.report.PageTimeReport27743$registerReportListener$1
                        {
                            this.f39173x3fe91575 = 353844568;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:49:0x00bf A[Catch: JSONException -> 0x00c4, TRY_LEAVE, TryCatch #0 {JSONException -> 0x00c4, blocks: (B:42:0x00aa, B:44:0x00b3, B:49:0x00bf), top: B:41:0x00aa }] */
                        /* JADX WARN: Removed duplicated region for block: B:52:0x00d7  */
                        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
                        /* renamed from: callback */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5678x3e538b48 r23) {
                            /*
                                Method dump skipped, instructions count: 290
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1748xc84c5534.C15900xb6d7c7b.mo1xf5bc2045(com.tencent.mm.sdk.event.IEvent):boolean");
                        }
                    };
                }
                com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = e53.e.f331166b;
                if (abstractC20980x9b9ad01d != null) {
                    abstractC20980x9b9ad01d.mo48813x58998cd();
                }
                e53.e.f331167c.mo48813x58998cd();
            }
        }
        this.f224976f.b(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}
