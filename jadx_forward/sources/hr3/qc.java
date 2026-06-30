package hr3;

/* loaded from: classes10.dex */
public final class qc extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f365455d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc(java.util.List list) {
        super(1);
        this.f365455d = list;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        xb5.a it = (xb5.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        return java.lang.Boolean.valueOf(this.f365455d.contains(it.f534539d));
    }
}
