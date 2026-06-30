package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f283738d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f283739e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n f283740f;

    public f(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n nVar, java.util.ArrayList arrayList, int i17, int i18) {
        this.f283740f = nVar;
        this.f283738d = arrayList;
        this.f283739e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n nVar = this.f283740f;
        if (nVar.f283885s.get()) {
            return;
        }
        nVar.n();
        nVar.f284079i.clear();
        nVar.f284079i.addAll(this.f283738d);
        nVar.getClass();
        nVar.f284080m = nVar.f284079i;
        zb5.i iVar = nVar.f284076f;
        if (iVar != null) {
            iVar.A(false, this.f283739e);
        }
    }
}
