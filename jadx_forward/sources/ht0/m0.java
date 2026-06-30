package ht0;

/* loaded from: classes10.dex */
public class m0 implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f366241d;

    public m0(ht0.n0 n0Var, java.lang.String str) {
        this.f366241d = str;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "BigSightFFMpegRecorder_tagRotate_after_process";
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.p314xaae8f345.mm.vfs.w6.h(this.f366241d);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.X264YUVMP4MuxRecorder", "stop, delete old file error: %s", e17.getMessage());
        }
    }
}
