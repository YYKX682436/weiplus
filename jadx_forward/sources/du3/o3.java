package du3;

/* loaded from: classes3.dex */
public final class o3 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.t3 f325206d;

    public o3(du3.t3 t3Var) {
        this.f325206d = t3Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        l45.q qVar;
        hk0.o oVar = (hk0.o) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "FUNC_CROP >> " + oVar.f363316b);
        if (!oVar.f363316b || (qVar = this.f325206d.f325259p) == null) {
            return;
        }
        new l45.a((l45.n) qVar).a(qk.g6.CROP_PHOTO);
    }
}
