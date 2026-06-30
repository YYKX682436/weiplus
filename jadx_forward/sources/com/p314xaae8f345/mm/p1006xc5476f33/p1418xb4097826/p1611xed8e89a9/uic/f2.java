package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class f2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.j2 f205215d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.j2 j2Var) {
        super(0);
        this.f205215d = j2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.j2 j2Var = this.f205215d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j2Var.f205357i, "[fetchEndCallback] totalSize=" + j2Var.O6().m56393xfb854877());
        if (j2Var.m58722x96811f7a().m82923x19404fcc() != null) {
            android.widget.TextView textView = (android.widget.TextView) j2Var.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.ili);
            if (textView != null) {
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573429el3);
            }
            android.widget.TextView textView2 = (android.widget.TextView) j2Var.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.ili);
            if (textView2 != null) {
                textView2.setTextColor(j2Var.m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
            }
            android.widget.TextView textView3 = (android.widget.TextView) j2Var.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.ili);
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            android.view.View mo144222x4ff8c0f0 = j2Var.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.ilg);
            if (mo144222x4ff8c0f0 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(mo144222x4ff8c0f0, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileCourseUIC$onCreate$4", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mo144222x4ff8c0f0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(mo144222x4ff8c0f0, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileCourseUIC$onCreate$4", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        j2Var.m58722x96811f7a().E(true);
        return jz5.f0.f384359a;
    }
}
