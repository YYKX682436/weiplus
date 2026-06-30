package wj5;

/* loaded from: classes3.dex */
public final class a implements db5.r4 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f528306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f528307b;

    public a(android.view.View view) {
        this.f528307b = view;
    }

    @Override // db5.r4
    public void a(android.view.View view, int i17, android.view.MenuItem menuItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuItem, "menuItem");
        if (menuItem.getItemId() == 0) {
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(view, "group_msg_set_top_bar_delete");
            aVar.ik(view, 40, 26356);
            aVar.qk(view, this.f528307b);
            if (this.f528306a) {
                return;
            }
            this.f528306a = true;
            aVar.Cj("view_exp", view, null, 26356);
        }
    }
}
