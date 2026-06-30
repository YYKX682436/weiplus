package ad5;

/* loaded from: classes10.dex */
public final class j0 extends ad5.l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ad5.j0 f84806a = new ad5.j0();

    public j0() {
        super(null);
    }

    public static final void e(ad5.j0 j0Var, android.content.Context context, java.util.List msgInfoList, boolean z17, boolean z18) {
        j0Var.getClass();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        int i17 = z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.pbp : com.p314xaae8f345.mm.R.C30867xcad56011.pbo;
        int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
        e4Var.f293309c = context.getString(i17);
        e4Var.f293315i = new ad5.z(c0Var, h0Var);
        e4Var.c();
        ad5.c0 c0Var2 = new ad5.c0(activity, c0Var, h0Var, z17, context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfoList, "msgInfoList");
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a == null || v65.i.b(c20976x6ba6452a, null, new zc5.l(msgInfoList, z18, z17, context, c0Var2, null), 1, null) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryMediaHelper", "executeDownloadAndSave: accountScope is null, skip");
            c0Var2.mo146xb9724478(java.lang.Boolean.FALSE);
        }
    }

    @Override // ad5.l0
    public int a() {
        return com.p314xaae8f345.mm.R.C30867xcad56011.pcj;
    }

    @Override // ad5.l0
    public int b() {
        return com.p314xaae8f345.mm.R.raw.f78993x9ccb8f9;
    }

    @Override // ad5.l0
    public int c() {
        return com.p314xaae8f345.mm.R.raw.f79003xa37f86e5;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0127  */
    @Override // ad5.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(android.content.Context r23, ad5.t0 r24) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ad5.j0.d(android.content.Context, ad5.t0):void");
    }

    /* renamed from: equals */
    public boolean m1112xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad5.j0)) {
            return false;
        }
        return true;
    }

    /* renamed from: hashCode */
    public int m1113x8cdac1b() {
        return -498024536;
    }

    /* renamed from: toString */
    public java.lang.String m1114x9616526c() {
        return "SaveMedia";
    }
}
