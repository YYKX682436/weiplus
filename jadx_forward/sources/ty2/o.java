package ty2;

/* loaded from: classes9.dex */
public final class o extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f504626d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f504627e;

    /* renamed from: f, reason: collision with root package name */
    public int f504628f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f504629g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f504630h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.content.Context context, java.lang.String tag) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        this.f504626d = tag;
        this.f504627e = new java.util.concurrent.atomic.AtomicInteger(0);
        setOrientation(0);
        this.f504629g = new java.util.ArrayList();
        this.f504630h = new java.util.LinkedHashMap();
    }

    public final java.lang.Integer a(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            return java.lang.Integer.valueOf(android.graphics.Color.parseColor(d(str)));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f504626d, th6, "", new java.lang.Object[0]);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x025c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0282 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(bw5.o5 r17, int r18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r19) {
        /*
            Method dump skipped, instructions count: 735
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ty2.o.b(bw5.o5, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void c() {
        removeAllViews();
        this.f504628f = 0;
        ((java.util.ArrayList) this.f504629g).clear();
        java.util.Map map = this.f504630h;
        java.util.Iterator it = ((java.util.LinkedHashMap) map).entrySet().iterator();
        while (it.hasNext()) {
            p3325xe03a0797.p3326xc267989b.p2.a((p3325xe03a0797.p3326xc267989b.r2) ((java.util.Map.Entry) it.next()).getValue(), null, 1, null);
        }
        ((java.util.LinkedHashMap) map).clear();
    }

    public final java.lang.String d(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (str.length() != 9) {
            return str;
        }
        char charAt = str.charAt(0);
        java.lang.String substring = str.substring(1, 3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        java.lang.String substring2 = str.substring(3, 5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
        java.lang.String substring3 = str.substring(5, 7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring3, "substring(...)");
        java.lang.String substring4 = str.substring(7, 9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring4, "substring(...)");
        return charAt + substring4 + substring + substring2 + substring3;
    }

    @Override // android.view.View
    public final java.lang.String getTag() {
        return this.f504626d;
    }
}
