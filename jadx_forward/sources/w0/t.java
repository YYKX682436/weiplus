package w0;

/* loaded from: classes10.dex */
public final class t implements w0.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w0.u f523393a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f523394b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.a f523395c;

    public t(w0.u uVar, java.lang.String str, yz5.a aVar) {
        this.f523393a = uVar;
        this.f523394b = str;
        this.f523395c = aVar;
    }

    public void a() {
        w0.u uVar = this.f523393a;
        java.util.Map map = uVar.f523398c;
        java.lang.String str = this.f523394b;
        java.util.List list = (java.util.List) map.remove(str);
        if (list != null) {
            list.remove(this.f523395c);
        }
        if (list == null || !(!list.isEmpty())) {
            return;
        }
        uVar.f523398c.put(str, list);
    }
}
