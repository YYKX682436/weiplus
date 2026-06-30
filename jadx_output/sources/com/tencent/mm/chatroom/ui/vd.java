package com.tencent.mm.chatroom.ui;

/* loaded from: classes12.dex */
public class vd implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.wd f64610d;

    public vd(com.tencent.mm.chatroom.ui.wd wdVar) {
        this.f64610d = wdVar;
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.storage.z3 z3Var = ((com.tencent.mm.chatroom.ui.xd) obj).f64672a;
        this.f64610d.getClass();
        return x51.k.a(z3Var.f2()).compareToIgnoreCase(x51.k.a(((com.tencent.mm.chatroom.ui.xd) obj2).f64672a.f2()));
    }
}
