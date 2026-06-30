package cb5;

/* loaded from: classes5.dex */
public class c extends wu5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f121884d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cb5.d f121885e;

    public c(cb5.d dVar, boolean z17) {
        this.f121885e = dVar;
        this.f121884d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        cb5.d dVar = this.f121885e;
        boolean z17 = this.f121884d;
        if (z17) {
            dVar.f121886d.f();
        } else if (!dVar.f121886d.f484377i) {
            return;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingMonitoredBanner", "hy: should not show banner");
            dVar.f121886d.k(8);
            return;
        }
        cb5.e eVar = dVar.f121886d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingMonitoredBanner", "hy: start show banner: %s, %s, %s, %b", eVar.f121890p, eVar.f121887m, eVar.f121888n, java.lang.Boolean.valueOf(eVar.f121889o));
        cb5.e eVar2 = dVar.f121886d;
        if (eVar2.f121890p == e01.c.Chatting) {
            c01.d9.b().m().getClass();
            eVar2.f121887m = (java.lang.String) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CHATTING_MONITOR_MAIN_WORDING_STRING_SYNC, "");
            c01.d9.b().m().getClass();
            eVar2.f121888n = (java.lang.String) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CHATTING_MONITOR_MAIN_URL_STRING_SYNC, "");
            c01.d9.b().m().getClass();
            eVar2.f121889o = ((java.lang.Boolean) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CHATTING_MONITOR_MAIN_CLOSABLE_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue();
        } else {
            c01.d9.b().m().getClass();
            eVar2.f121887m = (java.lang.String) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MAIN_MONITOR_MAIN_WORDING_STRING_SYNC, "");
            c01.d9.b().m().getClass();
            eVar2.f121888n = (java.lang.String) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MAIN_MONITOR_MAIN_URL_STRING_SYNC, "");
            c01.d9.b().m().getClass();
            eVar2.f121889o = ((java.lang.Boolean) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MAIN_MONITOR_MAIN_CLOSABLE_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue();
        }
        android.widget.TextView textView = (android.widget.TextView) eVar2.f484376h.findViewById(com.p314xaae8f345.mm.R.id.bpg);
        android.widget.ImageView imageView = (android.widget.ImageView) eVar2.f484376h.findViewById(com.p314xaae8f345.mm.R.id.f78246x851a1260);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(eVar2.f121887m)) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq);
        } else {
            textView.setText(eVar2.f121887m);
        }
        textView.setSelected(true);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(eVar2.f121888n)) {
            eVar2.f484376h.findViewById(com.p314xaae8f345.mm.R.id.jqb).setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a8y);
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.apk);
            textView.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
        } else {
            eVar2.f484376h.findViewById(com.p314xaae8f345.mm.R.id.jqb).setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563717b73);
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.apl);
            textView.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77687x3cb06c5));
        }
        eVar2.f484376h.setOnClickListener(new cb5.a(this));
        if (eVar2.f484376h.getVisibility() != 0) {
            eVar2.f121891q = "" + gm0.j1.b().h() + "_" + java.lang.System.currentTimeMillis();
            cb5.e.l(eVar2, 0);
        }
        eVar2.k(0);
        if (!eVar2.f121889o) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            imageView.setOnClickListener(new cb5.b(this));
        }
    }
}
