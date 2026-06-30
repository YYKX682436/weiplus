package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class f7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f289958d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q45.a f289959e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.o7 f289960f;

    public f7(com.p314xaae8f345.mm.ui.o7 o7Var, int i17, q45.a aVar) {
        this.f289960f = o7Var;
        this.f289958d = i17;
        this.f289959e = aVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        q45.a aVar = this.f289959e;
        this.f289960f.e(this.f289958d, aVar.f441654e, aVar.f441653d, aVar.f441656g);
        dialogInterface.dismiss();
    }
}
