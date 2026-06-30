package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f;

/* loaded from: classes7.dex */
public final class u2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 f263525d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var) {
        super(0);
        this.f263525d = e3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        hy4.k0 performanceHelper;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String d17;
        jz5.l[] lVarArr;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var = this.f263525d;
        java.util.Iterator it = e3Var.Z.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            performanceHelper = e3Var.V;
            if (!hasNext) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3 f3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3) it.next();
            if (f3Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.g3) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.g3) f3Var).s(performanceHelper);
            }
        }
        if (!e3Var.f263471l.f440261q) {
            jz5.g gVar = cx4.s.f306187a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performanceHelper, "performanceHelper");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 webView = e3Var.f263449a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webView, "webView");
            long j17 = performanceHelper.f367670s;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(android.net.Uri.parse(performanceHelper.f367666o).getHost());
            sb6.append(",");
            sb6.append(fp.s0.b(performanceHelper.f367666o, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
            sb6.append(",");
            sb6.append((performanceHelper.f367660i ? 1 : 0) | (performanceHelper.f367656e ? 2 : 0) | (performanceHelper.f367662k ? 4 : 0));
            sb6.append(",");
            fp.s0.b(performanceHelper.f367666o, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
            boolean z17 = performanceHelper.f367658g;
            java.util.LinkedList linkedList = performanceHelper.f367663l;
            int i17 = linkedList.size() <= 0 ? 0 : 2;
            java.util.LinkedList linkedList2 = performanceHelper.f367664m;
            sb6.append((z17 ? 1 : 0) | i17 | (linkedList2.size() <= 0 ? 0 : 4));
            sb6.append(",");
            sb6.append(performanceHelper.f367657f ? 1 : 0);
            sb6.append(",");
            sb6.append(performanceHelper.f367671t);
            sb6.append(",");
            sb6.append(fp.s0.b(performanceHelper.f367674w, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
            sb6.append(",,,,0,");
            sb6.append(cx4.s.d("pageAppear", performanceHelper, j17));
            sb6.append(cx4.s.d("onWebViewCreateStart", performanceHelper, j17));
            sb6.append(cx4.s.d("onWebViewCreateEnd", performanceHelper, j17));
            sb6.append(cx4.s.d("getA8KeyStart", performanceHelper, j17));
            sb6.append(cx4.s.d("getA8KeyEnd", performanceHelper, j17));
            sb6.append(cx4.s.d("clientLoadUrl", performanceHelper, j17));
            sb6.append(cx4.s.d("navigationStart", performanceHelper, j17));
            sb6.append(cx4.s.d("domainLookupStart", performanceHelper, j17));
            sb6.append(cx4.s.d("domainLookupEnd", performanceHelper, j17));
            sb6.append(cx4.s.d("connectStart", performanceHelper, j17));
            sb6.append(cx4.s.d("connectEnd", performanceHelper, j17));
            sb6.append(cx4.s.d("responseStart", performanceHelper, j17));
            sb6.append(cx4.s.d("responseEnd", performanceHelper, j17));
            if (performanceHelper.f367660i) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                str = "domainLookupStart";
                str2 = "domainLookupEnd";
                sb7.append(performanceHelper.f367661j - j17);
                sb7.append(',');
                d17 = sb7.toString();
            } else {
                str = "domainLookupStart";
                str2 = "domainLookupEnd";
                d17 = cx4.s.d("domLoading", performanceHelper, j17);
            }
            sb6.append(d17);
            sb6.append(cx4.s.d("domInteractive", performanceHelper, j17));
            sb6.append(cx4.s.d("domContentLoadedEventStart", performanceHelper, j17));
            sb6.append(cx4.s.d("domContentLoadedEventEnd", performanceHelper, j17));
            sb6.append(cx4.s.d("loadEventStart", performanceHelper, j17));
            sb6.append(cx4.s.d("loadEventEnd", performanceHelper, j17));
            sb6.append(cx4.s.d("onTryBindServiceStart", performanceHelper, j17));
            sb6.append(cx4.s.d("onPostBindedEnd", performanceHelper, j17));
            sb6.append(cx4.s.d("onCreate", performanceHelper, j17));
            sb6.append(cx4.s.d("onUIInitEnd", performanceHelper, j17));
            sb6.append("0,0,0,0,0,0,0,");
            sb6.append(cx4.s.d("onPostBindedStart", performanceHelper, j17));
            sb6.append(cx4.s.d("firstContentfulPaint", performanceHelper, j17));
            if (performanceHelper.f367669r == cx4.r.f306182e) {
                performanceHelper.f367669r = cx4.s.b();
            }
            sb6.append(performanceHelper.f367669r.f306186d);
            sb6.append(",");
            sb6.append(performanceHelper.f367675x);
            sb6.append(",");
            java.lang.String sb8 = sb6.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb8, "toString(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68478xbd3cda5f(19471, sb8);
            boolean z18 = performanceHelper.f367656e;
            boolean z19 = performanceHelper.f367657f;
            if (z18) {
                g0Var.C(1200L, 2L, 1L);
            }
            if (z19) {
                g0Var.C(1200L, 3L, 1L);
            }
            cx4.s.i(performanceHelper.f367671t, performanceHelper.f367666o, (r15 & 4) != 0 ? false : false, (r15 & 8) != 0 ? false : true, (r15 & 16) != 0 ? false : performanceHelper.f367656e, (r15 & 32) != 0 ? false : performanceHelper.f367657f, (r15 & 64) != 0 ? false : performanceHelper.f367658g, (r15 & 128) == 0 ? false : false);
            if (nw4.w2.a()) {
                long j18 = performanceHelper.f367670s;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(0L);
                arrayList.add(java.lang.Long.valueOf(cx4.s.a("pageAppear", performanceHelper, j18)));
                arrayList.add(java.lang.Long.valueOf(cx4.s.a("onWebViewCreateStart", performanceHelper, j18)));
                arrayList.add(java.lang.Long.valueOf(cx4.s.a("onWebViewCreateEnd", performanceHelper, j18)));
                arrayList.add(java.lang.Long.valueOf(cx4.s.a("getA8KeyStart", performanceHelper, j18)));
                arrayList.add(java.lang.Long.valueOf(cx4.s.a("getA8KeyEnd", performanceHelper, j18)));
                arrayList.add(java.lang.Long.valueOf(cx4.s.a("clientLoadUrl", performanceHelper, j18)));
                arrayList.add(java.lang.Long.valueOf(cx4.s.a("navigationStart", performanceHelper, j18)));
                arrayList.add(java.lang.Long.valueOf(cx4.s.a(str, performanceHelper, j18)));
                arrayList.add(java.lang.Long.valueOf(cx4.s.a(str2, performanceHelper, j18)));
                arrayList.add(java.lang.Long.valueOf(cx4.s.a("connectStart", performanceHelper, j18)));
                arrayList.add(java.lang.Long.valueOf(cx4.s.a("connectEnd", performanceHelper, j18)));
                arrayList.add(java.lang.Long.valueOf(cx4.s.a("responseStart", performanceHelper, j18)));
                arrayList.add(java.lang.Long.valueOf(cx4.s.a("responseEnd", performanceHelper, j18)));
                arrayList.add(java.lang.Long.valueOf(cx4.s.a("domLoading", performanceHelper, j18)));
                arrayList.add(java.lang.Long.valueOf(cx4.s.a("domInteractive", performanceHelper, j18)));
                arrayList.add(java.lang.Long.valueOf(cx4.s.a("onTryBindServiceStart", performanceHelper, j18)));
                arrayList.add(java.lang.Long.valueOf(cx4.s.a("onPostBindedEnd", performanceHelper, j18)));
                arrayList.add(java.lang.Long.valueOf(cx4.s.a("onCreate", performanceHelper, j18)));
                arrayList.add(java.lang.Long.valueOf(cx4.s.a("onUIInitEnd", performanceHelper, j18)));
                long a17 = cx4.s.a("firstContentfulPaint", performanceHelper, j18);
                if (a17 <= 0) {
                    arrayList.add(0L);
                    arrayList.add(0L);
                } else {
                    arrayList.add(java.lang.Long.valueOf(cx4.s.a("fetchStart", performanceHelper, j18)));
                    arrayList.add(java.lang.Long.valueOf(a17));
                }
                java.lang.String str3 = "[" + kz5.n0.g0(kz5.n0.K0(arrayList, 22), null, null, null, 0, null, null, 63, null) + ']';
                java.lang.String[][] strArr = performanceHelper.f367655d;
                if (strArr != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(strArr.length);
                    for (java.lang.String[] strArr2 : strArr) {
                        arrayList2.add(new jz5.l(strArr2[0], strArr2[1]));
                    }
                    lVarArr = (jz5.l[]) arrayList2.toArray(new jz5.l[0]);
                } else {
                    lVarArr = null;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.l0 l0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.l0(11);
                l0Var.a(new jz5.l("section", "GetA8Key"));
                l0Var.a(new jz5.l("preGetA8Key", java.lang.String.valueOf(performanceHelper.f367656e)));
                l0Var.a(new jz5.l("preDns", java.lang.String.valueOf(performanceHelper.f367657f)));
                if (lVarArr == null) {
                    lVarArr = new jz5.l[0];
                }
                l0Var.b(lVarArr);
                l0Var.a(new jz5.l("section", "Prefetch"));
                l0Var.a(new jz5.l("prefetch", java.lang.String.valueOf(performanceHelper.f367658g)));
                l0Var.a(new jz5.l("prefetchId", performanceHelper.f367659h));
                l0Var.a(new jz5.l("prefetchJS", kz5.n0.g0(linkedList, "<br/>", null, null, 0, null, null, 62, null)));
                l0Var.a(new jz5.l("prefetchCSS", kz5.n0.g0(linkedList2, "<br/>", null, null, 0, null, null, 62, null)));
                l0Var.a(new jz5.l("section", "Prefetch Headers"));
                java.util.HashMap hashMap = performanceHelper.f367665n;
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry : hashMap.entrySet()) {
                    java.lang.String str4 = (java.lang.String) entry.getKey();
                    java.lang.String lowerCase = r26.n0.u0(str4).toString().toLowerCase();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
                    if (r26.i0.y(lowerCase, "x-wx-", false)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                l0Var.b(kz5.e1.v(linkedHashMap).toArray(new jz5.l[0]));
                performanceHelper.c("['PageAppear', 'WebView', 'GetA8key', 'ClientLoadToNavStart', 'DomainLookUp', 'ConnectStart', 'Response', 'DomLoadingToInteractive', 'Invoker', 'WebViewUICreate', 'FCPToFetchStart']", str3, webView, kz5.c0.i(l0Var.d(new jz5.l[l0Var.c()])));
            }
        }
        return jz5.f0.f384359a;
    }
}
