package bk4;

/* loaded from: classes11.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public static final bk4.d2 f102989a = new bk4.d2();

    public static java.lang.String c(bk4.d2 d2Var, java.util.Calendar calendar, java.lang.String separate, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            separate = "-";
        }
        d2Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(calendar, "calendar");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(separate, "separate");
        int i18 = calendar.get(5);
        int i19 = calendar.get(2);
        return calendar.get(1) + separate + i19 + separate + i18;
    }

    public final java.util.Calendar a(long j17) {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f);
        java.util.Date parse = simpleDateFormat.parse(simpleDateFormat.format(java.lang.Long.valueOf(j17)));
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(parse);
        return calendar;
    }

    public final java.lang.String b(mj4.h info, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int e17 = c01.id.e() - ((mj4.k) info).f408600b.f76512x81959a6e;
        if (e17 < 0) {
            e17 = 0;
        }
        int i17 = e17 / 60;
        if (i17 < 1) {
            i17 = 1;
        }
        if (i17 < 60) {
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jx7, java.lang.Integer.valueOf(i17));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            return string;
        }
        int i18 = i17 / 60;
        java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jx6, java.lang.Integer.valueOf(i18 >= 1 ? i18 : 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        return string2;
    }
}
