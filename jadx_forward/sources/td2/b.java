package td2;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: d, reason: collision with root package name */
    public td2.a f499159d;

    /* renamed from: e, reason: collision with root package name */
    public final td2.a[] f499160e;

    /* renamed from: f, reason: collision with root package name */
    public td2.c f499161f;

    public b() {
        td2.a aVar = td2.a.f499157m;
        this.f499159d = aVar;
        this.f499160e = new td2.a[]{td2.a.f499151d, td2.a.f499152e, td2.a.f499153f, aVar};
    }

    public final void D0(final com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activity, final td2.c cVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.EventObserver", "life " + activity + ' ' + this);
        td2.c cVar2 = new td2.c() { // from class: com.tencent.mm.plugin.finder.life.SupportLifecycle$life$1
            @Override // td2.c
            /* renamed from: onCreate */
            public void mo55613x3e5a77bb(p012xc85e97e9.p093xedfae76a.y var1) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
                td2.b.this.f499159d = td2.a.f499151d;
                td2.c cVar3 = cVar;
                if (cVar3 != null) {
                    cVar3.mo55613x3e5a77bb(var1);
                }
            }

            @Override // td2.c
            /* renamed from: onDestroy */
            public void mo55614xac79a11b(p012xc85e97e9.p093xedfae76a.y var1) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
                td2.a aVar = td2.a.f499156i;
                td2.b bVar = td2.b.this;
                bVar.f499159d = aVar;
                td2.c cVar3 = cVar;
                if (cVar3 != null) {
                    cVar3.mo55614xac79a11b(var1);
                }
                td2.c cVar4 = bVar.f499161f;
                if (cVar4 != null) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("auto life remove ");
                    com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = activity;
                    sb6.append(activityC21401x6ce6f73f);
                    sb6.append(" this");
                    sb6.append(bVar);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.EventObserver", sb6.toString());
                    activityC21401x6ce6f73f.mo273xed6858b4().c(cVar4);
                    bVar.f499161f = null;
                }
            }

            @Override // td2.c
            /* renamed from: onPause */
            public void mo55615xb01dfb57(p012xc85e97e9.p093xedfae76a.y var1) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
                td2.a aVar = td2.a.f499154g;
                td2.b bVar = td2.b.this;
                bVar.f499159d = aVar;
                td2.c cVar3 = cVar;
                if (cVar3 != null) {
                    cVar3.mo55615xb01dfb57(var1);
                }
                java.util.Objects.toString(activity);
                java.util.Objects.toString(bVar);
            }

            @Override // td2.c
            /* renamed from: onResume */
            public void mo55616x57429eec(p012xc85e97e9.p093xedfae76a.y var1) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
                td2.a aVar = td2.a.f499153f;
                td2.b bVar = td2.b.this;
                bVar.f499159d = aVar;
                td2.c cVar3 = cVar;
                if (cVar3 != null) {
                    cVar3.mo55616x57429eec(var1);
                }
                java.util.Objects.toString(activity);
                java.util.Objects.toString(bVar);
            }

            @Override // td2.c
            /* renamed from: onStart */
            public void mo55617xb05099c3(p012xc85e97e9.p093xedfae76a.y var1) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
                td2.b.this.f499159d = td2.a.f499152e;
                td2.c cVar3 = cVar;
                if (cVar3 != null) {
                    cVar3.mo55617xb05099c3(var1);
                }
            }

            @Override // td2.c
            /* renamed from: onStop */
            public void mo55618xc39f8281(p012xc85e97e9.p093xedfae76a.y var1) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
                td2.b.this.f499159d = td2.a.f499155h;
                td2.c cVar3 = cVar;
                if (cVar3 != null) {
                    cVar3.mo55618xc39f8281(var1);
                }
            }
        };
        this.f499161f = cVar2;
        activity.mo273xed6858b4().a(cVar2);
    }
}
