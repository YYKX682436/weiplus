package am2;

/* loaded from: classes3.dex */
public final class a3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am2.g3 f8629d;

    public a3(am2.g3 g3Var) {
        this.f8629d = g3Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData;
        kotlin.jvm.internal.o.g(it, "it");
        je2.w wVar = (je2.w) dk2.ef.f233372a.i(je2.w.class);
        if (wVar != null && (liveMutableData = wVar.f299281h) != null) {
            r45.vc2 vc2Var = new r45.vc2();
            vc2Var.set(1, am2.g3.a(this.f8629d));
            vc2Var.set(2, "test一键送礼");
            liveMutableData.postValue(vc2Var);
        }
        return true;
    }
}
