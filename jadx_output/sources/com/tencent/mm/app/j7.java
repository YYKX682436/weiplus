package com.tencent.mm.app;

/* loaded from: classes7.dex */
public class j7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.d9 f53465d;

    public j7(com.tencent.mm.sdk.platformtools.d9 d9Var) {
        this.f53465d = d9Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        m3.a aVar = this.f53465d.f192544h;
        if (aVar != null) {
            aVar.accept(-1);
        }
    }
}
