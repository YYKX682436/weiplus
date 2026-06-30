package c61;

/* loaded from: classes11.dex */
public final class ga implements kv.d0, io.flutter.plugin.common.EventChannel.StreamHandler, hn1.z {

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.plugin.common.EventChannel.EventSink f39004d;

    @Override // hn1.z
    public void b(java.lang.String imageKey, java.lang.String path, java.lang.String usrname) {
        kotlin.jvm.internal.o.g(imageKey, "imageKey");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(usrname, "usrname");
        com.tencent.mars.xlog.Log.i("MicroMsg.AvatarChangedEventReceiver", "onAvatarLoadFromRemote: ".concat(usrname));
        ((ku5.t0) ku5.t0.f312615d).B(new c61.fa(this, usrname));
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AvatarChangedEventReceiver", "onCancel");
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        ((java.util.HashSet) com.tencent.mm.modelavatar.d1.wi().f70526i).remove(this);
        this.f39004d = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(java.lang.Object obj, io.flutter.plugin.common.EventChannel.EventSink events) {
        kotlin.jvm.internal.o.g(events, "events");
        com.tencent.mars.xlog.Log.i("MicroMsg.AvatarChangedEventReceiver", "onListen");
        this.f39004d = events;
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        ((java.util.HashSet) com.tencent.mm.modelavatar.d1.wi().f70526i).add(this);
        ((hn1.s) ((kv.b0) i95.n0.c(kv.b0.class))).wi(this);
    }
}
