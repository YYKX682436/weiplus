package cw1;

/* loaded from: classes12.dex */
public final class q2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f304789d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw1.o0 f304790e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f304791f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f304792g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13111x890e232d f304793h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f304794i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f304795m;

    public q2(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, cw1.o0 o0Var, byte[] bArr, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13111x890e232d activityC13111x890e232d, long j17, boolean z17) {
        this.f304789d = u3Var;
        this.f304790e = o0Var;
        this.f304791f = bArr;
        this.f304792g = h0Var;
        this.f304793h = activityC13111x890e232d;
        this.f304794i = j17;
        this.f304795m = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j17;
        this.f304789d.dismiss();
        this.f304790e.d(false);
        byte[] bArr = this.f304791f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13111x890e232d activityC13111x890e232d = this.f304793h;
        int length = bArr.length;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            j17 = 0;
            if (i17 >= length) {
                break;
            }
            int i19 = i18 + 1;
            if (bArr[i17] != Byte.MAX_VALUE) {
                activityC13111x890e232d.f177226h[i18] = 0;
            }
            i17++;
            i18 = i19;
        }
        java.lang.Object obj = this.f304792g.f391656d;
        if (obj != null) {
            long[] jArr = this.f304793h.f177226h;
            java.util.Iterator it = ((java.lang.Iterable) obj).iterator();
            while (it.hasNext()) {
                j17 += ((cw1.j) it.next()).f304544c;
            }
            jArr[6] = j17;
            this.f304790e.g(3, (java.util.List) this.f304792g.f391656d);
        }
        this.f304790e.h(this.f304793h.f177226h);
        this.f304793h.f177227i.mo152xb9724478();
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13111x890e232d activityC13111x890e232d2 = this.f304793h;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("tagsResult", this.f304793h.f177226h);
        activityC13111x890e232d2.setResult(-1, intent);
        yv1.f1 f1Var = yv1.g1.f547573p;
        java.lang.String string = this.f304793h.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b8q, fp.n0.a(this.f304794i));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        if (!this.f304795m) {
            db5.t7.h(this.f304793h, string);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13111x890e232d activityC13111x890e232d3 = this.f304793h;
        activityC13111x890e232d3.getClass();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC13111x890e232d3);
        u1Var.g(string + '\n' + activityC13111x890e232d3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b7s, 5));
        u1Var.a(false);
        u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.b7r);
        u1Var.e(new cw1.j2(activityC13111x890e232d3));
        u1Var.q(false);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = u1Var.f293531c;
        cw1.k2 k2Var = new cw1.k2(j0Var, (android.widget.TextView) j0Var.mo81952xc2a54588().findViewById(com.p314xaae8f345.mm.R.id.jlg), string, activityC13111x890e232d3);
        ku5.t0 t0Var = (ku5.t0) ku5.t0.f394148d;
        t0Var.getClass();
        t0Var.z(k2Var, 1000L, false);
    }
}
