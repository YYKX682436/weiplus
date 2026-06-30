package v92;

/* loaded from: classes15.dex */
public final class c implements db5.r4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v92.g f515687a;

    public c(v92.g gVar) {
        this.f515687a = gVar;
    }

    @Override // db5.r4
    public final void a(android.view.View view, int i17, android.view.MenuItem menuItem) {
        v92.g gVar = this.f515687a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = gVar.f515691a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(menuItem);
        gVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Mj(view);
        int itemId = menuItem.getItemId();
        if (itemId == 20002) {
            gVar.l(context, view, i17, menuItem);
            return;
        }
        if (itemId == 20003) {
            gVar.n(context, view, i17, menuItem);
        } else if (itemId == 20005) {
            gVar.k(context, view, i17, menuItem);
        } else {
            if (itemId != 20010) {
                return;
            }
            gVar.m(context, view, i17, menuItem);
        }
    }
}
