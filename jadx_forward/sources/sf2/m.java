package sf2;

/* loaded from: classes10.dex */
public final class m implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sf2.x f488731d;

    public m(sf2.x xVar) {
        this.f488731d = xVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        mm2.j7 j7Var = (mm2.j7) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("anchor openSongListLocateInfo: songName=");
        sb6.append(j7Var != null ? j7Var.f410716a : null);
        sb6.append(", uniqueAddId=");
        sb6.append(j7Var != null ? j7Var.f410717b : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicSingSongController", sb6.toString());
        if ((j7Var != null && (j7Var.a() ^ true)) && dk2.ef.f314917g) {
            this.f488731d.s7(true);
        }
    }
}
