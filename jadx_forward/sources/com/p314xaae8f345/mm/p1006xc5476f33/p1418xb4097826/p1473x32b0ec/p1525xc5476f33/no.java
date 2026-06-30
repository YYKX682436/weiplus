package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class no extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap f195198d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f195199e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 f195200f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap apVar, android.view.ViewGroup viewGroup, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 l1Var) {
        super(0);
        this.f195198d = apVar;
        this.f195199e = viewGroup;
        this.f195200f = l1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.animation.ValueAnimator valueAnimator;
        r45.kv1 kv1Var;
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList m75941xfb8219142;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "relaunchBulletInAnimation, BulletShowingInfo=" + this.f195198d.A.get(this.f195199e) + ", giftShowInfo=" + this.f195200f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn tnVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) this.f195198d.A.get(this.f195199e);
        if (tnVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap apVar = this.f195198d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 l1Var = this.f195200f;
            android.view.ViewGroup viewGroup = this.f195199e;
            df2.wy wyVar = (df2.wy) apVar.U0(df2.wy.class);
            if (wyVar != null) {
                wyVar.g7(l1Var);
            }
            tf2.k kVar = (tf2.k) apVar.U0(tf2.k.class);
            if (kVar != null) {
                kVar.a7(l1Var);
            }
            java.lang.String str = "bulletInfoMap " + viewGroup + " giftShowInfo:" + l1Var.f197127i + " reward:" + l1Var.f197128m + " comboSumCount:" + tnVar.f195975i;
            if (l1Var.f197127i > tnVar.f195975i) {
                tnVar.f195975i = l1Var.f197127i;
            } else {
                tnVar.f195975i += l1Var.f197128m;
            }
            tnVar.e(tnVar.f195975i, l1Var.f197132q, l1Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "loginfo " + str + " result " + tnVar.f195975i);
            java.lang.Object obj = null;
            if (tnVar.f195972f.get()) {
                if (tnVar.f195983q == 0 && tnVar.f195984r == 0) {
                    apVar.I.mo50302x6b17ad39(viewGroup);
                    apVar.f193447J = false;
                    apVar.Q1(l1Var, true);
                    tnVar.f195984r = c01.id.c();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "relaunchBulletInAnimation: restart precious gift, startShowingTime = " + tnVar.f195984r);
                } else {
                    r45.cj1 cj1Var = l1Var.f197125g;
                    java.lang.String m75945x2fec8307 = cj1Var != null ? cj1Var.m75945x2fec8307(0) : null;
                    r45.xv1 xv1Var = l1Var.f197136u;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appendFullScreenPreciousGift giftId:");
                    sb6.append(m75945x2fec8307);
                    sb6.append(" targetUsername:");
                    sb6.append(l1Var.f197134s);
                    sb6.append(" curPkUser:");
                    km2.q l76 = ((mm2.o4) apVar.P0(mm2.o4.class)).l7();
                    sb6.append(l76 != null ? l76.f390705c : null);
                    sb6.append(" randomItem:");
                    sb6.append((xv1Var == null || (m75941xfb8219142 = xv1Var.m75941xfb821914(1)) == null) ? null : java.lang.Integer.valueOf(m75941xfb8219142.size()));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", sb6.toString());
                    android.os.Bundle bundle = new android.os.Bundle();
                    if ((xv1Var == null || (m75941xfb821914 = xv1Var.m75941xfb821914(1)) == null || !(m75941xfb821914.isEmpty() ^ true)) ? false : true) {
                        bundle.putString("PARAM_LIVE_GIFT_INFO_Id", m75945x2fec8307);
                        bundle.putByteArray("PARAM_LIVE_GIFT_RANDOM_ITEM", xv1Var.mo14344x5f01b1f6());
                        r45.cj1 cj1Var2 = l1Var.f197125g;
                        if (cj1Var2 != null && (kv1Var = (r45.kv1) cj1Var2.m75936x14adae67(3)) != null) {
                            bundle.putByteArray("PARAM_LIVE_GIFT_INFO", kv1Var.mo14344x5f01b1f6());
                        }
                        apVar.f193448p.mo46557x60d69242(qo0.b.W1, bundle);
                    }
                }
                java.lang.String str2 = l1Var.f197133r;
                if (str2 == null) {
                    str2 = "";
                }
                apVar.W1(str2, tnVar, l1Var.f197128m, l1Var);
            }
            if (!tnVar.C) {
                android.animation.ValueAnimator valueAnimator2 = (android.animation.ValueAnimator) ((java.util.concurrent.ConcurrentHashMap) apVar.C).get(viewGroup);
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    valueAnimator2.cancel();
                }
                if (tnVar.f195971e && (valueAnimator = (android.animation.ValueAnimator) ((java.util.concurrent.ConcurrentHashMap) apVar.B).get(viewGroup)) != null) {
                    valueAnimator.start();
                }
                viewGroup.setAlpha(1.0f);
                viewGroup.setVisibility(0);
                if (!tnVar.f195972f.get()) {
                    android.animation.ValueAnimator valueAnimator3 = (android.animation.ValueAnimator) ((java.util.concurrent.ConcurrentHashMap) apVar.B).get(viewGroup);
                    if (valueAnimator3 != null) {
                        valueAnimator3.setCurrentPlayTime(550L);
                    }
                } else if (apVar.H.e()) {
                    java.util.Iterator mo144672x467c086e = ((kz5.k0) kz5.n0.J(apVar.A.entrySet())).mo144672x467c086e();
                    while (true) {
                        if (!mo144672x467c086e.hasNext()) {
                            break;
                        }
                        java.lang.Object next = mo144672x467c086e.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((java.util.Map.Entry) next).getKey(), viewGroup)) {
                            obj = next;
                            break;
                        }
                    }
                    apVar.w1((java.util.Map.Entry) obj);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
