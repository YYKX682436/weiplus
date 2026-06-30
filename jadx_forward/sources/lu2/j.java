package lu2;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final lu2.j f402909a = new lu2.j();

    public static /* synthetic */ void b(lu2.j jVar, android.content.Context context, java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            str2 = "";
        }
        jVar.a(context, str, str2);
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 c(lu2.j jVar, android.content.Context context, java.util.List dataList, java.lang.String str, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnClickListener onClickListener2, android.content.DialogInterface.OnClickListener onClickListener3, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            str = "Stream信息";
        }
        java.lang.String title = str;
        if ((i17 & 8) != 0) {
            onClickListener = null;
        }
        if ((i17 & 16) != 0) {
            onClickListener2 = null;
        }
        if ((i17 & 32) != 0) {
            onClickListener3 = null;
        }
        jVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4(context, null);
        c1163xf1deaba4.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context, 1, false));
        lu2.b bVar = new lu2.b(dataList, onClickListener3);
        c1163xf1deaba4.mo7960x6cab2c8d(bVar);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            mo7946xf939df19.m8146xced61ae5();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 r17 = db5.e1.r(context, title, c1163xf1deaba4, "Close", "Cancel", onClickListener == null ? lu2.h.f402907d : onClickListener, onClickListener2 == null ? lu2.i.f402908d : onClickListener2);
        bVar.f402898f = r17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r17);
        return r17;
    }

    public final void a(android.content.Context context, java.lang.String txt, java.lang.String extraCopyMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(txt, "txt");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraCopyMsg, "extraCopyMsg");
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setText(txt);
        textView.setGravity(3);
        textView.setTextSize(1, 13.0f);
        textView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5));
        textView.setTypeface(android.graphics.Typeface.MONOSPACE);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.j_);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        textView.setMovementMethod(android.text.method.ScrollingMovementMethod.getInstance());
        lu2.e eVar = new lu2.e(txt, extraCopyMsg, context);
        lu2.d dVar = lu2.d.f402900d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DebugDialog", "dialog msg ".concat(txt));
        db5.e1.r(context, "视频号测试", textView, "copy", "cancel", eVar, dVar);
    }
}
