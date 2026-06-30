package com.tencent.mm.chatroom.ui;

/* loaded from: classes12.dex */
public class jd implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.kd f64260d;

    public jd(com.tencent.mm.chatroom.ui.kd kdVar) {
        this.f64260d = kdVar;
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.storage.z3 z3Var = ((com.tencent.mm.chatroom.ui.bd) obj).f64059a;
        com.tencent.mm.chatroom.ui.kd kdVar = this.f64260d;
        return x51.k.a(kdVar.a(z3Var)).compareToIgnoreCase(x51.k.a(kdVar.a(((com.tencent.mm.chatroom.ui.bd) obj2).f64059a)));
    }
}
