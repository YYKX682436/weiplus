package vh4;

/* loaded from: classes.dex */
public class j2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f518621a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnDismissListener f518622b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f518623c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f518624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f518625e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f518626f;

    public j2(vh4.t1 t1Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, android.content.DialogInterface.OnDismissListener onDismissListener, android.app.Activity activity, int i17, java.lang.String str, int i18) {
        this.f518621a = u3Var;
        this.f518622b = onDismissListener;
        this.f518623c = activity;
        this.f518624d = i17;
        this.f518625e = str;
        this.f518626f = i18;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        this.f518621a.dismiss();
        android.content.DialogInterface.OnDismissListener onDismissListener = this.f518622b;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(null);
        }
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            boolean z17 = ((r45.m20) fVar.f152151d).f461620d;
            int i17 = this.f518626f;
            java.lang.String str = this.f518625e;
            int i18 = this.f518624d;
            android.app.Activity activity = this.f518623c;
            if (z17) {
                android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b.class);
                intent.putExtra("intent_process", 1);
                intent.putExtra("intent_extra_biz_type", i18);
                intent.putExtra("intent_extra_biz_key", str);
                android.app.Activity activity2 = this.f518623c;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.k(activity2, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/model/TeenModeService$9", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            } else {
                android.content.Intent intent2 = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18591xe20dd59b.class);
                intent2.putExtra("intent_extra_biz_type", i18);
                intent2.putExtra("intent_extra_biz_key", str);
                android.app.Activity activity3 = this.f518623c;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(java.lang.Integer.valueOf(i17));
                arrayList2.add(intent2);
                java.util.Collections.reverse(arrayList2);
                yj0.a.k(activity3, arrayList2.toArray(), "com/tencent/mm/plugin/teenmode/model/TeenModeService$9", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            }
        }
        return null;
    }
}
