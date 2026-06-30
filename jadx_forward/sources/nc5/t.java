package nc5;

/* loaded from: classes.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f417764d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f417765e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(yz5.l lVar, java.util.ArrayList arrayList) {
        super(1);
        this.f417764d = lVar;
        this.f417765e = arrayList;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object first = ((android.util.Pair) this.f417765e.get(((java.lang.Number) obj).intValue())).first;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(first, "first");
        this.f417764d.mo146xb9724478(first);
        return jz5.f0.f384359a;
    }
}
