package zm0;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final zm0.i f555637a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f555638b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedHashSet f555639c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f555640d;

    public e(zm0.i manager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(manager, "manager");
        this.f555637a = manager;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = manager.f555655c.f555641a;
        for (int i18 = 0; i18 < i17; i18++) {
            arrayList.add(new java.util.ArrayList());
        }
        this.f555638b = arrayList;
        this.f555639c = new java.util.LinkedHashSet();
        this.f555640d = new java.util.HashMap();
    }
}
