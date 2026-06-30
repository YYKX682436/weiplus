package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public final class g9 implements n13.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.da f100868a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s82.g f100869b;

    public g9(com.tencent.mm.plugin.fav.ui.da daVar, s82.g gVar) {
        this.f100868a = daVar;
        this.f100869b = gVar;
    }

    @Override // n13.x
    public final void a(boolean z17, java.lang.String str, android.os.Bundle extInfo) {
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        if (z17) {
            com.tencent.mm.plugin.fav.ui.da daVar = this.f100868a;
            com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(daVar.getContext(), "", daVar.getString(com.tencent.mm.R.string.cax), true, false, null);
            com.tencent.mm.plugin.fav.ui.x5.i(daVar.getContext(), daVar.f100591v, str, extInfo.getBoolean("is_group_to_do"), this.f100869b.f404774a, new com.tencent.mm.plugin.fav.ui.f9(Q, daVar));
        }
    }
}
