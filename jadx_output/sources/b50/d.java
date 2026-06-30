package b50;

/* loaded from: classes11.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin f17931d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f17932e;

    public d(com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin boxFlutterBizPlugin, long j17) {
        this.f17931d = boxFlutterBizPlugin;
        this.f17932e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f17931d.f67061d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("deleteMsg: delete in db msgId=");
        long j17 = this.f17932e;
        sb6.append(j17);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        r01.q3.nj().z0(j17);
    }
}
