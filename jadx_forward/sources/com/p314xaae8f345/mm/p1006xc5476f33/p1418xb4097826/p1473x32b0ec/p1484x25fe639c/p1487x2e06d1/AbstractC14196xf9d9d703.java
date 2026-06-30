package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\t\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/controller/base/LiveRoomController;", "Landroidx/lifecycle/c1;", "", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2960xe17f46c3, "Ljava/lang/Class;", "bu", "business", "(Ljava/lang/Class;)Landroidx/lifecycle/c1;", "ctrl", "controller", "(Ljava/lang/Class;)Lcom/tencent/mm/plugin/finder/live/controller/base/LiveRoomController;", "Lcom/tencent/mm/plugin/finder/live/controller/base/LiveRoomControllerStore;", "store", "Lcom/tencent/mm/plugin/finder/live/controller/base/LiveRoomControllerStore;", "getStore", "()Lcom/tencent/mm/plugin/finder/live/controller/base/LiveRoomControllerStore;", "<init>", "(Lcom/tencent/mm/plugin/finder/live/controller/base/LiveRoomControllerStore;)V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController */
/* loaded from: classes3.dex */
public abstract class AbstractC14196xf9d9d703 extends p012xc85e97e9.p093xedfae76a.c1 {
    private final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store;

    public AbstractC14196xf9d9d703(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.store = store;
    }

    /* renamed from: afterViewMount */
    public void mo56787xb95be1f8(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
    }

    /* renamed from: business */
    public final <T extends p012xc85e97e9.p093xedfae76a.c1> T m56788xbba4bfc0(java.lang.Class<T> bu6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bu6, "bu");
        return (T) this.store.m56796xbba4bfc0(bu6);
    }

    /* renamed from: controller */
    public final <T extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703> T m56789x25fe639c(java.lang.Class<T> ctrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctrl, "ctrl");
        return (T) this.store.m56798x25fe639c(ctrl);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e getStore() {
        return this.store;
    }

    /* renamed from: name */
    public java.lang.String m56791x337a8b() {
        return getClass().getSimpleName();
    }

    /* renamed from: onFloatMode */
    public /* bridge */ /* synthetic */ void mo14866x804e7f00() {
    }

    /* renamed from: onLiveActivate */
    public /* bridge */ /* synthetic */ void mo8997x8001c97e() {
    }

    /* renamed from: onLiveDeactivate */
    public abstract /* synthetic */ void mo14860x9606ce3f();

    /* renamed from: onLiveEnd */
    public /* bridge */ /* synthetic */ void mo56792x5aa1a970() {
    }

    /* renamed from: onLiveMsg */
    public /* bridge */ /* synthetic */ void mo14867x5aa1c816(r45.r71 r71Var) {
    }

    /* renamed from: onLivePause */
    public /* bridge */ /* synthetic */ void mo14861x3972754b() {
    }

    /* renamed from: onLiveResume */
    public /* bridge */ /* synthetic */ void mo14862xf87d6378() {
    }

    /* renamed from: onLiveSquareMode */
    public /* bridge */ /* synthetic */ void m56793x89a02e2b() {
    }

    /* renamed from: onLiveStart */
    public /* bridge */ /* synthetic */ void mo14863x39a513b7(r45.hc1 hc1Var) {
    }

    /* renamed from: onLiveStartFromWindow */
    public /* bridge */ /* synthetic */ void mo14864x95cdef51() {
    }

    /* renamed from: onNormalMode */
    public /* bridge */ /* synthetic */ void mo14868x7c41fe69() {
    }

    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
    }

    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
    }
}
