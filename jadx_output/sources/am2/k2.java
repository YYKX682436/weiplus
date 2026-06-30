package am2;

/* loaded from: classes3.dex */
public final class k2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final am2.k2 f8708d = new am2.k2();

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        dk2.u7 u7Var = dk2.u7.f234181a;
        java.util.Map.Entry entry = (java.util.Map.Entry) kz5.n0.Y(dk2.u7.f234185e.entrySet());
        if (entry == null) {
            return true;
        }
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var == null) {
            return true;
        }
        com.tencent.mm.plugin.finder.live.util.y.n(k0Var, null, null, new am2.j2(k0Var, entry, null), 3, null);
        return true;
    }
}
