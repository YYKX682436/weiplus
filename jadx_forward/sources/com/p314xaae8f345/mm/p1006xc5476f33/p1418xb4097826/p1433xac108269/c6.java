package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes2.dex */
public final class c6 implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f183593a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f183594b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f183595c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f183596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f183597e;

    public c6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, int i17, r45.qt2 qt2Var, yz5.l lVar) {
        this.f183593a = c14994x9b99c079;
        this.f183594b = activityC0065xcd7aa112;
        this.f183595c = i17;
        this.f183596d = qt2Var;
        this.f183597e = lVar;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f183594b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f183593a;
        if (i17 == -1) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
            if (stringArrayListExtra == null) {
                stringArrayListExtra = new java.util.ArrayList<>(0);
            }
            arrayList = stringArrayListExtra;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommonService", "share finderObject " + c14994x9b99c079.m59251x5db1b11() + " to " + arrayList);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3.class)).Ai().h(arrayList);
            if (!arrayList.isEmpty()) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                java.lang.Object a17 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
                ec2.d e27 = zy2.ra.e2((zy2.ra) a17, 0, 1, null);
                if (e27 != null) {
                    e27.a(new ec2.a(1, c14994x9b99c079.m59251x5db1b11(), c14994x9b99c079.m59229xb5af1dd5()));
                }
            }
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            java.lang.Object a18 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
            ec2.d e28 = zy2.ra.e2((zy2.ra) a18, 0, 1, null);
            if (e28 != null) {
                e28.a(new ec2.a(3, c14994x9b99c079.m59251x5db1b11(), c14994x9b99c079.m59229xb5af1dd5()));
            }
        }
        long j17 = i17 == -1 ? 1L : 2L;
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17;
        long m59251x5db1b11 = c14994x9b99c079.m59251x5db1b11();
        java.lang.String m59229xb5af1dd5 = c14994x9b99c079.m59229xb5af1dd5();
        int i18 = this.f183595c;
        java.lang.String c18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, ";");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "listToString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.Vj(o3Var, m59251x5db1b11, m59229xb5af1dd5, i18, j17, c18, this.f183596d, arrayList.size(), null, null, 384, null);
        yz5.l lVar = this.f183597e;
        if (lVar != null) {
            lVar.mo146xb9724478(arrayList);
        }
    }
}
