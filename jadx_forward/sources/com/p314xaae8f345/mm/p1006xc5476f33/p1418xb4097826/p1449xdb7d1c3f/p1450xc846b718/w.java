package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f187467a;

    /* renamed from: b, reason: collision with root package name */
    public final int f187468b;

    /* renamed from: c, reason: collision with root package name */
    public final int f187469c;

    /* renamed from: d, reason: collision with root package name */
    public final int f187470d;

    /* renamed from: e, reason: collision with root package name */
    public final int f187471e;

    /* renamed from: f, reason: collision with root package name */
    public final int f187472f;

    /* renamed from: g, reason: collision with root package name */
    public final int f187473g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f187474h;

    public w(int i17, int i18, int i19, int i27, int i28, int i29, int i37, java.lang.String str) {
        this.f187467a = i17;
        this.f187468b = i18;
        this.f187469c = i19;
        this.f187470d = i27;
        this.f187471e = i28;
        this.f187472f = i29;
        this.f187473g = i37;
        this.f187474h = str;
    }

    public final int a(boolean z17, boolean z18) {
        int i17 = 0;
        if (z18) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w(0, 0, this.f187469c, 0, 0, this.f187472f, this.f187473g, this.f187474h).a(z17, false);
        }
        int i18 = this.f187471e;
        int i19 = this.f187469c;
        int i27 = this.f187470d;
        int i28 = this.f187468b;
        int i29 = this.f187467a;
        java.lang.String str = this.f187474h;
        if (str != null) {
            switch (str.hashCode()) {
                case -1310893465:
                    if (str.equals("AuthorProfileNotify")) {
                        i17 = i27;
                        break;
                    }
                    break;
                case -293714827:
                    if (str.equals("finder_wx_private_msg_entrance")) {
                        i17 = i29;
                        break;
                    }
                    break;
                case 885710185:
                    if (str.equals("finder_private_msg_entrance")) {
                        i17 = i28;
                        break;
                    }
                    break;
                case 1266477644:
                    if (str.equals("WxMessageEntry")) {
                        i17 = i19;
                        break;
                    }
                    break;
                case 1850844961:
                    if (str.equals("AuthorProfileMemberNotify")) {
                        i17 = i18;
                        break;
                    }
                    break;
            }
        }
        return (z17 ? (i29 + i28) + this.f187472f : (((i29 + i28) + i19) + i27) + i18) - i17;
    }

    /* renamed from: equals */
    public boolean m55965xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w wVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w) obj;
        return this.f187467a == wVar.f187467a && this.f187468b == wVar.f187468b && this.f187469c == wVar.f187469c && this.f187470d == wVar.f187470d && this.f187471e == wVar.f187471e && this.f187472f == wVar.f187472f && this.f187473g == wVar.f187473g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f187474h, wVar.f187474h);
    }

    /* renamed from: hashCode */
    public int m55966x8cdac1b() {
        int hashCode = ((((((((((((java.lang.Integer.hashCode(this.f187467a) * 31) + java.lang.Integer.hashCode(this.f187468b)) * 31) + java.lang.Integer.hashCode(this.f187469c)) * 31) + java.lang.Integer.hashCode(this.f187470d)) * 31) + java.lang.Integer.hashCode(this.f187471e)) * 31) + java.lang.Integer.hashCode(this.f187472f)) * 31) + java.lang.Integer.hashCode(this.f187473g)) * 31;
        java.lang.String str = this.f187474h;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m55967x9616526c() {
        return "PersonalCenterCountCache(wxMessage=" + this.f187467a + ", message=" + this.f187468b + ", wxMessageEntry=" + this.f187469c + ", authorProfileNotify=" + this.f187470d + ", memberAuthorProfileNotify=" + this.f187471e + ", mergedDetail=" + this.f187472f + ", rawCount=" + this.f187473g + ", disposePath=" + this.f187474h + ')';
    }
}
