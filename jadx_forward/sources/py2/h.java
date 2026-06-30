package py2;

/* loaded from: classes4.dex */
public final class h implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f440608a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u26.w f440609b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ py2.i f440610c;

    public h(android.content.Context context, u26.w wVar, py2.i iVar) {
        this.f440608a = context;
        this.f440609b = wVar;
        this.f440610c = iVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        u26.w wVar = this.f440609b;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) this.f440608a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O6 = ((um3.b) pf5.z.f435481a.a(activity).a(um3.b.class)).O6();
        try {
            java.lang.String m75945x2fec8307 = ((r45.h51) fVar.f152151d).m75945x2fec8307(12);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            return v65.i.b(O6, null, new py2.f(new org.json.JSONObject(m75945x2fec8307), wVar, null), 1, null);
        } catch (java.lang.Throwable unused) {
            return v65.i.b(O6, null, new py2.g(wVar, this.f440610c, null), 1, null);
        }
    }
}
