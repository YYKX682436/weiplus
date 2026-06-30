package com.tencent.mm.plugin.appbrand.ipc;

/* loaded from: classes7.dex */
public class i implements wd0.p1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f78412a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ipc.j f78413b;

    public i(com.tencent.mm.plugin.appbrand.ipc.j jVar) {
        this.f78413b = jVar;
    }

    @Override // wd0.p1
    public void a() {
        b(-2);
        this.f78413b.f78414d.T6(null);
    }

    public final void b(int i17) {
        if (this.f78412a) {
            return;
        }
        this.f78412a = true;
        android.support.v4.os.ResultReceiver resultReceiver = (android.support.v4.os.ResultReceiver) this.f78413b.f78414d.getIntent().getParcelableExtra("key_result_receiver");
        if (resultReceiver != null) {
            resultReceiver.b(i17, null);
        }
    }

    @Override // wd0.p1
    public void onSuccess() {
        b(-1);
        this.f78413b.f78414d.T6(null);
    }
}
