package sc2;

/* loaded from: classes2.dex */
public final class u2 {
    public u2(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(in5.s0 holder, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(sc2.a8.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        sc2.a8 a8Var = (sc2.a8) a17;
        am.ia iaVar = event.f135785g;
        int i17 = iaVar.f88452b;
        if (i17 == 8 && iaVar.f88458h == 2) {
            a8Var.T6(holder, sc2.r2.f487721d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeedJumperAccountAroundObserver", "updateLivingStatus gone");
        } else if (i17 == 38) {
            a8Var.T6(holder, new sc2.t2(holder));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeedJumperAccountAroundObserver", "onFollowBtnShow");
        }
    }
}
