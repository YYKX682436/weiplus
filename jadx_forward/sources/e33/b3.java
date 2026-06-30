package e33;

/* loaded from: classes10.dex */
public class b3 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.C15655x4db85b14 f328690d;

    public b3(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.C15655x4db85b14 c15655x4db85b14) {
        this.f328690d = c15655x4db85b14;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.C15655x4db85b14 c15655x4db85b14 = this.f328690d;
        if (c15655x4db85b14.f220102q == null && c15655x4db85b14.f220101p.size() <= 0) {
            return true;
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(c15655x4db85b14.f220101p.size());
        objArr[1] = java.lang.Boolean.valueOf(c15655x4db85b14.f220102q != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageFolderMgrView", "onPreDraw pAlbums size=%d, had favoriteAlbum=%s", objArr);
        t23.p0.n().c(new e33.a3(this));
        return false;
    }
}
