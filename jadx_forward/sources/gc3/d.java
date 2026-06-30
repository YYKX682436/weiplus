package gc3;

/* loaded from: classes9.dex */
public final class d implements z21.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.AbstractC16410x346dc9fa f351957a;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.AbstractC16410x346dc9fa abstractC16410x346dc9fa) {
        this.f351957a = abstractC16410x346dc9fa;
    }

    @Override // z21.b
    public void a(java.lang.String[] lst, java.util.List voiceIdSet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lst, "lst");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(voiceIdSet, "voiceIdSet");
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.AbstractC16410x346dc9fa abstractC16410x346dc9fa = this.f351957a;
        if (abstractC16410x346dc9fa.getVoiceDetectListener() != null) {
            kz5.n0.g0(voiceIdSet, "|", null, null, 0, null, null, 62, null);
            kz5.z.d0(lst, "|", null, null, 0, null, null, 62, null);
        }
        abstractC16410x346dc9fa.f229134n.mo50303x856b99f0(0);
        abstractC16410x346dc9fa.f229134n.mo50307xb9e94560(0, abstractC16410x346dc9fa.f229132i);
    }

    @Override // z21.b
    public void b(java.util.List list) {
        gc3.a voiceDetectListener = this.f351957a.getVoiceDetectListener();
        if (voiceDetectListener != null) {
            java.util.List S0 = list != null ? kz5.n0.S0(list) : null;
            gc3.o oVar = (gc3.o) voiceDetectListener;
            if (S0 == null || !(!S0.isEmpty())) {
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it = S0.iterator();
            int i17 = 0;
            while (true) {
                java.lang.String str = "";
                if (!it.hasNext()) {
                    break;
                }
                int i18 = i17 + 1;
                z21.c cVar = (z21.c) it.next();
                if (i17 != 0) {
                    str = "|";
                }
                sb6.append(str);
                sb6.append(cVar.f551093b + '-' + cVar.f551092a);
                i17 = i18;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyVoiceTransLayout", "onDetectedKeyword, " + ((java.lang.Object) sb6));
            gc3.n voiceListener = oVar.f351969a.getVoiceListener();
            if (voiceListener != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.nh nhVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.nh) voiceListener;
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd activityC16384xb66222dd = nhVar.f228775a;
                activityC16384xb66222dd.f227969w2 = S0;
                if (activityC16384xb66222dd.f227973x2 == -1 || S0.size() <= nhVar.f228775a.f227973x2) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "onDetectKeywords size:%s index:%s words:%s", java.lang.Integer.valueOf(S0.size()), java.lang.Integer.valueOf(nhVar.f228775a.f227973x2), fc3.e.f342553q.a(nhVar.f228775a.f227969w2, 0));
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd activityC16384xb66222dd2 = nhVar.f228775a;
                java.util.List list2 = activityC16384xb66222dd2.f227969w2;
                java.util.List newWords = list2.subList(activityC16384xb66222dd2.f227973x2, list2.size());
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd activityC16384xb66222dd3 = nhVar.f228775a;
                activityC16384xb66222dd3.f227973x2 = activityC16384xb66222dd3.f227969w2.size();
                fc3.e eVar = nhVar.f228775a.S;
                eVar.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newWords, "newWords");
                try {
                    java.util.List<z21.c> S02 = kz5.n0.S0(newWords);
                    eVar.f342567k = true;
                    for (z21.c cVar2 : S02) {
                        long j17 = eVar.f342565i;
                        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
                        long j18 = eVar.f342559c;
                        if (currentTimeMillis > j18) {
                            java.lang.String keyword = cVar2.f551092a;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keyword, "keyword");
                            eVar.d(keyword);
                        } else {
                            long j19 = j18 - currentTimeMillis;
                            eVar.f342565i += j18;
                            java.lang.String str2 = cVar2.f551092a;
                            ku5.u0 u0Var = ku5.t0.f394148d;
                            fc3.c cVar3 = new fc3.c(eVar, str2);
                            ku5.t0 t0Var = (ku5.t0) u0Var;
                            t0Var.getClass();
                            t0Var.z(cVar3, j19, false);
                        }
                    }
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LuckyMoneyKeywordTextHelper", th6, "", new java.lang.Object[0]);
                }
            }
        }
    }

    @Override // z21.b
    public void c() {
    }

    @Override // z21.b
    public void d(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.AbstractC16410x346dc9fa abstractC16410x346dc9fa = this.f351957a;
        abstractC16410x346dc9fa.f229134n.mo50303x856b99f0(0);
        abstractC16410x346dc9fa.f229134n.mo50303x856b99f0(1);
        gc3.a voiceDetectListener = abstractC16410x346dc9fa.getVoiceDetectListener();
        if (voiceDetectListener != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyVoiceTransLayout", "onDetectFinish");
            gc3.n voiceListener = ((gc3.o) voiceDetectListener).f351969a.getVoiceListener();
            if (voiceListener != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "onDetectTransFinish");
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd activityC16384xb66222dd = ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.nh) voiceListener).f228775a;
                java.util.List list = activityC16384xb66222dd.f227969w2;
                if (list != null && list.size() > 0) {
                    fc3.e eVar = activityC16384xb66222dd.S;
                    java.util.List keywords = activityC16384xb66222dd.f227969w2;
                    eVar.getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keywords, "keywords");
                    java.util.List list2 = eVar.f342562f;
                    if (list2 == null || list2.size() <= 0) {
                        eVar.c(keywords);
                    } else {
                        int size = keywords.size();
                        java.util.List list3 = eVar.f342562f;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list3);
                        if (size > list3.size()) {
                            eVar.f342562f = keywords;
                        }
                    }
                }
            }
        }
        if (abstractC16410x346dc9fa.currentState == 1) {
            return;
        }
        abstractC16410x346dc9fa.currentState = 1;
        abstractC16410x346dc9fa.j();
    }

    @Override // z21.b
    public void e(int i17, int i18, int i19, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.AbstractC16410x346dc9fa abstractC16410x346dc9fa = this.f351957a;
        abstractC16410x346dc9fa.f229134n.mo50303x856b99f0(0);
        abstractC16410x346dc9fa.f229134n.mo50303x856b99f0(1);
        android.os.Message message = new android.os.Message();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("localCode", i17);
        bundle.putInt("errType", i18);
        bundle.putInt("errCode", i19);
        message.setData(bundle);
        message.what = 1;
        abstractC16410x346dc9fa.f229135o.mo50308x2936bf5f(message);
    }

    @Override // z21.b
    public void f(java.lang.String str, boolean z17) {
    }

    @Override // z21.b
    public void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.AbstractC16410x346dc9fa abstractC16410x346dc9fa = this.f351957a;
        abstractC16410x346dc9fa.getCurrentState();
        abstractC16410x346dc9fa.f229136p.d();
        abstractC16410x346dc9fa.f229135o.mo50305x3d8a09a2(0);
    }
}
