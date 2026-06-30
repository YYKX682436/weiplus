package am2;

/* loaded from: classes3.dex */
public final class p2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am2.x2 f8730d;

    public p2(am2.x2 x2Var) {
        this.f8730d = x2Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData = ((mm2.i5) this.f8730d.f8773b.a(mm2.i5.class)).f329140f;
        r45.f52 f52Var = new r45.f52();
        f52Var.set(0, java.lang.Integer.valueOf(com.tencent.live.TXLivePluginDef.ErrorCode.CODE_PARAMTYPEERROR));
        r45.gw1 gw1Var = new r45.gw1();
        gw1Var.set(2, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        gw1Var.set(3, "desc");
        f52Var.set(2, new com.tencent.mm.protobuf.g(gw1Var.toByteArray()));
        liveMutableData.postValue(f52Var.toByteArray());
        return true;
    }
}
