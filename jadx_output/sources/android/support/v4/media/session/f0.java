package android.support.v4.media.session;

/* loaded from: classes15.dex */
public class f0 {

    /* renamed from: c, reason: collision with root package name */
    public static int f8972c;

    /* renamed from: a, reason: collision with root package name */
    public final android.support.v4.media.session.w f8973a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f8974b = new java.util.ArrayList();

    public f0(android.content.Context context, java.lang.String str) {
        android.content.ComponentName componentName;
        android.app.PendingIntent pendingIntent;
        if (context == null) {
            throw new java.lang.IllegalArgumentException("context must not be null");
        }
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("tag must not be null or empty");
        }
        int i17 = androidx.media.session.MediaButtonReceiver.f11708a;
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
            pendingIntent = android.app.PendingIntent.getBroadcast(context, 0, intent2, android.os.Build.VERSION.SDK_INT >= 31 ? com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62 : 0);
        } else {
            pendingIntent = null;
        }
        int i18 = android.os.Build.VERSION.SDK_INT;
        if (i18 >= 29) {
            this.f8973a = new android.support.v4.media.session.b0(context, str, null, null);
        } else if (i18 >= 28) {
            this.f8973a = new android.support.v4.media.session.a0(context, str, null, null);
        } else {
            this.f8973a = new android.support.v4.media.session.z(context, str, null, null);
        }
        f(new android.support.v4.media.session.s(this), new android.os.Handler(android.os.Looper.myLooper() != null ? android.os.Looper.myLooper() : android.os.Looper.getMainLooper()));
        ((android.support.v4.media.session.y) this.f8973a).f(pendingIntent);
        new java.util.concurrent.ConcurrentHashMap();
        android.support.v4.media.session.MediaSessionCompat$Token b17 = b();
        if (i18 >= 29) {
            new android.support.v4.media.session.l(context, b17);
        } else {
            new android.support.v4.media.session.k(context, b17);
        }
        if (f8972c == 0) {
            f8972c = (int) (android.util.TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
        }
    }

    public static void a(android.os.Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(android.support.v4.media.session.f0.class.getClassLoader());
        }
    }

    public static android.support.v4.media.session.PlaybackStateCompat c(android.support.v4.media.session.PlaybackStateCompat playbackStateCompat, android.support.v4.media.MediaMetadataCompat mediaMetadataCompat) {
        int i17;
        if (playbackStateCompat != null) {
            long j17 = playbackStateCompat.f8953e;
            long j18 = -1;
            if (j17 != -1 && ((i17 = playbackStateCompat.f8952d) == 3 || i17 == 4 || i17 == 5)) {
                if (playbackStateCompat.f8959n > 0) {
                    long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    long j19 = (playbackStateCompat.f8955g * ((float) (elapsedRealtime - r6))) + j17;
                    if (mediaMetadataCompat != null) {
                        android.os.Bundle bundle = mediaMetadataCompat.f8916d;
                        if (bundle.containsKey("android.media.metadata.DURATION")) {
                            j18 = bundle.getLong("android.media.metadata.DURATION", 0L);
                        }
                    }
                    long j27 = (j18 < 0 || j19 <= j18) ? j19 < 0 ? 0L : j19 : j18;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    long j28 = playbackStateCompat.f8954f;
                    long j29 = playbackStateCompat.f8956h;
                    int i18 = playbackStateCompat.f8957i;
                    java.lang.CharSequence charSequence = playbackStateCompat.f8958m;
                    java.util.List list = playbackStateCompat.f8960o;
                    if (list != null) {
                        arrayList.addAll(list);
                    }
                    return new android.support.v4.media.session.PlaybackStateCompat(playbackStateCompat.f8952d, j27, j28, playbackStateCompat.f8955g, j29, i18, charSequence, elapsedRealtime, arrayList, playbackStateCompat.f8961p, playbackStateCompat.f8962q);
                }
            }
        }
        return playbackStateCompat;
    }

    public android.support.v4.media.session.MediaSessionCompat$Token b() {
        return this.f8973a.c();
    }

    public void d() {
        android.support.v4.media.session.y yVar = (android.support.v4.media.session.y) this.f8973a;
        yVar.f9003e = true;
        yVar.f9004f.kill();
        int i17 = android.os.Build.VERSION.SDK_INT;
        android.media.session.MediaSession mediaSession = yVar.f8999a;
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
        ((android.support.v4.media.session.y) this.f8973a).f8999a.setActive(z17);
        java.util.Iterator it = this.f8974b.iterator();
        if (it.hasNext()) {
            android.support.v4.media.f.a(it.next());
            throw null;
        }
    }

    public void f(android.support.v4.media.session.v vVar, android.os.Handler handler) {
        android.support.v4.media.session.w wVar = this.f8973a;
        if (vVar == null) {
            wVar.a(null, null);
            return;
        }
        if (handler == null) {
            handler = new android.os.Handler();
        }
        wVar.a(vVar, handler);
    }

    public void g(android.support.v4.media.MediaMetadataCompat mediaMetadataCompat) {
        android.media.MediaMetadata mediaMetadata;
        android.support.v4.media.session.y yVar = (android.support.v4.media.session.y) this.f8973a;
        yVar.f9006h = mediaMetadataCompat;
        if (mediaMetadataCompat == null) {
            mediaMetadata = null;
        } else {
            if (mediaMetadataCompat.f8917e == null) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                mediaMetadataCompat.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                mediaMetadataCompat.f8917e = (android.media.MediaMetadata) android.media.MediaMetadata.CREATOR.createFromParcel(obtain);
                obtain.recycle();
            }
            mediaMetadata = mediaMetadataCompat.f8917e;
        }
        yVar.f8999a.setMetadata(mediaMetadata);
    }

    public void h(android.support.v4.media.session.PlaybackStateCompat playbackStateCompat) {
        android.media.session.PlaybackState playbackState;
        android.support.v4.media.session.y yVar = (android.support.v4.media.session.y) this.f8973a;
        yVar.f9005g = playbackStateCompat;
        synchronized (yVar.f9001c) {
            int beginBroadcast = yVar.f9004f.beginBroadcast();
            while (true) {
                beginBroadcast--;
                if (beginBroadcast < 0) {
                    break;
                } else {
                    try {
                        ((android.support.v4.media.session.c) yVar.f9004f.getBroadcastItem(beginBroadcast)).bj(playbackStateCompat);
                    } catch (android.os.RemoteException unused) {
                    }
                }
            }
            yVar.f9004f.finishBroadcast();
        }
        android.media.session.MediaSession mediaSession = yVar.f8999a;
        if (playbackStateCompat == null) {
            playbackState = null;
        } else {
            if (playbackStateCompat.f8963r == null) {
                android.media.session.PlaybackState.Builder d17 = android.support.v4.media.session.i0.d();
                android.support.v4.media.session.i0.x(d17, playbackStateCompat.f8952d, playbackStateCompat.f8953e, playbackStateCompat.f8955g, playbackStateCompat.f8959n);
                android.support.v4.media.session.i0.u(d17, playbackStateCompat.f8954f);
                android.support.v4.media.session.i0.s(d17, playbackStateCompat.f8956h);
                android.support.v4.media.session.i0.v(d17, playbackStateCompat.f8958m);
                for (android.support.v4.media.session.PlaybackStateCompat.CustomAction customAction : playbackStateCompat.f8960o) {
                    android.media.session.PlaybackState.CustomAction.Builder e17 = android.support.v4.media.session.i0.e(customAction.f8964d, customAction.f8965e, customAction.f8966f);
                    android.support.v4.media.session.i0.w(e17, customAction.f8967g);
                    android.support.v4.media.session.i0.a(d17, android.support.v4.media.session.i0.b(e17));
                }
                android.support.v4.media.session.i0.t(d17, playbackStateCompat.f8961p);
                android.support.v4.media.session.j0.b(d17, playbackStateCompat.f8962q);
                playbackStateCompat.f8963r = android.support.v4.media.session.i0.c(d17);
            }
            playbackState = playbackStateCompat.f8963r;
        }
        mediaSession.setPlaybackState(playbackState);
    }
}
