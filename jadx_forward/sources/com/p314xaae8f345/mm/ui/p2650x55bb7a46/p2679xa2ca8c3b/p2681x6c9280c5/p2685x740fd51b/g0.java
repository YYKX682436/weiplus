package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b;

/* loaded from: classes12.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22101xd1256332.State f286321a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f286322b;

    public g0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22101xd1256332.State state, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        this.f286321a = state;
        this.f286322b = list;
    }

    /* renamed from: equals */
    public boolean m80323xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.g0)) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.g0 g0Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.g0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f286321a, g0Var.f286321a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f286322b, g0Var.f286322b);
    }

    /* renamed from: hashCode */
    public int m80324x8cdac1b() {
        int hashCode = this.f286321a.hashCode() * 31;
        java.util.List list = this.f286322b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m80325x9616526c() {
        return "Next(state=" + this.f286321a + ", actions=" + this.f286322b + ')';
    }

    public /* synthetic */ g0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22101xd1256332.State state, java.util.List list, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(state, (i17 & 2) != 0 ? null : list);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22101xd1256332.State r2, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.f0... r3) {
        /*
            r1 = this;
            java.lang.String r0 = "state"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r0)
            java.lang.String r0 = "actions"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r0)
            java.util.List r3 = kz5.z.z0(r3)
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L18
            goto L19
        L18:
            r3 = 0
        L19:
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.g0.<init>(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView$State, com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.f0[]):void");
    }
}
