package x51;

/* loaded from: classes12.dex */
public class y0 implements android.media.MediaPlayer.OnCompletionListener {
    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        try {
            mediaPlayer.release();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MiroMsg.NotificationUtil", e17, "", new java.lang.Object[0]);
        }
    }
}
