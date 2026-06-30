package sc2;

/* loaded from: classes2.dex */
public final class v4 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f487839a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487840b;

    public v4(java.lang.String str, android.view.View view) {
        this.f487839a = str;
        this.f487840b = view;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (z17) {
            i95.m c17 = i95.n0.c(c50.c1.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            c50.c1 c1Var = (c50.c1) c17;
            ml2.i5 i5Var = ml2.i5.f409103e;
            java.lang.String str = this.f487839a;
            android.content.Context context = this.f487840b.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            java.lang.String valueOf = java.lang.String.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216913n);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("notice_type", 2);
            c50.c1.l9(c1Var, i5Var, str, 0L, 0, valueOf, null, null, null, null, null, null, null, jSONObject.toString(), 0L, 0, null, 61408, null);
        }
    }
}
