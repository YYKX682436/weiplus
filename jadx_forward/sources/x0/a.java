package x0;

/* loaded from: classes.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f532393d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.util.List list) {
        super(1);
        this.f532393d = list;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        java.util.List list = this.f532393d;
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((yz5.l) list.get(i17)).mo146xb9724478(state);
        }
        return jz5.f0.f384359a;
    }
}
