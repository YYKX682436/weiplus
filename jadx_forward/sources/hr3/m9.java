package hr3;

/* loaded from: classes8.dex */
public class m9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a f365331d;

    public m9(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a viewOnClickListenerC16860xc669c20a) {
        this.f365331d = viewOnClickListenerC16860xc669c20a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a viewOnClickListenerC16860xc669c20a = this.f365331d;
        intent.putExtra("finder_username", viewOnClickListenerC16860xc669c20a.Z.m76197x6c03c64c());
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1.f542005a.w(viewOnClickListenerC16860xc669c20a.f279303d, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
