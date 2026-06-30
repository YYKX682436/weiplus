package vw3;

/* loaded from: classes.dex */
public final class t5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerShowMsgXmlUI f522652d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f522653e;

    public t5(com.tencent.mm.plugin.repairer.ui.RepairerShowMsgXmlUI repairerShowMsgXmlUI, java.lang.String str) {
        this.f522652d = repairerShowMsgXmlUI;
        this.f522653e = str;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String str = this.f522653e;
        com.tencent.mm.plugin.repairer.ui.RepairerShowMsgXmlUI repairerShowMsgXmlUI = this.f522652d;
        if (i17 != 0) {
            if (i17 != 1) {
                return;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(str);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = repairerShowMsgXmlUI.mo55332x76847179();
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(mo55332x76847179);
            e4Var.f293309c = repairerShowMsgXmlUI.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571894st);
            e4Var.c();
            return;
        }
        android.content.Intent intent = repairerShowMsgXmlUI.getIntent();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String format = java.lang.String.format("msg_info_%s.txt", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(intent.getLongExtra("Chat_Msg_Id", java.lang.System.currentTimeMillis()))}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        xs.i1 i1Var = (xs.i1) i95.n0.c(xs.i1.class);
        byte[] bytes = str.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        ((zc0.h) i1Var).aj(format, bytes, true);
    }
}
