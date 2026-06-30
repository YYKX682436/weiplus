package pr;

/* loaded from: classes11.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f439242a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f439243b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.p f439244c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f439245d;

    /* renamed from: e, reason: collision with root package name */
    public int f439246e;

    /* renamed from: f, reason: collision with root package name */
    public int f439247f;

    public h(java.util.List md5List, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, yz5.p pVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(md5List, "md5List");
        this.f439242a = md5List;
        this.f439243b = gVar;
        this.f439244c = pVar;
        this.f439245d = "MicroMsg.EmojiMd5ToInfo";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiMd5ToInfo", "request size: " + md5List.size());
        if (!md5List.isEmpty()) {
            a();
        } else if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Boolean.TRUE, 0);
        }
    }

    public final void a() {
        int i17 = this.f439247f;
        this.f439246e = i17;
        int i18 = i17 + 100;
        this.f439247f = i18;
        java.util.List list = this.f439242a;
        if (i18 > list.size()) {
            this.f439247f = list.size();
        }
        new hr.a(1, 0, list.subList(this.f439246e, this.f439247f), this.f439243b, null, 16, null).l().K(new pr.g(this));
    }
}
