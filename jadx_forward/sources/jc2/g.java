package jc2;

/* loaded from: classes8.dex */
public final class g implements jc2.c {

    /* renamed from: a, reason: collision with root package name */
    public final r45.vs2 f380484a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f380485b;

    /* renamed from: c, reason: collision with root package name */
    public final int f380486c;

    public g(r45.vs2 ctrlInfo, java.util.List interceptors, int i17, jc2.b bVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctrlInfo, "ctrlInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(interceptors, "interceptors");
        this.f380484a = ctrlInfo;
        this.f380485b = interceptors;
        this.f380486c = i17;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb a(r45.vs2 ctrlInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctrlInfo, "ctrlInfo");
        java.util.List list = this.f380485b;
        int size = list.size();
        int i17 = this.f380486c;
        if (i17 < size) {
            return ((jc2.d) list.get(i17)).a(new jc2.g(ctrlInfo, list, i17 + 1, null));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.RedDotChain", "index out of bounds");
        return null;
    }
}
