package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5;

/* loaded from: classes.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f170207d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.Runnable runnable) {
        super(1);
        this.f170207d = runnable;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.os.Parcelable it = (android.os.Parcelable) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Runnable runnable = this.f170207d;
        if (runnable != null) {
            runnable.run();
        }
        return jz5.f0.f384359a;
    }
}
