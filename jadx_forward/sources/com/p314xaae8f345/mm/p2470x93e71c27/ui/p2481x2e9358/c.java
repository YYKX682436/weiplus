package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes15.dex */
public class c extends android.widget.BaseAdapter {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f271735m = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f271737e;

    /* renamed from: f, reason: collision with root package name */
    public final int f271738f;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19663x33e018e7 f271741i;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f271736d = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public java.util.Map f271739g = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f271740h = false;

    public c(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19663x33e018e7 c19663x33e018e7, android.content.Context context, java.util.List list, java.util.Map map, java.util.ArrayList arrayList) {
        this.f271741i = c19663x33e018e7;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(list == null ? -1 : list.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppGrid", "AppGridAdapter infoList size:%s ", objArr);
        this.f271737e = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 56.0f);
        this.f271738f = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 53.3f);
        f(list, map, arrayList);
    }

    public final void a(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.e eVar, java.lang.String str, java.lang.String str2) {
        java.util.Map map = this.f271739g;
        if (map == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppGrid", "func[attachHarcodeServiceApp] harcodeServiceAppInfoMap null");
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m) map.get(str);
        if (mVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppGrid", "func[attachHarcodeServiceApp] info null");
            return;
        }
        l75.e0 e0Var = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m.f270516f2;
        if ("wxce6f23b478a3a2a2".equals(mVar.f67370x28d45f97)) {
            eVar.f271816g.setImageResource(com.p314xaae8f345.mm.R.raw.f80814x7d20a9f6);
        } else if ("wx6fa7e3bab7e15415".equals(mVar.f67370x28d45f97)) {
            eVar.f271816g.setImageResource(com.p314xaae8f345.mm.R.raw.f80809xdd3b223);
        } else if ("wx7302cee7c7d6d7d6".equals(mVar.f67370x28d45f97)) {
            eVar.f271816g.setImageResource(com.p314xaae8f345.mm.R.raw.f80802x8f3f2a9b);
            eVar.f271822p = "card";
        } else if ("wx3cc22b542de028d4".equals(mVar.f67370x28d45f97)) {
            eVar.f271816g.setImageResource(com.p314xaae8f345.mm.R.raw.f80800x19fd226b);
        } else {
            eVar.f271816g.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bvu);
        }
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19663x33e018e7 c19663x33e018e7 = this.f271741i;
        if (K0) {
            eVar.f271814e.setText(((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Ui(c19663x33e018e7.f271446e, mVar));
        } else {
            android.widget.TextView textView = eVar.f271814e;
            android.content.Context context = c19663x33e018e7.f271446e;
            if (context != null) {
                java.lang.String m17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.m(context);
                java.lang.String str3 = m17.equalsIgnoreCase("zh_CN") ? mVar.f67372x453d1e07 : null;
                if (m17.equalsIgnoreCase("en")) {
                    str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f67373x634ac1e1) ? mVar.f67372x453d1e07 : mVar.f67373x634ac1e1;
                }
                if (m17.equalsIgnoreCase("zh_TW") || m17.equalsIgnoreCase("zh_HK")) {
                    if (m17.equalsIgnoreCase("zh_HK")) {
                        str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f67374x634ac23b) ? mVar.f67375x634ac3bb : mVar.f67374x634ac23b;
                    }
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                        str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f67375x634ac3bb) ? mVar.f67372x453d1e07 : mVar.f67375x634ac3bb;
                    }
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                    str2 = str3;
                }
            }
            textView.setText(str2);
        }
        if (mVar.G0()) {
            if ((mVar.f67387x8aa40beb & 2) != 0) {
                if (c19663x33e018e7.f271453o == null) {
                    c19663x33e018e7.f271453o = c19663x33e018e7.f271446e.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0);
                }
                if (c19663x33e018e7.f271453o.getBoolean("SP_KEY_SERVICE_APP_PREFIX_" + mVar.f67370x28d45f97, true)) {
                    eVar.f271818i.setVisibility(0);
                }
            }
        }
        if ("wxce6f23b478a3a2a2".equals(mVar.f67370x28d45f97)) {
            int intValue = ((java.lang.Integer) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
            if (intValue <= 1) {
                return;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(((java.lang.String) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REMITTANCE_STRING_SYNC, "")).split(";")).contains(intValue + "")) {
                return;
            }
            eVar.f271818i.setVisibility(0);
            return;
        }
        if ("wx6fa7e3bab7e15415".equals(mVar.f67370x28d45f97)) {
            int intValue2 = ((java.lang.Integer) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
            if (intValue2 <= 1) {
                eVar.f271818i.setVisibility(8);
                return;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(((java.lang.String) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_HONGBAO_STRING_SYNC, "")).split(";")).contains(intValue2 + "")) {
                return;
            }
            eVar.f271818i.setVisibility(0);
        }
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m getItem(int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19663x33e018e7 c19663x33e018e7 = this.f271741i;
        int i18 = c19663x33e018e7.f271451m;
        if (i17 < i18 && c19663x33e018e7.f271450i == 0) {
            return null;
        }
        int i19 = c19663x33e018e7.f271450i;
        int i27 = c19663x33e018e7.f271448g;
        if ((i19 * i27) + i17 < i18) {
            return null;
        }
        int i28 = (i17 - i18) + (i19 * i27);
        java.util.List list = this.f271736d;
        if (i28 >= ((java.util.ArrayList) list).size()) {
            return null;
        }
        return (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m) ((java.util.ArrayList) list).get((i17 - c19663x33e018e7.f271451m) + (c19663x33e018e7.f271450i * c19663x33e018e7.f271448g));
    }

    public final java.util.Map d(int i17, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.e eVar) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19663x33e018e7 c19663x33e018e7 = this.f271741i;
        java.lang.ref.WeakReference weakReference = c19663x33e018e7.f271454p;
        yb5.d dVar = weakReference == null ? null : (yb5.d) weakReference.get();
        java.util.HashMap hashMap = new java.util.HashMap();
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppGrid", "hy: no attaching chatting!");
            return hashMap;
        }
        int i18 = 1;
        int i19 = eVar.f271820n.getVisibility() == 0 ? 1 : 0;
        java.lang.String str = eVar.f271822p;
        int i27 = c19663x33e018e7.f271450i;
        int numColumns = (i17 % c19663x33e018e7.getNumColumns()) + 1;
        java.lang.String str2 = (i27 + 1) + "#" + ((i17 / c19663x33e018e7.getNumColumns()) + 1) + "#" + numColumns;
        java.lang.String str3 = c19663x33e018e7.f271455q;
        java.lang.String x17 = dVar.x();
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(x17)) {
            i18 = 3;
        } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(x17)) {
            i18 = 2;
        }
        if (c01.e2.R(x17)) {
            i18 = 4;
        }
        java.lang.String x18 = dVar.x();
        hashMap.put("has_reddot", java.lang.Integer.valueOf(i19));
        hashMap.put("attachment_item_name", str);
        hashMap.put("attachment_item_index", str2);
        hashMap.put("attachment_exp_sessionid", str3);
        hashMap.put("chat_name", x18);
        hashMap.put("chat_type", java.lang.Integer.valueOf(i18));
        if ("voice_input".equals(str)) {
            hashMap.put("log_version", "20260409");
        }
        return hashMap;
    }

    public void f(java.util.List list, java.util.Map map, java.util.ArrayList arrayList) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(list == null ? -1 : list.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppGrid", "[refreshInitData] AppGridAdapter infoList size:%s ", objArr);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        objArr2[0] = java.lang.Integer.valueOf(map == null ? -1 : map.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppGrid", "[refreshInitData] hardcodeServiceAppInfoMap size:%s ", objArr2);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        objArr3[0] = java.lang.Integer.valueOf(arrayList != null ? arrayList.size() : -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppGrid", "[refreshInitData] unCertainEnters size:%s ", objArr3);
        java.util.List list2 = this.f271736d;
        list2.clear();
        list2.addAll(list);
        list2.addAll(arrayList);
        this.f271739g = map;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.y b17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19663x33e018e7.b((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.x) it.next());
            if (b17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17.f272288b)) {
                this.f271740h = true;
                return;
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19663x33e018e7 c19663x33e018e7 = this.f271741i;
        int i17 = c19663x33e018e7.f271450i;
        return i17 == c19663x33e018e7.f271449h + (-1) ? c19663x33e018e7.f271447f - (i17 * c19663x33e018e7.f271448g) : c19663x33e018e7.f271448g;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x097e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x050f  */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.widget.TextView, android.view.View] */
    /* JADX WARN: Type inference failed for: r2v103 */
    /* JADX WARN: Type inference failed for: r2v90 */
    /* JADX WARN: Type inference failed for: r2v91, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.tencent.mm.pluginsdk.ui.chat.AppGrid] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [int] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v77 */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r27, android.view.View r28, android.view.ViewGroup r29) {
        /*
            Method dump skipped, instructions count: 2494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
