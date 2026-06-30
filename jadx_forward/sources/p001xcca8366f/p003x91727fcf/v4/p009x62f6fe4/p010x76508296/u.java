package p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296;

/* loaded from: classes15.dex */
public class u extends android.media.session.MediaSession.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v f90525a;

    public u(p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v vVar) {
        this.f90525a = vVar;
    }

    public final p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.y a() {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.y yVar;
        synchronized (this.f90525a.f90526a) {
            yVar = (p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.y) this.f90525a.f90529d.get();
        }
        if (yVar == null || this.f90525a != yVar.mo2492x71965dbb()) {
            return null;
        }
        return yVar;
    }

    public final void b(p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.w wVar) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return;
        }
        java.lang.String mo2493x9cad5bd8 = wVar.mo2493x9cad5bd8();
        if (android.text.TextUtils.isEmpty(mo2493x9cad5bd8)) {
            mo2493x9cad5bd8 = "android.media.session.MediaController";
        }
        wVar.b(new c4.o0(mo2493x9cad5bd8, -1, -1));
    }

    @Override // android.media.session.MediaSession.Callback
    public void onCommand(java.lang.String str, android.os.Bundle bundle, android.os.ResultReceiver resultReceiver) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f fVar;
        w4.e eVar;
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.y a17 = a();
        if (a17 == null) {
            return;
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0.a(bundle);
        b(a17);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0047xab30f989 c0047xab30f989 = a17.f90533b;
                synchronized (c0047xab30f989.f90476d) {
                    fVar = c0047xab30f989.f90478f;
                }
                j3.e.b(bundle2, "android.support.v4.media.session.EXTRA_BINDER", fVar == null ? null : fVar.asBinder());
                synchronized (c0047xab30f989.f90476d) {
                    eVar = c0047xab30f989.f90479g;
                }
                if (eVar != null) {
                    android.os.Bundle bundle3 = new android.os.Bundle();
                    bundle3.putParcelable("a", new p012xc85e97e9.p113x8afc139a.C1187xee9e85e9(eVar));
                    bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                }
                resultReceiver.send(0, bundle2);
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v vVar = this.f90525a;
                vVar.getClass();
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v vVar2 = this.f90525a;
                bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
                vVar2.getClass();
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v vVar3 = this.f90525a;
                vVar3.getClass();
            } else if (!str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                this.f90525a.b(str, bundle, resultReceiver);
            }
        } catch (android.os.BadParcelableException unused) {
        }
        a17.b(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onCustomAction(java.lang.String str, android.os.Bundle bundle) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.y a17 = a();
        if (a17 == null) {
            return;
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0.a(bundle);
        b(a17);
        try {
            boolean equals = str.equals("android.support.v4.media.session.action.PLAY_FROM_URI");
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v vVar = this.f90525a;
            if (equals) {
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                vVar.getClass();
            } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                vVar.getClass();
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                vVar.getClass();
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                vVar.getClass();
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
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
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
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
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.y a17 = a();
        if (a17 == null) {
            return;
        }
        b(a17);
        this.f90525a.getClass();
        a17.b(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public boolean onMediaButtonEvent(android.content.Intent intent) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.y a17 = a();
        if (a17 == null) {
            return false;
        }
        b(a17);
        boolean c17 = this.f90525a.c(intent);
        a17.b(null);
        return c17 || super.onMediaButtonEvent(intent);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPause() {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.y a17 = a();
        if (a17 == null) {
            return;
        }
        b(a17);
        this.f90525a.d();
        a17.b(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPlay() {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.y a17 = a();
        if (a17 == null) {
            return;
        }
        b(a17);
        this.f90525a.e();
        a17.b(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPlayFromMediaId(java.lang.String str, android.os.Bundle bundle) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.y a17 = a();
        if (a17 == null) {
            return;
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0.a(bundle);
        b(a17);
        this.f90525a.f(str, bundle);
        a17.b(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPlayFromSearch(java.lang.String str, android.os.Bundle bundle) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.y a17 = a();
        if (a17 == null) {
            return;
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0.a(bundle);
        b(a17);
        this.f90525a.getClass();
        a17.b(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPlayFromUri(android.net.Uri uri, android.os.Bundle bundle) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.y a17 = a();
        if (a17 == null) {
            return;
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0.a(bundle);
        b(a17);
        this.f90525a.getClass();
        a17.b(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPrepare() {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.y a17 = a();
        if (a17 == null) {
            return;
        }
        b(a17);
        this.f90525a.getClass();
        a17.b(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPrepareFromMediaId(java.lang.String str, android.os.Bundle bundle) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.y a17 = a();
        if (a17 == null) {
            return;
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0.a(bundle);
        b(a17);
        this.f90525a.getClass();
        a17.b(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPrepareFromSearch(java.lang.String str, android.os.Bundle bundle) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.y a17 = a();
        if (a17 == null) {
            return;
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0.a(bundle);
        b(a17);
        this.f90525a.getClass();
        a17.b(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPrepareFromUri(android.net.Uri uri, android.os.Bundle bundle) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.y a17 = a();
        if (a17 == null) {
            return;
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0.a(bundle);
        b(a17);
        this.f90525a.getClass();
        a17.b(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onRewind() {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.y a17 = a();
        if (a17 == null) {
            return;
        }
        b(a17);
        this.f90525a.getClass();
        a17.b(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onSeekTo(long j17) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.y a17 = a();
        if (a17 == null) {
            return;
        }
        b(a17);
        this.f90525a.g(j17);
        a17.b(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onSetPlaybackSpeed(float f17) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.y a17 = a();
        if (a17 == null) {
            return;
        }
        b(a17);
        this.f90525a.getClass();
        a17.b(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onSetRating(android.media.Rating rating) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.y a17 = a();
        if (a17 == null) {
            return;
        }
        b(a17);
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.C0043xc6eebb9f.a(rating);
        this.f90525a.getClass();
        a17.b(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onSkipToNext() {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.y a17 = a();
        if (a17 == null) {
            return;
        }
        b(a17);
        this.f90525a.h();
        a17.b(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onSkipToPrevious() {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.y a17 = a();
        if (a17 == null) {
            return;
        }
        b(a17);
        this.f90525a.i();
        a17.b(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onSkipToQueueItem(long j17) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.y a17 = a();
        if (a17 == null) {
            return;
        }
        b(a17);
        this.f90525a.getClass();
        a17.b(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onStop() {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.y a17 = a();
        if (a17 == null) {
            return;
        }
        b(a17);
        this.f90525a.j();
        a17.b(null);
    }
}
