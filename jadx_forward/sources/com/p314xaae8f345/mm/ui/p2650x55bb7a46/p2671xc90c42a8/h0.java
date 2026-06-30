package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public final class h0 implements zb5.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f283768d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f283769e;

    /* renamed from: f, reason: collision with root package name */
    public zb5.b f283770f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.C21744x29417dbc f283771g;

    /* renamed from: h, reason: collision with root package name */
    public int f283772h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f283773i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f283774m;

    /* renamed from: n, reason: collision with root package name */
    public long f283775n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f283776o;

    public h0(android.content.Context context, java.lang.String talker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        this.f283768d = context;
        this.f283769e = talker;
        this.f283772h = 1;
        this.f283773i = "";
        this.f283774m = "";
        this.f283776o = jz5.h.b(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.g0.f283756d);
    }

    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiHistoryListPresenter", "[firstLoad] :: query " + this.f283773i);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.C21744x29417dbc c21744x29417dbc = this.f283771g;
        if (c21744x29417dbc != null) {
            c21744x29417dbc.f282087w = false;
            c21744x29417dbc.f282088x = false;
        }
        this.f283774m = "";
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.b0(this));
    }

    public final boolean d(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb emojiInfo, java.lang.String mQuery) {
        boolean z17;
        boolean z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mQuery, "mQuery");
        java.lang.String Bi = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class))).Bi(emojiInfo.mo42933xb5885648());
        char[] charArray = mQuery.toCharArray();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(charArray, "toCharArray(...)");
        int length = charArray.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                z17 = false;
                break;
            }
            char c17 = charArray[i17];
            if (19968 <= c17 && c17 < 40892) {
                z17 = true;
                break;
            }
            i17++;
        }
        if (!z17 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Bi)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Bi);
            java.util.Locale locale = java.util.Locale.getDefault();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale, "getDefault(...)");
            java.lang.String lowerCase = Bi.toLowerCase(locale);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lowerCase)) {
                z18 = false;
            } else {
                java.util.regex.Matcher matcher = ((java.util.regex.Pattern) ((jz5.n) this.f283776o).mo141623x754a37bb()).matcher(lowerCase);
                z18 = false;
                while (matcher.find()) {
                    java.lang.String group = matcher.group();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(group);
                    boolean y17 = r26.i0.y(group, mQuery, false);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiHistoryListPresenter", "[isContains] search=" + mQuery + " group=" + group);
                    z18 = y17;
                    if (y17) {
                        break;
                    }
                }
            }
            if (z18) {
                return true;
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Bi)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Bi);
            java.util.Locale locale2 = java.util.Locale.getDefault();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale2, "getDefault(...)");
            java.lang.String lowerCase2 = Bi.toLowerCase(locale2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase2, "toLowerCase(...)");
            if (r26.n0.B(lowerCase2, mQuery, false)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z
    /* renamed from: onDetach */
    public void mo79813x3f5eee52() {
        zb5.b bVar = this.f283770f;
        if (bVar != null) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ActivityC21745xdfe2aae0) bVar).f282090d = null;
        }
        this.f283770f = null;
        de5.a aVar = de5.a.f310929a;
        aVar.l("");
        aVar.k(21, 7, 8);
    }
}
