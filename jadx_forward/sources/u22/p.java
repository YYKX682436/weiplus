package u22;

/* loaded from: classes10.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u22.r f505536d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f505537e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(u22.r rVar, java.util.List list) {
        super(0);
        this.f505536d = rVar;
        this.f505537e = list;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        u22.r rVar = this.f505536d;
        boolean z17 = rVar.f505552g;
        java.util.LinkedList linkedList = rVar.f505560o;
        java.util.LinkedList linkedList2 = rVar.f505557l;
        java.util.List list = this.f505537e;
        if (z17) {
            rVar.f505552g = false;
            linkedList.clear();
            linkedList2.clear();
            if (list.isEmpty()) {
                v85.e.f515636a.c(linkedList2);
                rVar.d();
                return jz5.f0.f384359a;
            }
        }
        int min = java.lang.Math.min(t22.o.f496637e - linkedList2.size(), list.size());
        if (min > 0) {
            linkedList2.addAll(list.subList(0, min));
            v85.e.f515636a.c(linkedList2);
            rVar.f505553h = min < list.size();
            rVar.d();
            if (min < list.size()) {
                linkedList.addAll(list.subList(min, list.size()));
                rVar.c();
            }
        } else {
            if (!rVar.f505553h) {
                rVar.f505553h = true;
                rVar.d();
            }
            linkedList.addAll(list);
            rVar.c();
        }
        return jz5.f0.f384359a;
    }
}
