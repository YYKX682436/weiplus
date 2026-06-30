package ue4;

/* loaded from: classes12.dex */
public class q extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ue4.r f508449a;

    public q(ue4.r rVar) {
        this.f508449a = rVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if ("com.tencent.mm.plugin.sport.uploadstep".equals(intent.getAction()) && gm0.j1.a()) {
            ((ku5.t0) ku5.t0.f394148d).h(new ue4.p(this), "UploadSportStepEventHandle");
        }
    }
}
