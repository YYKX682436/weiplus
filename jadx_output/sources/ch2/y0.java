package ch2;

/* loaded from: classes10.dex */
public final class y0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f41493d;

    public y0(ch2.o2 o2Var) {
        this.f41493d = o2Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.util.List list = (java.util.List) obj;
        com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", "dispatchSongListState: " + list);
        if (list != null) {
            this.f41493d.v7(list, true);
        }
        return jz5.f0.f302826a;
    }
}
