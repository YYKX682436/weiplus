package bb2;

/* loaded from: classes2.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final bb2.p0 f100473a = new bb2.p0();

    /* renamed from: b, reason: collision with root package name */
    public static int f100474b;

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        f100474b = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209148b5).mo141623x754a37bb()).r()).intValue();
    }

    public final bb2.a1 a(android.view.View itemView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        if (f100474b == 1) {
            android.view.KeyEvent.Callback findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.lta);
            if (findViewById instanceof bb2.a1) {
                return (bb2.a1) findViewById;
            }
            return null;
        }
        android.view.KeyEvent.Callback findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.edr);
        if (findViewById2 instanceof bb2.a1) {
            return (bb2.a1) findViewById2;
        }
        return null;
    }

    public final void b(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, boolean z17, zy2.gc gcVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        if (!z17) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            hb2.b0.f361558e.n(feed.mo2128x1ed62e84(), feed.getFeedObject().m59276x6c285d75(), z17, gcVar);
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activity, 1, true);
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(activity).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570326ag3, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568867ob5)).setText(activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cnv));
        k0Var.s(inflate, false);
        k0Var.f293405n = new bb2.n0(activity);
        k0Var.f293414s = new bb2.o0(feed, z17, gcVar);
        k0Var.v();
    }
}
