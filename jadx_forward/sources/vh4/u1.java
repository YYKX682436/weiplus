package vh4;

/* loaded from: classes.dex */
public class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f518683d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f518684e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f518685f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f518686g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f518687h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f518688i;

    public u1(vh4.t1 t1Var, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, int i17) {
        this.f518683d = context;
        this.f518684e = str;
        this.f518685f = str2;
        this.f518686g = str3;
        this.f518687h = j17;
        this.f518688i = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = new android.content.Intent(this.f518683d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18571x56e85567.class);
        intent.putExtra("intent_extra_bind_guardian_username", this.f518684e);
        intent.putExtra("intent_extra_bind_ward_username", this.f518685f);
        intent.putExtra("intent_extra_bind_ticket", this.f518686g);
        intent.putExtra("intent_extra_request_time", this.f518687h);
        intent.putExtra("intent_extra_msg_type", this.f518688i);
        intent.putExtra("intent_extra_adult_user", false);
        android.content.Context context = this.f518683d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/model/TeenModeService$10", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/teenmode/model/TeenModeService$10", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
