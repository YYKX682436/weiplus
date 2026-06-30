package o31;

/* loaded from: classes7.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p965xc41bc71e.p968x36f002.AbstractC11169x49c8c792 f424207d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.p314xaae8f345.mm.p965xc41bc71e.p968x36f002.AbstractC11169x49c8c792 abstractC11169x49c8c792) {
        super(0);
        this.f424207d = abstractC11169x49c8c792;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(android.os.Process.myPid());
        sb6.append('_');
        sb6.append(this.f424207d.hashCode());
        return sb6.toString();
    }
}
