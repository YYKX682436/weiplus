package c61;

/* loaded from: classes11.dex */
public final class ga implements kv.d0, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.StreamHandler, hn1.z {

    /* renamed from: d, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink f120537d;

    @Override // hn1.z
    public void b(java.lang.String imageKey, java.lang.String path, java.lang.String usrname) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageKey, "imageKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(usrname, "usrname");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarChangedEventReceiver", "onAvatarLoadFromRemote: ".concat(usrname));
        ((ku5.t0) ku5.t0.f394148d).B(new c61.fa(this, usrname));
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.StreamHandler
    /* renamed from: onCancel */
    public void mo14279x3d6f0539(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarChangedEventReceiver", "onCancel");
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        ((java.util.HashSet) com.p314xaae8f345.mm.p943x351df9c2.d1.wi().f152059i).remove(this);
        this.f120537d = null;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.StreamHandler
    /* renamed from: onListen */
    public void mo14280x4d3de486(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink events) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(events, "events");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarChangedEventReceiver", "onListen");
        this.f120537d = events;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        ((java.util.HashSet) com.p314xaae8f345.mm.p943x351df9c2.d1.wi().f152059i).add(this);
        ((hn1.s) ((kv.b0) i95.n0.c(kv.b0.class))).wi(this);
    }
}
