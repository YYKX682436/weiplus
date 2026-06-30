package q01;

/* loaded from: classes12.dex */
public final class j implements q01.e {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.u0 f440828d;

    public j(com.p314xaae8f345.mm.p944x882e457a.u0 onSceneEnd) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSceneEnd, "onSceneEnd");
        this.f440828d = onSceneEnd;
    }

    /* renamed from: hashCode */
    public int m159202x8cdac1b() {
        return this.f440828d.hashCode();
    }

    @Override // e75.a
    /* renamed from: onChanged */
    public void mo2231x7bb163d5(java.lang.Object obj) {
        q01.g event = (q01.g) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (event.f440812a == q01.f.f440809e) {
            this.f440828d.mo815x76e0bfae(event.f440813b, event.f440814c, event.f440815d, event.f440816e);
        }
    }
}
