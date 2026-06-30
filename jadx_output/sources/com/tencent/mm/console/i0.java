package com.tencent.mm.console;

/* loaded from: classes3.dex */
public class i0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f64810d;

    public i0(java.lang.String str) {
        this.f64810d = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.sdk.platformtools.b0.e(this.f64810d);
    }
}
