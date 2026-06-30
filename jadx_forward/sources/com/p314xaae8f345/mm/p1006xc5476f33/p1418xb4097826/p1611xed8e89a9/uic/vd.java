package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class vd extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14895xe517e819 f205831d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14895xe517e819 c14895xe517e819) {
        super(1);
        this.f205831d = c14895xe517e819;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14895xe517e819 c14895xe517e819 = this.f205831d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c14895xe517e819.f204981i, "[fetchEndCallback] totalSize=" + c14895xe517e819.O6().m56393xfb854877() + ",hasMore:" + response.getHasMore());
        if (response.getHasMore()) {
            c14895xe517e819.f204988s = 1;
        } else {
            if (c14895xe517e819.m58691x96811f7a().m82923x19404fcc() != null) {
                android.widget.TextView textView = (android.widget.TextView) c14895xe517e819.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.ili);
                if (textView != null) {
                    textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573429el3);
                }
                android.widget.TextView textView2 = (android.widget.TextView) c14895xe517e819.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.ili);
                if (textView2 != null) {
                    textView2.setTextColor(c14895xe517e819.m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
                }
                android.widget.TextView textView3 = (android.widget.TextView) c14895xe517e819.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.ili);
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                android.view.View mo144222x4ff8c0f0 = c14895xe517e819.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.ilg);
                if (mo144222x4ff8c0f0 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(mo144222x4ff8c0f0, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileReplayLiveUIC$onCreate$4", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    mo144222x4ff8c0f0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(mo144222x4ff8c0f0, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileReplayLiveUIC$onCreate$4", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            c14895xe517e819.m58691x96811f7a().E(true);
            c14895xe517e819.f204988s = 0;
        }
        return jz5.f0.f384359a;
    }
}
