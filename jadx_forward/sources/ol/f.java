package ol;

/* loaded from: classes13.dex */
public class f implements ll.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ol.h f427622a;

    public f(ol.h hVar) {
        this.f427622a = hVar;
    }

    public void a(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5175x3ee93aa3 c5175x3ee93aa3) {
        long c17;
        int i17 = c5175x3ee93aa3.f135523g.f88249a;
        if (!(i17 == 12 || i17 == 11 || i17 == 10 || i17 == 6)) {
            if (this.f427622a.f427640p.containsKey(c5175x3ee93aa3.f135523g.f88251c)) {
                ol.i iVar = (ol.i) this.f427622a.f427640p.get(c5175x3ee93aa3.f135523g.f88251c);
                if (iVar != null && iVar.a(java.lang.Integer.valueOf(i17))) {
                    int i18 = rl.b.f478676a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.AudioMixPlayerImpl", "don't callback again", null);
                    return;
                }
                if (iVar != null) {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
                    synchronized (iVar) {
                        java.lang.Object obj = iVar.f427651a;
                        iVar.f427651a = valueOf;
                        java.lang.String str = obj.toString() + " -> " + iVar.f427651a.toString();
                        int i19 = rl.b.f478676a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StateRunner", str, null);
                    }
                    this.f427622a.f427640p.put(c5175x3ee93aa3.f135523g.f88251c, iVar);
                }
            } else {
                synchronized (this.f427622a.f427631g) {
                    this.f427622a.f427640p.put(c5175x3ee93aa3.f135523g.f88251c, new ol.i(java.lang.Integer.valueOf(i17)));
                }
            }
        }
        if (this.f427622a.f427634j == null) {
            return;
        }
        am.g0 g0Var = c5175x3ee93aa3.f135523g;
        java.lang.Object[] objArr = {g0Var.f88251c, g0Var.f88252d};
        int i27 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioMixPlayerImpl", "onEventChange audioId:%s, state:%s", objArr);
        if (i17 == 9) {
            ((dl3.p) this.f427622a.f427634j).getClass();
            c5175x3ee93aa3.b(android.os.Looper.getMainLooper());
            return;
        }
        if (i17 == 7) {
            dl3.i iVar2 = ((dl3.p) this.f427622a.f427634j).f316874a;
            if (!iVar2.f316851k.contains(c5175x3ee93aa3.f135523g.f88251c)) {
                c5175x3ee93aa3.b(android.os.Looper.getMainLooper());
            }
            iVar2.f316851k.remove(c5175x3ee93aa3.f135523g.f88251c);
            return;
        }
        if (i17 == 0) {
            ((dl3.p) this.f427622a.f427634j).getClass();
            c5175x3ee93aa3.b(android.os.Looper.getMainLooper());
            return;
        }
        if (i17 == 1) {
            ((dl3.p) this.f427622a.f427634j).getClass();
            c5175x3ee93aa3.b(android.os.Looper.getMainLooper());
            return;
        }
        if (i17 == 2) {
            ((dl3.p) this.f427622a.f427634j).getClass();
            c5175x3ee93aa3.b(android.os.Looper.getMainLooper());
            return;
        }
        if (i17 == 3) {
            this.f427622a.f427639o.put(c5175x3ee93aa3.f135523g.f88251c, java.lang.Boolean.FALSE);
            dl3.p pVar = (dl3.p) this.f427622a.f427634j;
            pVar.getClass();
            c5175x3ee93aa3.b(android.os.Looper.getMainLooper());
            dl3.i.b(pVar.f316874a, c5175x3ee93aa3.f135523g.f88251c);
            return;
        }
        if (i17 == 5) {
            this.f427622a.f427639o.put(c5175x3ee93aa3.f135523g.f88251c, java.lang.Boolean.FALSE);
            ((dl3.p) this.f427622a.f427634j).getClass();
            c5175x3ee93aa3.b(android.os.Looper.getMainLooper());
            return;
        }
        if (i17 == 4) {
            this.f427622a.f427639o.put(c5175x3ee93aa3.f135523g.f88251c, java.lang.Boolean.FALSE);
            dl3.p pVar2 = (dl3.p) this.f427622a.f427634j;
            pVar2.getClass();
            int i28 = c5175x3ee93aa3.f135523g.f88254f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "onError errCode:%d", java.lang.Integer.valueOf(i28));
            if (i28 == 709 || i28 == 702 || i28 == 703 || i28 == 705 || i28 == 706) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.AudioPlayerMgr", "decode mix cache errors, don't callback to JS");
            } else {
                c5175x3ee93aa3.b(android.os.Looper.getMainLooper());
            }
            dl3.i iVar3 = pVar2.f316874a;
            el3.i iVar4 = iVar3.f316861u;
            am.g0 g0Var2 = c5175x3ee93aa3.f135523g;
            if (iVar4 != null) {
                n01.b bVar = (n01.b) iVar3.f316849i.get(g0Var2.f88251c);
                if (bVar == null) {
                    return;
                }
                el3.i iVar5 = iVar3.f316861u;
                int i29 = g0Var2.f88254f;
                ((el3.h) iVar5).getClass();
                com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                c4582x424c344.m40330x4c144dd(na1.e.f72905x366c91de);
                c4582x424c344.m40331x936762bd(91);
                c4582x424c344.m40332x57b2b64f(1L);
                com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3442 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                c4582x424c3442.m40330x4c144dd(na1.e.f72905x366c91de);
                c4582x424c3442.m40331x936762bd(el3.a.a(i29));
                c4582x424c3442.m40332x57b2b64f(1L);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(c4582x424c344);
                arrayList.add(c4582x424c3442);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.j(arrayList, true, false);
                el3.a.b(arrayList);
                if (!iVar3.B.e(bVar.f415371c)) {
                    if (iVar3.A.containsKey(bVar.f415371c)) {
                        iVar3.A.put(bVar.f415371c, java.lang.Integer.valueOf(((java.lang.Integer) iVar3.A.get(bVar.f415371c)).intValue() + 1));
                    } else {
                        iVar3.A.put(bVar.f415371c, 1);
                    }
                }
            }
            dl3.i.b(iVar3, g0Var2.f88251c);
            return;
        }
        if (i17 == 10) {
            ((dl3.p) this.f427622a.f427634j).getClass();
            c5175x3ee93aa3.b(android.os.Looper.getMainLooper());
            return;
        }
        if (i17 == 6) {
            ((dl3.p) this.f427622a.f427634j).getClass();
            c5175x3ee93aa3.b(android.os.Looper.getMainLooper());
            return;
        }
        if (i17 != 11) {
            if (i17 == 12) {
                this.f427622a.f427634j.getClass();
                return;
            } else {
                if (i17 == 13) {
                    dl3.p pVar3 = (dl3.p) this.f427622a.f427634j;
                    pVar3.getClass();
                    dl3.i.b(pVar3.f316874a, c5175x3ee93aa3.f135523g.f88251c);
                    return;
                }
                return;
            }
        }
        dl3.p pVar4 = (dl3.p) this.f427622a.f427634j;
        dl3.i iVar6 = pVar4.f316874a;
        if (iVar6.f316861u != null) {
            n01.b bVar2 = (n01.b) iVar6.f316849i.get(c5175x3ee93aa3.f135523g.f88251c);
            if (bVar2 != null) {
                long j17 = bVar2.f415385q;
                if (j17 > 1000000) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.AudioPlayerMgr", "onRealPlay: %s, invokeCallTime:%d", bVar2.f415369a, java.lang.Long.valueOf(j17));
                }
                java.lang.String str2 = c5175x3ee93aa3.f135523g.f88256h;
                if (android.text.TextUtils.isEmpty(str2)) {
                    str2 = bVar2.f415370b;
                }
                java.lang.String str3 = str2;
                el3.i iVar7 = pVar4.f316874a.f316861u;
                java.lang.String str4 = bVar2.f415369a;
                long currentTimeMillis = java.lang.System.currentTimeMillis() - bVar2.f415383o;
                long j18 = bVar2.f415384p;
                long j19 = bVar2.f415385q;
                java.lang.String str5 = bVar2.f415371c;
                long d17 = pVar4.f316874a.B.f427612a.d(bVar2.f415369a);
                long j27 = bVar2.f415392x;
                ol.c cVar = pVar4.f316874a.B;
                java.lang.String str6 = bVar2.f415371c;
                cVar.getClass();
                il.j a17 = il.j.a();
                synchronized (a17.f373538c) {
                    if (a17.f373536a.contains(str6)) {
                        hl.d dVar = (hl.d) a17.f373537b.get(str6);
                        if (dVar != null && dVar.f363552b) {
                            c17 = dVar.c();
                        }
                    }
                    c17 = 0;
                }
                ((el3.h) iVar7).E(str4, str3, currentTimeMillis, j18, j19, false, str5, d17, j27, c17);
                if (pVar4.f316874a.A.containsKey(bVar2.f415371c)) {
                    pVar4.f316874a.A.remove(bVar2.f415371c);
                }
            }
        }
        c5175x3ee93aa3.b(android.os.Looper.getMainLooper());
    }
}
