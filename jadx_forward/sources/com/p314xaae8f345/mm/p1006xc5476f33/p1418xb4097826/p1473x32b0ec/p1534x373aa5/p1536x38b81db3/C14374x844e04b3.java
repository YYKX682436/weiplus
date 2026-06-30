package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.p1536x38b81db3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B/\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R0\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/convert/FinderLiveSwitchRoleConvertFactory;", "Lin5/s;", "", "type", "Lin5/r;", "getItemConvert", "Lkotlin/Function1;", "Ljz5/f0;", "onSwitchRole", "Lyz5/l;", "getOnSwitchRole", "()Lyz5/l;", "setOnSwitchRole", "(Lyz5/l;)V", "Lkotlin/Function0;", "onAddRole", "Lyz5/a;", "getOnAddRole", "()Lyz5/a;", "setOnAddRole", "(Lyz5/a;)V", "<init>", "(Lyz5/l;Lyz5/a;)V", "Companion", "cm2/j", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.view.convert.FinderLiveSwitchRoleConvertFactory */
/* loaded from: classes3.dex */
public final class C14374x844e04b3 implements in5.s {

    /* renamed from: ADD_ROLE */
    public static final int f35846xe6bedd74 = 2;

    /* renamed from: Companion */
    public static final cm2.j f35847x233c02ec = new cm2.j(null);

    /* renamed from: SWITCH_ROLE */
    public static final int f35848x10166a1 = 1;
    private yz5.a onAddRole;
    private yz5.l onSwitchRole;

    /* JADX WARN: Multi-variable type inference failed */
    public C14374x844e04b3() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // in5.s
    /* renamed from: getItemConvert */
    public in5.r mo43555xf2bb75ea(int type) {
        return type != 1 ? type != 2 ? new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2() : new cm2.c(this.onAddRole) : new cm2.h(this.onSwitchRole);
    }

    public final yz5.a getOnAddRole() {
        return this.onAddRole;
    }

    public final yz5.l getOnSwitchRole() {
        return this.onSwitchRole;
    }

    /* renamed from: setOnAddRole */
    public final void m57578x66f06796(yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "<set-?>");
        this.onAddRole = aVar;
    }

    /* renamed from: setOnSwitchRole */
    public final void m57579x49a4de8b(yz5.l lVar) {
        this.onSwitchRole = lVar;
    }

    public C14374x844e04b3(yz5.l lVar, yz5.a onAddRole) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onAddRole, "onAddRole");
        this.onSwitchRole = lVar;
        this.onAddRole = onAddRole;
    }

    public /* synthetic */ C14374x844e04b3(yz5.l lVar, yz5.a aVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? null : lVar, (i17 & 2) != 0 ? cm2.i.f124886d : aVar);
    }
}
