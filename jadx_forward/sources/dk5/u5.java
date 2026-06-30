package dk5;

/* loaded from: classes9.dex */
public class u5 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk5.v5 f316474d;

    public u5(dk5.v5 v5Var) {
        this.f316474d = v5Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f316474d.f316497a.f316076c = true;
    }
}
