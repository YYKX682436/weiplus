package cj5;

/* loaded from: classes.dex */
public final class x4 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f123805d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f123806e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f123807f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f123808g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f123809h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f123805d = jz5.h.b(new cj5.w4(this));
        this.f123806e = jz5.h.b(new cj5.v4(activity));
        this.f123807f = jz5.h.b(new cj5.r4(activity));
        this.f123808g = jz5.h.b(new cj5.s4(activity));
        this.f123809h = new java.util.LinkedList();
    }

    public final em.l2 T6() {
        return (em.l2) ((jz5.n) this.f123805d).mo141623x754a37bb();
    }

    public final void U6(wi5.n0 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        jz5.g gVar = this.f123808g;
        int size = ((java.util.List) ((jz5.n) gVar).mo141623x754a37bb()).size();
        java.util.LinkedList list = state.f527852o;
        if (size <= 0 || list.size() != ((java.util.List) ((jz5.n) gVar).mo141623x754a37bb()).size()) {
            T6().i().setChecked(false);
        } else {
            T6().i().setChecked(true);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        java.util.LinkedList linkedList = this.f123809h;
        linkedList.clear();
        linkedList.addAll(list);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onClickDialogSpaceOnHalfScreenMode */
    public boolean mo10662xe0085496() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClickDialogSpaceOnHalfScreenMode !! ");
        java.util.LinkedList linkedList = this.f123809h;
        sb6.append(linkedList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SelectCustomContactUIC", sb6.toString());
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_Conv_User", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(linkedList, ","));
        m158354x19263085().setResult(-1, intent);
        m158354x19263085().finish();
        return super.mo10662xe0085496();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f m67437x4bd5310;
        java.util.List list = (java.util.List) ((jz5.n) this.f123808g).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-memberList>(...)");
        java.util.LinkedList linkedList = this.f123809h;
        linkedList.clear();
        linkedList.addAll(list);
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.L2(m158354x19263085(), new cj5.u4(this));
    }
}
