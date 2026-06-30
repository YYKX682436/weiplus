package bk4;

/* loaded from: classes11.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public static final bk4.d2 f21456a = new bk4.d2();

    public static java.lang.String c(bk4.d2 d2Var, java.util.Calendar calendar, java.lang.String separate, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            separate = "-";
        }
        d2Var.getClass();
        kotlin.jvm.internal.o.g(calendar, "calendar");
        kotlin.jvm.internal.o.g(separate, "separate");
        int i18 = calendar.get(5);
        int i19 = calendar.get(2);
        return calendar.get(1) + separate + i19 + separate + i18;
    }

    public final java.util.Calendar a(long j17) {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS);
        java.util.Date parse = simpleDateFormat.parse(simpleDateFormat.format(java.lang.Long.valueOf(j17)));
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(parse);
        return calendar;
    }

    public final java.lang.String b(mj4.h info, android.content.Context context) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(context, "context");
        int e17 = c01.id.e() - ((mj4.k) info).f327067b.field_CreateTime;
        if (e17 < 0) {
            e17 = 0;
        }
        int i17 = e17 / 60;
        if (i17 < 1) {
            i17 = 1;
        }
        if (i17 < 60) {
            java.lang.String string = context.getString(com.tencent.mm.R.string.jx7, java.lang.Integer.valueOf(i17));
            kotlin.jvm.internal.o.f(string, "getString(...)");
            return string;
        }
        int i18 = i17 / 60;
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.jx6, java.lang.Integer.valueOf(i18 >= 1 ? i18 : 1));
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        return string2;
    }
}
