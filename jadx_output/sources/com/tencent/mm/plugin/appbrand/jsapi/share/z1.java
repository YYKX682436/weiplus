package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes3.dex */
public final class z1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f83333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f83334e;

    public z1(yz5.p pVar, java.lang.Long l17) {
        this.f83333d = pVar;
        this.f83334e = l17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f83333d.invoke(java.lang.Boolean.FALSE, this.f83334e);
    }
}
