package bu2;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final bu2.j f106067a = new bu2.j();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.c0 f106068b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.c0(200);

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f106069c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f106070d = new java.util.HashMap();

    public final void a(int i17, java.util.List feeds) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feeds, "feeds");
        java.util.HashMap hashMap = f106069c;
        synchronized (hashMap) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            java.lang.Object obj = hashMap.get(valueOf);
            if (obj == null) {
                obj = new android.util.LongSparseArray();
                hashMap.put(valueOf, obj);
            }
            android.util.LongSparseArray longSparseArray = (android.util.LongSparseArray) obj;
            java.util.Iterator it = feeds.iterator();
            while (it.hasNext()) {
                longSparseArray.put(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it.next()).m76784x5db1b11(), java.lang.Long.valueOf(c01.id.c()));
            }
        }
    }

    public final java.lang.String b(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, r45.sm2 sm2Var, r45.sm2 sm2Var2) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = h(c19792x256d2725.m76784x5db1b11());
        int m76758x8ed22866 = (h17 == null || (feedObject = h17.getFeedObject()) == null) ? -1 : feedObject.m76758x8ed22866();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("commentCount[local=");
        sb6.append(m76758x8ed22866);
        sb6.append(" -> yes=");
        sb6.append(sm2Var.m75939xb282bd08(0));
        sb6.append("](no=");
        sb6.append(sm2Var2 != null ? java.lang.Integer.valueOf(sm2Var2.m75939xb282bd08(0)) : null);
        sb6.append(')');
        java.lang.String sb7 = sb6.toString();
        c19792x256d2725.m76851xc51b2372(sm2Var.m75939xb282bd08(0));
        g(c19792x256d2725).set(1, sm2Var);
        return sb7;
    }

    public final java.lang.String c(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, r45.ll2 ll2Var, r45.ll2 ll2Var2) {
        if (cm2.a.f124861a.t(c19792x256d2725)) {
            return "live feed cnt not need change by FinderObjectCountInfo";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = h(c19792x256d2725.m76784x5db1b11());
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject = h17 != null ? h17.getFeedObject() : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("likeCount[local=");
        sb6.append(feedObject != null ? feedObject.m76791xf4204902() : -1);
        sb6.append(" -> yes=");
        sb6.append(ll2Var.m75939xb282bd08(0));
        sb6.append("](no=");
        sb6.append(ll2Var2 != null ? java.lang.Integer.valueOf(ll2Var2.m75939xb282bd08(0)) : null);
        sb6.append(") forwardCount[local=");
        sb6.append(feedObject != null ? feedObject.m76776x4ec953c0() : -1);
        sb6.append(" -> yes=");
        sb6.append(ll2Var.m75939xb282bd08(1));
        sb6.append("](no=");
        sb6.append(ll2Var2 != null ? java.lang.Integer.valueOf(ll2Var2.m75939xb282bd08(1)) : null);
        sb6.append(") readCount[local=");
        sb6.append(feedObject != null ? feedObject.m76817xbb830663() : -1);
        sb6.append(" -> yes=");
        sb6.append(ll2Var.m75939xb282bd08(2));
        sb6.append("](no=");
        sb6.append(ll2Var2 != null ? java.lang.Integer.valueOf(ll2Var2.m75939xb282bd08(2)) : null);
        sb6.append(") favCount[local=");
        sb6.append(feedObject != null ? feedObject.m76768xb80ecc2a() : -1);
        sb6.append(" -> yes=");
        sb6.append(ll2Var.m75939xb282bd08(3));
        sb6.append("](no=");
        sb6.append(ll2Var2 != null ? java.lang.Integer.valueOf(ll2Var2.m75939xb282bd08(3)) : null);
        sb6.append(") ");
        java.lang.String sb7 = sb6.toString();
        c19792x256d2725.m76884x50740976(ll2Var.m75939xb282bd08(0));
        c19792x256d2725.m76869x85124ecc(ll2Var.m75939xb282bd08(1));
        c19792x256d2725.m76910x17d6c6d7(ll2Var.m75939xb282bd08(2));
        c19792x256d2725.m76861xb2c72d36(ll2Var.m75939xb282bd08(3));
        g(c19792x256d2725).set(0, ll2Var);
        return sb7;
    }

    public final java.lang.String d(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, r45.um2 um2Var, r45.um2 um2Var2) {
        r45.pm2 pm2Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject;
        r45.dm2 m76806xdef68064;
        r45.pm2 pm2Var2;
        r45.um2 um2Var3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = h(c19792x256d2725.m76784x5db1b11());
        int m75939xb282bd08 = (h17 == null || (feedObject = h17.getFeedObject()) == null || (m76806xdef68064 = feedObject.m76806xdef68064()) == null || (pm2Var2 = (r45.pm2) m76806xdef68064.m75936x14adae67(12)) == null || (um2Var3 = (r45.um2) pm2Var2.m75936x14adae67(2)) == null) ? -1 : um2Var3.m75939xb282bd08(0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("globalFavCount[local=");
        sb6.append(m75939xb282bd08);
        sb6.append(" -> yes=");
        sb6.append(um2Var.m75939xb282bd08(0));
        sb6.append("](no=");
        r45.um2 um2Var4 = null;
        sb6.append(um2Var2 != null ? java.lang.Integer.valueOf(um2Var2.m75939xb282bd08(0)) : null);
        sb6.append(')');
        java.lang.String sb7 = sb6.toString();
        r45.dm2 m76806xdef680642 = c19792x256d2725.m76806xdef68064();
        if (m76806xdef680642 != null && (pm2Var = (r45.pm2) m76806xdef680642.m75936x14adae67(12)) != null) {
            um2Var4 = (r45.um2) pm2Var.m75936x14adae67(2);
        }
        if (um2Var4 != null) {
            um2Var4.set(0, java.lang.Integer.valueOf(um2Var.m75939xb282bd08(0)));
        }
        g(c19792x256d2725).set(2, um2Var);
        return sb7;
    }

    public final java.lang.String e(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, r45.ym2 ym2Var, r45.ym2 ym2Var2) {
        r45.pm2 pm2Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject;
        r45.dm2 m76806xdef68064;
        r45.pm2 pm2Var2;
        r45.ym2 ym2Var3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = h(c19792x256d2725.m76784x5db1b11());
        int m75939xb282bd08 = (h17 == null || (feedObject = h17.getFeedObject()) == null || (m76806xdef68064 = feedObject.m76806xdef68064()) == null || (pm2Var2 = (r45.pm2) m76806xdef68064.m75936x14adae67(12)) == null || (ym2Var3 = (r45.ym2) pm2Var2.m75936x14adae67(4)) == null) ? -1 : ym2Var3.m75939xb282bd08(0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("thumbUpCount[local=");
        sb6.append(m75939xb282bd08);
        sb6.append(" -> yes=");
        sb6.append(ym2Var.m75939xb282bd08(0));
        sb6.append("](no=");
        r45.ym2 ym2Var4 = null;
        sb6.append(ym2Var2 != null ? java.lang.Integer.valueOf(ym2Var2.m75939xb282bd08(0)) : null);
        sb6.append(')');
        java.lang.String sb7 = sb6.toString();
        r45.dm2 m76806xdef680642 = c19792x256d2725.m76806xdef68064();
        if (m76806xdef680642 != null && (pm2Var = (r45.pm2) m76806xdef680642.m75936x14adae67(12)) != null) {
            ym2Var4 = (r45.ym2) pm2Var.m75936x14adae67(4);
        }
        if (ym2Var4 != null) {
            ym2Var4.set(0, java.lang.Integer.valueOf(ym2Var.m75939xb282bd08(0)));
        }
        g(c19792x256d2725).set(4, ym2Var);
        return sb7;
    }

    public final java.lang.String f(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, r45.zm2 zm2Var, r45.zm2 zm2Var2) {
        r45.pm2 pm2Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject;
        r45.dm2 m76806xdef68064;
        r45.pm2 pm2Var2;
        r45.zm2 zm2Var3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = h(c19792x256d2725.m76784x5db1b11());
        int m75939xb282bd08 = (h17 == null || (feedObject = h17.getFeedObject()) == null || (m76806xdef68064 = feedObject.m76806xdef68064()) == null || (pm2Var2 = (r45.pm2) m76806xdef68064.m75936x14adae67(12)) == null || (zm2Var3 = (r45.zm2) pm2Var2.m75936x14adae67(5)) == null) ? 0 : zm2Var3.m75939xb282bd08(0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("thumbUpFlag[local=");
        sb6.append(m75939xb282bd08);
        sb6.append(" -> yes=");
        sb6.append(zm2Var.m75939xb282bd08(0));
        sb6.append("](no=");
        r45.zm2 zm2Var4 = null;
        sb6.append(zm2Var2 != null ? java.lang.Integer.valueOf(zm2Var2.m75939xb282bd08(0)) : null);
        sb6.append(')');
        java.lang.String sb7 = sb6.toString();
        r45.dm2 m76806xdef680642 = c19792x256d2725.m76806xdef68064();
        if (m76806xdef680642 != null && (pm2Var = (r45.pm2) m76806xdef680642.m75936x14adae67(12)) != null) {
            zm2Var4 = (r45.zm2) pm2Var.m75936x14adae67(5);
        }
        if (zm2Var4 != null) {
            zm2Var4.set(0, java.lang.Integer.valueOf(zm2Var.m75939xb282bd08(0)));
        }
        g(c19792x256d2725).set(5, zm2Var);
        return sb7;
    }

    public final r45.pm2 g(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725) {
        r45.dm2 m76806xdef68064;
        if (c19792x256d2725.m76806xdef68064() == null) {
            c19792x256d2725.m76899x71cce6d8(new r45.dm2());
        }
        r45.dm2 m76806xdef680642 = c19792x256d2725.m76806xdef68064();
        if ((m76806xdef680642 != null ? (r45.pm2) m76806xdef680642.m75936x14adae67(12) : null) == null && (m76806xdef68064 = c19792x256d2725.m76806xdef68064()) != null) {
            m76806xdef68064.set(12, new r45.pm2());
        }
        r45.dm2 m76806xdef680643 = c19792x256d2725.m76806xdef68064();
        r45.pm2 pm2Var = m76806xdef680643 != null ? (r45.pm2) m76806xdef680643.m75936x14adae67(12) : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(pm2Var);
        return pm2Var;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h(long j17) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) f106068b.b(java.lang.Long.valueOf(j17));
    }

    public final boolean i(int i17, long j17) {
        boolean z17;
        java.util.HashMap hashMap = f106070d;
        synchronized (hashMap) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            java.lang.Object obj = hashMap.get(valueOf);
            if (obj == null) {
                obj = new android.util.LongSparseArray();
                hashMap.put(valueOf, obj);
            }
            z17 = ((android.util.LongSparseArray) obj).indexOfKey(j17) >= 0;
        }
        return z17;
    }

    public final boolean j(long j17, bu2.i iVar) {
        return j17 != 0 && (iVar instanceof bu2.h);
    }

    public final int k(r45.jn2 jn2Var, r45.jn2 jn2Var2) {
        if (jn2Var != null && jn2Var.m75933x41a8a7f2(1)) {
            return 0;
        }
        long m75942xfb822ef2 = jn2Var != null ? jn2Var.m75942xfb822ef2(0) : -1L;
        long m75942xfb822ef22 = jn2Var2 != null ? jn2Var2.m75942xfb822ef2(0) : -1L;
        if (m75942xfb822ef2 > m75942xfb822ef22) {
            return 1;
        }
        return m75942xfb822ef2 == m75942xfb822ef22 ? -1 : -1000;
    }

    public final boolean l(long j17) {
        f106068b.e(java.lang.Long.valueOf(j17));
        return true;
    }

    public final java.lang.String m(int i17) {
        return i17 != -1000 ? i17 != -100 ? i17 != -1 ? i17 != 0 ? "(newVersion>oldVersion)" : "(override)" : "(newVersion=oldVersion)" : "(monotonic_data=null)" : "(newVersion<oldVersion)";
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        if ((r4 != null && r4.m75939xb282bd08(2) == 6) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ea, code lost:
    
        if (j(r28.m59233x87980ca(), r29) != false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 r28, bu2.i r29) {
        /*
            Method dump skipped, instructions count: 2388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bu2.j.n(com.tencent.mm.plugin.finder.storage.FinderItem, bu2.i):boolean");
    }

    public final boolean o(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 item, bu2.i source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        if (f106068b.b(java.lang.Long.valueOf(item.f66939xc8a07680)) == null) {
            return n(item, source);
        }
        return false;
    }
}
