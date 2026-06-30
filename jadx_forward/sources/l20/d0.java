package l20;

/* loaded from: classes9.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396674d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.C10548x1e09fcd9 f396675e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(java.lang.String str, com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.C10548x1e09fcd9 c10548x1e09fcd9) {
        super(1);
        this.f396674d = str;
        this.f396675e = c10548x1e09fcd9;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        java.lang.String url = this.f396674d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(url, "$url");
        r00.b bVar = r00.b.f449530d;
        if (bitmap != null) {
            r00.g.a(url, bVar, bitmap, new l20.c0(this.f396675e));
        }
        return jz5.f0.f384359a;
    }
}
