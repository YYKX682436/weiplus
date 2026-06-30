package of;

/* loaded from: classes14.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of.m f426373d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(of.m mVar) {
        super(0);
        this.f426373d = mVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.List list = this.f426373d.f426375a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.Integer num = ((of.i) it.next()).f426371g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
            arrayList.add(java.lang.Integer.valueOf(num.intValue()));
        }
        return java.lang.Integer.valueOf(kz5.n0.I0(arrayList));
    }
}
