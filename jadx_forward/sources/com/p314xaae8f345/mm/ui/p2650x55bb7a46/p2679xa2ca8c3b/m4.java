package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class m4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f286086d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f286087e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f286088f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f286089g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f286090h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f286091i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f286092m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f286093n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yb5.d f286094o;

    public m4(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.o4 o4Var, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, yb5.d dVar) {
        this.f286086d = str;
        this.f286087e = str2;
        this.f286088f = str3;
        this.f286089g = str4;
        this.f286090h = str5;
        this.f286091i = str6;
        this.f286092m = str7;
        this.f286093n = str8;
        this.f286094o = dVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_scene", 1);
        intent.putExtra("key_receiver", this.f286086d);
        intent.putExtra("key_receivertitle", this.f286087e);
        intent.putExtra("key_sendertitle", this.f286088f);
        intent.putExtra("key_sender_des", this.f286089g);
        intent.putExtra("key_receiver_des", this.f286090h);
        intent.putExtra("key_url", this.f286091i);
        intent.putExtra("key_templateid", this.f286092m);
        intent.putExtra("key_sceneid", this.f286093n);
        j45.l.j(this.f286094o.g(), "wallet_index", ".ui.WalletSendC2CMsgUI", intent, null);
    }
}
