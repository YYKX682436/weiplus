package android.support.v4.media.session;

/* loaded from: classes15.dex */
public class u extends android.media.session.MediaSession.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.media.session.v f8992a;

    public u(android.support.v4.media.session.v vVar) {
        this.f8992a = vVar;
    }

    public final android.support.v4.media.session.y a() {
        android.support.v4.media.session.y yVar;
        synchronized (this.f8992a.f8993a) {
            yVar = (android.support.v4.media.session.y) this.f8992a.f8996d.get();
        }
        if (yVar == null || this.f8992a != yVar.getCallback()) {
            return null;
        }
        return yVar;
    }

    public final void b(android.support.v4.media.session.w wVar) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return;
        }
        java.lang.String callingPackage = wVar.getCallingPackage();
        if (android.text.TextUtils.isEmpty(callingPackage)) {
            callingPackage = "android.media.session.MediaController";
        }
        wVar.b(new c4.o0(callingPackage, -1, -1));
    }

    @Override // android.media.session.MediaSession.Callback
    public void onCommand(java.lang.String str, android.os.Bundle bundle, android.os.ResultReceiver resultReceiver) {
        android.support.v4.media.session.f fVar;
        w4.e eVar;
        android.support.v4.media.session.y a17 = a();
        if (a17 == null) {
            return;
        }
        android.support.v4.media.session.f0.a(bundle);
        b(a17);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                android.support.v4.media.session.MediaSessionCompat$Token mediaSessionCompat$Token = a17.f9000b;
                synchronized (mediaSessionCompat$Token.f8943d) {
                    fVar = mediaSessionCompat$Token.f8945f;
                }
                j3.e.b(bundle2, "android.support.v4.media.session.EXTRA_BINDER", fVar == null ? null : fVar.asBinder());
                synchronized (mediaSessionCompat$Token.f8943d) {
                    eVar = mediaSessionCompat$Token.f8946g;
                }
                if (eVar != null) {
                    android.os.Bundle bundle3 = new android.os.Bundle();
                    bundle3.putParcelable("a", new androidx.versionedparcelable.ParcelImpl(eVar));
                    bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                }
                resultReceiver.send(0, bundle2);
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                android.support.v4.media.session.v vVar = this.f8992a;
                vVar.getClass();
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                android.support.v4.media.session.v vVar2 = this.f8992a;
                bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
                vVar2.getClass();
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                android.support.v4.media.session.v vVar3 = this.f8992a;
                vVar3.getClass();
            } else if (!str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                this.f8992a.b(str, bundle, resultReceiver);
            }
        } catch (android.os.BadParcelableException unused) {
        }
        a17.b(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onCustomAction(java.lang.String str, android.os.Bundle bundle) {
        android.support.v4.media.session.y a17 = a();
        if (a17 == null) {
            return;
        }
        android.support.v4.media.session.f0.a(bundle);
        b(a17);
        try {
            boolean equals = str.equals("android.support.v4.media.session.action.PLAY_FROM_URI");
            android.support.v4.media.session.v vVar = this.f8992a;
            if (equals) {
                android.support.v4.media.session.f0.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                vVar.getClass();
            } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                vVar.getClass();
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                android.support.v4.media.session.f0.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                vVar.getClass();
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                android.support.v4.media.session.f0.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                vVar.getClass();
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                android.support.v4.media.session.f0.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                vVar.getClass();
            } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                vVar.getClass();
            } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
                vVar.getClass();
            } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
                vVar.getClass();
            } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                android.support.v4.media.session.f0.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                vVar.getClass();
            } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
                vVar.getClass();
            } else {
                vVar.getClass();
            }
        } catch (android.os.BadParcelableException unused) {
        }
        a17.b(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onFastForward() {
        android.support.v4.media.session.y a17 = a();
        if (a17 == null) {
            return;
        }
        b(a17);
        this.f8992a.getClass();
        a17.b(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public boolean onMediaButtonEvent(android.content.Intent intent) {
        android.support.v4.media.session.y a17 = a();
        if (a17 == null) {
            return false;
        }
        b(a17);
        boolean c17 = this.f8992a.c(intent);
        a17.b(null);
        return c17 || super.onMediaButtonEvent(intent);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPause() {
        android.support.v4.media.session.y a17 = a();
        if (a17 == null) {
            return;
        }
        b(a17);
        this.f8992a.d();
        a17.b(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPlay() {
        android.support.v4.media.session.y a17 = a();
        if (a17 == null) {
            return;
        }
        b(a17);
        this.f8992a.e();
        a17.b(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPlayFromMediaId(java.lang.String str, android.os.Bundle bundle) {
        android.support.v4.media.session.y a17 = a();
        if (a17 == null) {
            return;
        }
        android.support.v4.media.session.f0.a(bundle);
        b(a17);
        this.f8992a.f(str, bundle);
        a17.b(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPlayFromSearch(java.lang.String str, android.os.Bundle bundle) {
        android.support.v4.media.session.y a17 = a();
        if (a17 == null) {
            return;
        }
        android.support.v4.media.session.f0.a(bundle);
        b(a17);
        this.f8992a.getClass();
        a17.b(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPlayFromUri(android.net.Uri uri, android.os.Bundle bundle) {
        android.support.v4.media.session.y a17 = a();
        if (a17 == null) {
            return;
        }
        android.support.v4.media.session.f0.a(bundle);
        b(a17);
        this.f8992a.getClass();
        a17.b(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPrepare() {
        android.support.v4.media.session.y a17 = a();
        if (a17 == null) {
            return;
        }
        b(a17);
        this.f8992a.getClass();
        a17.b(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPrepareFromMediaId(java.lang.String str, android.os.Bundle bundle) {
        android.support.v4.media.session.y a17 = a();
        if (a17 == null) {
            return;
        }
        android.support.v4.media.session.f0.a(bundle);
        b(a17);
        this.f8992a.getClass();
        a17.b(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPrepareFromSearch(java.lang.String str, android.os.Bundle bundle) {
        android.support.v4.media.session.y a17 = a();
        if (a17 == null) {
            return;
        }
        android.support.v4.media.session.f0.a(bundle);
        b(a17);
        this.f8992a.getClass();
        a17.b(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPrepareFromUri(android.net.Uri uri, android.os.Bundle bundle) {
        android.support.v4.media.session.y a17 = a();
        if (a17 == null) {
            return;
        }
        android.support.v4.media.session.f0.a(bundle);
        b(a17);
        this.f8992a.getClass();
        a17.b(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onRewind() {
        android.support.v4.media.session.y a17 = a();
        if (a17 == null) {
            return;
        }
        b(a17);
        this.f8992a.getClass();
        a17.b(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onSeekTo(long j17) {
        android.support.v4.media.session.y a17 = a();
        if (a17 == null) {
            return;
        }
        b(a17);
        this.f8992a.g(j17);
        a17.b(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onSetPlaybackSpeed(float f17) {
        android.support.v4.media.session.y a17 = a();
        if (a17 == null) {
            return;
        }
        b(a17);
        this.f8992a.getClass();
        a17.b(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onSetRating(android.media.Rating rating) {
        android.support.v4.media.session.y a17 = a();
        if (a17 == null) {
            return;
        }
        b(a17);
        android.support.v4.media.RatingCompat.a(rating);
        this.f8992a.getClass();
        a17.b(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onSkipToNext() {
        android.support.v4.media.session.y a17 = a();
        if (a17 == null) {
            return;
        }
        b(a17);
        this.f8992a.h();
        a17.b(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onSkipToPrevious() {
        android.support.v4.media.session.y a17 = a();
        if (a17 == null) {
            return;
        }
        b(a17);
        this.f8992a.i();
        a17.b(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onSkipToQueueItem(long j17) {
        android.support.v4.media.session.y a17 = a();
        if (a17 == null) {
            return;
        }
        b(a17);
        this.f8992a.getClass();
        a17.b(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onStop() {
        android.support.v4.media.session.y a17 = a();
        if (a17 == null) {
            return;
        }
        b(a17);
        this.f8992a.j();
        a17.b(null);
    }
}
