package kv2;

/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final kv2.h f394195a = new kv2.h();

    /* renamed from: b, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.y0 f394196b = p3325xe03a0797.p3326xc267989b.z0.b();

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f394197c = jz5.h.b(kv2.f.f394193d);

    public static final void c(java.lang.ref.WeakReference contextReference, dm.pd mention, int i17, so2.i msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextReference, "contextReference");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mention, "mention");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        r45.vg2 vg2Var = mention.f66083x26b3182a;
        if (vg2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingFinderMentionRouter", "handleTingFinderMention fail, mentionExtInfo is null. position:" + i17);
            return;
        }
        int m75939xb282bd08 = vg2Var.m75939xb282bd08(6);
        if (m75939xb282bd08 != 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingFinderMentionRouter", "bypassType is unknown:" + m75939xb282bd08);
            return;
        }
        bw5.ic0 h17 = f394195a.h(mention);
        if (h17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingFinderMentionRouter", "handleTingFinderMention fail, bypassMessage is null. position:" + i17);
            return;
        }
        int i18 = h17.f110056d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleTingFinderMention, bypassMessageType:");
        sb6.append(i18);
        sb6.append(", listen_id:");
        sb6.append(h17.m12143x6e095e9(1) ? h17.f110057e : "");
        sb6.append(", category_id:");
        sb6.append(h17.m12143x6e095e9(4) ? h17.f110058f : "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingFinderMentionRouter", sb6.toString());
        kv2.a aVar = (kv2.a) ((java.util.Map) ((jz5.n) f394197c).mo141623x754a37bb()).get(java.lang.Integer.valueOf(i18));
        if (aVar != null) {
            aVar.a(contextReference, mention, h17);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingFinderMentionRouter", "routeMap not found handler for " + i18);
    }

    public final kv2.b a(dm.pd pdVar) {
        kv2.i g17;
        if (d(pdVar) && (g17 = g(pdVar)) != kv2.i.f394198d) {
            if (g17 == kv2.i.f394201g || g17 == kv2.i.f394202h) {
                return kv2.b.f394183e;
            }
            bw5.ic0 h17 = h(pdVar);
            if (g17 == kv2.i.f394199e) {
                if (h17 != null && h17.f110062m == 1) {
                    return kv2.b.f394183e;
                }
                if (h17 != null && h17.f110062m == 7) {
                    return kv2.b.f394184f;
                }
            }
            if (g17 == kv2.i.f394200f) {
                if (!(h17 != null && h17.f110062m == 3)) {
                    if (!(h17 != null && h17.f110062m == 2)) {
                        if (h17 != null && h17.f110062m == 4) {
                            return kv2.b.f394184f;
                        }
                    }
                }
                return kv2.b.f394183e;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("commentCgiTypeWithMention parse error, uniCommentBypassMessage?.listenItemType: ");
            sb6.append(h17 != null ? java.lang.Integer.valueOf(h17.f110062m) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingFinderMentionRouter", sb6.toString());
            return kv2.b.f394182d;
        }
        return kv2.b.f394182d;
    }

    public final p3325xe03a0797.p3326xc267989b.r2 b(java.lang.ref.WeakReference contextReference, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextReference, "contextReference");
        return p3325xe03a0797.p3326xc267989b.l.d(f394196b, null, null, new kv2.c(contextReference, j17, j18, null), 3, null);
    }

    public final boolean d(dm.pd mention) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mention, "mention");
        if (mention.f66122x76e81a5a != 1) {
            return false;
        }
        r45.vg2 vg2Var = mention.f66083x26b3182a;
        if (vg2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingFinderMentionRouter", "handleTingFinderMention fail, mentionExtInfo is null");
            return false;
        }
        int m75939xb282bd08 = vg2Var.m75939xb282bd08(6);
        if (m75939xb282bd08 == 4) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingFinderMentionRouter", "bypassType is unknown:" + m75939xb282bd08);
        return false;
    }

    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 e(java.lang.ref.WeakReference contextReference) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextReference, "contextReference");
        android.app.Activity activity = (android.app.Activity) contextReference.get();
        if (activity != null) {
            return db5.e1.Q(activity, null, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggd), true, false, kv2.g.f394194d);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingFinderMentionRouter", "showToast Loading, activity is null");
        return null;
    }

    public final void f(java.lang.ref.WeakReference contextReference, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextReference, "contextReference");
        android.app.Activity activity = (android.app.Activity) contextReference.get();
        if (activity == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingFinderMentionRouter", "showToast fail, activity is null");
        } else {
            db5.e1.i(activity, i17, 0);
        }
    }

    public final kv2.i g(dm.pd mention) {
        bw5.ic0 h17;
        int i17;
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mention, "mention");
        if (d(mention) && (h17 = h(mention)) != null) {
            int i19 = h17.f110056d;
            boolean z17 = true;
            java.lang.String str = h17.m12143x6e095e9(1) ? h17.f110057e : "";
            java.lang.String str2 = h17.m12143x6e095e9(4) ? h17.f110058f : "";
            if (i19 == 1) {
                if (!(str == null || str.length() == 0) && (i18 = h17.f110062m) > 0) {
                    return (i18 == 1 || i18 == 7) ? kv2.i.f394199e : kv2.i.f394200f;
                }
            }
            if (i19 == 2) {
                if (str2 != null && str2.length() != 0) {
                    z17 = false;
                }
                if (!z17 && (i17 = h17.f110063n) > 0) {
                    if (i17 == 3) {
                        return kv2.i.f394201g;
                    }
                    if (i17 == 2 || i17 == 8 || i17 == 26) {
                        return kv2.i.f394202h;
                    }
                    return kv2.i.f394198d;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingFinderMentionRouter", "tingFinderMentionSourceType parse error, bypassMessage.type: " + i19 + ", listenId: " + str + ", listenItemType: " + h17.f110062m + ", categoryId: " + str2 + ", categoryItemType: " + h17.f110063n);
            return kv2.i.f394198d;
        }
        return kv2.i.f394198d;
    }

    public final bw5.ic0 h(dm.pd pdVar) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = pdVar.f66083x26b3182a.m75934xbce7f2f(5);
        if (m75934xbce7f2f == null || m75934xbce7f2f.f273689a.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingFinderMentionRouter", "uniCommentBypassMessageFromMention fail, bypassBuffer is empty");
            return null;
        }
        try {
            return new bw5.ic0().mo11468x92b714fd(m75934xbce7f2f.g());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingFinderMentionRouter", "uniCommentBypassMessageFromMention fail, parse bypassMessage error, e:" + e17.getLocalizedMessage());
            return null;
        }
    }
}
