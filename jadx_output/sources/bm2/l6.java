package bm2;

/* loaded from: classes10.dex */
public final class l6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.o6 f22069d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hn2.d f22070e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(bm2.o6 o6Var, hn2.d dVar, bm2.i6 i6Var) {
        super(0);
        this.f22069d = o6Var;
        this.f22070e = dVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f22069d.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        hn2.d dVar = this.f22070e;
        sb6.append(dVar.f282506b);
        sb6.append(' ');
        sb6.append(dVar.f282505a);
        sb6.append(" isDownloading:");
        sb6.append(dVar.f282514j);
        sb6.append(", progress ");
        sb6.append(dVar.f282515k);
        sb6.append(", has requested ");
        sb6.append(dVar.c());
        com.tencent.mars.xlog.Log.i("FinderLiveRequestSongListAdapter", sb6.toString());
        return jz5.f0.f302826a;
    }
}
