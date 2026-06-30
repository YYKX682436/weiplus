package it2;

/* loaded from: classes.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f376049d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f376050e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(java.util.HashSet hashSet, yz5.l lVar) {
        super(0);
        this.f376049d = hashSet;
        this.f376050e = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.Iterator it = this.f376049d.iterator();
        while (it.hasNext()) {
            this.f376050e.mo146xb9724478(it.next());
        }
        return jz5.f0.f384359a;
    }
}
