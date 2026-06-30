package com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui;

/* loaded from: classes15.dex */
public class e implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.AbstractActivityC18835xbdcc0e00 f257776d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.AbstractActivityC18835xbdcc0e00 abstractActivityC18835xbdcc0e00) {
        this.f257776d = abstractActivityC18835xbdcc0e00;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        if (message.what != 1) {
            return false;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.v5.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f574851jq2, new com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.d(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.AbstractActivityC18835xbdcc0e00 abstractActivityC18835xbdcc0e00 = this.f257776d;
        abstractActivityC18835xbdcc0e00.f257704n = "voice_pt_voice_print_record.rec";
        fq4.d0 d0Var = abstractActivityC18835xbdcc0e00.f257702i;
        d0Var.f347114b = "voice_pt_voice_print_record.rec";
        eq4.b bVar = d0Var.f347118f;
        bVar.getClass();
        ym1.f.f544667h.h(bVar, "record");
        bVar.f337437l = new fp.e(abstractActivityC18835xbdcc0e00);
        int r17 = bVar.r("record", 4);
        bVar.f337438m = false;
        if (r17 != 0) {
            bVar.o(100);
        } else {
            new eq4.a(bVar).mo50307xb9e94560(0, 50L);
        }
        abstractActivityC18835xbdcc0e00.f257710t.c(100L, 100L);
        abstractActivityC18835xbdcc0e00.f257701h.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.C18848xa06e1dbc c18848xa06e1dbc = abstractActivityC18835xbdcc0e00.f257701h;
        c18848xa06e1dbc.f257757d.getVisibility();
        if (c18848xa06e1dbc.f257757d.getVisibility() != 0 || c18848xa06e1dbc.f257758e) {
            c18848xa06e1dbc.f257757d.clearAnimation();
            c18848xa06e1dbc.f257757d.setVisibility(4);
            c18848xa06e1dbc.f257757d.invalidate();
        } else {
            c18848xa06e1dbc.f257757d.clearAnimation();
            c18848xa06e1dbc.f257758e = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.g1.a(c18848xa06e1dbc.f257757d, c18848xa06e1dbc.getContext(), new com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.w0(c18848xa06e1dbc));
        }
        abstractActivityC18835xbdcc0e00.f257701h.m72728x63103da6(abstractActivityC18835xbdcc0e00.f257705o);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = abstractActivityC18835xbdcc0e00.f257711u;
        b4Var.d();
        b4Var.c(500L, 500L);
        android.view.View view = abstractActivityC18835xbdcc0e00.f257699f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI", "pressMic", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI", "pressMic", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.C18846x292f7cd4 c18846x292f7cd4 = abstractActivityC18835xbdcc0e00.f257700g;
        c18846x292f7cd4.f257755p = false;
        c18846x292f7cd4.f257754o = -1.0f;
        c18846x292f7cd4.f257756q = false;
        c18846x292f7cd4.f257753n = 0.0f;
        c18846x292f7cd4.postInvalidate();
        c18846x292f7cd4.f257756q = true;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = c18846x292f7cd4.f257750h;
        long j17 = com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.C18846x292f7cd4.f257742t;
        b4Var2.c(j17, j17);
        c18846x292f7cd4.b();
        return true;
    }
}
