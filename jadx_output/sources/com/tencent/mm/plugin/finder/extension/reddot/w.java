package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f105934a;

    /* renamed from: b, reason: collision with root package name */
    public final int f105935b;

    /* renamed from: c, reason: collision with root package name */
    public final int f105936c;

    /* renamed from: d, reason: collision with root package name */
    public final int f105937d;

    /* renamed from: e, reason: collision with root package name */
    public final int f105938e;

    /* renamed from: f, reason: collision with root package name */
    public final int f105939f;

    /* renamed from: g, reason: collision with root package name */
    public final int f105940g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f105941h;

    public w(int i17, int i18, int i19, int i27, int i28, int i29, int i37, java.lang.String str) {
        this.f105934a = i17;
        this.f105935b = i18;
        this.f105936c = i19;
        this.f105937d = i27;
        this.f105938e = i28;
        this.f105939f = i29;
        this.f105940g = i37;
        this.f105941h = str;
    }

    public final int a(boolean z17, boolean z18) {
        int i17 = 0;
        if (z18) {
            return new com.tencent.mm.plugin.finder.extension.reddot.w(0, 0, this.f105936c, 0, 0, this.f105939f, this.f105940g, this.f105941h).a(z17, false);
        }
        int i18 = this.f105938e;
        int i19 = this.f105936c;
        int i27 = this.f105937d;
        int i28 = this.f105935b;
        int i29 = this.f105934a;
        java.lang.String str = this.f105941h;
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
        return (z17 ? (i29 + i28) + this.f105939f : (((i29 + i28) + i19) + i27) + i18) - i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.extension.reddot.w)) {
            return false;
        }
        com.tencent.mm.plugin.finder.extension.reddot.w wVar = (com.tencent.mm.plugin.finder.extension.reddot.w) obj;
        return this.f105934a == wVar.f105934a && this.f105935b == wVar.f105935b && this.f105936c == wVar.f105936c && this.f105937d == wVar.f105937d && this.f105938e == wVar.f105938e && this.f105939f == wVar.f105939f && this.f105940g == wVar.f105940g && kotlin.jvm.internal.o.b(this.f105941h, wVar.f105941h);
    }

    public int hashCode() {
        int hashCode = ((((((((((((java.lang.Integer.hashCode(this.f105934a) * 31) + java.lang.Integer.hashCode(this.f105935b)) * 31) + java.lang.Integer.hashCode(this.f105936c)) * 31) + java.lang.Integer.hashCode(this.f105937d)) * 31) + java.lang.Integer.hashCode(this.f105938e)) * 31) + java.lang.Integer.hashCode(this.f105939f)) * 31) + java.lang.Integer.hashCode(this.f105940g)) * 31;
        java.lang.String str = this.f105941h;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "PersonalCenterCountCache(wxMessage=" + this.f105934a + ", message=" + this.f105935b + ", wxMessageEntry=" + this.f105936c + ", authorProfileNotify=" + this.f105937d + ", memberAuthorProfileNotify=" + this.f105938e + ", mergedDetail=" + this.f105939f + ", rawCount=" + this.f105940g + ", disposePath=" + this.f105941h + ')';
    }
}
