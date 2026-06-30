package c13;

/* loaded from: classes11.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f119419d;

    public k(java.util.List list) {
        this.f119419d = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24132x9b57f23e c24132x9b57f23e = c13.b0.f119394e;
        if (c24132x9b57f23e != null) {
            c24132x9b57f23e.m89488x1f049d31(this.f119419d, new c13.c("callback onExternalAudioOutputDeviceChanged"));
        }
    }
}
