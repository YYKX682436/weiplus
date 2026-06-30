package hc2;

/* loaded from: classes2.dex */
public abstract class m0 {
    public static final java.lang.String a(r45.hj2 hj2Var, android.app.Activity activity) {
        java.lang.String m59210xe5e0d2a0;
        r45.zi2 zi2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        boolean z17 = hj2Var != null && hj2Var.m75939xb282bd08(14) == 1;
        boolean z18 = hj2Var != null && hj2Var.m75939xb282bd08(13) == 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(b(activity));
        if ((z17 || !z18) && h17 != null ? (m59210xe5e0d2a0 = h17.m59210xe5e0d2a0()) == null : !(hj2Var != null && (zi2Var = (r45.zi2) hj2Var.m75936x14adae67(3)) != null && (m59210xe5e0d2a0 = zi2Var.m75945x2fec8307(1)) != null)) {
            m59210xe5e0d2a0 = "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getMusicCoverUrl] isAudio:");
        sb6.append(z17);
        sb6.append(" hasCopyright:");
        sb6.append(z18);
        sb6.append(" feed:");
        sb6.append(h17 != null);
        sb6.append(" coverUrl:");
        sb6.append(m59210xe5e0d2a0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMusicExt", sb6.toString());
        return m59210xe5e0d2a0;
    }

    public static final long b(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        android.content.Intent intent = activity.getIntent();
        long longExtra = intent != null ? intent.getLongExtra("key_feed_id", 0L) : 0L;
        if (longExtra != 0 && bu2.j.f106067a.h(longExtra) != null) {
            return longExtra;
        }
        pf5.z zVar = pf5.z.f435481a;
        if (!(activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ea2.k0 k0Var = (ea2.k0) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).e(ea2.k0.class);
        if (k0Var == null) {
            return 0L;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.p1427x9da2e250.C13648x75a87560 c13648x75a87560 = k0Var.I;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = null;
        if (c13648x75a87560 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13918xdafe8cba c13918xdafe8cba = ((ea2.j0) zVar.b(c13648x75a87560).a(ea2.j0.class)).f183499r;
            if (c13918xdafe8cba == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
                throw null;
            }
            java.util.List<E> m56392xfc5c33e5 = c13918xdafe8cba.m56392xfc5c33e5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5.class);
            if (m56392xfc5c33e5 != 0) {
                abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) kz5.n0.Z(m56392xfc5c33e5);
            }
        }
        if (abstractC14490x69736cb5 != null) {
            return abstractC14490x69736cb5.mo2128x1ed62e84();
        }
        return 0L;
    }

    public static final java.lang.String c(r45.hj2 hj2Var, android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079) {
        java.lang.String str;
        r45.zi2 zi2Var;
        java.lang.String m75945x2fec8307;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (c14994x9b99c079 == null) {
            c14994x9b99c079 = bu2.j.f106067a.h(b(activity));
        }
        java.lang.String str2 = "";
        if (c14994x9b99c079 == null || (str = c14994x9b99c079.m59273x80025a04()) == null) {
            str = "";
        }
        int i17 = 0;
        boolean z17 = hj2Var != null && hj2Var.m75939xb282bd08(14) == 1;
        boolean z18 = hj2Var != null && hj2Var.m75939xb282bd08(13) == 0;
        if ((str.length() > 0) && (z17 || !z18)) {
            i17 = com.p314xaae8f345.mm.R.C30867xcad56011.low;
        }
        if (i17 != 0) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String string = activity.getResources().getString(i17, str);
            ((ke0.e) xVar).getClass();
            str2 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(activity, string).toString();
        } else if (hj2Var != null && (zi2Var = (r45.zi2) hj2Var.m75936x14adae67(3)) != null && (m75945x2fec8307 = zi2Var.m75945x2fec8307(2)) != null) {
            str2 = m75945x2fec8307;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMusicExt", "[getMusicTopicName] isAudio:" + z17 + " hasCopyRight:" + z18 + " nickName:" + str + " topicName:" + str2);
        return str2;
    }
}
