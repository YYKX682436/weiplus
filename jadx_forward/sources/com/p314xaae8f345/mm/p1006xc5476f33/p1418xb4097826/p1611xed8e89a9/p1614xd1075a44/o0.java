package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44;

/* loaded from: classes3.dex */
public final class o0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f206185d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 f206186e;

    public o0(r45.h32 h32Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 s1Var) {
        this.f206185d = h32Var;
        this.f206186e = s1Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget$handleFinderLiveNoticeInfo$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        android.content.ClipData newPlainText = android.content.ClipData.newPlainText("Label", this.f206185d.m75945x2fec8307(4));
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("clipboard");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((android.content.ClipboardManager) systemService).setPrimaryClip(newPlainText);
        db5.t7.m(this.f206186e.f206251b, "已复制noticeId");
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget$handleFinderLiveNoticeInfo$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
