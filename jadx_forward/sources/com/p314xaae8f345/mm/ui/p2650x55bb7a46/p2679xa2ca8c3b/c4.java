package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class c4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285221d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285222e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285223f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285224g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285225h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285226i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285227m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285228n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yb5.d f285229o;

    public c4(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.e4 e4Var, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, yb5.d dVar) {
        this.f285221d = str;
        this.f285222e = str2;
        this.f285223f = str3;
        this.f285224g = str4;
        this.f285225h = str5;
        this.f285226i = str6;
        this.f285227m = str7;
        this.f285228n = str8;
        this.f285229o = dVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_scene", 1);
        intent.putExtra("key_receiver", this.f285221d);
        intent.putExtra("key_receivertitle", this.f285222e);
        intent.putExtra("key_sendertitle", this.f285223f);
        intent.putExtra("key_sender_des", this.f285224g);
        intent.putExtra("key_receiver_des", this.f285225h);
        intent.putExtra("key_url", this.f285226i);
        intent.putExtra("key_templateid", this.f285227m);
        intent.putExtra("key_sceneid", this.f285228n);
        j45.l.j(this.f285229o.g(), "wallet_index", ".ui.WalletSendC2CMsgUI", intent, null);
    }
}
