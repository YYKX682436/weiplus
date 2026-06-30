package j7;

/* loaded from: classes13.dex */
public class q implements android.os.Handler.Callback {

    /* renamed from: i, reason: collision with root package name */
    public static final j7.p f379551i = new j7.o();

    /* renamed from: d, reason: collision with root package name */
    public volatile com.p147xb1cd08cc.p148x5de23a5.r f379552d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f379553e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f379554f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final android.os.Handler f379555g;

    /* renamed from: h, reason: collision with root package name */
    public final j7.p f379556h;

    public q(j7.p pVar) {
        new android.os.Bundle();
        this.f379556h = pVar == null ? f379551i : pVar;
        this.f379555g = new android.os.Handler(android.os.Looper.getMainLooper(), this);
    }

    public static android.app.Activity a(android.content.Context context) {
        if (context instanceof android.app.Activity) {
            return (android.app.Activity) context;
        }
        if (context instanceof android.content.ContextWrapper) {
            return a(((android.content.ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static boolean e(android.content.Context context) {
        android.app.Activity a17 = a(context);
        return a17 == null || !a17.isFinishing();
    }

    public com.p147xb1cd08cc.p148x5de23a5.r b(android.content.Context context) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = q7.p.f441843a;
        if ((android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) && !(context instanceof android.app.Application)) {
            if (context instanceof p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) {
                p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f = (p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) context;
                if (!(android.os.Looper.myLooper() == android.os.Looper.getMainLooper())) {
                    return b(activityC1102x9ee2d9f.getApplicationContext());
                }
                if (activityC1102x9ee2d9f.isDestroyed()) {
                    throw new java.lang.IllegalArgumentException("You cannot start a load for a destroyed activity");
                }
                com.p147xb1cd08cc.p148x5de23a5.p150x31c90fad.C1428xbf23151d d17 = d(activityC1102x9ee2d9f.mo7595x9cdc264(), null, e(activityC1102x9ee2d9f));
                com.p147xb1cd08cc.p148x5de23a5.r rVar = d17.f125506h;
                if (rVar != null) {
                    return rVar;
                }
                com.p147xb1cd08cc.p148x5de23a5.c b17 = com.p147xb1cd08cc.p148x5de23a5.c.b(activityC1102x9ee2d9f);
                j7.r rVar2 = d17.f125503e;
                ((j7.o) this.f379556h).getClass();
                com.p147xb1cd08cc.p148x5de23a5.r rVar3 = new com.p147xb1cd08cc.p148x5de23a5.r(b17, d17.f125502d, rVar2, activityC1102x9ee2d9f);
                d17.f125506h = rVar3;
                return rVar3;
            }
            if (context instanceof android.app.Activity) {
                android.app.Activity activity = (android.app.Activity) context;
                if (!(android.os.Looper.myLooper() == android.os.Looper.getMainLooper())) {
                    return b(activity.getApplicationContext());
                }
                if (activity.isDestroyed()) {
                    throw new java.lang.IllegalArgumentException("You cannot start a load for a destroyed activity");
                }
                j7.n c17 = c(activity.getFragmentManager(), null, e(activity));
                com.p147xb1cd08cc.p148x5de23a5.r rVar4 = c17.f379548g;
                if (rVar4 != null) {
                    return rVar4;
                }
                com.p147xb1cd08cc.p148x5de23a5.c b18 = com.p147xb1cd08cc.p148x5de23a5.c.b(activity);
                j7.r rVar5 = c17.f379546e;
                ((j7.o) this.f379556h).getClass();
                com.p147xb1cd08cc.p148x5de23a5.r rVar6 = new com.p147xb1cd08cc.p148x5de23a5.r(b18, c17.f379545d, rVar5, activity);
                c17.f379548g = rVar6;
                return rVar6;
            }
            if (context instanceof android.content.ContextWrapper) {
                android.content.ContextWrapper contextWrapper = (android.content.ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return b(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f379552d == null) {
            synchronized (this) {
                if (this.f379552d == null) {
                    com.p147xb1cd08cc.p148x5de23a5.c b19 = com.p147xb1cd08cc.p148x5de23a5.c.b(context.getApplicationContext());
                    j7.p pVar = this.f379556h;
                    j7.b bVar = new j7.b();
                    j7.i iVar = new j7.i();
                    android.content.Context applicationContext = context.getApplicationContext();
                    ((j7.o) pVar).getClass();
                    this.f379552d = new com.p147xb1cd08cc.p148x5de23a5.r(b19, bVar, iVar, applicationContext);
                }
            }
        }
        return this.f379552d;
    }

    public final j7.n c(android.app.FragmentManager fragmentManager, android.app.Fragment fragment, boolean z17) {
        j7.n nVar = (j7.n) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (nVar != null) {
            return nVar;
        }
        java.util.Map map = this.f379553e;
        j7.n nVar2 = (j7.n) ((java.util.HashMap) map).get(fragmentManager);
        if (nVar2 == null) {
            nVar2 = new j7.n();
            nVar2.f379550i = fragment;
            if (fragment != null && fragment.getActivity() != null) {
                nVar2.a(fragment.getActivity());
            }
            if (z17) {
                nVar2.f379545d.d();
            }
            ((java.util.HashMap) map).put(fragmentManager, nVar2);
            fragmentManager.beginTransaction().add(nVar2, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f379555g.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return nVar2;
    }

    public final com.p147xb1cd08cc.p148x5de23a5.p150x31c90fad.C1428xbf23151d d(p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, boolean z17) {
        com.p147xb1cd08cc.p148x5de23a5.p150x31c90fad.C1428xbf23151d c1428xbf23151d = (com.p147xb1cd08cc.p148x5de23a5.p150x31c90fad.C1428xbf23151d) abstractC1104xc1ad431d.m7665x7a44761a("com.bumptech.glide.manager");
        if (c1428xbf23151d != null) {
            return c1428xbf23151d;
        }
        java.util.HashMap hashMap = (java.util.HashMap) this.f379554f;
        com.p147xb1cd08cc.p148x5de23a5.p150x31c90fad.C1428xbf23151d c1428xbf23151d2 = (com.p147xb1cd08cc.p148x5de23a5.p150x31c90fad.C1428xbf23151d) hashMap.get(abstractC1104xc1ad431d);
        if (c1428xbf23151d2 == null) {
            c1428xbf23151d2 = new com.p147xb1cd08cc.p148x5de23a5.p150x31c90fad.C1428xbf23151d();
            c1428xbf23151d2.f125507i = componentCallbacksC1101xa17d4670;
            if (componentCallbacksC1101xa17d4670 != null && componentCallbacksC1101xa17d4670.mo7438x76847179() != null) {
                p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46702 = componentCallbacksC1101xa17d4670;
                while (componentCallbacksC1101xa17d46702.m7453x12a9d210() != null) {
                    componentCallbacksC1101xa17d46702 = componentCallbacksC1101xa17d46702.m7453x12a9d210();
                }
                p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d m7446xe17c5d07 = componentCallbacksC1101xa17d46702.m7446xe17c5d07();
                if (m7446xe17c5d07 != null) {
                    c1428xbf23151d2.j0(componentCallbacksC1101xa17d4670.mo7438x76847179(), m7446xe17c5d07);
                }
            }
            if (z17) {
                c1428xbf23151d2.f125502d.d();
            }
            hashMap.put(abstractC1104xc1ad431d, c1428xbf23151d2);
            p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = abstractC1104xc1ad431d.m7630xb2c12e75();
            m7630xb2c12e75.h(0, c1428xbf23151d2, "com.bumptech.glide.manager", 1);
            m7630xb2c12e75.e();
            this.f379555g.obtainMessage(2, abstractC1104xc1ad431d).sendToTarget();
        }
        return c1428xbf23151d2;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        java.lang.Object obj;
        java.lang.Object remove;
        java.lang.Object obj2;
        java.lang.Object obj3;
        int i17 = message.what;
        boolean z17 = true;
        if (i17 == 1) {
            obj = (android.app.FragmentManager) message.obj;
            remove = ((java.util.HashMap) this.f379553e).remove(obj);
        } else {
            if (i17 != 2) {
                obj3 = null;
                z17 = false;
                obj2 = null;
                if (z17 && obj3 == null && android.util.Log.isLoggable("RMRetriever", 5)) {
                    java.util.Objects.toString(obj2);
                }
                return z17;
            }
            obj = (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d) message.obj;
            remove = ((java.util.HashMap) this.f379554f).remove(obj);
        }
        java.lang.Object obj4 = remove;
        obj2 = obj;
        obj3 = obj4;
        if (z17) {
            java.util.Objects.toString(obj2);
        }
        return z17;
    }
}
