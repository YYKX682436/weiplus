package wc5;

/* loaded from: classes.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f526108d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(java.util.HashSet hashSet) {
        super(1);
        this.f526108d = hashSet;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        uc5.l0 row = (uc5.l0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(row, "row");
        return java.lang.Boolean.valueOf(this.f526108d.contains(row.v()));
    }
}
