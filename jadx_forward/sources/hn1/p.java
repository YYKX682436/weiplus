package hn1;

/* loaded from: classes11.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hn1.s f364004d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364005e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f364006f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364007g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(hn1.s sVar, java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        super(0);
        this.f364004d = sVar;
        this.f364005e = str;
        this.f364006f = bitmap;
        this.f364007g = str2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.Iterator it = ((java.util.LinkedList) ((jz5.n) this.f364004d.f364019h).mo141623x754a37bb()).iterator();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            hn1.z zVar = (hn1.z) ((d75.c) it.next()).get();
            if (zVar == null) {
                it.remove();
            } else {
                zVar.a(this.f364005e, this.f364006f, this.f364007g);
            }
        }
        return jz5.f0.f384359a;
    }
}
