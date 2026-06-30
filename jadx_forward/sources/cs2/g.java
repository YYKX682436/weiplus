package cs2;

/* loaded from: classes2.dex */
public final class g implements vr2.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cs2.i f303602a;

    public g(cs2.i iVar) {
        this.f303602a = iVar;
    }

    @Override // vr2.i
    public void a(java.lang.String mediaId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
    }

    @Override // vr2.i
    public void b(java.lang.String mediaId, cs2.p task, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        cs2.i.a(this.f303602a, i17, i18);
    }

    @Override // vr2.i
    public void c(java.lang.String mediaId, int i17, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
    }

    @Override // vr2.i
    public void d(java.lang.String mediaId, boolean z17, int i17, cs2.p task, long j17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        cs2.i.a(this.f303602a, i18, i19);
    }

    @Override // vr2.i
    public void e(java.lang.String mediaId, java.lang.String msg, cs2.p task, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        cs2.i.a(this.f303602a, i17, i18);
    }

    @Override // vr2.i
    public void f(java.lang.String mediaId, cs2.p task, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        cs2.i iVar = this.f303602a;
        if (iVar.f303608e) {
            return;
        }
        android.content.Context context = iVar.f303604a;
        jz5.f0 f0Var = null;
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = context instanceof com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 ? (com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) context : null;
        if (abstractActivityC22579xbed01a37 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GridFeedPreloadCore", "onPreloadStart loading:" + i17 + " waiting:" + i18);
            android.app.Activity m81193x1252e2cf = abstractActivityC22579xbed01a37.m81193x1252e2cf();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = m81193x1252e2cf instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) m81193x1252e2cf : null;
            if (activityC0065xcd7aa112 != null) {
                if (activityC0065xcd7aa112 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15036x1a33c799) {
                    pf5.z zVar = pf5.z.f435481a;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 fragment = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) zVar.a(activityC0065xcd7aa112).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class)).m63052x8f02c6c();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
                    p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.b(fragment).a(cs2.k.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
                    ((cs2.k) a17).R6();
                } else {
                    p012xc85e97e9.p093xedfae76a.c1 a18 = pf5.z.f435481a.a(activityC0065xcd7aa112).a(cs2.k.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
                    ((cs2.k) a18).R6();
                }
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null) {
                p012xc85e97e9.p093xedfae76a.c1 a19 = pf5.z.f435481a.a(abstractActivityC22579xbed01a37).a(cs2.k.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a19, "get(...)");
                ((cs2.k) a19).R6();
            }
            iVar.f303608e = true;
        }
    }

    @Override // vr2.i
    public void g(java.lang.String mediaId, int i17, int i18, java.lang.String fileFormat, java.lang.String codingFormat, cs2.p task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileFormat, "fileFormat");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codingFormat, "codingFormat");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
    }

    @Override // vr2.i
    public void h(java.lang.String mediaId, cs2.p task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
    }
}
