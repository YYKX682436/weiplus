package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes3.dex */
public class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f234144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wo3.x f234145e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 f234146f;

    public f0(android.app.Activity activity, wo3.x xVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 k2Var) {
        this.f234144d = activity;
        this.f234145e = xVar;
        this.f234146f = k2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/offline/ui/OfflineErrorHelper$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(this.f234144d, this.f234145e.f529757h, true);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.q0(3, 1);
        this.f234146f.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/offline/ui/OfflineErrorHelper$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
