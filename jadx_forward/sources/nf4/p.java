package nf4;

/* loaded from: classes4.dex */
public final class p extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f418411e = {l75.n0.m145250x3fdc6f77(nf4.o.f418410v, "StoryVideoCacheInfo")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f418412f = "MicroMsg.StoryVideoCacheStorage";

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f418413d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(l75.k0 db6) {
        super(db6, nf4.o.f418410v, "StoryVideoCacheInfo", dm.fb.f318471m);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = nf4.o.f418410v;
        this.f418413d = db6;
    }

    public final boolean D0(nf4.o item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        return super.mo9952xce0038c9(item, new java.lang.String[0]);
    }

    public void y0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f418412f, "dropTable " + this.f418413d.mo70514xb06685ab("StoryVideoCacheInfo", null, null));
    }

    @Override // l75.n0, l75.g0
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public boolean mo880xb970c2b9(nf4.o item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        return super.mo880xb970c2b9(item);
    }
}
