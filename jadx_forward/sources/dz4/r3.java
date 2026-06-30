package dz4;

/* loaded from: classes12.dex */
public final class r3 implements jz4.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f326926d;

    public r3(dz4.u3 u3Var) {
        this.f326926d = new java.lang.ref.WeakReference(u3Var);
    }

    @Override // jz4.a
    public void F0() {
        dz4.u3 u3Var = (dz4.u3) this.f326926d.get();
        if (u3Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteFlutterRecordHelper", "OnRecordingTimeLimited: ");
            u3Var.a();
        }
    }

    @Override // jz4.a
    public void G5() {
        if (((dz4.u3) this.f326926d.get()) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteFlutterRecordHelper", "OnRecordingStop: ");
        }
    }
}
