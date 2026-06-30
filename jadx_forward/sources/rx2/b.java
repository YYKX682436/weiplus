package rx2;

/* loaded from: classes10.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx2.d f482496d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(rx2.d dVar) {
        super(1);
        this.f482496d = dVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        jz5.l selectName = (jz5.l) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectName, "selectName");
        java.util.Iterator it = this.f482496d.f482499b.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(selectName.f384366d, ((r45.gb4) it.next()).m75945x2fec8307(2))) {
                break;
            }
            i17++;
        }
        return java.lang.Boolean.valueOf(i17 == -1);
    }
}
