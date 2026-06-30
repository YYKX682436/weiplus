package ij1;

/* loaded from: classes15.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f373206d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ij1.h f373207e;

    public g(ij1.h hVar, android.os.Bundle bundle) {
        this.f373207e = hVar;
        this.f373206d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String string = this.f373206d.getString("delay_load_img_path");
        ij1.h hVar = this.f373207e;
        hVar.f373208a.m52699x43560096(string);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaShareMessageService", "onLoadImageFinishedAction(%s)", string);
        hVar.f373210c.Ai(hVar.f373209b, 0);
    }
}
