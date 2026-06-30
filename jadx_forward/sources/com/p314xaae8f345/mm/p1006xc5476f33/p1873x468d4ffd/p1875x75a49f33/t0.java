package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33;

/* loaded from: classes5.dex */
public final class t0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.q0 f230620d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f230621e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16540x42192224 f230622f;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16540x42192224 c16540x42192224, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.q0 q0Var) {
        this.f230622f = c16540x42192224;
        this.f230620d = q0Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f230622f.f230459y.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.r0 holder = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.r0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16540x42192224 c16540x42192224 = this.f230622f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.p0 p0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.p0) c16540x42192224.f230459y.get(i17);
        boolean z17 = p0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.u0;
        android.widget.ImageView imageView = holder.f230617d;
        if (!z17) {
            if (p0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.s0) {
                imageView.setImageBitmap(p0Var.f230604a);
                return;
            }
            return;
        }
        if (p0Var.f230604a != null) {
            if (!r1.isRecycled()) {
                imageView.setImageBitmap(p0Var.f230604a);
                return;
            }
            return;
        }
        if (this.f230621e != null && (!r1.isRecycled())) {
            imageView.setImageBitmap(this.f230621e);
        }
        java.util.HashSet hashSet = c16540x42192224.f230460z;
        long j17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.u0) p0Var).f230624b;
        if (hashSet.contains(java.lang.Long.valueOf(j17))) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.q0 q0Var = this.f230620d;
        if (q0Var != null) {
            java.util.List c17 = kz5.b0.c(java.lang.Long.valueOf(j17));
            c17.toString();
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16540x42192224 c16540x421922242 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.e1) q0Var).f230544a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.d1 d1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.d1(c16540x421922242);
            rm5.k kVar = c16540x421922242.f230458x;
            if (kVar != null) {
                ((rm5.h) kVar).a(c17, d1Var);
            }
        }
        hashSet.add(java.lang.Long.valueOf(j17));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.widget.ImageView imageView = new android.widget.ImageView(parent.getContext());
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16540x42192224 c16540x42192224 = this.f230622f;
        imageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(c16540x42192224.f230447m, c16540x42192224.f230446i));
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.r0(imageView);
    }
}
