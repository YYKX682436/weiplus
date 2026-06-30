package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e;

/* loaded from: classes9.dex */
public class l implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o f293820d;

    public l(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o oVar) {
        this.f293820d = oVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o oVar = this.f293820d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.n nVar = oVar.f293840n;
        if (nVar != null) {
            nVar.mo26477x57429edc(false, 0, 0, 0);
        }
        oVar.b();
    }
}
