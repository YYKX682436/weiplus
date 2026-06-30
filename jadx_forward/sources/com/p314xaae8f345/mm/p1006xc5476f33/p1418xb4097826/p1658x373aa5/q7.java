package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class q7 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb f214411a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f214412b;

    /* renamed from: c, reason: collision with root package name */
    public int f214413c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f214414d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Long f214415e;

    public q7(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb, java.lang.String str, int i17, boolean z17, java.lang.Long l17) {
        this.f214411a = interfaceC4987x84e327cb;
        this.f214412b = str;
        this.f214413c = i17;
        this.f214414d = z17;
        this.f214415e = l17;
    }

    public final r45.e60 a() {
        int i17 = this.f214413c;
        if (i17 != 1) {
            if (i17 != 2 || this.f214412b == null) {
                return null;
            }
            r45.e60 e60Var = new r45.e60();
            java.util.LinkedList m75941xfb821914 = e60Var.m75941xfb821914(1);
            r45.j60 j60Var = new r45.j60();
            j60Var.set(0, this.f214412b);
            m75941xfb821914.add(j60Var);
            return e60Var;
        }
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.f214411a;
        if (interfaceC4987x84e327cb == null) {
            return null;
        }
        r45.e60 e60Var2 = new r45.e60();
        java.util.LinkedList m75941xfb8219142 = e60Var2.m75941xfb821914(0);
        r45.g60 g60Var = new r45.g60();
        g60Var.set(0, interfaceC4987x84e327cb.mo42933xb5885648());
        g60Var.set(2, interfaceC4987x84e327cb.X0());
        g60Var.set(4, interfaceC4987x84e327cb.S0());
        g60Var.set(1, interfaceC4987x84e327cb.E1());
        g60Var.set(5, ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.t2) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.n6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.n6.class))).Ai(interfaceC4987x84e327cb));
        g60Var.set(3, interfaceC4987x84e327cb.mo42930x4f4a97c4());
        g60Var.set(6, java.lang.Integer.valueOf(interfaceC4987x84e327cb.mo42931x1c4fb41d()));
        g60Var.set(7, java.lang.Integer.valueOf(interfaceC4987x84e327cb.mo42937x755bd410()));
        m75941xfb8219142.add(g60Var);
        return e60Var2;
    }

    /* renamed from: equals */
    public boolean m62866xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.q7)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.q7 q7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.q7) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f214411a, q7Var.f214411a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f214412b, q7Var.f214412b) && this.f214413c == q7Var.f214413c && this.f214414d == q7Var.f214414d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f214415e, q7Var.f214415e);
    }

    /* renamed from: hashCode */
    public int m62867x8cdac1b() {
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.f214411a;
        int hashCode = (interfaceC4987x84e327cb == null ? 0 : interfaceC4987x84e327cb.hashCode()) * 31;
        java.lang.String str = this.f214412b;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f214413c)) * 31) + java.lang.Boolean.hashCode(this.f214414d)) * 31;
        java.lang.Long l17 = this.f214415e;
        return hashCode2 + (l17 != null ? l17.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m62868x9616526c() {
        return "FinderCommentPostContent(emoji=" + this.f214411a + ", image=" + this.f214412b + ", contentType=" + this.f214413c + ", fromRecentImage=" + this.f214414d + ", imageFileModifiedTime=" + this.f214415e + ')';
    }

    public /* synthetic */ q7(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb, java.lang.String str, int i17, boolean z17, java.lang.Long l17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i18 & 1) != 0 ? null : interfaceC4987x84e327cb, (i18 & 2) != 0 ? null : str, (i18 & 4) != 0 ? 0 : i17, (i18 & 8) != 0 ? false : z17, (i18 & 16) != 0 ? null : l17);
    }
}
