package a40;

@j95.b
/* loaded from: classes4.dex */
public final class i extends i95.w implements o72.u3 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Set f82708d = kz5.z.D0(new java.lang.String[]{"ملاحظة", "Notiz", "Note", "Nota", "Catatan", "メモ", "참고", "Внимание", "แจ้งเตือน", "Not", "Ghi chú", "笔记", "筆記"});

    public boolean Ai(java.lang.String title) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        return f82708d.contains(title);
    }

    public java.lang.String wi(java.lang.String originTitle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originTitle, "originTitle");
        if (!(originTitle.length() == 0)) {
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575412ph1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            if (!r26.i0.y(originTitle, string, false) && !f82708d.contains(originTitle)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575412ph1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                sb6.append(string2);
                sb6.append(" : ");
                sb6.append(originTitle);
                return sb6.toString();
            }
        }
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(java.lang.System.currentTimeMillis());
        java.lang.String string3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575411ph0, java.lang.Integer.valueOf(calendar.get(1)), java.lang.Integer.valueOf(calendar.get(2) + 1), java.lang.Integer.valueOf(calendar.get(5)));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        return string3;
    }
}
