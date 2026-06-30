package fl3;

/* loaded from: classes13.dex */
public class b implements android.media.AudioManager.OnAudioFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fl3.a f345462d;

    public b(fl3.a aVar) {
        this.f345462d = aVar;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicAudioFocusHelper", "focus change %d", java.lang.Integer.valueOf(i17));
        if (i17 == -2 || i17 == -3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicAudioFocusHelper", "audio focus lossTransient");
            return;
        }
        if (i17 == 1 || i17 == 2 || i17 == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicAudioFocusHelper", "audio focus gain");
            return;
        }
        if (i17 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicAudioFocusHelper", "audio focus loss, passive pause");
            fl3.a aVar = this.f345462d;
            if (aVar.f345459a.b() != null) {
                ((android.media.AudioManager) aVar.f345459a.b()).abandonAudioFocus(aVar.f345461c);
            }
            aVar.f345460b = false;
        }
    }
}
