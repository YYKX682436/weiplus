package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes10.dex */
public final class ln extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mn f200487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f200488e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f200489f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ln(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mn mnVar, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2) {
        super(0);
        this.f200487d = mnVar;
        this.f200488e = f0Var;
        this.f200489f = f0Var2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mn mnVar = this.f200487d;
        boolean isEmpty = mnVar.f200632w.isEmpty();
        android.view.ViewGroup viewGroup = mnVar.f200627r;
        android.widget.TextView textView = mnVar.f200624o;
        if (isEmpty) {
            textView.setVisibility(0);
            android.view.View view = mnVar.f200625p;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLinkInviteAnchorWidget$updateSearchData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLinkInviteAnchorWidget$updateSearchData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            viewGroup.setVisibility(8);
        } else {
            textView.setVisibility(8);
            android.view.View view2 = mnVar.f200625p;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLinkInviteAnchorWidget$updateSearchData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLinkInviteAnchorWidget$updateSearchData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            viewGroup.setVisibility(0);
        }
        java.util.ArrayList arrayList3 = mnVar.f200632w;
        bm2.i4 i4Var = mnVar.f200628s;
        i4Var.x(arrayList3);
        i4Var.m8146xced61ae5();
        int i17 = this.f200488e.f391649d;
        if (i17 == 0) {
            i4Var.m8146xced61ae5();
        } else {
            int i18 = this.f200489f.f391649d;
            if (i17 < i18) {
                i4Var.m8153xd399a4d9(i17, i18 - i17);
            }
        }
        return jz5.f0.f384359a;
    }
}
