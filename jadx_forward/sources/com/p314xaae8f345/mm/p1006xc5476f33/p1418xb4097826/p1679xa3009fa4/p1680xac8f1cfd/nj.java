package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class nj extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl f216867d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl blVar) {
        super(0);
        this.f216867d = blVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl blVar = this.f216867d;
        if (com.p314xaae8f345.mm.ui.fj.b(blVar.m158354x19263085())) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = blVar.m158354x19263085();
            android.content.Intent m158359x1e885992 = blVar.m158359x1e885992();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(m158359x1e885992);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m158354x19263085, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$onCreate$4$2$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            m158354x19263085.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(m158354x19263085, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$onCreate$4$2$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("android:activity.enterSplitSideWithAdjacentFlag", 4);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = blVar.m158354x19263085();
            android.content.Intent m158359x1e8859922 = blVar.m158359x1e885992();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(bundle);
            arrayList2.add(m158359x1e8859922);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(m158354x192630852, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$onCreate$4$2$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
            m158354x192630852.startActivity((android.content.Intent) arrayList2.get(0), (android.os.Bundle) arrayList2.get(1));
            yj0.a.f(m158354x192630852, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$onCreate$4$2$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
        }
        return jz5.f0.f384359a;
    }
}
