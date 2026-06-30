package zb4;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb f552836a;

    /* renamed from: b, reason: collision with root package name */
    public android.util.Size f552837b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f552838c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f552839d;

    /* renamed from: e, reason: collision with root package name */
    public int f552840e;

    public a(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb, android.util.Size emojiSize, java.lang.String str, java.lang.String text, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiSize, "emojiSize");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        this.f552836a = interfaceC4987x84e327cb;
        this.f552837b = emojiSize;
        this.f552838c = str;
        this.f552839d = text;
        this.f552840e = i17;
    }

    public final int a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContentType", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        int i17 = this.f552840e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContentType", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        return i17;
    }

    public final com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEmoji", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.f552836a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEmoji", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        return interfaceC4987x84e327cb;
    }

    public final java.lang.String c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getImage", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        java.lang.String str = this.f552838c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImage", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        return str;
    }

    public final java.lang.String d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getText", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        java.lang.String str = this.f552839d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getText", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        return str;
    }

    public final boolean e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isTextComment", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        boolean z17 = this.f552840e == 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isTextComment", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        return z17;
    }

    /* renamed from: equals */
    public boolean m178657xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
            return true;
        }
        if (!(obj instanceof zb4.a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
            return false;
        }
        zb4.a aVar = (zb4.a) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f552836a, aVar.f552836a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f552837b, aVar.f552837b)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f552838c, aVar.f552838c)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f552839d, aVar.f552839d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
            return false;
        }
        int i17 = this.f552840e;
        int i18 = aVar.f552840e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        return i17 == i18;
    }

    public final boolean f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isValid", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        int i17 = this.f552840e;
        if (i17 != 0) {
            if (i17 != 1) {
                java.lang.String str = this.f552838c;
                boolean z17 = !(str == null || str.length() == 0);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValid", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
                return z17;
            }
            com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.f552836a;
            if (interfaceC4987x84e327cb != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(interfaceC4987x84e327cb);
                java.lang.String mo42933xb5885648 = interfaceC4987x84e327cb.mo42933xb5885648();
                if (!(mo42933xb5885648 == null || mo42933xb5885648.length() == 0)) {
                    r3 = true;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValid", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
            return r3;
        }
        if (this.f552839d.length() > 0) {
            java.lang.String str2 = this.f552839d;
            int length = str2.length() - 1;
            int i18 = 0;
            boolean z18 = false;
            while (i18 <= length) {
                boolean z19 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(str2.charAt(!z18 ? i18 : length), 32) <= 0;
                if (z18) {
                    if (!z19) {
                        break;
                    }
                    length--;
                } else if (z19) {
                    i18++;
                } else {
                    z18 = true;
                }
            }
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2.subSequence(i18, length + 1).toString(), "")) {
                r3 = true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValid", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        return r3;
    }

    public final void g(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setContentType", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        this.f552840e = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setContentType", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
    }

    public final void h(android.util.Size size) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setEmojiSize", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(size, "<set-?>");
        this.f552837b = size;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setEmojiSize", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
    }

    /* renamed from: hashCode */
    public int m178658x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.f552836a;
        int hashCode = (((interfaceC4987x84e327cb == null ? 0 : interfaceC4987x84e327cb.hashCode()) * 31) + this.f552837b.hashCode()) * 31;
        java.lang.String str = this.f552838c;
        int hashCode2 = ((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f552839d.hashCode()) * 31) + java.lang.Integer.hashCode(this.f552840e);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        return hashCode2;
    }

    public final void i(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setText", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.f552839d = str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setText", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
    }

    /* renamed from: toString */
    public java.lang.String m178659x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        java.lang.String str = "SnsCmtPostContentData(emoji=" + this.f552836a + ", emojiSize=" + this.f552837b + ", image=" + this.f552838c + ", text=" + this.f552839d + ", contentType=" + this.f552840e + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        return str;
    }

    public a() {
        this(null, new android.util.Size(0, 0), null, "", 0);
    }
}
