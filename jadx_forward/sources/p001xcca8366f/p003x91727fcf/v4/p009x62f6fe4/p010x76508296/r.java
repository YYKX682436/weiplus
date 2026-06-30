package p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296;

/* loaded from: classes11.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.i f90523a;

    public r(android.content.Context context, p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0047xab30f989 c0047xab30f989) {
        new java.util.concurrent.ConcurrentHashMap();
        if (c0047xab30f989 == null) {
            throw new java.lang.IllegalArgumentException("sessionToken must not be null");
        }
        this.f90523a = new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.k(context, c0047xab30f989);
    }

    public void a(java.lang.String str, android.os.Bundle bundle, android.os.ResultReceiver resultReceiver) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("command must neither be null nor empty");
        }
        ((p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.k) this.f90523a).f90509a.sendCommand(str, bundle, resultReceiver);
    }
}
