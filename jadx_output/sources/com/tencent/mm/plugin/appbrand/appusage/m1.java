package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public class m1 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f76516d;

    public m1(com.tencent.mm.plugin.appbrand.appusage.p1 p1Var, com.tencent.mm.ipcinvoker.r rVar) {
        this.f76516d = rVar;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        com.tencent.mm.ipcinvoker.r rVar = this.f76516d;
        if (rVar != null) {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            obtain.writeString(str);
            obtain.writeInt(w0Var.f316974b);
            java.lang.Object obj = w0Var.f316976d;
            obtain.writeString(obj == null ? null : obj.toString());
            rVar.a(obtain);
        }
    }
}
