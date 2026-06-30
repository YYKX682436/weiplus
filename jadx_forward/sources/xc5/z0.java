package xc5;

/* loaded from: classes12.dex */
public final class z0 extends xc5.c {

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f535136c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f535137d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        super(msgInfo, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        this.f535136c = new java.util.LinkedHashMap();
        this.f535137d = new java.util.LinkedHashMap();
    }

    @Override // mf3.k
    public gg3.c a() {
        mf3.w mo147256x74bf41ce = mo147256x74bf41ce();
        java.lang.String str = (java.lang.String) ((java.util.LinkedHashMap) this.f535136c).get(mo147256x74bf41ce);
        java.lang.String str2 = str == null ? "" : str;
        java.lang.String str3 = (java.lang.String) ((java.util.LinkedHashMap) this.f535137d).get(mo147256x74bf41ce);
        java.lang.String str4 = str3 == null ? "" : str3;
        if (r26.n0.N(str2) || r26.n0.N(str4)) {
            return null;
        }
        return new gg3.c(mo2110x5db1b11(), str2, str4, null, 0L, false, 40, null);
    }

    @Override // mf3.k
    public eg3.i c() {
        return null;
    }

    @Override // xc5.b
    public co.a d() {
        java.lang.Object obj;
        java.util.Map map = this.f535136c;
        java.lang.String str = (java.lang.String) ((java.util.LinkedHashMap) map).get(mo147256x74bf41ce());
        if (str == null) {
            str = "";
        }
        if (r26.n0.N(str)) {
            java.util.Iterator it = ((java.util.LinkedHashMap) map).values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (!r26.n0.N((java.lang.String) obj)) {
                    break;
                }
            }
            java.lang.String str2 = (java.lang.String) obj;
            str = str2 != null ? str2 : "";
        }
        if (r26.n0.N(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiveMsgHistoryGalleryMediaInfo", "createForwardViewModel: no cached thumb, msgId=" + this.f534932a.m124847x74d37ac6());
            return null;
        }
        jd5.a aVar = new jd5.a();
        h(aVar);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        aVar.p(str);
        return aVar;
    }

    @Override // mf3.k
    public sf3.g e() {
        return null;
    }

    @Override // mf3.k
    public java.lang.String g() {
        return "";
    }

    @Override // mf3.k
    /* renamed from: getType */
    public mf3.u mo2109xfb85f7b0() {
        return mf3.u.f407658g;
    }

    public final void i(mf3.w level, java.lang.String thumbPath, java.lang.String videoPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(level, "level");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbPath, "thumbPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPath, "videoPath");
        if (r26.n0.N(thumbPath) || r26.n0.N(videoPath)) {
            return;
        }
        this.f535136c.put(level, thumbPath);
        this.f535137d.put(level, videoPath);
    }
}
