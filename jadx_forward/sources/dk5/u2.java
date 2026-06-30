package dk5;

/* loaded from: classes9.dex */
public class u2 implements dk5.l7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f316461a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r35.i1 f316462b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f316463c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f316464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316465e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316466f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316467g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 f316468h;

    public u2(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93, android.content.Intent intent, r35.i1 i1Var, java.util.HashMap hashMap, boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f316468h = activityC22571x51759e93;
        this.f316461a = intent;
        this.f316462b = i1Var;
        this.f316463c = hashMap;
        this.f316464d = z17;
        this.f316465e = str;
        this.f316466f = str2;
        this.f316467g = str3;
    }

    @Override // dk5.l7
    public void a() {
        this.f316461a.putExtra("KShowTodoIntroduceView", 1);
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93 = this.f316468h;
        android.content.Intent intent = this.f316461a;
        r35.i1 i1Var = this.f316462b;
        java.util.HashMap hashMap = this.f316463c;
        boolean z17 = this.f316464d;
        java.lang.String str = this.f316465e;
        java.lang.String str2 = this.f316466f;
        java.lang.String str3 = this.f316467g;
        int i17 = com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93.B2;
        activityC22571x51759e93.B7(intent, i1Var, hashMap, z17, str, str2, str3);
    }
}
