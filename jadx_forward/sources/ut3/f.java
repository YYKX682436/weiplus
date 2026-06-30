package ut3;

/* loaded from: classes10.dex */
public class f {

    /* renamed from: c, reason: collision with root package name */
    public static final ut3.f f512709c = new ut3.f();

    /* renamed from: a, reason: collision with root package name */
    public ut3.d f512710a = null;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Bundle f512711b = new android.os.Bundle();

    public void a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046) {
        ut3.d dVar = this.f512710a;
        android.os.Bundle bundle = this.f512711b;
        if (dVar != null && context != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CaptureDataManager", "doSend, generateCallback:%s", java.lang.Integer.valueOf(dVar.hashCode()));
            this.f512710a.k3(context, c16991x15ced046, new android.os.Bundle(bundle));
            bundle.clear();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CaptureDataManager", "doSend, generateCallback null, finish");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_extra_data", bundle);
        intent.putExtra("KSEGMENTMEDIAINFO", c16991x15ced046);
        android.app.Activity activity = (android.app.Activity) context;
        activity.setResult(-1, intent);
        activity.finish();
    }

    public void b(android.content.Context context, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16505x35e9c14f c16505x35e9c14f) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("media_basic_extra_bundle", this.f512711b);
        intent.putExtra("media_basic_out_model", c16505x35e9c14f);
        android.app.Activity activity = (android.app.Activity) context;
        activity.setResult(i17, intent);
        activity.finish();
    }

    public android.os.Bundle c() {
        return this.f512711b;
    }

    public void d(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16994x3ba8255 c16994x3ba8255) {
        ut3.d dVar = this.f512710a;
        if (dVar == null) {
            return;
        }
        dVar.r3(z17, c16994x3ba8255, this.f512711b);
    }

    public void e(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CaptureDataManager", "updateSoundTrackTypeOnExtData: %d", java.lang.Integer.valueOf(i17));
        f512709c.f512711b.putInt("SOUND_TRACK_TYPE", i17);
    }
}
