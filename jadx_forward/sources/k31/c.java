package k31;

/* loaded from: classes9.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f385356d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f385357e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f385358f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z17, boolean z18, boolean z19) {
        super(2);
        this.f385356d = z17;
        this.f385357e = z18;
        this.f385358f = z19;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d3 = (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) obj;
        com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 toUpdateItem = (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUpdateItem, "toUpdateItem");
        if (c11159x8f55e6d3 != null) {
            if (this.f385356d) {
                c11159x8f55e6d3.f153340m = toUpdateItem.f153340m;
                c11159x8f55e6d3.f153348u = toUpdateItem.f153348u;
                c11159x8f55e6d3.f153347t = toUpdateItem.f153347t;
                c11159x8f55e6d3.f153351x = toUpdateItem.f153351x;
                c11159x8f55e6d3.f153350w = toUpdateItem.f153350w;
                c11159x8f55e6d3.B = toUpdateItem.B;
                c11159x8f55e6d3.C = toUpdateItem.C;
                c11159x8f55e6d3.f153352y = toUpdateItem.f153352y;
                c11159x8f55e6d3.A = toUpdateItem.A;
            }
            if (this.f385357e) {
                c11159x8f55e6d3.f153342o = toUpdateItem.f153342o;
            }
            if (this.f385358f) {
                c11159x8f55e6d3.f153341n = toUpdateItem.f153341n;
            }
        }
        return jz5.f0.f384359a;
    }
}
