package hn1;

/* loaded from: classes11.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hn1.s f364008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364009e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364010f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364011g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(hn1.s sVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(0);
        this.f364008d = sVar;
        this.f364009e = str;
        this.f364010f = str2;
        this.f364011g = str3;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.Iterator it = ((java.util.LinkedList) ((jz5.n) this.f364008d.f364019h).mo141623x754a37bb()).iterator();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            hn1.z zVar = (hn1.z) ((d75.c) it.next()).get();
            if (zVar == null) {
                it.remove();
            } else {
                zVar.b(this.f364009e, this.f364010f, this.f364011g);
            }
        }
        return jz5.f0.f384359a;
    }
}
