package g26;

/* loaded from: classes16.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g26.s f349538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g26.l f349539e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(g26.s sVar, g26.l lVar) {
        super(0);
        this.f349538d = sVar;
        this.f349539e = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Iterable iterable = (java.util.List) this.f349538d.f349544e.mo141623x754a37bb();
        if (iterable == null) {
            iterable = kz5.p0.f395529d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(iterable, 10));
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((f26.c3) it.next()).y0(this.f349539e));
        }
        return arrayList;
    }
}
