package uo1;

/* loaded from: classes5.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final uo1.w f511130a = new uo1.w();

    public final void a(android.app.Activity activity, int i17, java.lang.String str, long j17, boolean z17, yz5.l dismissCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dismissCallback, "dismissCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        f0Var.f391649d = i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.g0();
        g0Var.f391654d = j17 >= 0 ? eo1.a.f337078a.a(j17) : 0L;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(activity);
        android.view.View inflate = android.view.LayoutInflater.from(activity).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dpy, (android.view.ViewGroup) null);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.rci);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.rcj);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.rck);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) inflate.findViewById(com.p314xaae8f345.mm.R.id.rch);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc82 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) inflate.findViewById(com.p314xaae8f345.mm.R.id.rcl);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc83 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) inflate.findViewById(com.p314xaae8f345.mm.R.id.rcm);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.rcn);
        y1Var.f293570s = new uo1.a(i17, f0Var, g0Var, dismissCallback);
        imageView.setOnClickListener(new uo1.b(y1Var));
        textView.setText(str == null || str.length() == 0 ? activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574396my0) : activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574397my1, str));
        uo1.i iVar = new uo1.i(f0Var, linearLayout, viewOnClickListenerC22631x1cc07cc8, g0Var, textView2, activity, viewOnClickListenerC22631x1cc07cc82, viewOnClickListenerC22631x1cc07cc83);
        iVar.mo152xb9724478();
        viewOnClickListenerC22631x1cc07cc8.m81396xb3e0a10a(new uo1.f(z17, y1Var, f0Var, g0Var, j17, iVar));
        viewOnClickListenerC22631x1cc07cc82.m81396xb3e0a10a(new uo1.g(f0Var));
        viewOnClickListenerC22631x1cc07cc83.m81396xb3e0a10a(new uo1.h(f0Var));
        y1Var.k(inflate);
        y1Var.s();
    }
}
