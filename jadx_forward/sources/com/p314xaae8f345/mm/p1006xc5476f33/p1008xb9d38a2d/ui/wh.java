package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes11.dex */
public class wh implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f155837d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f155838e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f155839f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11468x5768076f f155840g;

    public wh(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11468x5768076f abstractActivityC11468x5768076f, int i17, int i18, java.lang.String str) {
        this.f155840g = abstractActivityC11468x5768076f;
        this.f155837d = i17;
        this.f155838e = i18;
        this.f155839f = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11468x5768076f abstractActivityC11468x5768076f = this.f155840g;
        abstractActivityC11468x5768076f.setResult(-1);
        abstractActivityC11468x5768076f.f7(this.f155837d, this.f155838e, this.f155839f);
    }
}
