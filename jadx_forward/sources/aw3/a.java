package aw3;

/* loaded from: classes10.dex */
public final class a implements qk.p7 {

    /* renamed from: a, reason: collision with root package name */
    public final qc0.p1 f96359a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.ei0 f96360b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f96361c;

    public a(qc0.p1 callback, r45.ei0 restoreData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(restoreData, "restoreData");
        this.f96359a = callback;
        this.f96360b = restoreData;
        this.f96361c = "MicroMsg.StickerEditor.FinishCallback";
    }

    @Override // qk.p7
    public void a(android.graphics.Bitmap bitmap, boolean z17) {
        r45.ei0 ei0Var = this.f96360b;
        boolean z18 = ei0Var.f455063e.isEmpty() && ei0Var.f455062d.isEmpty();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSuccess: bitmap generated:");
        sb6.append(bitmap != null);
        sb6.append(", isNeverEdit: ");
        sb6.append(z18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f96361c, sb6.toString());
        yz5.q qVar = this.f96359a.f442965c;
        if (qVar != null) {
            qVar.mo147xb9724478(bitmap, java.lang.Boolean.valueOf(z18), ei0Var);
        }
    }

    @Override // qk.p7
    /* renamed from: onError */
    public void mo9160xaf8aa769(java.lang.Exception exc) {
        yz5.p pVar = this.f96359a.f442964b;
        if (pVar != null) {
            pVar.mo149xb9724478(exc, this.f96360b);
        }
    }
}
