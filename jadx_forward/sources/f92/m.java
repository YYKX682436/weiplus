package f92;

/* loaded from: classes10.dex */
public final class m implements pf5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f92.t f341793a;

    public m(f92.t tVar) {
        this.f341793a = tVar;
    }

    @Override // pf5.a
    /* renamed from: onActivityPostCreated */
    public void mo129202xd264673a(android.app.Activity activity, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // pf5.a
    /* renamed from: onActivityPostDestroyed */
    public void mo129203x1da8b1eb(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if ((activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) || (activity instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b)) {
            java.lang.String str = (java.lang.String) this.f341793a.f341814n.remove(java.lang.Integer.valueOf(activity.hashCode()));
            if (str == null) {
                str = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AccountManager", "onActivityPostDestroyed, activity=" + activity + ", selfFinderUsername=" + str);
        }
    }

    @Override // pf5.a
    /* renamed from: onActivityPreCreated */
    public void mo129204xc08eef73(android.app.Activity activity, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if ((activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) || (activity instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b)) {
            java.lang.String stringExtra = activity.getIntent().getStringExtra("KEY_FINDER_USERNAME_SELF");
            if (stringExtra == null) {
                stringExtra = "";
            }
            boolean booleanExtra = activity.getIntent().getBooleanExtra("KEY_CAN_USE_SELF_CLUB_USERNAME", false);
            int i17 = 1;
            if (!(stringExtra.length() > 0)) {
                if (booleanExtra) {
                    stringExtra = ((f92.t) pf5.u.f435469a.e(m40.g0.class).a(f92.t.class)).N6();
                    i17 = 2;
                } else {
                    stringExtra = g92.b.f351302e.T0();
                    i17 = 3;
                }
            }
            pf5.z zVar = pf5.z.f435481a;
            if (!(activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).c(zy2.ra.class));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stringExtra, "<set-?>");
            nyVar.F = stringExtra;
            this.f341793a.f341814n.put(java.lang.Integer.valueOf(activity.hashCode()), stringExtra);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AccountManager", "onActivityPreCreated, case=" + i17 + ", activity=" + activity + ", selfFinderUsername=" + stringExtra);
        }
    }

    @Override // pf5.a
    /* renamed from: onActivityPreDestroyed */
    public void mo129205x2b520fe4(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }
}
