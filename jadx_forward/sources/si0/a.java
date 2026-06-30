package si0;

/* loaded from: classes13.dex */
public final class a implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ si0.b f489567a;

    public a(si0.b bVar) {
        this.f489567a = bVar;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(android.media.MediaPlayer mediaPlayer) {
        si0.b bVar = this.f489567a;
        int i17 = bVar.f489572c;
        int i18 = bVar.f489571b;
        if (i17 < i18 || i18 == -1) {
            bVar.f489572c = i17 + 1;
            mediaPlayer.seekTo(0);
            mediaPlayer.start();
        }
    }
}
