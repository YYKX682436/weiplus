package p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296;

/* loaded from: classes15.dex */
public class f0 {

    /* renamed from: c, reason: collision with root package name */
    public static int f90505c;

    /* renamed from: a, reason: collision with root package name */
    public final p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.w f90506a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f90507b = new java.util.ArrayList();

    public f0(android.content.Context context, java.lang.String str) {
        android.content.ComponentName componentName;
        android.app.PendingIntent pendingIntent;
        if (context == null) {
            throw new java.lang.IllegalArgumentException("context must not be null");
        }
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("tag must not be null or empty");
        }
        int i17 = p012xc85e97e9.p096x62f6fe4.p097x76508296.C1135x23358825.f93241a;
        android.content.Intent intent = new android.content.Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        java.util.List<android.content.pm.ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers.size() == 1) {
            android.content.pm.ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
            componentName = new android.content.ComponentName(activityInfo.packageName, activityInfo.name);
        } else {
            queryBroadcastReceivers.size();
            componentName = null;
        }
        if (componentName != null) {
            android.content.Intent intent2 = new android.content.Intent("android.intent.action.MEDIA_BUTTON");
            intent2.setComponent(componentName);
            pendingIntent = android.app.PendingIntent.getBroadcast(context, 0, intent2, android.os.Build.VERSION.SDK_INT >= 31 ? com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432 : 0);
        } else {
            pendingIntent = null;
        }
        int i18 = android.os.Build.VERSION.SDK_INT;
        if (i18 >= 29) {
            this.f90506a = new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.b0(context, str, null, null);
        } else if (i18 >= 28) {
            this.f90506a = new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.a0(context, str, null, null);
        } else {
            this.f90506a = new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.z(context, str, null, null);
        }
        f(new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.s(this), new android.os.Handler(android.os.Looper.myLooper() != null ? android.os.Looper.myLooper() : android.os.Looper.getMainLooper()));
        ((p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.y) this.f90506a).f(pendingIntent);
        new java.util.concurrent.ConcurrentHashMap();
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0047xab30f989 b17 = b();
        if (i18 >= 29) {
            new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.l(context, b17);
        } else {
            new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.k(context, b17);
        }
        if (f90505c == 0) {
            f90505c = (int) (android.util.TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
        }
    }

    public static void a(android.os.Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0.class.getClassLoader());
        }
    }

    public static p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0049x5ee9be38 c(p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0049x5ee9be38 c0049x5ee9be38, p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.C0042x9e34a075 c0042x9e34a075) {
        int i17;
        if (c0049x5ee9be38 != null) {
            long j17 = c0049x5ee9be38.f90486e;
            long j18 = -1;
            if (j17 != -1 && ((i17 = c0049x5ee9be38.f90485d) == 3 || i17 == 4 || i17 == 5)) {
                if (c0049x5ee9be38.f90492n > 0) {
                    long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    long j19 = (c0049x5ee9be38.f90488g * ((float) (elapsedRealtime - r6))) + j17;
                    if (c0042x9e34a075 != null) {
                        android.os.Bundle bundle = c0042x9e34a075.f90449d;
                        if (bundle.containsKey("android.media.metadata.DURATION")) {
                            j18 = bundle.getLong("android.media.metadata.DURATION", 0L);
                        }
                    }
                    long j27 = (j18 < 0 || j19 <= j18) ? j19 < 0 ? 0L : j19 : j18;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    long j28 = c0049x5ee9be38.f90487f;
                    long j29 = c0049x5ee9be38.f90489h;
                    int i18 = c0049x5ee9be38.f90490i;
                    java.lang.CharSequence charSequence = c0049x5ee9be38.f90491m;
                    java.util.List list = c0049x5ee9be38.f90493o;
                    if (list != null) {
                        arrayList.addAll(list);
                    }
                    return new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0049x5ee9be38(c0049x5ee9be38.f90485d, j27, j28, c0049x5ee9be38.f90488g, j29, i18, charSequence, elapsedRealtime, arrayList, c0049x5ee9be38.f90494p, c0049x5ee9be38.f90495q);
                }
            }
        }
        return c0049x5ee9be38;
    }

    public p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0047xab30f989 b() {
        return this.f90506a.c();
    }

    public void d() {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.y yVar = (p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.y) this.f90506a;
        yVar.f90536e = true;
        yVar.f90537f.kill();
        int i17 = android.os.Build.VERSION.SDK_INT;
        android.media.session.MediaSession mediaSession = yVar.f90532a;
        if (i17 == 27) {
            try {
                java.lang.reflect.Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                declaredField.setAccessible(true);
                android.os.Handler handler = (android.os.Handler) declaredField.get(mediaSession);
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        mediaSession.setCallback(null);
        mediaSession.release();
    }

    public void e(boolean z17) {
        ((p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.y) this.f90506a).f90532a.setActive(z17);
        java.util.Iterator it = this.f90507b.iterator();
        if (it.hasNext()) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
            throw null;
        }
    }

    public void f(p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v vVar, android.os.Handler handler) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.w wVar = this.f90506a;
        if (vVar == null) {
            wVar.a(null, null);
            return;
        }
        if (handler == null) {
            handler = new android.os.Handler();
        }
        wVar.a(vVar, handler);
    }

    public void g(p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.C0042x9e34a075 c0042x9e34a075) {
        android.media.MediaMetadata mediaMetadata;
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.y yVar = (p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.y) this.f90506a;
        yVar.f90539h = c0042x9e34a075;
        if (c0042x9e34a075 == null) {
            mediaMetadata = null;
        } else {
            if (c0042x9e34a075.f90450e == null) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                c0042x9e34a075.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                c0042x9e34a075.f90450e = (android.media.MediaMetadata) android.media.MediaMetadata.CREATOR.createFromParcel(obtain);
                obtain.recycle();
            }
            mediaMetadata = c0042x9e34a075.f90450e;
        }
        yVar.f90532a.setMetadata(mediaMetadata);
    }

    public void h(p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0049x5ee9be38 c0049x5ee9be38) {
        android.media.session.PlaybackState playbackState;
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.y yVar = (p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.y) this.f90506a;
        yVar.f90538g = c0049x5ee9be38;
        synchronized (yVar.f90534c) {
            int beginBroadcast = yVar.f90537f.beginBroadcast();
            while (true) {
                beginBroadcast--;
                if (beginBroadcast < 0) {
                    break;
                } else {
                    try {
                        ((p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.c) yVar.f90537f.getBroadcastItem(beginBroadcast)).bj(c0049x5ee9be38);
                    } catch (android.os.RemoteException unused) {
                    }
                }
            }
            yVar.f90537f.finishBroadcast();
        }
        android.media.session.MediaSession mediaSession = yVar.f90532a;
        if (c0049x5ee9be38 == null) {
            playbackState = null;
        } else {
            if (c0049x5ee9be38.f90496r == null) {
                android.media.session.PlaybackState.Builder d17 = p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.i0.d();
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.i0.x(d17, c0049x5ee9be38.f90485d, c0049x5ee9be38.f90486e, c0049x5ee9be38.f90488g, c0049x5ee9be38.f90492n);
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.i0.u(d17, c0049x5ee9be38.f90487f);
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.i0.s(d17, c0049x5ee9be38.f90489h);
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.i0.v(d17, c0049x5ee9be38.f90491m);
                for (p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0049x5ee9be38.CustomAction customAction : c0049x5ee9be38.f90493o) {
                    android.media.session.PlaybackState.CustomAction.Builder e17 = p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.i0.e(customAction.f90497d, customAction.f90498e, customAction.f90499f);
                    p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.i0.w(e17, customAction.f90500g);
                    p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.i0.a(d17, p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.i0.b(e17));
                }
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.i0.t(d17, c0049x5ee9be38.f90494p);
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.j0.b(d17, c0049x5ee9be38.f90495q);
                c0049x5ee9be38.f90496r = p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.i0.c(d17);
            }
            playbackState = c0049x5ee9be38.f90496r;
        }
        mediaSession.setPlaybackState(playbackState);
    }
}
