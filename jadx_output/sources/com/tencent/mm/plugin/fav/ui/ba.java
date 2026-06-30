package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public final class ba implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.da f100523d;

    public ba(com.tencent.mm.plugin.fav.ui.da daVar) {
        this.f100523d = daVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.fav.ui.da daVar = this.f100523d;
        android.app.Activity context = daVar.getContext();
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = daVar.f100583n;
        if (cVar != null) {
            com.tencent.mm.plugin.fav.ui.ec.g(context, 4106, cVar, daVar.f100587r);
        } else {
            kotlin.jvm.internal.o.o("mResultAdapter");
            throw null;
        }
    }
}
