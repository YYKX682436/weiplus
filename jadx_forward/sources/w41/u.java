package w41;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final w41.u f524421a = new w41.u();

    public static final void a(w41.u uVar, boolean z17, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var) {
        uVar.getClass();
        android.content.Context context = y1Var.f293560f.getContext();
        if (z17) {
            y1Var.r(false);
        } else {
            db5.e1.E(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g0f), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g0e), false, null);
        }
    }

    public final void b(android.content.Context context, java.lang.String talkUsername) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talkUsername, "talkUsername");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(context);
        y1Var.j(com.p314xaae8f345.mm.R.C30864xbddafb2a.bom);
        android.view.ViewGroup viewGroup = y1Var.B;
        android.widget.ImageView imageView = (android.widget.ImageView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f566861hb1);
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f566863hb3);
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f566865hb5);
        android.widget.Button button = (android.widget.Button) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f566864hb4);
        android.widget.Button button2 = (android.widget.Button) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f566860hb0);
        android.widget.TextView textView3 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f566862hb2);
        k41.h1 h1Var = k41.h1.f385540d;
        k41.g0 c17 = k41.o0.c(talkUsername);
        if (c17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenIMKefuLocReqDialog", "%s maybe is wrong? getContactFromLocal return null", talkUsername);
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.u.a(imageView, c17.f68613xdec927b);
        textView.setText(c17.f68604x21f9b213);
        textView2.setText(t41.g.b(c17.u0()));
        y1Var.s();
        textView3.setOnClickListener(new w41.m(viewGroup));
        button.setOnClickListener(new w41.o(viewGroup, c17, y1Var));
        button2.setOnClickListener(new w41.s(viewGroup, c17, y1Var));
    }
}
