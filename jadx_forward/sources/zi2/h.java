package zi2;

/* loaded from: classes3.dex */
public final class h implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zi2.w f554642d;

    public h(zi2.w wVar) {
        this.f554642d = wVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCoverPlugin", "receive micTagChangeListener");
        java.util.Iterator it = this.f554642d.x1().t().iterator();
        while (it.hasNext()) {
            ((lj2.u0) it.next()).g();
        }
    }
}
