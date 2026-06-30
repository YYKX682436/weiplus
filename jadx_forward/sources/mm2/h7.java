package mm2;

/* loaded from: classes3.dex */
public final class h7 extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 f410647f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 f410648g;

    /* renamed from: h, reason: collision with root package name */
    public int f410649h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f410650i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 f410651m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 f410652n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 f410653o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 f410654p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 f410655q;

    /* renamed from: r, reason: collision with root package name */
    public int f410656r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f410657s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f410658t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f410647f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44();
        this.f410648g = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44();
        this.f410650i = new java.util.LinkedList();
        this.f410651m = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44();
        this.f410652n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44();
        this.f410653o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44();
        this.f410654p = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44();
        this.f410655q = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44();
    }

    public final java.lang.String N6() {
        java.lang.String str;
        java.util.LinkedList linkedList = this.f410650i;
        return (linkedList.size() <= 0 || this.f410649h >= linkedList.size() || (str = ((r45.la4) linkedList.get(this.f410649h)).f460807e) == null) ? "" : str;
    }

    public final boolean O6() {
        return this.f410650i.size() > 0;
    }

    public final void P6(r45.na4 liveSdkParam) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveSdkParam, "liveSdkParam");
        java.util.LinkedList channel_params_desc = liveSdkParam.f462731g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(channel_params_desc, "channel_params_desc");
        this.f410650i = channel_params_desc;
        java.util.Iterator it = channel_params_desc.iterator();
        while (it.hasNext()) {
            r45.ka4 ka4Var = ((r45.la4) it.next()).f460806d;
            r45.ka4 ka4Var2 = liveSdkParam.f462730f;
            int i17 = ka4Var2.S;
            this.f410656r = i17;
            ka4Var.S = i17;
            ka4Var.T = ka4Var2.T;
            this.f410657s = ka4Var2.T;
            ka4Var.U = ka4Var2.U;
            this.f410658t = ka4Var2.U;
        }
    }

    public final void Q6(kn0.g liveRoomInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveRoomInfo, "liveRoomInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiStreamSlice", "updateCurLiveRoomInfo currentPosition: " + this.f410649h + " size: " + this.f410650i.size());
        if (this.f410649h >= this.f410650i.size()) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.Object obj = this.f410650i.get(this.f410649h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        r45.la4 la4Var = (r45.la4) obj;
        java.util.LinkedList<r45.gv> linkedList = la4Var.f460806d.f460073m;
        if (linkedList != null) {
            for (r45.gv gvVar : linkedList) {
                java.lang.Integer valueOf = java.lang.Integer.valueOf(gvVar.f457071f);
                java.lang.String str = gvVar.f457070e;
                java.lang.String str2 = "";
                if (str == null) {
                    str = "";
                }
                int i17 = gvVar.f457075m;
                java.lang.String str3 = gvVar.f457076n;
                java.lang.String str4 = gvVar.f457078p;
                if (str4 != null) {
                    str2 = str4;
                }
                hashMap.put(valueOf, new kn0.r(str, i17, str3, str2));
            }
        }
        liveRoomInfo.f391077k = hashMap;
        r45.ka4 channel_params = la4Var.f460806d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(channel_params, "channel_params");
        liveRoomInfo.f391081o = channel_params;
        liveRoomInfo.f391080n = la4Var.f460806d.f460084v;
        ((mm2.n6) m147920xbba4bfc0(mm2.n6.class)).f410826f = pm0.v.z(liveRoomInfo.f391080n, 2);
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        super.mo528x82b764cd();
        this.f410653o.mo7808x76db6cb1(0);
    }
}
