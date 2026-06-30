package wc5;

/* loaded from: classes.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f526173d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(java.util.HashSet hashSet) {
        super(1);
        this.f526173d = hashSet;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        uc5.l0 row = (uc5.l0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(row, "row");
        return java.lang.Boolean.valueOf(this.f526173d.contains(row.v()));
    }
}
