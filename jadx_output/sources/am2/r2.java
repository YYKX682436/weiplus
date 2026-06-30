package am2;

/* loaded from: classes3.dex */
public final class r2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am2.x2 f8738d;

    public r2(am2.x2 x2Var) {
        this.f8738d = x2Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        r45.ih1 ih1Var = new r45.ih1();
        ih1Var.set(0, 1);
        ih1Var.set(3, 0L);
        ih1Var.set(1, 1);
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData = ((mm2.i5) this.f8738d.f8773b.a(mm2.i5.class)).f329140f;
        r45.f52 f52Var = new r45.f52();
        f52Var.set(0, java.lang.Integer.valueOf(com.tencent.live.TXLivePluginDef.ErrorCode.CODE_PARAMNOTFOUND));
        f52Var.set(2, new com.tencent.mm.protobuf.g(ih1Var.toByteArray()));
        liveMutableData.postValue(f52Var.toByteArray());
        return true;
    }
}
