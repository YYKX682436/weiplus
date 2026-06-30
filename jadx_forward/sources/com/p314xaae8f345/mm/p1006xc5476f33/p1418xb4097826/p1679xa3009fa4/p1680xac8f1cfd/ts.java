package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class ts extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt f217590g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f217591h;

    public ts(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt ptVar, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        this.f217590g = ptVar;
        this.f217591h = activityC0065xcd7aa112;
    }

    @Override // fc2.d
    public boolean E0() {
        return false;
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if ((event instanceof fc2.t) && ((i17 = ((fc2.t) event).f342518d) == 0 || i17 == 4 || i17 == 5 || i17 == 1 || i17 == 7)) {
            return true;
        }
        return (event instanceof ec2.f) && ((ec2.f) event).f332492d == 17;
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt ptVar = this.f217590g;
        if (ptVar.m80379x76847179().getResources().getConfiguration().orientation == 2 || (ev6 instanceof ec2.f) || !(ev6 instanceof fc2.t)) {
            return;
        }
        boolean z17 = ptVar.f217153u;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f217591h;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderVideoOrientationUIC", "onEventHappen: error, need to set orientation into android:configChanges in AndroidManifest.xml, activity = " + activityC0065xcd7aa112);
            return;
        }
        int i17 = ((fc2.t) ev6).f342518d;
        ptVar.f217155w = i17 == 0;
        if (i17 == 1) {
            if (!ptVar.f217152t) {
                ptVar.m80379x76847179().setRequestedOrientation(1);
            }
            ptVar.f217148p = null;
            ptVar.f217152t = true;
            return;
        }
        ptVar.f217152t = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoOrientationUIC", "onEventHappen: ev = " + ev6 + ", isLandScapeVideo = " + ptVar.R6("ScrollEvent") + ", activity = " + activityC0065xcd7aa112.getClass().getSimpleName());
    }
}
