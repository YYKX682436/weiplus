package v61;

/* loaded from: classes13.dex */
public class s0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {
    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        int i17 = v61.u0.f515012a + 1;
        v61.u0.f515012a = i17;
        if (i17 == 1 || i17 == 16 || i17 % 96 == 0) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            ((android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getRunningTasks(1).get(0).topActivity.getClassName();
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11457x794a57af.class.getName().equals(r3.getClassName())) {
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11457x794a57af.class);
                intent.addFlags(2);
                intent.addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
                intent.addFlags(67108864);
                android.app.PendingIntent activity = android.app.PendingIntent.getActivity(context, 36, intent, fp.g0.a(1073741824));
                z2.k0 k0Var = new z2.k0(context, "reminder_channel_id");
                k0Var.f(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572064xr));
                android.app.Notification notification = k0Var.D;
                notification.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.c7v;
                notification.when = java.lang.System.currentTimeMillis();
                k0Var.f550996g = activity;
                z2.i0 i0Var = new z2.i0(k0Var);
                i0Var.f550983b = z2.k0.c(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gv8));
                z2.k0 k0Var2 = i0Var.f551053a;
                android.app.Notification b17 = k0Var2 != null ? k0Var2.b() : null;
                b17.defaults |= 1;
                b17.flags = 16 | b17.flags;
                ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).n(36, b17, false);
            }
        }
        return true;
    }
}
