package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public final class c9 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.da f100546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f100547e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f100548f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f100549g;

    public c9(com.tencent.mm.plugin.fav.ui.da daVar, java.util.ArrayList arrayList, java.util.HashMap hashMap, boolean z17) {
        this.f100546d = daVar;
        this.f100547e = arrayList;
        this.f100548f = hashMap;
        this.f100549g = z17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.fav.ui.da daVar = this.f100546d;
        com.tencent.mm.plugin.fav.ui.ec.a(daVar.getContext(), this.f100547e, new com.tencent.mm.plugin.fav.ui.b9(daVar), 26, this.f100548f);
        daVar.P6();
        if (this.f100549g) {
            com.tencent.mm.plugin.fav.ui.FavSearchUI.e7(daVar.getContext());
        }
    }
}
