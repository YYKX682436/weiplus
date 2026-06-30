package dz4;

/* loaded from: classes5.dex */
public final class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.o1 f326882d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f326883e;

    public m1(dz4.o1 o1Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f326882d = o1Var;
        this.f326883e = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dz4.o1 o1Var = this.f326882d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = o1Var.f326895c;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        o1Var.f326895c = null;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f326883e;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) h0Var.f391656d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "onMediaFileExportSaved: path null");
            dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h_w), 1).show();
        } else {
            q75.c.f((java.lang.String) h0Var.f391656d, context);
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573837g00, q75.c.e());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            dp.a.m125854x26a183b(context, string, 1).show();
        }
    }
}
