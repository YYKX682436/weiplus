package jt2;

/* loaded from: classes3.dex */
public final class a extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "notifyAnimationStatus";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        java.util.HashSet Q0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        int optInt = data.optInt("status", 0);
        java.lang.String optString = data.optString("viewId", "");
        if (optInt != 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            if (!(optString.length() == 0)) {
                lc3.e eVar = this.f399423a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
                it2.x xVar = ((it2.k) eVar).f376044d;
                xVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicRewardFeatureService", "notify status changed: " + optInt + " for view " + optString);
                java.lang.Object obj = ((java.util.concurrent.ConcurrentMap) ((jz5.n) xVar.f376067h).mo141623x754a37bb()).get(optString);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1623xc84f4f2f.p1624x373aa5.C14940x2aae97e1 c14940x2aae97e1 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1623xc84f4f2f.p1624x373aa5.C14940x2aae97e1 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1623xc84f4f2f.p1624x373aa5.C14940x2aae97e1) obj : null;
                if (c14940x2aae97e1 != null) {
                    synchronized (c14940x2aae97e1.f207033m) {
                        Q0 = kz5.n0.Q0(c14940x2aae97e1.f207033m);
                    }
                    if (optInt == 1) {
                        java.util.Iterator it = Q0.iterator();
                        while (it.hasNext()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pk pkVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pk) ((kt2.a) it.next());
                            pkVar.getClass();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGiftPlayMagicRewardWidget", "onAnimationStart");
                            d75.b.g(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ok(pkVar.f200922b));
                        }
                    } else if (optInt == 2) {
                        java.util.Iterator it6 = Q0.iterator();
                        while (it6.hasNext()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pk pkVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pk) ((kt2.a) it6.next());
                            pkVar2.getClass();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGiftPlayMagicRewardWidget", "onAnimationEnd");
                            if (!pkVar2.f200921a) {
                                pkVar2.f200921a = true;
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rk rkVar = pkVar2.f200922b;
                                rkVar.f201188c = false;
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1623xc84f4f2f.p1624x373aa5.C14940x2aae97e1 c14940x2aae97e12 = rkVar.f201187b;
                                if (c14940x2aae97e12 != null) {
                                    c14940x2aae97e12.setVisibility(8);
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1623xc84f4f2f.p1624x373aa5.C14940x2aae97e1 c14940x2aae97e13 = rkVar.f201187b;
                                if (c14940x2aae97e13 != null) {
                                    c14940x2aae97e13.g(pkVar2);
                                }
                                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                                ((p3325xe03a0797.p3326xc267989b.r) pkVar2.f200923c).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE));
                            }
                        }
                    } else if (optInt == 3) {
                        java.util.Iterator it7 = Q0.iterator();
                        while (it7.hasNext()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pk pkVar3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pk) ((kt2.a) it7.next());
                            pkVar3.getClass();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGiftPlayMagicRewardWidget", "onAnimationCancel");
                            if (!pkVar3.f200921a) {
                                pkVar3.f200921a = true;
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rk rkVar2 = pkVar3.f200922b;
                                rkVar2.f201188c = false;
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1623xc84f4f2f.p1624x373aa5.C14940x2aae97e1 c14940x2aae97e14 = rkVar2.f201187b;
                                if (c14940x2aae97e14 != null) {
                                    c14940x2aae97e14.setVisibility(8);
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1623xc84f4f2f.p1624x373aa5.C14940x2aae97e1 c14940x2aae97e15 = rkVar2.f201187b;
                                if (c14940x2aae97e15 != null) {
                                    c14940x2aae97e15.g(pkVar3);
                                }
                                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                                ((p3325xe03a0797.p3326xc267989b.r) pkVar3.f200923c).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE));
                            }
                        }
                    } else if (optInt == 4) {
                        java.util.Iterator it8 = Q0.iterator();
                        while (it8.hasNext()) {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pk) ((kt2.a) it8.next())).getClass();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGiftPlayMagicRewardWidget", "onAnimationRepeat");
                        }
                    } else if (optInt != 5) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicRewardView", "unknown event: " + optInt);
                    } else {
                        java.util.Iterator it9 = Q0.iterator();
                        while (it9.hasNext()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pk pkVar4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pk) ((kt2.a) it9.next());
                            pkVar4.getClass();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGiftPlayMagicRewardWidget", "onAnimationTimeout");
                            if (!pkVar4.f200921a) {
                                pkVar4.f200921a = true;
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rk rkVar3 = pkVar4.f200922b;
                                rkVar3.f201188c = false;
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1623xc84f4f2f.p1624x373aa5.C14940x2aae97e1 c14940x2aae97e16 = rkVar3.f201187b;
                                if (c14940x2aae97e16 != null) {
                                    c14940x2aae97e16.setVisibility(8);
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1623xc84f4f2f.p1624x373aa5.C14940x2aae97e1 c14940x2aae97e17 = rkVar3.f201187b;
                                if (c14940x2aae97e17 != null) {
                                    c14940x2aae97e17.g(pkVar4);
                                }
                                p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                                ((p3325xe03a0797.p3326xc267989b.r) pkVar4.f200923c).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
                            }
                        }
                    }
                }
                s().mo146xb9724478(k());
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MRJsApiNotifyAnimationStatus", "notifyAnimationStatus with " + data);
        s().mo146xb9724478(i(lc3.x.f399470d));
    }
}
