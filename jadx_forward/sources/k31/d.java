package k31;

/* loaded from: classes9.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f385359d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f385360e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f385361f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f385362g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f385363h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f385364i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.util.List list, boolean z17, java.lang.String str, boolean z18, boolean z19, boolean z27) {
        super(0);
        this.f385359d = list;
        this.f385360e = z17;
        this.f385361f = str;
        this.f385362g = z18;
        this.f385363h = z19;
        this.f385364i = z27;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17 = this.f385360e;
        java.lang.String str = this.f385361f;
        java.util.List list = this.f385359d;
        if (list != null) {
            k31.h hVar = k31.h.f385372a;
            k31.c cVar = new k31.c(this.f385363h, this.f385364i, z17);
            java.util.Iterator it = ((java.util.ArrayList) kz5.n0.V(list)).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d3 = (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) it.next();
                k31.h hVar2 = k31.h.f385372a;
                java.lang.String str2 = str + c11159x8f55e6d3.f153336f;
                java.util.HashMap hashMap = k31.h.f385373b;
                com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d32 = (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) hashMap.get(str2);
                if (c11159x8f55e6d32 != null) {
                    cVar.mo149xb9724478(c11159x8f55e6d32, c11159x8f55e6d3);
                } else {
                    hashMap.put(str2, c11159x8f55e6d3);
                    cVar.mo149xb9724478(c11159x8f55e6d3, c11159x8f55e6d3);
                }
            }
        }
        if (z17) {
            k31.h.f385372a.j(str, this.f385362g);
        }
        return jz5.f0.f384359a;
    }
}
