package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class e7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f289905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q45.a f289906e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.o7 f289907f;

    public e7(com.p314xaae8f345.mm.ui.o7 o7Var, int i17, q45.a aVar) {
        this.f289907f = o7Var;
        this.f289905d = i17;
        this.f289906e = aVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        q45.a aVar = this.f289906e;
        this.f289907f.e(this.f289905d, aVar.f441654e, aVar.f441653d, aVar.f441656g);
        dialogInterface.dismiss();
    }
}
