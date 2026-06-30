package com.google.protobuf;

/* loaded from: classes16.dex */
public class t5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Iterator f45546a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.Map.Entry f45547b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f45548c;

    public t5(com.google.protobuf.u5 u5Var, boolean z17, com.google.protobuf.o5 o5Var) {
        java.util.Iterator r17 = u5Var.f45578d.r();
        this.f45546a = r17;
        if (r17.hasNext()) {
            this.f45547b = (java.util.Map.Entry) r17.next();
        }
        this.f45548c = z17;
    }

    public void a(int i17, com.google.protobuf.k0 k0Var) {
        while (true) {
            java.util.Map.Entry entry = this.f45547b;
            if (entry == null || ((com.google.protobuf.b4) entry.getKey()).f44909e.f45563f >= i17) {
                return;
            }
            com.google.protobuf.b4 b4Var = (com.google.protobuf.b4) this.f45547b.getKey();
            if (this.f45548c && b4Var.u0() == com.google.protobuf.vb.MESSAGE && !b4Var.d1()) {
                java.util.Map.Entry entry2 = this.f45547b;
                boolean z17 = entry2 instanceof com.google.protobuf.b7;
                com.google.protobuf.u1 u1Var = b4Var.f44909e;
                if (z17) {
                    int i18 = u1Var.f45563f;
                    android.support.v4.media.f.a(((com.google.protobuf.b7) entry2).f44926d.getValue());
                    throw null;
                }
                k0Var.M(u1Var.f45563f, (com.google.protobuf.k8) entry2.getValue());
            } else {
                com.google.protobuf.b5.y(b4Var, this.f45547b.getValue(), k0Var);
            }
            java.util.Iterator it = this.f45546a;
            if (it.hasNext()) {
                this.f45547b = (java.util.Map.Entry) it.next();
            } else {
                this.f45547b = null;
            }
        }
    }
}
