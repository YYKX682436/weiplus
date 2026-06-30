package fr2;

/* loaded from: classes2.dex */
public final class n extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fr2.p f347267a;

    public n(fr2.p pVar) {
        this.f347267a = pVar;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (z17) {
            fr2.p pVar = this.f347267a;
            android.app.Activity context = pVar.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4.f183535a.a(java.lang.String.valueOf(V6.m75939xb282bd08(5)), "", V6.m75945x2fec8307(1), "chatroom_page_start_live", "");
            fr2.p.P6(pVar, 1);
        }
    }
}
