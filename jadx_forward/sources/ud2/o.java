package ud2;

/* loaded from: classes10.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f508167a;

    /* renamed from: b, reason: collision with root package name */
    public final ud2.a f508168b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f508169c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f508170d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f508171e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 f508172f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a f508173g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.a f508174h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.a f508175i;

    /* renamed from: j, reason: collision with root package name */
    public final yz5.p f508176j;

    /* renamed from: k, reason: collision with root package name */
    public final yz5.l f508177k;

    /* renamed from: l, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1472xadfe2b3.C14164xdaa7d2e7 f508178l;

    /* JADX WARN: Type inference failed for: r8v12, types: [com.tencent.mm.plugin.finder.liteapp.ShowWindowPreviewManagerForLiteApp$lifeObserver$1] */
    public o(android.view.View parentView, ud2.a previewView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentView, "parentView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previewView, "previewView");
        this.f508167a = parentView;
        this.f508168b = previewView;
        this.f508169c = "ShowWindowPreviewController";
        android.view.View findViewById = previewView.mo31848xfb86a31b().findViewById(com.p314xaae8f345.mm.R.id.cl6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f508171e = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = previewView.mo31848xfb86a31b().findViewById(com.p314xaae8f345.mm.R.id.icq);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962) findViewById2).setTag("nearby-live-preview-view-tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "apply(...)");
        this.f508172f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962) findViewById2;
        p012xc85e97e9.p093xedfae76a.y d17 = d(previewView.mo31848xfb86a31b());
        this.f508173g = new com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a("ShowWindowPreviewController", d17 instanceof p012xc85e97e9.p093xedfae76a.y ? d17 : null, 0, 4, null);
        this.f508174h = new ud2.m(this);
        this.f508175i = new ud2.k(this);
        this.f508176j = new ud2.l(this);
        this.f508177k = new ud2.j(this);
        this.f508178l = new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.plugin.finder.liteapp.ShowWindowPreviewManagerForLiteApp$lifeObserver$1
            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_STOP)
            /* renamed from: onStop */
            public final void m56743xc39f8281() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd8962 = ud2.o.this.f508172f;
                if (c14522x8ffd8962.mo58387xc00617a4()) {
                    c14522x8ffd8962.mo58388x65825f6();
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ud2.o r9, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r10) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ud2.o.a(ud2.o, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void b(ud2.o oVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = oVar.f508170d;
        if (c14994x9b99c079 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(oVar.f508169c, "FinderObject is null, can not play");
            return;
        }
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.X(c14994x9b99c079.m59259x7dea7760());
        java.lang.String m75945x2fec8307 = mb4Var.m75945x2fec8307(16);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        java.lang.String m75945x2fec83072 = mb4Var.m75945x2fec8307(20);
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        java.lang.String concat = m75945x2fec8307.concat(m75945x2fec83072);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(concat)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(mb4Var.m75945x2fec8307(1));
            java.lang.String m75945x2fec83073 = mb4Var.m75945x2fec8307(19);
            sb6.append(m75945x2fec83073 != null ? m75945x2fec83073 : "");
            concat = sb6.toString();
        }
        java.lang.String str = concat;
        r45.nw1 m59258xd0557130 = c14994x9b99c079.m59258xd0557130();
        if (m59258xd0557130 != null && m59258xd0557130.m75939xb282bd08(2) == 1) {
            mn2.g1 g1Var = mn2.g1.f411508a;
            g1Var.e().c(new mn2.q3(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), oVar.f508171e, g1Var.h(mn2.f1.f411486d));
        } else {
            i95.m c17 = i95.n0.c(c61.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            c61.zb.g7((c61.zb) c17, oVar.f508171e, str, 0, 4, null);
        }
    }

    public static final void c(ud2.o oVar) {
        r45.nw1 m76794xd0557130;
        java.lang.String m75945x2fec8307;
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        p012xc85e97e9.p093xedfae76a.n b17;
        p012xc85e97e9.p093xedfae76a.y d17 = oVar.d(oVar.f508168b.mo31848xfb86a31b());
        boolean a17 = (d17 == null || (mo273xed6858b4 = d17.mo273xed6858b4()) == null || (b17 = mo273xed6858b4.b()) == null) ? false : b17.a(p012xc85e97e9.p093xedfae76a.n.RESUMED);
        java.lang.String str = oVar.f508169c;
        if (!a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "try start play when inactive!");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = oVar.f508170d;
        if (c14994x9b99c079 == null || (m76794xd0557130 = c14994x9b99c079.getFeedObject().m76794xd0557130()) == null || (m75945x2fec8307 = m76794xd0557130.m75945x2fec8307(3)) == null) {
            return;
        }
        if (m75945x2fec8307.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "liveUrl is empty");
            return;
        }
        gp2.a aVar = new gp2.a(m75945x2fec8307, new so2.h1(c14994x9b99c079), false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd8962 = oVar.f508172f;
        c14522x8ffd8962.m58393x5bde035d(aVar);
        c14522x8ffd8962.mo58394x764d819b(true);
        ws5.f.j(oVar.f508172f, oVar.f508174h, oVar.f508175i, oVar.f508176j, oVar.f508177k, null, null, 48, null);
    }

    public final p012xc85e97e9.p093xedfae76a.y d(android.view.View view) {
        if (view == null) {
            return null;
        }
        if (!(view.getContext() instanceof p012xc85e97e9.p093xedfae76a.y)) {
            android.view.ViewParent parent = view.getParent();
            return d(parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null);
        }
        java.lang.Object context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        return (p012xc85e97e9.p093xedfae76a.y) context;
    }

    public final void e(java.lang.String str, java.util.HashMap hashMap) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f508169c, "notify event " + str + ", params = " + hashMap);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        if (hashMap == null) {
            hashMap = new java.util.HashMap();
        }
        hashMap.put("event", str);
        hashMap2.put("event", "playEvent");
        hashMap2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, hashMap);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = this.f508168b.f508110e;
        if (c28688xe8dbe4c2 != null) {
            c28688xe8dbe4c2.m138438xd8c5c779("platformViewEvent", hashMap2);
        }
    }
}
