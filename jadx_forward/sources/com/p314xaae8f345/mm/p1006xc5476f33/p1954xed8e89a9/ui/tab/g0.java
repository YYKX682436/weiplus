package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes10.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.l0 f235856d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f235857e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.l0 l0Var, boolean z17) {
        super(2);
        this.f235856d = l0Var;
        this.f235857e = z17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.util.List list = (java.util.List) obj2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ContactBizHeaderLiveNoticeLogicV2", "decrypt result: " + booleanValue);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.l0 l0Var = this.f235856d;
        if (!p3325xe03a0797.p3326xc267989b.z0.h(l0Var.f235933n)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ContactBizHeaderLiveNoticeLogicV2", "decrypt callback: coroutine cancelled, skip UI update");
        } else if (!booleanValue || list == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ContactBizHeaderLiveNoticeLogicV2", "decrypt failed");
            if (this.f235857e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ContactBizHeaderLiveNoticeLogicV2", "decrypt failed, but show nextLiveNotice");
                android.view.View e17 = l0Var.e();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(e17, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogicV2$setupLiveNotifyView$1$1", "invoke", "(ZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                e17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(e17, "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogicV2$setupLiveNotifyView$1$1", "invoke", "(ZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                l0Var.g();
            } else {
                android.view.View e18 = l0Var.e();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(e18, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogicV2$setupLiveNotifyView$1$1", "invoke", "(ZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                e18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(e18, "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogicV2$setupLiveNotifyView$1$1", "invoke", "(ZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            r45.j32 j32Var = l0Var.f235929j;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j32Var);
            java.util.LinkedList m75941xfb821914 = j32Var.m75941xfb821914(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getNotice_info(...)");
            int i17 = 0;
            for (java.lang.Object obj3 : m75941xfb821914) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.h32 h32Var = (r45.h32) obj3;
                if (i17 < list.size()) {
                    h32Var.set(4, (java.lang.String) list.get(i17));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ContactBizHeaderLiveNoticeLogicV2", "  notice[" + i17 + "]: noticeId=" + h32Var.m75945x2fec8307(4));
                }
                i17 = i18;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ContactBizHeaderLiveNoticeLogicV2", "show live notify view with liveNoticeList");
            android.view.View e19 = l0Var.e();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(e19, arrayList3.toArray(), "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogicV2$setupLiveNotifyView$1$1", "invoke", "(ZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            e19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(e19, "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogicV2$setupLiveNotifyView$1$1", "invoke", "(ZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view = l0Var.f235922c;
            if (view.getTag(com.p314xaae8f345.mm.R.id.f564925ak0) == null) {
                view.setTag(com.p314xaae8f345.mm.R.id.f564925ak0, java.lang.Boolean.TRUE);
                java.lang.String UserName = l0Var.f235921b.f470766d.f464598d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UserName, "UserName");
                gr3.e.d(UserName, 1701, l0Var.f235923d, l0Var.f235920a.getIntent(), l0Var.f235924e.g() != sr3.a.f493362e ? 5 : 0, 0, 0, null, null, null, 0, 0, 4064, null);
            }
            l0Var.g();
        }
        return jz5.f0.f384359a;
    }
}
