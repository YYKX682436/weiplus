package tl;

/* loaded from: classes12.dex */
public class i implements android.media.MediaRecorder.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tl.t f501584a;

    public i(tl.t tVar) {
        this.f501584a = tVar;
    }

    @Override // android.media.MediaRecorder.OnErrorListener
    public void onError(android.media.MediaRecorder mediaRecorder, int i17, int i18) {
        tl.t tVar = this.f501584a;
        tl.a aVar = tVar.f501658e;
        if (aVar != null) {
            aVar.a();
        }
        try {
            tVar.f501668o.release();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAudioRecorder", e17.getMessage());
        }
        tVar.f501671r = tl.s.ERROR;
    }
}
