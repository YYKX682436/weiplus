package ey2;

/* loaded from: classes2.dex */
public class f2 extends pf5.o0 {

    /* renamed from: e, reason: collision with root package name */
    public final android.util.ArrayMap f338905e = new android.util.ArrayMap();

    /* renamed from: f, reason: collision with root package name */
    public final android.util.ArrayMap f338906f = new android.util.ArrayMap();

    public int N6(java.lang.String source, int i17, java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        android.util.ArrayMap arrayMap = this.f338906f;
        java.lang.Integer num = (java.lang.Integer) arrayMap.get(username);
        if (num == null) {
            num = -1;
        }
        int intValue = num.intValue();
        if (intValue != -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTabStateCacheVM", source + " use cache tab index=" + intValue);
            return intValue;
        }
        if (i17 == 1) {
            int O6 = O6(source, "FinderMessageEntryRight", username);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTabStateCacheVM", source + " use extInfo index=" + O6);
            if (O6 != -1) {
                return O6;
            }
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.f338905e.get(username);
        java.lang.Integer num2 = concurrentHashMap != null ? (java.lang.Integer) concurrentHashMap.get(java.lang.Integer.valueOf(i17)) : null;
        boolean z17 = false;
        int intValue2 = num2 == null ? 0 : num2.intValue();
        java.lang.Integer[] numArr = {0, 0, 0};
        R6(i17, numArr, username);
        jz5.l P6 = P6(numArr, true);
        arrayMap.put(username, java.lang.Integer.valueOf(intValue2));
        if ((intValue2 >= 0 && intValue2 < 3 ? numArr : null) != null && numArr[intValue2].intValue() == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTabStateCacheVM", source + " red dot index =" + intValue2);
            return intValue2;
        }
        if (((java.lang.Number) P6.f384366d).intValue() > 0) {
            java.lang.Object obj = P6.f384367e;
            arrayMap.put(username, obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTabStateCacheVM", source + " use num red dot index=" + ((java.lang.Number) obj).intValue());
            return ((java.lang.Number) obj).intValue();
        }
        jz5.l P62 = P6(numArr, false);
        if (intValue2 >= 0 && intValue2 < 3) {
            z17 = true;
        }
        if ((z17 ? numArr : null) != null && numArr[intValue2].intValue() == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTabStateCacheVM", source + " red dot index =" + intValue2);
            return intValue2;
        }
        if (((java.lang.Number) P62.f384366d).intValue() > 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(source);
            sb6.append(" use normal red dot index=");
            java.lang.Object obj2 = P62.f384367e;
            sb6.append(((java.lang.Number) obj2).intValue());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTabStateCacheVM", sb6.toString());
            arrayMap.put(username, obj2);
            return ((java.lang.Number) obj2).intValue();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTabStateCacheVM", source + " use name cache username=" + username + ",index=" + intValue2 + ",type:" + i17);
        return intValue2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int O6(java.lang.String source, java.lang.String path, java.lang.String str) {
        r45.b03 b03Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        r45.f03 b07 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().b0(path, str);
        int i17 = 1;
        if ((b07 != null && b07.f455427n == 5) != true) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(source);
            sb6.append(" [getEnterTabIndexBy] username=");
            sb6.append(str);
            sb6.append(",path=");
            sb6.append(path);
            sb6.append(", index=-1,show_ext_info_type:");
            sb6.append(b07 != null ? java.lang.Integer.valueOf(b07.f455427n) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTabStateCacheVM", sb6.toString());
            return -1;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = b07.f455428o;
        byte[] g17 = gVar != null ? gVar.g() : null;
        if (g17 != null) {
            b03Var = new r45.b03();
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(b03Var.mo11468x92b714fd(g17));
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
        } else {
            b03Var = new r45.b03();
        }
        if (b03Var.m75939xb282bd08(0) == 1) {
            i17 = 0;
        } else if (b03Var.m75939xb282bd08(0) != 2) {
            i17 = b03Var.m75939xb282bd08(0) == 3 ? 2 : -1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTabStateCacheVM", source + " [getEnterTabIndexBy] username=" + str + ",path=" + path + ", index=" + i17);
        this.f338906f.put(str, java.lang.Integer.valueOf(i17));
        return i17;
    }

    public final jz5.l P6(java.lang.Integer[] numArr, boolean z17) {
        int length = numArr.length;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i27 = -1;
        while (i17 < length) {
            int i28 = i19 + 1;
            int intValue = numArr[i17].intValue();
            if (z17 && intValue == 2) {
                i18++;
                if (i27 != -1) {
                    i17++;
                    i19 = i28;
                }
                i27 = i19;
                i17++;
                i19 = i28;
            } else {
                if (!z17 && intValue == 1) {
                    i18++;
                    if (i27 != -1) {
                    }
                    i27 = i19;
                }
                i17++;
                i19 = i28;
            }
        }
        return new jz5.l(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i27));
    }

    public final int Q6(r45.f03 f03Var) {
        if (f03Var != null) {
            return (f03Var.f455421e <= 0 || f03Var.f455420d != 2) ? 1 : 2;
        }
        return 0;
    }

    public void R6(int i17, java.lang.Integer[] redDotFlags, java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redDotFlags, "redDotFlags");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        if (i17 == 1) {
            r45.f03 b07 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().b0("NotificationCenterLike", username);
            r45.f03 b08 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().b0("NotificationCenterComment", username);
            r45.f03 b09 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().b0("NotificationCenterFollow", username);
            redDotFlags[0] = java.lang.Integer.valueOf(Q6(b07));
            redDotFlags[1] = java.lang.Integer.valueOf(Q6(b08));
            redDotFlags[2] = java.lang.Integer.valueOf(Q6(b09));
            return;
        }
        r45.f03 b010 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().b0("MemberNotificationCenterLike", username);
        r45.f03 b011 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().b0("MemberNotificationCenterComment", username);
        r45.f03 b012 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().b0("MemberNotificationCenterJoin", username);
        redDotFlags[0] = java.lang.Integer.valueOf(Q6(b010));
        redDotFlags[1] = java.lang.Integer.valueOf(Q6(b011));
        redDotFlags[2] = java.lang.Integer.valueOf(Q6(b012));
    }

    public final void S6(int i17, int i18, java.lang.String username) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTagCacheVm", "username:" + username + " type=" + i17 + " tabIndex=" + i18 + ' ');
        android.util.ArrayMap arrayMap = this.f338905e;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) arrayMap.get(username);
        if (concurrentHashMap != null) {
            concurrentHashMap.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = new java.util.concurrent.ConcurrentHashMap();
            concurrentHashMap2.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            arrayMap.put(username, concurrentHashMap2);
        }
        this.f338906f.put(username, -1);
    }
}
