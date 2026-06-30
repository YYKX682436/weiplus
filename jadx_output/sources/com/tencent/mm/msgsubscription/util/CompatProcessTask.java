package com.tencent.mm.msgsubscription.util;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/msgsubscription/util/CompatProcessTask;", "Landroid/os/Parcelable;", "wxbiz-msgsubscription-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public abstract class CompatProcessTask implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f71889d = jz5.h.b(new o31.h(this));

    public final void b() {
        ku5.u0 u0Var = ku5.t0.f312615d;
        ((ku5.t0) u0Var).h(new o31.g(this), "CompatProcessTask_" + ((java.lang.String) ((jz5.n) this.f71889d).getValue()));
    }

    public void c() {
    }

    public abstract void d();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }
}
