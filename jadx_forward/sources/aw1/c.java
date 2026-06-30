package aw1;

/* loaded from: classes12.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f96034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab f96035e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f96036f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.util.List list, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab, java.util.List list2) {
        super(0);
        this.f96034d = list;
        this.f96035e = c26987xeef691ab;
        this.f96036f = list2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CWildFileCleaner", "cleanWildFunctions video");
        java.util.List list = this.f96034d;
        if (!list.isEmpty()) {
            aw1.m.f96122a.f(this.f96035e, list, this.f96036f);
        }
        return jz5.f0.f384359a;
    }
}
