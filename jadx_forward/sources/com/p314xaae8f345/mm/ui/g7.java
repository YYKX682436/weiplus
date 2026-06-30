package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class g7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f290155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q45.a f290156e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.o7 f290157f;

    public g7(com.p314xaae8f345.mm.ui.o7 o7Var, int i17, q45.a aVar) {
        this.f290157f = o7Var;
        this.f290155d = i17;
        this.f290156e = aVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        q45.a aVar = this.f290156e;
        this.f290157f.e(this.f290155d, aVar.f441654e, aVar.f441653d, aVar.f441656g);
        dialogInterface.dismiss();
    }
}
