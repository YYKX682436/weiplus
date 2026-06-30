package com.tencent.mm.console;

/* loaded from: classes11.dex */
public class p3 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        java.lang.String format = new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i17 = calendar.get(11);
        calendar.add(10, 1);
        int i18 = calendar.get(11);
        java.lang.String format2 = java.lang.String.format("%02d:00", java.lang.Integer.valueOf(i17));
        java.lang.String format3 = java.lang.String.format("%02d:00", java.lang.Integer.valueOf(i18));
        com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "exec() called UPLOAD_RECENT_XLOG date:%s beginHour:%s endHour:%s", format, format2, format3);
        k14.n.a().c(new com.tencent.mm.console.p3$$a(), format, format2, format3, "", "");
    }
}
