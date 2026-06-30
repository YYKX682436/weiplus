package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes7.dex */
public class m1 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f158049d;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.p1 p1Var, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f158049d = rVar;
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f158049d;
        if (rVar != null) {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            obtain.writeString(str);
            obtain.writeInt(w0Var.f398507b);
            java.lang.Object obj = w0Var.f398509d;
            obtain.writeString(obj == null ? null : obj.toString());
            rVar.a(obtain);
        }
    }
}
