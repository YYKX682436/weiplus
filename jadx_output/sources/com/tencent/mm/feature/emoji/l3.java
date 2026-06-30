package com.tencent.mm.feature.emoji;

/* loaded from: classes3.dex */
public final class l3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f66374d;

    public l3(yz5.l lVar) {
        this.f66374d = lVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.cancel();
        this.f66374d.invoke(2);
    }
}
