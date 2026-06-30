package xf2;

/* loaded from: classes8.dex */
public final class j implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f535814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f535815e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1491x36113a39.p1492x373aa5.AbstractC14206xe2e594d5 f535816f;

    public j(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1491x36113a39.p1492x373aa5.AbstractC14206xe2e594d5 abstractC14206xe2e594d5) {
        this.f535814d = k0Var;
        this.f535815e = str;
        this.f535816f = abstractC14206xe2e594d5;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1491x36113a39.p1492x373aa5.AbstractC14206xe2e594d5 abstractC14206xe2e594d5 = this.f535816f;
        java.lang.String str = this.f535815e;
        if (valueOf != null && valueOf.intValue() == 0) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1491x36113a39.p1492x373aa5.AbstractC14206xe2e594d5.f193150i;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_File_Name", str);
            intent.putExtra("Retr_Compress_Type", 0);
            intent.putExtra("Retr_Msg_Type", 0);
            android.content.Context context = abstractC14206xe2e594d5.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
            j45.l.x((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context, ".ui.transmit.MsgRetransmitUI", intent, 1014, xf2.m.f535823d);
        } else if (valueOf != null && valueOf.intValue() == 1) {
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1491x36113a39.p1492x373aa5.AbstractC14206xe2e594d5.f193150i;
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Ksnsupload_type", 0);
            intent2.putExtra("sns_kemdia_path", str);
            android.content.Context context2 = abstractC14206xe2e594d5.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            j45.l.w((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2, ".plugin.sns.ui.SnsUploadUI", intent2, 1017, xf2.n.f535824d);
        }
        this.f535814d.u();
    }
}
