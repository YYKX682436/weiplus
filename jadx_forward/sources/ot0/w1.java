package ot0;

/* loaded from: classes12.dex */
public final class w1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f430341d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f430342e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(long j17, long j18) {
        super(0);
        this.f430341d = j17;
        this.f430342e = j18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511510i;
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 and = c26981x40bb0da.gt(this.f430341d).and(c26981x40bb0da.lt(this.f430342e));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(and, "and(...)");
        return and;
    }
}
