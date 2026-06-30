package i13;

/* loaded from: classes5.dex */
public final class q extends i13.r {

    /* renamed from: m, reason: collision with root package name */
    public final yz5.l f368851m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(java.lang.String id6, java.lang.String title, java.lang.String msg, long j17, yz5.l lVar) {
        super(id6, title, msg, j17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        this.f368851m = lVar;
    }

    @Override // i13.c
    public android.graphics.drawable.Drawable b() {
        return null;
    }

    @Override // i13.c
    public boolean e() {
        return true;
    }

    @Override // i13.c
    public boolean f() {
        return false;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return 0L;
    }

    @Override // i13.c
    public void k(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
    }

    @Override // i13.c
    public void n(in5.s0 holder, android.view.View view, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        yz5.l lVar = this.f368851m;
        if (lVar != null) {
            android.content.Context context = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            lVar.mo146xb9724478(context);
        }
    }
}
