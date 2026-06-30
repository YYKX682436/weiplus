package mm2;

/* loaded from: classes10.dex */
public final class v4 extends mm2.e {

    /* renamed from: p, reason: collision with root package name */
    public static final mm2.q4 f411008p = new mm2.q4(null);

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f411009f;

    /* renamed from: g, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f411010g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f411011h;

    /* renamed from: i, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f411012i;

    /* renamed from: m, reason: collision with root package name */
    public mm2.r4 f411013m;

    /* renamed from: n, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f411014n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.HashMap f411015o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f411009f = "Finder.LiveMilestoneLotterySlice";
        this.f411010g = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(null);
        this.f411011h = new java.util.concurrent.ConcurrentHashMap();
        this.f411012i = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(null);
        this.f411014n = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(null);
    }

    public final void N6(r45.f02 f02Var, java.lang.String str) {
        r45.l30 l30Var;
        r45.l30 l30Var2;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        java.lang.Object obj;
        java.util.LinkedList linkedList3;
        java.lang.Object obj2;
        java.lang.String str2 = f02Var.f455411d;
        boolean z17 = str2 == null || str2.length() == 0;
        java.lang.String str3 = this.f411009f;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "addOrReplaceLotteryInfo lotteryId empty");
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f411011h;
        r45.f02 f02Var2 = (r45.f02) concurrentHashMap.get(str2);
        if (f02Var2 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, str + ", addOrReplaceLotteryInfo replace");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, str + ", addOrReplaceLotteryInfo add");
        }
        if (f02Var2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "diffLotteryInfo prev is null");
        } else {
            if (pm0.v.z(f02Var2.f455414g, 1)) {
                f02Var.f455414g |= 1;
            }
            r45.tl4 tl4Var = f02Var2.f455412e;
            r45.tl4 tl4Var2 = f02Var.f455412e;
            if (tl4Var != null && tl4Var2 != null && tl4Var2.f468083i < tl4Var.f468083i) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "curBaseInfo.participate_count " + tl4Var2.f468083i + " < preBaseInfo.participate_count " + tl4Var.f468083i);
                tl4Var2.f468083i = tl4Var.f468083i;
            }
            r45.sl4 sl4Var = f02Var2.f455415h;
            java.lang.Object obj3 = null;
            if (sl4Var == null || (linkedList3 = sl4Var.f467366f) == null) {
                l30Var = null;
            } else {
                java.util.Iterator it = linkedList3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it.next();
                        if (((r45.l30) obj2).m75939xb282bd08(2) > 0) {
                            break;
                        }
                    }
                }
                l30Var = (r45.l30) obj2;
            }
            r45.sl4 sl4Var2 = f02Var.f455415h;
            if (sl4Var2 == null || (linkedList2 = sl4Var2.f467366f) == null) {
                l30Var2 = null;
            } else {
                java.util.Iterator it6 = linkedList2.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it6.next();
                        if (((r45.l30) obj).m75939xb282bd08(2) > 0) {
                            break;
                        }
                    }
                }
                l30Var2 = (r45.l30) obj;
            }
            if (l30Var != null && l30Var2 == null) {
                r45.sl4 sl4Var3 = f02Var.f455415h;
                if (sl4Var3 != null && (linkedList = sl4Var3.f467366f) != null) {
                    java.util.Iterator it7 = linkedList.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it7.next();
                        if (((r45.l30) next).m75939xb282bd08(0) == l30Var.m75939xb282bd08(0)) {
                            obj3 = next;
                            break;
                        }
                    }
                    r45.l30 l30Var3 = (r45.l30) obj3;
                    if (l30Var3 != null) {
                        l30Var3.set(2, java.lang.Integer.valueOf(l30Var.m75939xb282bd08(2)));
                        if (l30Var3.m75939xb282bd08(3) < l30Var.m75939xb282bd08(3)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "current.select_count " + l30Var3.m75939xb282bd08(3) + " < preVotedChoice.select_count " + l30Var.m75939xb282bd08(3));
                            l30Var3.set(3, java.lang.Integer.valueOf(l30Var.m75939xb282bd08(3)));
                        }
                    }
                }
            } else if (l30Var != null && l30Var2 != null && l30Var2.m75939xb282bd08(3) < l30Var.m75939xb282bd08(3)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "current2.select_count " + l30Var2.m75939xb282bd08(3) + " < preVotedChoice.select_count " + l30Var.m75939xb282bd08(3));
                l30Var2.set(3, java.lang.Integer.valueOf(l30Var.m75939xb282bd08(3)));
            }
        }
        if (f02Var2 != null) {
            mm2.w4.a(f02Var2, str3, "addOrReplaceLotteryInfo prev,");
        }
        mm2.w4.a(f02Var, str3, "addOrReplaceLotteryInfo cur,");
        concurrentHashMap.put(str2, f02Var);
    }

    public final java.lang.Object O6(java.lang.String lotteryId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lotteryId, "lotteryId");
        java.util.HashMap hashMap = this.f411015o;
        if (hashMap != null) {
            return hashMap.get(lotteryId);
        }
        return null;
    }

    public final mm2.r4 P6() {
        mm2.r4 r4Var;
        synchronized (this) {
            r4Var = this.f411013m;
        }
        return r4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q6(java.lang.String r20, android.content.Context r21, boolean r22, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r23) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mm2.v4.Q6(java.lang.String, android.content.Context, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void R6(r45.g02 g02Var, java.lang.String tag, java.lang.String prefix) {
        java.util.ArrayList arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(g02Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefix, "prefix");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderLiveMilestoneLotteryMetaInfo logInfo ");
        sb6.append(prefix);
        sb6.append(" wording:");
        sb6.append(g02Var.f456302e);
        sb6.append(", title:");
        sb6.append(g02Var.f456305h);
        sb6.append(", description:");
        sb6.append(g02Var.f456306i);
        sb6.append(", color infos = ");
        java.util.LinkedList<r45.ql4> linkedList = g02Var.f456308n;
        if (linkedList != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (r45.ql4 ql4Var : linkedList) {
                arrayList.add(ql4Var.f465620d + ": " + ql4Var.f465621e);
            }
        } else {
            arrayList = null;
        }
        sb6.append(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, sb6.toString());
        java.util.LinkedList<r45.dm4> infos = g02Var.f456301d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(infos, "infos");
        for (r45.dm4 dm4Var : infos) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, prefix + " infos, title:" + dm4Var.f454102d + ", button_status:" + dm4Var.f454105g + ", is_reserved:" + dm4Var.f454107i + ", is_attended:" + dm4Var.f454109n + ", sub_title:" + dm4Var.f454103e + ", start_time:" + dm4Var.f454104f + ", notice_id:" + dm4Var.f454106h + ", lottery_id:" + dm4Var.f454108m);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final r45.l30 S6(java.lang.String lotteryId, java.lang.Integer num) {
        r45.dm4 dm4Var;
        r45.sl4 sl4Var;
        java.util.LinkedList linkedList;
        r45.tl4 tl4Var;
        java.util.LinkedList linkedList2;
        java.lang.Object obj;
        java.lang.String str = this.f411009f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "participateLottery lottery:" + lotteryId + ", choiceId:" + num);
        r45.l30 l30Var = null;
        if (lotteryId == null || lotteryId.length() == 0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(str, "participateLottery lotteryId empty", new java.lang.Object[0]);
            return null;
        }
        r45.g02 g02Var = (r45.g02) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f411010g).mo144003x754a37bb();
        if (g02Var == null || (linkedList2 = g02Var.f456301d) == null) {
            dm4Var = null;
        } else {
            java.util.Iterator it = linkedList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.dm4) obj).f454108m, lotteryId)) {
                    break;
                }
            }
            dm4Var = (r45.dm4) obj;
        }
        if (dm4Var != null) {
            dm4Var.f454109n = 1;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lotteryId, "lotteryId");
        r45.f02 f02Var = (r45.f02) this.f411011h.get(lotteryId);
        if (f02Var != null) {
            int i17 = f02Var.f455414g;
            java.util.regex.Pattern pattern = pm0.v.f438335a;
            f02Var.f455414g = i17 | 1;
        }
        if (f02Var != null && (tl4Var = f02Var.f455412e) != null) {
            tl4Var.f468083i++;
        }
        if (num == null) {
            if (f02Var != null) {
                mm2.w4.a(f02Var, str, "participateLottery");
            }
            return null;
        }
        if (f02Var != null && (sl4Var = f02Var.f455415h) != null && (linkedList = sl4Var.f467366f) != null) {
            java.util.Iterator it6 = linkedList.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                java.lang.Object next = it6.next();
                if (((r45.l30) next).m75939xb282bd08(0) == num.intValue()) {
                    l30Var = next;
                    break;
                }
            }
            l30Var = l30Var;
        }
        if (l30Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "participateLottery choiceId:" + num + " not exist");
        } else {
            l30Var.set(2, 1);
            l30Var.set(3, java.lang.Integer.valueOf(l30Var.m75939xb282bd08(3) + 1));
        }
        if (f02Var != null) {
            mm2.w4.a(f02Var, str, "participateLottery");
        }
        return l30Var;
    }

    public final java.lang.Object T6(r45.gn3 gn3Var, java.lang.Class cls, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return f411008p.a(this.f411009f, ((mm2.c1) m147920xbba4bfc0(mm2.c1.class)).f410385o, ((mm2.e1) m147920xbba4bfc0(mm2.e1.class)).f410518o, ((mm2.e1) m147920xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) m147920xbba4bfc0(mm2.e1.class)).f410516m, gn3Var, cls, interfaceC29045xdcb5ca57);
    }

    public final void U6(r45.f02 lotteryInfo, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lotteryInfo, "lotteryInfo");
        N6(lotteryInfo, "getlivemsg");
        if (z17) {
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f411014n).k(lotteryInfo);
        } else {
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f411012i).k(lotteryInfo);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        if ((r10 == null || r10.length() == 0) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0074, code lost:
    
        if ((r9 == null || r9.length() == 0) == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V6(r45.g02 r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mm2.v4.V6(r45.g02, boolean):void");
    }

    public final void W6(java.lang.String lotteryId, java.lang.Object resultInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lotteryId, "lotteryId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultInfo, "resultInfo");
        java.util.HashMap hashMap = this.f411015o;
        if (hashMap == null) {
            hashMap = new java.util.HashMap();
        }
        this.f411015o = hashMap;
        hashMap.put(lotteryId, resultInfo);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f411009f, "setClaimed lotteryId:" + lotteryId + ',' + pm0.b0.g(resultInfo));
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f411010g).k(null);
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f411012i).k(null);
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f411014n).k(null);
        this.f411013m = null;
        this.f411011h.clear();
    }
}
