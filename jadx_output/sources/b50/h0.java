package b50;

/* loaded from: classes11.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin f17945d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin boxFlutterBizPlugin) {
        super(0);
        this.f17945d = boxFlutterBizPlugin;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(g83.a.c(), false);
        kotlin.jvm.internal.o.d(i17);
        com.tencent.mars.xlog.Log.i(this.f17945d.f67061d, "imgCacheDirectory=".concat(i17));
        return i17;
    }
}
