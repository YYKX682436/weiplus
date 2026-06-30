package gd1;

/* loaded from: classes7.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f352049d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(java.util.ArrayList arrayList) {
        super(1);
        this.f352049d = arrayList;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        id1.d dVar = id1.d.f371995n;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(it, dVar.f372002d);
        java.util.ArrayList arrayList = this.f352049d;
        if (b17) {
            arrayList.add(dVar);
        } else {
            id1.d dVar2 = id1.d.f371996o;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(it, dVar2.f372002d)) {
                arrayList.add(dVar2);
            } else {
                id1.d dVar3 = id1.d.f371998q;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(it, dVar3.f372002d)) {
                    arrayList.add(dVar3);
                } else {
                    id1.d dVar4 = id1.d.f371999r;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(it, dVar4.f372002d)) {
                        arrayList.add(dVar4);
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
