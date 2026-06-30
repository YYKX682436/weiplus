package aw1;

/* loaded from: classes12.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f96049d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab f96050e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f96051f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.util.List list, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab, java.util.List list2) {
        super(0);
        this.f96049d = list;
        this.f96050e = c26987xeef691ab;
        this.f96051f = list2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CWildFileCleaner", "cleanWildFunctions voice");
        java.util.List list = this.f96049d;
        if (!list.isEmpty()) {
            aw1.m.f96122a.g(this.f96050e, list, this.f96051f);
        }
        return jz5.f0.f384359a;
    }
}
