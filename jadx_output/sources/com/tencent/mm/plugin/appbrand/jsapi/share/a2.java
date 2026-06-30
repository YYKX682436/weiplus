package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes3.dex */
public final class a2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f83108d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f83109e;

    public a2(yz5.p pVar, java.lang.Long l17) {
        this.f83108d = pVar;
        this.f83109e = l17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f83108d.invoke(java.lang.Boolean.FALSE, this.f83109e);
    }
}
