package iq5;

/* loaded from: classes5.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2814x373aa5.C22931x315eebc8 f375338d;

    public c(com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2814x373aa5.C22931x315eebc8 c22931x315eebc8) {
        this.f375338d = c22931x315eebc8;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        yz5.a aVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wedrop/ui/view/PermissionLineView$checkPermission$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        iq5.d m48328xa0ab20ce = this.f375338d.m48328xa0ab20ce();
        if (m48328xa0ab20ce != null && (aVar = m48328xa0ab20ce.f375343h) != null) {
            aVar.mo152xb9724478();
        }
        yj0.a.h(this, "com/tencent/mm/wedrop/ui/view/PermissionLineView$checkPermission$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
