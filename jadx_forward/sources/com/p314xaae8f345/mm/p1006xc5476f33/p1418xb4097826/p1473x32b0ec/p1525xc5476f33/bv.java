package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class bv extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv f193607d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f193608e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f193609f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.x71 f193610g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv ivVar, int i17, int i18, r45.x71 x71Var) {
        super(0);
        this.f193607d = ivVar;
        this.f193608e = i17;
        this.f193609f = i18;
        this.f193610g = x71Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv ivVar = this.f193607d;
        if (ivVar.w0() == 0) {
            if (this.f193608e == 0 && this.f193609f == 0) {
                ivVar.B1(this.f193610g, false);
            } else {
                ivVar.I.setVisibility(0);
                ivVar.P.setVisibility(8);
                ivVar.Y.setVisibility(8);
                ivVar.M.setVisibility(8);
                android.view.View view = ivVar.L;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveKTVMemberListPlugin", "onGetLiveOnlineMemberFail", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveKTVMemberListPlugin", "onGetLiveOnlineMemberFail", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ivVar.f194549r, "onGetLiveOnlineByRoomFail");
            }
        }
        return jz5.f0.f384359a;
    }
}
