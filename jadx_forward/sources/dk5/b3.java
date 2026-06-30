package dk5;

/* loaded from: classes9.dex */
public class b3 implements dk5.o7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f316056a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316057b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316058c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f316059d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 f316060e;

    public b3(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93, android.content.Intent intent, java.lang.String str, java.lang.String str2, android.view.View view) {
        this.f316060e = activityC22571x51759e93;
        this.f316056a = intent;
        this.f316057b = str;
        this.f316058c = str2;
        this.f316059d = view;
    }

    @Override // dk5.o7
    public void a(boolean z17, java.lang.String str, int i17, boolean z18) {
        android.content.Intent intent = this.f316056a;
        intent.putExtra("KSendGroupToDo", z18);
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93 = this.f316060e;
        if (z17) {
            activityC22571x51759e93.f292545y2 = str;
            java.lang.String str2 = this.f316057b;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                activityC22571x51759e93.W7();
            } else {
                activityC22571x51759e93.X7(str2);
            }
            intent.putExtra("custom_send_text", str);
            activityC22571x51759e93.a8(-1, intent);
            activityC22571x51759e93.finish();
        } else {
            int i18 = com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93.B2;
            activityC22571x51759e93.a8(0, intent);
            if (activityC22571x51759e93.f292524k2) {
                activityC22571x51759e93.finish();
            }
        }
        k01.u0 u0Var = (k01.u0) i95.n0.c(k01.u0.class);
        ((ij1.j) u0Var).Ui(this.f316058c, this.f316059d);
    }
}
