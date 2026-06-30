package n8;

/* loaded from: classes15.dex */
public class o extends java.lang.Thread {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.media.AudioTrack f417071d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n8.w f417072e;

    public o(n8.w wVar, android.media.AudioTrack audioTrack) {
        this.f417072e = wVar;
        this.f417071d = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        n8.w wVar = this.f417072e;
        android.media.AudioTrack audioTrack = this.f417071d;
        try {
            audioTrack.flush();
            audioTrack.release();
        } finally {
            wVar.f417099f.open();
        }
    }
}
