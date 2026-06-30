package sj3;

/* loaded from: classes5.dex */
public final class t3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f490280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sj3.d4 f490281e;

    public t3(android.content.Intent intent, sj3.d4 d4Var) {
        this.f490280d = intent;
        this.f490281e = d4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkSmallWindow$mini$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        view.setOnClickListener(null);
        android.content.Intent intent = this.f490280d;
        intent.addFlags(268435456);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkSmallWindow$mini$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkSmallWindow$mini$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        sj3.d4 d4Var = this.f490281e;
        d4Var.f490012h = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new sj3.r3(d4Var), false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = d4Var.f490012h;
        if (b4Var != null) {
            b4Var.c(2000L, 2000L);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new sj3.s3(d4Var), 200L);
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkSmallWindow$mini$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
