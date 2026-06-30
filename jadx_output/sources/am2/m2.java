package am2;

/* loaded from: classes3.dex */
public final class m2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am2.x2 f8716d;

    public m2(am2.x2 x2Var) {
        this.f8716d = x2Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        am2.x2 x2Var = this.f8716d;
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData = ((je2.t) x2Var.f8773b.a(je2.t.class)).f299268n;
        r45.tp1 tp1Var = new r45.tp1();
        x2Var.getClass();
        ce2.i iVar = (ce2.i) dk2.u7.f234185e.get("findercoin_5_14239178507806247143");
        tp1Var.set(0, iVar != null ? iVar.c1() : null);
        tp1Var.set(2, "听了这么久，给他送朵花吧");
        tp1Var.set(3, 5000);
        tp1Var.set(4, 1);
        liveMutableData.postValue(tp1Var);
        return true;
    }
}
