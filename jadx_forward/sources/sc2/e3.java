package sc2;

/* loaded from: classes2.dex */
public final class e3 {
    public e3(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static final int a(sc2.e3 e3Var, android.content.Context context) {
        int b17 = e3Var.b(context);
        int i17 = sc2.m3.B[b17];
        if (i17 == -1) {
            i17 = com.p314xaae8f345.mm.ui.bl.c(context);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedJumperBubbleObserver", "[getNavigationBarHeight] index:" + b17 + " navigationBarHeight:" + i17 + ", translationY");
        return i17;
    }

    public final int b(android.content.Context context) {
        if (com.p314xaae8f345.mm.ui.bk.Q() && c(context)) {
            return 2;
        }
        return (!com.p314xaae8f345.mm.ui.bk.Q() || c(context)) ? 0 : 1;
    }

    public final boolean c(android.content.Context context) {
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity == null) {
            return false;
        }
        return com.p314xaae8f345.mm.ui.bk.N(activity.getTaskId()) || (com.p314xaae8f345.mm.ui.bk.O(activity.getContentResolver()) && !activity.isInMultiWindowMode());
    }

    public final void d(in5.s0 holder, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(sc2.a8.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        ((sc2.a8) a17).T6(holder, new sc2.d3(holder, source));
    }
}
