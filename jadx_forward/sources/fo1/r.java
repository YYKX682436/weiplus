package fo1;

/* loaded from: classes5.dex */
public abstract class r {
    public static final java.lang.String a(long j17) {
        java.lang.String str;
        java.lang.Object sb6;
        android.text.format.Time time = new android.text.format.Time();
        time.set(j17);
        android.text.format.Time time2 = new android.text.format.Time();
        time2.setToNow();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (time.monthDay != time2.monthDay) {
            str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fda) + ' ';
        } else {
            str = "";
        }
        if (k35.m1.i()) {
            sb6 = k35.s.a("kk:mm", time);
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append((java.lang.Object) k35.m1.b(context, time.hour));
            sb7.append((java.lang.Object) k35.s.a("hh:mm", time));
            sb6 = sb7.toString();
        }
        return str + sb6;
    }

    public static final java.lang.String b(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.p0 p0Var) {
        java.lang.String h17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p0Var, "<this>");
        long j17 = p0Var.f297483h;
        if (j17 < 102400) {
            java.lang.String g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.mzs);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g17);
            return g17;
        }
        java.lang.String f07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(j17);
        long j18 = p0Var.f297484i;
        if (j18 < 60000) {
            h17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.mwc);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "getString(...)");
        } else {
            long j19 = j18 / com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;
            if (j19 < 60) {
                h17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.h(com.p314xaae8f345.mm.R.C30867xcad56011.mwd, java.lang.Long.valueOf(j19));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "getString(...)");
            } else {
                h17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.h(com.p314xaae8f345.mm.R.C30867xcad56011.mwb, java.lang.Long.valueOf(java.lang.Math.min(j19 / 60, 99L)));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "getString(...)");
            }
        }
        java.lang.String h18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.h(com.p314xaae8f345.mm.R.C30867xcad56011.mzr, h17, f07);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h18);
        return h18;
    }

    public static final java.lang.String c(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c9, android.content.Context ctx) {
        java.lang.String string;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c12853x6acde7c9, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        int ordinal = c12853x6acde7c9.f174263d.ordinal();
        if (ordinal == 0) {
            string = ctx.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mvp);
        } else if (ordinal == 1) {
            java.util.List list = c12853x6acde7c9.f174264e;
            boolean isEmpty = list.isEmpty();
            java.util.List list2 = c12853x6acde7c9.f174265f;
            string = isEmpty ? ctx.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574400mz0, java.lang.Integer.valueOf(list2.size())) : list2.isEmpty() ? ctx.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574401mz1, java.lang.Integer.valueOf(list.size())) : ctx.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574402mz2, java.lang.Integer.valueOf(list.size()), java.lang.Integer.valueOf(list2.size()));
        } else {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            string = ctx.getString(com.p314xaae8f345.mm.R.C30867xcad56011.myt);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        return string;
    }
}
