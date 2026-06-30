package com.tencent.mm.plugin.account.ui;

/* loaded from: classes11.dex */
public class wh implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f74304d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f74305e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f74306f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.SetPwdUI f74307g;

    public wh(com.tencent.mm.plugin.account.ui.SetPwdUI setPwdUI, int i17, int i18, java.lang.String str) {
        this.f74307g = setPwdUI;
        this.f74304d = i17;
        this.f74305e = i18;
        this.f74306f = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.account.ui.SetPwdUI setPwdUI = this.f74307g;
        setPwdUI.setResult(-1);
        setPwdUI.f7(this.f74304d, this.f74305e, this.f74306f);
    }
}
