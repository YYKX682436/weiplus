package dk5;

/* loaded from: classes9.dex */
public class k1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk5.c2 f316234d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8 f316235e;

    public k1(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8 activityC22567x42e895b8, dk5.c2 c2Var) {
        this.f316235e = activityC22567x42e895b8;
        this.f316234d = c2Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f316234d.f316076c = true;
        this.f316235e.finish();
    }
}
