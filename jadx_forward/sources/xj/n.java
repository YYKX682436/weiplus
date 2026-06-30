package xj;

/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final wj.r0 f536294a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Intent f536295b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f536296c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f536297d;

    public n(wj.r0 launchAppShowType, android.content.Intent intent, android.content.Context context, java.util.Map map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(launchAppShowType, "launchAppShowType");
        this.f536294a = launchAppShowType;
        this.f536295b = intent;
        this.f536296c = context;
        this.f536297d = map;
    }

    /* renamed from: equals */
    public boolean m175611xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xj.n)) {
            return false;
        }
        xj.n nVar = (xj.n) obj;
        return this.f536294a == nVar.f536294a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f536295b, nVar.f536295b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f536296c, nVar.f536296c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f536297d, nVar.f536297d);
    }

    /* renamed from: hashCode */
    public int m175612x8cdac1b() {
        int hashCode = this.f536294a.hashCode() * 31;
        android.content.Intent intent = this.f536295b;
        int hashCode2 = (hashCode + (intent == null ? 0 : intent.hashCode())) * 31;
        android.content.Context context = this.f536296c;
        int hashCode3 = (hashCode2 + (context == null ? 0 : context.hashCode())) * 31;
        java.util.Map map = this.f536297d;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m175613x9616526c() {
        return "MagicAdOpenArgs(launchAppShowType=" + this.f536294a + ", extIntent=" + this.f536295b + ", context=" + this.f536296c + ", schemeUrlQuery=" + this.f536297d + ')';
    }

    public /* synthetic */ n(wj.r0 r0Var, android.content.Intent intent, android.content.Context context, java.util.Map map, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? wj.r0.f528032e : r0Var, (i17 & 2) != 0 ? null : intent, (i17 & 4) != 0 ? null : context, (i17 & 8) != 0 ? null : map);
    }
}
