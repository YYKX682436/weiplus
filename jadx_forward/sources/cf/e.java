package cf;

/* loaded from: classes.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f122355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f122356e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(yz5.l lVar, java.util.LinkedList linkedList) {
        super(1);
        this.f122355d = lVar;
        this.f122356e = linkedList;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        java.lang.Object mo146xb9724478 = this.f122355d.mo146xb9724478(e17);
        if (mo146xb9724478 != null) {
            this.f122356e.add(mo146xb9724478);
        }
        return jz5.f0.f384359a;
    }
}
