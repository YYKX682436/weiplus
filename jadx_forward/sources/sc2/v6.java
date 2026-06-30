package sc2;

/* loaded from: classes2.dex */
public final class v6 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final in5.s0 f487842d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f487843e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f487844f;

    /* renamed from: g, reason: collision with root package name */
    public final long f487845g;

    /* renamed from: h, reason: collision with root package name */
    public xc2.c1 f487846h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ sc2.r7 f487847i;

    public v6(sc2.r7 r7Var, in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, java.lang.String source, long j17, xc2.c1 c1Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        j17 = (i17 & 8) != 0 ? 0L : j17;
        c1Var = (i17 & 16) != 0 ? null : c1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        this.f487847i = r7Var;
        this.f487842d = holder;
        this.f487843e = feed;
        this.f487844f = source;
        this.f487845g = j17;
        this.f487846h = c1Var;
        holder.f3639x46306858.getContext();
    }

    public final void a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BaseAdFeedJumperUIC", "[" + str + "] feedId=" + str2 + ' ' + str3);
    }

    public final void b(long j17, java.lang.String str, int i17, java.util.Set set) {
        boolean z17;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m77226x96bac258;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m77226x96bac2582;
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e6 hk6 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.hk((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17, j17, str, i17, null, 8, null);
        r45.fl2 fl2Var = hk6 != null ? hk6.f206545a : null;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (set != null) {
            java.util.Iterator it = set.iterator();
            str2 = "";
            while (it.hasNext()) {
                while (true) {
                    str3 = str2;
                    for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 : ((xc2.t) it.next()).f534835d) {
                        java.util.LinkedList<r45.wf6> m76521x7528c3fb = c19786x6a1e2862.m76521x7528c3fb();
                        if (m76521x7528c3fb != null) {
                            java.lang.String str6 = "";
                            str5 = str6;
                            for (r45.wf6 wf6Var : m76521x7528c3fb) {
                                if (str5.length() > 0) {
                                    str5 = str5 + '#';
                                }
                                java.lang.String str7 = str6.length() > 0 ? str6 + '#' : str6;
                                str5 = str5 + wf6Var.m75939xb282bd08(2);
                                str6 = str7 + wf6Var.m75939xb282bd08(1);
                            }
                            str4 = str6;
                        } else {
                            str4 = "";
                            str5 = str4;
                        }
                        try {
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                            jSONObject2.put("business_type", c19786x6a1e2862.m76480xe2ee1ca3());
                            jSONObject2.put("showPosition", str4);
                            jSONObject2.put("showStyle", str5);
                            if (str3.length() > 0) {
                                str3 = str3 + '#';
                            }
                            if (c19786x6a1e2862.m76480xe2ee1ca3() == 124) {
                                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 m76506x42318aa0 = c19786x6a1e2862.m76506x42318aa0();
                                if (m76506x42318aa0 != null && m76506x42318aa0.m77224x4236b52c() == 59) {
                                    r45.dq2 dq2Var = new r45.dq2();
                                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 m76506x42318aa02 = c19786x6a1e2862.m76506x42318aa0();
                                    if (((m76506x42318aa02 == null || (m77226x96bac2582 = m76506x42318aa02.m77226x96bac258()) == null) ? 0 : m77226x96bac2582.f273689a.length) > 0) {
                                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 m76506x42318aa03 = c19786x6a1e2862.m76506x42318aa0();
                                        byte[] g17 = (m76506x42318aa03 == null || (m77226x96bac258 = m76506x42318aa03.m77226x96bac258()) == null) ? null : m77226x96bac258.g();
                                        if (g17 != null) {
                                            try {
                                                dq2Var.mo11468x92b714fd(g17);
                                            } catch (java.lang.Exception e17) {
                                                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                                            }
                                        }
                                    }
                                    jSONObject.put("cluster_id", pm0.v.u(dq2Var.m75942xfb822ef2(2)));
                                    jSONObject.put("cluster_name", dq2Var.m75945x2fec8307(0));
                                    jSONObject2.put("cluster_info", jSONObject.toString());
                                }
                            }
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            sb6.append(str3);
                            java.lang.String jSONObject3 = jSONObject2.toString();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
                            try {
                                sb6.append(r26.i0.t(jSONObject3, ",", ";", false));
                                str2 = sb6.toString();
                                break;
                            } catch (org.json.JSONException e18) {
                                e = e18;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.BaseAdFeedJumperUIC", e.getMessage());
                            }
                        } catch (org.json.JSONException e19) {
                            e = e19;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.BaseAdFeedJumperUIC", e.getMessage());
                        }
                    }
                }
                str2 = str3;
            }
            z17 = false;
        } else {
            z17 = false;
            str2 = "";
        }
        if (fl2Var != null) {
            java.lang.String m75945x2fec8307 = fl2Var.m75945x2fec8307(5);
            java.lang.String str8 = m75945x2fec8307 != null ? m75945x2fec8307 : "";
            try {
                org.json.JSONObject jSONObject4 = str8.length() == 0 ? true : z17 ? new org.json.JSONObject() : new org.json.JSONObject(str8);
                jSONObject4.put("jump_info", str2);
                jSONObject4.put("cluster_info", jSONObject.toString());
                fl2Var.set(5, jSONObject4.toString());
            } catch (org.json.JSONException e27) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.BaseAdFeedJumperUIC", e27.getMessage());
            }
        }
    }

    /* renamed from: equals */
    public boolean m164276xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof sc2.v6) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f487842d.f3639x46306858, ((sc2.v6) obj).f487842d.f3639x46306858);
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m164277x8cdac1b() {
        return this.f487842d.f3639x46306858.hashCode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:409:0x0bba, code lost:
    
        if (((r1 == null || !r1.f487710a) ? r42 : 1) == 0) goto L377;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:276:0x07a6  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0b60  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0b89  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0bd7  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0bec  */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v41, types: [java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo525x7bb163d5(java.lang.Object r57) {
        /*
            Method dump skipped, instructions count: 3223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sc2.v6.mo525x7bb163d5(java.lang.Object):void");
    }

    /* renamed from: toString */
    public java.lang.String m164278x9616526c() {
        return sc2.v6.class.getSimpleName() + '#' + pm0.v.u(this.f487843e.mo2128x1ed62e84());
    }
}
