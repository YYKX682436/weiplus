package j23;

/* loaded from: classes12.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j23.y f378816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f378817e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t13.j f378818f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(j23.y yVar, android.content.Context context, t13.j jVar) {
        super(1);
        this.f378816d = yVar;
        this.f378817e = context;
        this.f378818f = jVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        b23.a it = (b23.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        j75.d dVar = it.f379599d;
        if (dVar != null && (dVar instanceof fi0.c)) {
            fi0.c cVar = (fi0.c) dVar;
            j23.y yVar = this.f378816d;
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cVar.f344270b, yVar.f378827m);
            boolean z18 = cVar.f344274f;
            if (b17) {
                long j17 = yVar.f378828n;
                long j18 = cVar.f344271c;
                if (j18 == j17) {
                    yVar.f378830p = c01.id.c();
                    java.util.LinkedList linkedList = cVar.f344273e;
                    yVar.f496094g = !linkedList.isEmpty() ? 1 : 0;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSRelevantSearchUIUnit", "[fts][sug] uiunit pardus end hasUpdated:" + yVar.f378832r + ", hitLocal:" + z18 + ", searchId=" + j18);
                    synchronized (yVar.f378832r) {
                        if (yVar.f378832r.get()) {
                            z17 = true;
                        } else {
                            yVar.f378832r.set(true);
                            z17 = false;
                        }
                    }
                    if (!z17) {
                        yVar.f378829o = z18;
                        if (!z18) {
                            yVar.f378831q = linkedList;
                            java.lang.String str = cVar.f344275g;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
                            yVar.f378833s = str;
                            java.lang.String str2 = yVar.f378827m;
                            java.util.LinkedList linkedList2 = yVar.f378831q;
                            android.content.Context context = this.f378817e;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                            pf5.z zVar = pf5.z.f435481a;
                            boolean z19 = context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112;
                            if (!z19) {
                                throw new java.lang.IllegalStateException("Check failed.".toString());
                            }
                            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context;
                            p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a(activityC0065xcd7aa112).a(z13.f.class);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
                            if (((z13.f) a17).f7()) {
                                if (!(linkedList2 == null || linkedList2.isEmpty()) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.di6) kz5.n0.X(linkedList2)).f454045d, str2)) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSRelevantSearchUIUnit", "[fts] removeSugItemEqualToQueryAtFirstIfNeeded: " + str2);
                                    linkedList2.removeFirst();
                                }
                            }
                            if (!z19) {
                                throw new java.lang.IllegalStateException("Check failed.".toString());
                            }
                            p012xc85e97e9.p093xedfae76a.c1 a18 = zVar.a(activityC0065xcd7aa112).a(z13.f.class);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
                            boolean f76 = ((z13.f) a18).f7();
                            int i17 = cVar.f344276h;
                            if (f76) {
                                if (i17 <= 0) {
                                    i17 = 0;
                                }
                                java.util.LinkedList linkedList3 = yVar.f378831q;
                                int size = linkedList3 != null ? linkedList3.size() : 0;
                                if (i17 > size) {
                                    i17 = size;
                                }
                            } else {
                                if (1 >= i17) {
                                    i17 = 1;
                                }
                                java.util.LinkedList linkedList4 = yVar.f378831q;
                                int size2 = linkedList4 != null ? linkedList4.size() : 1;
                                if (i17 > size2) {
                                    i17 = size2;
                                }
                            }
                            yVar.f378834t = i17;
                            long j19 = yVar.f378828n;
                            java.lang.String str3 = yVar.f378827m;
                            if (str3 == null) {
                                str3 = "";
                            }
                            android.content.Context context2 = yVar.f496092e;
                            if (context2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity");
                                j75.f m67437x4bd5310 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0) context2).m67437x4bd5310();
                                if (m67437x4bd5310 != null) {
                                    m67437x4bd5310.B3(new fi0.j(j19, str3, false));
                                }
                            }
                        }
                        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
                        if (c20976x6ba6452a != null) {
                            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                            p3325xe03a0797.p3326xc267989b.l.d(c20976x6ba6452a, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new j23.u(this.f378818f, yVar, null), 2, null);
                        }
                    }
                }
            }
            cVar.f379600a = new fi0.d(z18);
        }
        return jz5.f0.f384359a;
    }
}
