package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes8.dex */
public final class bk extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14085x1922346d f191245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1627x3c22fcc2.C14957x1a4885f0 f191246e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14085x1922346d activityC14085x1922346d, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1627x3c22fcc2.C14957x1a4885f0 c14957x1a4885f0) {
        super(1);
        this.f191245d = activityC14085x1922346d;
        this.f191246e = c14957x1a4885f0;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        int intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1627x3c22fcc2.C14957x1a4885f0 c14957x1a4885f0 = this.f191246e;
        int size = c14957x1a4885f0.m56387xe6796cde().size();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14085x1922346d activityC14085x1922346d = this.f191245d;
        if (size == 0) {
            android.view.View view = activityC14085x1922346d.loadingView;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "refreshWhenDataReady", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "refreshWhenDataReady", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            activityC14085x1922346d.d7().setVisibility(0);
            activityC14085x1922346d.e7().setVisibility(8);
        } else {
            android.view.View view2 = activityC14085x1922346d.loadingView;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "refreshWhenDataReady", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "refreshWhenDataReady", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            activityC14085x1922346d.d7().setVisibility(8);
            activityC14085x1922346d.e7().setVisibility(0);
        }
        if (intValue == 0) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = activityC14085x1922346d.m58958x4905e9fa().mo7946xf939df19();
            if (mo7946xf939df192 != null) {
                mo7946xf939df192.m8146xced61ae5();
            }
        } else if (intValue < size && (mo7946xf939df19 = activityC14085x1922346d.m58958x4905e9fa().mo7946xf939df19()) != null) {
            mo7946xf939df19.m8153xd399a4d9(intValue, size - intValue);
        }
        activityC14085x1922346d.e7().post(new pt2.n(intValue, activityC14085x1922346d, size));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1627x3c22fcc2.C14957x1a4885f0 c14957x1a4885f02 = activityC14085x1922346d.E;
        if (c14957x1a4885f02 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedloader");
            throw null;
        }
        org.json.JSONObject put = jSONObject.put("search_word", c14957x1a4885f02.f207209d).put("search_res_num", c14957x1a4885f0.m56387xe6796cde().size()).put("vst_id", activityC14085x1922346d.F);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e3 e3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e3.f206542a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC14085x1922346d.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        e3Var.a("3", xy2.c.e(mo55332x76847179), put);
        return jz5.f0.f384359a;
    }
}
