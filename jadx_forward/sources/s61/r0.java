package s61;

/* loaded from: classes8.dex */
public class r0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r61.g1 f484919d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11378xa7f41e6e f484920e;

    public r0(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11378xa7f41e6e activityC11378xa7f41e6e, r61.g1 g1Var) {
        this.f484920e = activityC11378xa7f41e6e;
        this.f484919d = g1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f484919d);
        this.f484920e.finish();
    }
}
