package rl2;

/* loaded from: classes4.dex */
public final class e extends be2.d {

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f478725e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f478726f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l75.k0 db6) {
        super(db6, ce2.m.f122318p, "FinderLiveConfig", dm.m4.f319982g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = ce2.m.f122318p;
        this.f478725e = db6;
        this.f478726f = "select * from FinderLiveConfig ";
    }

    @Override // l75.n0
    /* renamed from: replace */
    public boolean mo11260x413cb2b4(l75.f0 f0Var) {
        ce2.m item = (ce2.m) f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        boolean mo11260x413cb2b4 = super.mo11260x413cb2b4(item);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveConfigStorage", "insert " + item.f67424x4b6e619a + ", ret:" + mo11260x413cb2b4);
        return mo11260x413cb2b4;
    }
}
