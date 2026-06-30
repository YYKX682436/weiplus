package com.tencent.mm.console;

/* loaded from: classes.dex */
public class c0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f64797d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f64798e;

    public c0(java.lang.String str, android.content.Context context) {
        this.f64797d = str;
        this.f64798e = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.sdk.platformtools.b0.e(this.f64797d);
        dp.a.makeText(this.f64798e, com.tencent.mm.R.string.kbv, 0).show();
    }
}
