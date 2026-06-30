package gl;

/* loaded from: classes14.dex */
public final class w implements android.media.AudioManager.OnCommunicationDeviceChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gl.y f354315a;

    public w(gl.y yVar) {
        this.f354315a = yVar;
    }

    @Override // android.media.AudioManager.OnCommunicationDeviceChangedListener
    public final void onCommunicationDeviceChanged(android.media.AudioDeviceInfo audioDeviceInfo) {
        gl.y yVar = this.f354315a;
        p3325xe03a0797.p3326xc267989b.l.d(yVar.f354326h, null, null, new gl.v(yVar, audioDeviceInfo, null), 3, null);
    }
}
