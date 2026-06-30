package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.s f283969d;

    public r(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.s sVar) {
        this.f283969d = sVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.s sVar = this.f283969d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y yVar = sVar.f283979d.f284004f;
        if (yVar.f284076f != null) {
            yVar.f284077g.m8146xced61ae5();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.t tVar = sVar.f283979d;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y yVar2 = tVar.f284004f;
            zb5.i iVar = yVar2.f284076f;
            java.lang.String str = tVar.f284002d;
            boolean isEmpty = yVar2.f284079i.isEmpty();
            java.util.ArrayList arrayList = sVar.f283979d.f284004f.f284079i;
            iVar.j0(str, isEmpty, arrayList != null ? arrayList.size() : 0);
        }
    }
}
