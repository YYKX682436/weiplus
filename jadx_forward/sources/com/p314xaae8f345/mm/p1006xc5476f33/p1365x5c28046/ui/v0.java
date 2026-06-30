package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes5.dex */
public final class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f179755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13303x3d472b4c f179756e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f179757f;

    public v0(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13303x3d472b4c activityC13303x3d472b4c, java.util.List list) {
        this.f179755d = z17;
        this.f179756e = activityC13303x3d472b4c;
        this.f179757f = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = this.f179755d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13303x3d472b4c activityC13303x3d472b4c = this.f179756e;
        if (z17) {
            i12.e eVar = activityC13303x3d472b4c.f179287q;
            if (eVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            eVar.f368746n.clear();
            eVar.m8146xced61ae5();
        }
        java.util.List list = this.f179757f;
        if (list != null) {
            i12.e eVar2 = activityC13303x3d472b4c.f179287q;
            if (eVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
            java.util.LinkedList linkedList = eVar2.f368746n;
            int size = linkedList.size();
            linkedList.addAll(list);
            eVar2.m8153xd399a4d9(size, list.size());
        }
    }
}
