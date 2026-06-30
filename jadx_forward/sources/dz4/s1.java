package dz4;

@j95.b
/* loaded from: classes8.dex */
public final class s1 extends i95.w implements ih0.r {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f326929d = "MicroMsg.WeNoteFlutterFeatureService";

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f326930e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f326931f = new java.util.LinkedHashSet();

    public void Ai(ih0.p holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.util.List list = this.f326930e;
        if (((java.util.ArrayList) list).contains(holder)) {
            ((java.util.ArrayList) list).remove(holder);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f326929d, "unRegisterFavNoteActivityHolder: holder not found in list, holder key: " + ((ez4.u) holder).f339476b);
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f326929d, "onAccountInitialized: ");
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.t.f298394a = u72.a.class;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.n.f299244a = dz4.p1.f326902a;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3164x6bba817.f.f299186a = dz4.q1.f326910a;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.o.f299245a = dz4.r1.f326921a;
    }

    public ih0.p wi(java.lang.String key) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.util.Iterator it = this.f326930e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((ez4.u) ((ih0.p) obj)).f339476b, key)) {
                break;
            }
        }
        return (ih0.p) obj;
    }
}
