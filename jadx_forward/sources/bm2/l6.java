package bm2;

/* loaded from: classes10.dex */
public final class l6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.o6 f103602d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hn2.d f103603e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(bm2.o6 o6Var, hn2.d dVar, bm2.i6 i6Var) {
        super(0);
        this.f103602d = o6Var;
        this.f103603e = dVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f103602d.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        hn2.d dVar = this.f103603e;
        sb6.append(dVar.f364039b);
        sb6.append(' ');
        sb6.append(dVar.f364038a);
        sb6.append(" isDownloading:");
        sb6.append(dVar.f364047j);
        sb6.append(", progress ");
        sb6.append(dVar.f364048k);
        sb6.append(", has requested ");
        sb6.append(dVar.c());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRequestSongListAdapter", sb6.toString());
        return jz5.f0.f384359a;
    }
}
