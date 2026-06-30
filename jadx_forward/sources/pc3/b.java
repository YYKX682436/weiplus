package pc3;

/* loaded from: classes7.dex */
public final class b extends com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad f434902t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, pc3.c cVar, com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad) {
        super(context, cVar);
        this.f434902t = c4209xd2d3ddad;
    }

    @Override // com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2
    public void c(final yz5.a action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        ch.g gVar = this.f434902t.f130116g;
        java.lang.Runnable runnable = new java.lang.Runnable(action) { // from class: pc3.a

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f434901d;

            {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "function");
                this.f434901d = action;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f434901d.mo152xb9724478();
            }
        };
        ch.a aVar = gVar.f122717d;
        if (aVar.g()) {
            runnable.run();
        } else {
            aVar.k(runnable, false);
        }
    }
}
