package v85;

/* loaded from: classes10.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f515632d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.p64 f515633e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.p64 f515634f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i17, r45.p64 p64Var, r45.p64 p64Var2) {
        super(0);
        this.f515632d = i17;
        this.f515633e = p64Var;
        this.f515634f = p64Var2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.p64 p64Var;
        int i17 = -1;
        v85.e.f515642g--;
        int i18 = 0;
        int i19 = this.f515632d;
        if (i19 == 2) {
            v85.e eVar = v85.e.f515636a;
            java.lang.String LensId = this.f515633e.f464325d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(LensId, "LensId");
            r45.q64 q64Var = v85.e.f515641f;
            java.util.LinkedList lensInfoList = q64Var.f465243d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lensInfoList, "lensInfoList");
            java.util.Iterator it = lensInfoList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.p64) it.next()).f464325d, LensId)) {
                    i17 = i18;
                    break;
                }
                i18++;
            }
            if (i17 >= 0) {
                q64Var.f465243d.remove(i17);
                eVar.b();
            }
        } else if (i19 == 0 && (p64Var = this.f515634f) != null) {
            java.util.LinkedList lensInfoList2 = v85.e.f515641f.f465243d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lensInfoList2, "lensInfoList");
            java.util.Iterator it6 = lensInfoList2.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.p64) it6.next()).f464325d, p64Var.f464325d)) {
                    i17 = i18;
                    break;
                }
                i18++;
            }
            if (i17 > 0) {
                java.lang.Object obj = v85.e.f515641f.f465243d.get(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                r45.p64 p64Var2 = (r45.p64) obj;
                p64Var2.f464325d = p64Var.f464325d;
                p64Var2.f464329h = p64Var.f464329h;
                p64Var2.f464326e = p64Var.f464326e;
                p64Var2.f464327f = p64Var.f464327f;
                p64Var2.f464328g = p64Var.f464328g;
            }
        }
        return jz5.f0.f384359a;
    }
}
