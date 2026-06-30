package jr3;

/* loaded from: classes4.dex */
public class b implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jr3.c f382928d;

    public b(jr3.c cVar) {
        this.f382928d = cVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        jr3.c cVar = this.f382928d;
        if (cVar.f382932g.isFinishing()) {
            return false;
        }
        android.app.Activity activity = cVar.f382932g;
        cVar.f382930e = db5.e1.Q(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), cVar.f382932g.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), false, true, new jr3.a(this));
        return false;
    }
}
