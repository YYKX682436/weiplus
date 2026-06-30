package ix3;

/* loaded from: classes12.dex */
public final class x1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9 f377135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ix3.z1 f377136e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f377137f;

    public x1(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9 c1098xe10e35e9, ix3.z1 z1Var, java.lang.String str) {
        this.f377135d = c1098xe10e35e9;
        this.f377136e = z1Var;
        this.f377137f = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/uic/RepairerFileMsgDebugUIC$showAllExifInfo$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9 c1098xe10e35e9 = this.f377135d;
        c1098xe10e35e9.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3174x9a13bc90, null);
        c1098xe10e35e9.m7362xaf634eb4();
        this.f377136e.U6(this.f377137f);
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/uic/RepairerFileMsgDebugUIC$showAllExifInfo$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
