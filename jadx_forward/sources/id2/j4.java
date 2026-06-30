package id2;

/* loaded from: classes3.dex */
public final class j4 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public yl2.g1 f372164d;

    /* renamed from: e, reason: collision with root package name */
    public r45.fd2 f372165e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f372166f;

    /* renamed from: g, reason: collision with root package name */
    public final mm2.y6 f372167g;

    /* renamed from: h, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.q f372168h;

    /* renamed from: i, reason: collision with root package name */
    public int f372169i;

    /* renamed from: m, reason: collision with root package name */
    public long f372170m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f372171n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j4(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f372166f = "";
        this.f372167g = new mm2.y6(new gk2.e(null, 1, 0 == true ? 1 : 0));
        this.f372171n = jz5.h.b(new id2.h4(activity));
    }

    public final id2.z3 O6() {
        return (id2.z3) ((jz5.n) this.f372171n).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onActivityResult,requestCode:");
        sb6.append(i17);
        sb6.append(",resultCode:");
        sb6.append(i18);
        sb6.append(",face verify result:");
        sb6.append(intent != null ? java.lang.Integer.valueOf(intent.getIntExtra("FACE_VERIFY_RESULT", 0)) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostPendingUIC", sb6.toString());
        if (i17 == 10002) {
            if (i18 == 1) {
                p3325xe03a0797.p3326xc267989b.q qVar = this.f372168h;
                if (qVar != null) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE));
                }
                id2.v3 v3Var = O6().f372437g;
                if (v3Var != null) {
                    v3Var.e(true);
                    return;
                }
                return;
            }
            p3325xe03a0797.p3326xc267989b.q qVar2 = this.f372168h;
            if (qVar2 != null) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                qVar2.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
            }
            id2.v3 v3Var2 = O6().f372437g;
            if (v3Var2 != null) {
                v3Var2.e(false);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        this.f372169i = m158359x1e885992().getIntExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_TYPE", 0);
        this.f372170m = m158359x1e885992().getLongExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_ID", 0L);
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("KEY_LUCKY_MONEY_CHAT_ROOM_USERNAME");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f372166f = stringExtra;
        byte[] byteArrayExtra = m158359x1e885992().getByteArrayExtra("KEY_TAG_INFO");
        if (byteArrayExtra != null) {
            r45.fd2 fd2Var = new r45.fd2();
            try {
                fd2Var.mo11468x92b714fd(byteArrayExtra);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                fd2Var = null;
            }
            this.f372165e = fd2Var;
        }
        mm2.y6 y6Var = this.f372167g;
        java.util.ArrayList arrayList = y6Var.f411116g;
        java.util.ArrayList<java.lang.String> stringArrayListExtra = m158359x1e885992().getStringArrayListExtra("KEY_WHITE_ROOM_LIST");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new java.util.ArrayList<>();
        }
        arrayList.addAll(stringArrayListExtra);
        java.util.ArrayList arrayList2 = y6Var.f411117h;
        java.util.ArrayList<java.lang.String> stringArrayListExtra2 = m158359x1e885992().getStringArrayListExtra("KEY_WHITE_MEMBER_LIST");
        if (stringArrayListExtra2 == null) {
            stringArrayListExtra2 = new java.util.ArrayList<>();
        }
        arrayList2.addAll(stringArrayListExtra2);
        java.util.ArrayList arrayList3 = y6Var.f411118i;
        java.util.ArrayList<java.lang.String> stringArrayListExtra3 = m158359x1e885992().getStringArrayListExtra("KEY_WHITE_LABEL_LIST");
        if (stringArrayListExtra3 == null) {
            stringArrayListExtra3 = new java.util.ArrayList<>();
        }
        arrayList3.addAll(stringArrayListExtra3);
        r45.re2 re2Var = new r45.re2();
        java.util.LinkedList m75941xfb821914 = re2Var.m75941xfb821914(0);
        java.util.ArrayList arrayList4 = y6Var.f411116g;
        m75941xfb821914.addAll(arrayList4);
        re2Var.m75941xfb821914(1).addAll(arrayList2);
        re2Var.m75941xfb821914(2).addAll(arrayList4);
        re2Var.m75941xfb821914(2).addAll(arrayList2);
        re2Var.m75941xfb821914(4).addAll(arrayList3);
        y6Var.j(re2Var);
        y6Var.f411114e = m158359x1e885992().getIntExtra("KEY_WHITE_LIST_MODE", 0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initStartLiveOptions roomId:");
        sb6.append(this.f372166f);
        sb6.append(", visibilityMode:");
        sb6.append(y6Var.f411114e);
        sb6.append("visibilityRoomChooseList:");
        sb6.append(kz5.n0.g0(arrayList4, ";", null, null, 0, null, null, 62, null));
        sb6.append(", visibilityUserChooseList:");
        sb6.append(kz5.n0.g0(arrayList2, ";", null, null, 0, null, null, 62, null));
        sb6.append(",visibilityLabelChooseList:");
        sb6.append(kz5.n0.g0(arrayList3, ";", null, null, 0, null, null, 62, null));
        sb6.append(",tagInfo:");
        r45.fd2 fd2Var2 = this.f372165e;
        sb6.append(fd2Var2 != null ? java.lang.Integer.valueOf(fd2Var2.m75939xb282bd08(0)) : null);
        sb6.append('#');
        r45.fd2 fd2Var3 = this.f372165e;
        sb6.append(fd2Var3 != null ? fd2Var3.m75945x2fec8307(1) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostPendingUIC", sb6.toString());
        pf5.e.m158344xbe96bc24(this, null, null, new id2.i4(this, null), 3, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
    }
}
