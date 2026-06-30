package kh;

/* loaded from: classes12.dex */
public final class w extends android.media.AudioManager.AudioPlaybackCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.os.Handler f389470a;

    public w(android.os.Handler handler) {
        this.f389470a = handler;
    }

    @Override // android.media.AudioManager.AudioPlaybackCallback
    public void onPlaybackConfigChanged(java.util.List configs) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configs, "configs");
        super.onPlaybackConfigChanged(configs);
        android.os.Handler handler = this.f389470a;
        kh.y yVar = kh.y.f389480d;
        handler.removeCallbacks(yVar);
        java.util.List list = (java.util.List) kh.y.f389482f.mo141623x754a37bb();
        list.clear();
        list.addAll(configs);
        this.f389470a.postDelayed(yVar, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
    }
}
