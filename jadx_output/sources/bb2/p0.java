package bb2;

/* loaded from: classes2.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final bb2.p0 f18940a = new bb2.p0();

    /* renamed from: b, reason: collision with root package name */
    public static int f18941b;

    static {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        f18941b = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127615b5).getValue()).r()).intValue();
    }

    public final bb2.a1 a(android.view.View itemView) {
        kotlin.jvm.internal.o.g(itemView, "itemView");
        if (f18941b == 1) {
            android.view.KeyEvent.Callback findViewById = itemView.findViewById(com.tencent.mm.R.id.lta);
            if (findViewById instanceof bb2.a1) {
                return (bb2.a1) findViewById;
            }
            return null;
        }
        android.view.KeyEvent.Callback findViewById2 = itemView.findViewById(com.tencent.mm.R.id.edr);
        if (findViewById2 instanceof bb2.a1) {
            return (bb2.a1) findViewById2;
        }
        return null;
    }

    public final void b(androidx.appcompat.app.AppCompatActivity activity, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, boolean z17, zy2.gc gcVar) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(feed, "feed");
        if (!z17) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            hb2.b0.f280025e.n(feed.getItemId(), feed.getFeedObject().getObjectNonceId(), z17, gcVar);
            return;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) activity, 1, true);
        android.view.View inflate = com.tencent.mm.ui.id.b(activity).inflate(com.tencent.mm.R.layout.f488793ag3, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487334ob5)).setText(activity.getResources().getString(com.tencent.mm.R.string.cnv));
        k0Var.s(inflate, false);
        k0Var.f211872n = new bb2.n0(activity);
        k0Var.f211881s = new bb2.o0(feed, z17, gcVar);
        k0Var.v();
    }
}
