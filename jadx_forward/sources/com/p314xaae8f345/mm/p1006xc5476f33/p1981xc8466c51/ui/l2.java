package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* loaded from: classes5.dex */
public class l2 {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.regex.Pattern f236971h = java.util.regex.Pattern.compile("[a-zA-z]");

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.regex.Pattern f236972i = java.util.regex.Pattern.compile("[一-龥]");

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.regex.Pattern f236973j = java.util.regex.Pattern.compile("[\\p{P}\\s]");

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.regex.Pattern f236974k = java.util.regex.Pattern.compile("[0-9]");

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f236975a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.BaseAdapter f236976b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.a f236977c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236978d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10687xa533b04c f236979e = null;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f236980f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f236981g;

    public l2(android.content.Context context, android.widget.BaseAdapter baseAdapter, com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.a aVar) {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.C16975xd7ad480a c16975xd7ad480a = new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.C16975xd7ad480a(this, a0Var);
        this.f236980f = c16975xd7ad480a;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5234x14788364> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5234x14788364>(a0Var) { // from class: com.tencent.mm.plugin.record.ui.TranslateHelper$3
            {
                this.f39173x3fe91575 = -348375692;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5234x14788364 c5234x14788364) {
                int D1;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5234x14788364 c5234x147883642 = c5234x14788364;
                com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.l2 l2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.l2.this;
                com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10687xa533b04c c10687xa533b04c = l2Var.f236979e;
                java.lang.String str = c10687xa533b04c == null ? null : c10687xa533b04c.f149355e;
                if (c10687xa533b04c == null) {
                    D1 = -1;
                } else {
                    java.util.Map map = c10687xa533b04c.f149356f;
                    D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(map == null ? null : (java.lang.String) map.get("TranslateHelper.SettingsRequestExtKey.MsgPosition"), 0);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TranslateHelper", "changeTransLangListener, eventSessionId: " + c5234x147883642.f135568g.f90035a + ", requestMsgId: " + str + ", requestMsgPosition: " + D1);
                if (str != null && android.text.TextUtils.equals(str, c5234x147883642.f135568g.f90035a)) {
                    l2Var.f236979e = null;
                    l2Var.f(D1, true);
                }
                return false;
            }
        };
        this.f236981g = abstractC20980x9b9ad01d;
        this.f236975a = context;
        this.f236976b = baseAdapter;
        this.f236977c = aVar;
        c16975xd7ad480a.mo48813x58998cd();
        abstractC20980x9b9ad01d.mo48813x58998cd();
    }

    public static int b(java.lang.String str) {
        int i17 = 0;
        int i18 = 0;
        while (i17 < str.length()) {
            int i19 = i17 + 1;
            if (f236972i.matcher(str.substring(i17, i19)).find()) {
                i18++;
            }
            i17 = i19;
        }
        return i18;
    }

    public static boolean c(java.lang.String str) {
        boolean z17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        int indexOf = str.indexOf(58);
        if (indexOf != -1) {
            str = str.substring(indexOf + 1);
        }
        java.lang.String replaceAll = f236974k.matcher(f236973j.matcher(str).replaceAll("")).replaceAll("");
        int length = replaceAll.length();
        if (length == 0) {
            return false;
        }
        java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        if (c17 == null) {
            c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        }
        if (!c17.equals("zh_CN")) {
            return true;
        }
        o13.r rVar = o13.s.f423788a;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(replaceAll)) {
            for (char c18 : replaceAll.toCharArray()) {
                if (o13.s.a(c18) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) o13.s.f423798k.get(java.lang.String.valueOf(c18)))) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        return z17 || ((float) b(replaceAll)) / ((float) length) < 1.0f;
    }

    public static boolean d(java.lang.String str) {
        if (c(str)) {
            return true;
        }
        return j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C19983xefbc77b3()) == 1;
    }

    public bt3.f3 a(int i17) {
        java.util.Iterator it = this.f236977c.f236876b.f105812d.iterator();
        while (it.hasNext()) {
            bt3.f3 f3Var = (bt3.f3) it.next();
            if (i17 == f3Var.f105797d) {
                return f3Var;
            }
        }
        bt3.f3 f3Var2 = new bt3.f3();
        f3Var2.f105797d = i17;
        f3Var2.f105798e = 0;
        this.f236977c.f236876b.f105812d.add(f3Var2);
        return f3Var2;
    }

    public byte[] e() {
        bt3.g3 g3Var;
        java.util.LinkedList linkedList;
        this.f236980f.mo48814x2efc64();
        this.f236981g.mo48814x2efc64();
        bt3.g3 g3Var2 = new bt3.g3();
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.a aVar = this.f236977c;
        if (aVar != null && (g3Var = aVar.f236876b) != null && (linkedList = g3Var.f105812d) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                bt3.f3 f3Var = (bt3.f3) it.next();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f3Var.f105799f)) {
                    g3Var2.f105812d.add(f3Var);
                }
            }
        }
        this.f236976b = null;
        this.f236977c = null;
        this.f236975a = null;
        try {
            return g3Var2.mo14344x5f01b1f6();
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    public void f(int i17, boolean z17) {
        bt3.f3 a17 = a(i17);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17.f105799f) && !z17) {
            a17.f105798e = 2;
            this.f236976b.notifyDataSetChanged();
            return;
        }
        if (i17 >= this.f236977c.f236875a.size()) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6175x4c627f21 c6175x4c627f21 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6175x4c627f21();
        am.hz hzVar = c6175x4c627f21.f136435g;
        hzVar.getClass();
        hzVar.f88413c = "" + i17;
        hzVar.f88411a = ((r45.gp0) this.f236977c.f236875a.get(i17)).f456941f;
        hzVar.f88412b = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.c(this.f236975a);
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = a17.f105801h;
        hzVar.f88417g = gVar != null ? gVar.f273689a : null;
        hzVar.f88414d = 4;
        c6175x4c627f21.e();
        a17.f105798e = 1;
        this.f236976b.notifyDataSetChanged();
        this.f236978d = true;
    }
}
