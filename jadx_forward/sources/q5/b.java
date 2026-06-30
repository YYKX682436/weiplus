package q5;

/* loaded from: classes13.dex */
public final class b implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f441667d = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: e, reason: collision with root package name */
    public static volatile q5.b f441668e;

    public static q5.b a() {
        if (f441668e == null) {
            synchronized (q5.b.class) {
                if (f441668e == null) {
                    f441668e = new q5.b();
                }
            }
        }
        return f441668e;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        java.util.Iterator it = f441667d.iterator();
        while (it.hasNext()) {
            try {
                ((q5.a) it.next()).getClass();
                java.util.Objects.toString(activity);
                mk.a aVar = xy5.b.f539695a;
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        java.util.Iterator it = f441667d.iterator();
        while (it.hasNext()) {
            try {
                a.a aVar = (a.a) ((q5.a) it.next());
                aVar.f81575b.f81578b.e(activity);
                aVar.f81575b.f81579c.remove(java.lang.Integer.valueOf(activity.hashCode()));
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        java.util.Iterator it = f441667d.iterator();
        while (it.hasNext()) {
            try {
                ((q5.a) it.next()).getClass();
                java.util.Objects.toString(activity);
                mk.a aVar = xy5.b.f539695a;
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostCreated(android.app.Activity activity, android.os.Bundle bundle) {
        java.util.Iterator it = f441667d.iterator();
        while (it.hasNext()) {
            try {
                ((q5.a) it.next()).getClass();
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostDestroyed(android.app.Activity activity) {
        java.util.Iterator it = f441667d.iterator();
        while (it.hasNext()) {
            try {
                ((q5.a) it.next()).getClass();
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostPaused(android.app.Activity activity) {
        java.util.Iterator it = f441667d.iterator();
        while (it.hasNext()) {
            try {
                ((q5.a) it.next()).getClass();
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(android.app.Activity activity) {
        java.util.Iterator it = f441667d.iterator();
        while (it.hasNext()) {
            try {
                ((q5.a) it.next()).getClass();
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostSaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        java.util.Iterator it = f441667d.iterator();
        while (it.hasNext()) {
            try {
                ((q5.a) it.next()).getClass();
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(android.app.Activity activity) {
        java.util.Iterator it = f441667d.iterator();
        while (it.hasNext()) {
            try {
                ((q5.a) it.next()).getClass();
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStopped(android.app.Activity activity) {
        java.util.Iterator it = f441667d.iterator();
        while (it.hasNext()) {
            try {
                ((q5.a) it.next()).getClass();
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(android.app.Activity activity, android.os.Bundle bundle) {
        java.util.Iterator it = f441667d.iterator();
        while (it.hasNext()) {
            try {
                ((q5.a) it.next()).getClass();
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreDestroyed(android.app.Activity activity) {
        java.util.Iterator it = f441667d.iterator();
        while (it.hasNext()) {
            try {
                ((q5.a) it.next()).getClass();
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPrePaused(android.app.Activity activity) {
        java.util.Iterator it = f441667d.iterator();
        while (it.hasNext()) {
            try {
                ((q5.a) it.next()).getClass();
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreResumed(android.app.Activity activity) {
        java.util.Iterator it = f441667d.iterator();
        while (it.hasNext()) {
            try {
                ((q5.a) it.next()).getClass();
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreSaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        java.util.Iterator it = f441667d.iterator();
        while (it.hasNext()) {
            try {
                ((q5.a) it.next()).getClass();
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStarted(android.app.Activity activity) {
        java.util.Iterator it = f441667d.iterator();
        while (it.hasNext()) {
            try {
                ((q5.a) it.next()).getClass();
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStopped(android.app.Activity activity) {
        java.util.Iterator it = f441667d.iterator();
        while (it.hasNext()) {
            try {
                ((q5.a) it.next()).getClass();
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        java.util.Iterator it = f441667d.iterator();
        while (it.hasNext()) {
            try {
                ((q5.a) it.next()).a(activity);
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        java.util.Iterator it = f441667d.iterator();
        while (it.hasNext()) {
            try {
                ((q5.a) it.next()).getClass();
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        java.util.Iterator it = f441667d.iterator();
        while (it.hasNext()) {
            try {
                ((q5.a) it.next()).getClass();
                java.util.Objects.toString(activity);
                mk.a aVar = xy5.b.f539695a;
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(final android.app.Activity activity) {
        java.util.Iterator it = f441667d.iterator();
        while (it.hasNext()) {
            try {
                a.a aVar = (a.a) ((q5.a) it.next());
                aVar.getClass();
                a.b bVar = aVar.f81575b;
                final ry5.c f17 = ry5.c.f();
                if (activity == null) {
                    f17.getClass();
                } else {
                    f17.f483238c.post(new java.lang.Runnable() { // from class: ry5.c$$h
                        @Override // java.lang.Runnable
                        public final void run() {
                            ry5.c cVar = ry5.c.this;
                            cVar.getClass();
                            android.app.Activity activity2 = activity;
                            java.lang.String simpleName = activity2.getClass().getSimpleName();
                            java.lang.String b17 = a.b.c().b();
                            java.lang.Long l17 = (java.lang.Long) a.b.c().f81579c.get(java.lang.Integer.valueOf(activity2.hashCode()));
                            long longValue = l17 != null ? l17.longValue() : java.lang.System.currentTimeMillis();
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            sb6.append(ry5.d.a());
                            sb6.append(";");
                            sb6.append(ry5.d.j());
                            sb6.append(";2;");
                            ((my1.c) a.b.c().f81582f).getClass();
                            sb6.append(o45.wf.f424562g);
                            java.lang.String sb7 = sb6.toString();
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            try {
                                jSONObject.put("action", 8);
                                jSONObject.put("uin", b17);
                                jSONObject.put("startTime", longValue);
                                jSONObject.put("pageName", simpleName);
                                jSONObject.put("clientInfo", sb7);
                                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "");
                            } catch (org.json.JSONException unused) {
                            }
                            cVar.f483237b.c(jSONObject.toString());
                        }
                    });
                }
                bVar.f81578b.e(activity);
                bVar.f81579c.remove(java.lang.Integer.valueOf(activity.hashCode()));
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }
}
