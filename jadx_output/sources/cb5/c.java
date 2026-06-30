package cb5;

/* loaded from: classes5.dex */
public class c extends wu5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f40351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cb5.d f40352e;

    public c(cb5.d dVar, boolean z17) {
        this.f40352e = dVar;
        this.f40351d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        cb5.d dVar = this.f40352e;
        boolean z17 = this.f40351d;
        if (z17) {
            dVar.f40353d.f();
        } else if (!dVar.f40353d.f402844i) {
            return;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingMonitoredBanner", "hy: should not show banner");
            dVar.f40353d.k(8);
            return;
        }
        cb5.e eVar = dVar.f40353d;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingMonitoredBanner", "hy: start show banner: %s, %s, %s, %b", eVar.f40357p, eVar.f40354m, eVar.f40355n, java.lang.Boolean.valueOf(eVar.f40356o));
        cb5.e eVar2 = dVar.f40353d;
        if (eVar2.f40357p == e01.c.Chatting) {
            c01.d9.b().m().getClass();
            eVar2.f40354m = (java.lang.String) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_CHATTING_MONITOR_MAIN_WORDING_STRING_SYNC, "");
            c01.d9.b().m().getClass();
            eVar2.f40355n = (java.lang.String) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_CHATTING_MONITOR_MAIN_URL_STRING_SYNC, "");
            c01.d9.b().m().getClass();
            eVar2.f40356o = ((java.lang.Boolean) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_CHATTING_MONITOR_MAIN_CLOSABLE_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue();
        } else {
            c01.d9.b().m().getClass();
            eVar2.f40354m = (java.lang.String) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_MAIN_MONITOR_MAIN_WORDING_STRING_SYNC, "");
            c01.d9.b().m().getClass();
            eVar2.f40355n = (java.lang.String) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_MAIN_MONITOR_MAIN_URL_STRING_SYNC, "");
            c01.d9.b().m().getClass();
            eVar2.f40356o = ((java.lang.Boolean) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_MAIN_MONITOR_MAIN_CLOSABLE_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue();
        }
        android.widget.TextView textView = (android.widget.TextView) eVar2.f402843h.findViewById(com.tencent.mm.R.id.bpg);
        android.widget.ImageView imageView = (android.widget.ImageView) eVar2.f402843h.findViewById(com.tencent.mm.R.id.close_icon);
        if (com.tencent.mm.sdk.platformtools.t8.K0(eVar2.f40354m)) {
            textView.setText(com.tencent.mm.R.string.f490604zq);
        } else {
            textView.setText(eVar2.f40354m);
        }
        textView.setSelected(true);
        if (com.tencent.mm.sdk.platformtools.t8.K0(eVar2.f40355n)) {
            eVar2.f402843h.findViewById(com.tencent.mm.R.id.jqb).setBackgroundResource(com.tencent.mm.R.color.a8y);
            imageView.setImageResource(com.tencent.mm.R.drawable.apk);
            textView.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479549ab0));
        } else {
            eVar2.f402843h.findViewById(com.tencent.mm.R.id.jqb).setBackgroundResource(com.tencent.mm.R.drawable.f482184b73);
            imageView.setImageResource(com.tencent.mm.R.drawable.apl);
            textView.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.BW_50));
        }
        eVar2.f402843h.setOnClickListener(new cb5.a(this));
        if (eVar2.f402843h.getVisibility() != 0) {
            eVar2.f40358q = "" + gm0.j1.b().h() + "_" + java.lang.System.currentTimeMillis();
            cb5.e.l(eVar2, 0);
        }
        eVar2.k(0);
        if (!eVar2.f40356o) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            imageView.setOnClickListener(new cb5.b(this));
        }
    }
}
