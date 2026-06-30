package r2;

/* loaded from: classes5.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r2.o f450251d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r2.o oVar) {
        super(1);
        this.f450251d = oVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r2.o it = (r2.o) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        r2.o oVar = this.f450251d;
        android.os.Handler handler = oVar.getHandler();
        final yz5.a aVar = oVar.f450276s;
        handler.post(new java.lang.Runnable() { // from class: r2.i$$a
            @Override // java.lang.Runnable
            public final void run() {
                yz5.a tmp0 = yz5.a.this;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tmp0, "$tmp0");
                tmp0.mo152xb9724478();
            }
        });
        return jz5.f0.f384359a;
    }
}
