package aw3;

/* loaded from: classes10.dex */
public final class a implements qk.p7 {

    /* renamed from: a, reason: collision with root package name */
    public final qc0.p1 f14826a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.ei0 f14827b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f14828c;

    public a(qc0.p1 callback, r45.ei0 restoreData) {
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlin.jvm.internal.o.g(restoreData, "restoreData");
        this.f14826a = callback;
        this.f14827b = restoreData;
        this.f14828c = "MicroMsg.StickerEditor.FinishCallback";
    }

    @Override // qk.p7
    public void a(android.graphics.Bitmap bitmap, boolean z17) {
        r45.ei0 ei0Var = this.f14827b;
        boolean z18 = ei0Var.f373530e.isEmpty() && ei0Var.f373529d.isEmpty();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSuccess: bitmap generated:");
        sb6.append(bitmap != null);
        sb6.append(", isNeverEdit: ");
        sb6.append(z18);
        com.tencent.mars.xlog.Log.i(this.f14828c, sb6.toString());
        yz5.q qVar = this.f14826a.f361432c;
        if (qVar != null) {
            qVar.invoke(bitmap, java.lang.Boolean.valueOf(z18), ei0Var);
        }
    }

    @Override // qk.p7
    public void onError(java.lang.Exception exc) {
        yz5.p pVar = this.f14826a.f361431b;
        if (pVar != null) {
            pVar.invoke(exc, this.f14827b);
        }
    }
}
