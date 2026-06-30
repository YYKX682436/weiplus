package a31;

/* loaded from: classes14.dex */
public class p implements android.media.MediaPlayer.OnCompletionListener {
    public p(com.tencent.mm.modelvoiceaddr.ui.VoiceSearchLayout voiceSearchLayout, a31.a aVar) {
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        mediaPlayer.release();
    }
}
