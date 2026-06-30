package dk5;

/* loaded from: classes9.dex */
public class x1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8 f316519e;

    public x1(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8 activityC22567x42e895b8, java.lang.String str) {
        this.f316519e = activityC22567x42e895b8;
        this.f316518d = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8 activityC22567x42e895b8 = this.f316519e;
        android.content.Intent intent = activityC22567x42e895b8.getIntent();
        int i18 = com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.H1;
        activityC22567x42e895b8.g7(intent, this.f316518d);
    }
}
