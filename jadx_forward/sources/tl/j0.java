package tl;

/* loaded from: classes12.dex */
public class j0 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl.p0 f501588d;

    public j0(tl.p0 p0Var) {
        this.f501588d = p0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        tl.p0 p0Var = this.f501588d;
        if (booleanValue) {
            p0Var.n();
            return null;
        }
        if (p0Var.f501614n) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SceneVoice.Recorder", "mHasBeginRec is true");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoice.Recorder", "after start bluetooth, timeout to directly start record");
        p0Var.n();
        return null;
    }
}
