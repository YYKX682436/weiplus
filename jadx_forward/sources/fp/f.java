package fp;

/* loaded from: classes14.dex */
public class f implements android.media.AudioManager.OnAudioFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fp.g f346728d;

    public f(fp.g gVar) {
        this.f346728d = gVar;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i17) {
        fp.g gVar = this.f346728d;
        if (gVar.f346731c != null) {
            gVar.f346731c.mo13848x3dcbea6f(i17);
        }
    }
}
