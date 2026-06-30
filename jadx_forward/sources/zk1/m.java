package zk1;

/* loaded from: classes14.dex */
public final class m extends android.view.View.AccessibilityDelegate {

    /* renamed from: l, reason: collision with root package name */
    public static final zk1.j f554947l = new zk1.j(null);

    /* renamed from: m, reason: collision with root package name */
    public static final jz5.g f554948m = jz5.h.a(jz5.i.f384363e, zk1.i.f554944d);

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f554949a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Class f554950b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f554951c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f554952d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Boolean f554953e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Boolean f554954f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f554955g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.a f554956h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Rect f554957i;

    /* renamed from: j, reason: collision with root package name */
    public final android.graphics.Rect f554958j = new android.graphics.Rect();

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f554959k = jz5.h.a(jz5.i.f384364f, new zk1.l(this));

    public m(android.view.View view, java.lang.Class cls, java.lang.String str, boolean z17, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str2, yz5.a aVar, android.graphics.Rect rect, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f554949a = view;
        this.f554950b = cls;
        this.f554951c = str;
        this.f554952d = z17;
        this.f554953e = bool;
        this.f554954f = bool2;
        this.f554955g = str2;
        this.f554956h = aVar;
        this.f554957i = rect;
    }

    public static final void a(android.view.View view, java.lang.Class cls, java.lang.Integer num, boolean z17, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Integer num2, yz5.a aVar, java.lang.Integer num3, java.lang.Integer num4, java.lang.Integer num5, java.lang.Integer num6, java.lang.Integer num7) {
        f554947l.a(view, cls, num, z17, bool, bool2, num2, aVar, num3, num4, num5, num6, num7);
    }

    @Override // android.view.View.AccessibilityDelegate
    public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View host) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        zk1.k kVar = (zk1.k) this.f554959k.mo141623x754a37bb();
        return kVar != null ? kVar : super.getAccessibilityNodeProvider(host);
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(android.view.View host, android.view.accessibility.AccessibilityNodeInfo info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        java.lang.Class cls = this.f554950b;
        if (cls != null) {
            info.setClassName(cls.getName());
        }
        java.lang.String str = this.f554951c;
        if (str != null) {
            info.setContentDescription(str);
        }
        if (this.f554952d) {
            info.setCollectionInfo(null);
        }
        java.lang.Boolean bool = this.f554953e;
        if (bool != null) {
            info.setFocusable(bool.booleanValue());
        }
        java.lang.Boolean bool2 = this.f554954f;
        if (bool2 != null) {
            info.setClickable(bool2.booleanValue());
        }
        java.lang.String str2 = this.f554955g;
        if (str2 != null) {
            info.addAction(new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(16, str2));
        }
        yz5.a aVar = this.f554956h;
        if (aVar != null) {
            boolean booleanValue = ((java.lang.Boolean) aVar.mo152xb9724478()).booleanValue();
            info.setCheckable(true);
            info.setChecked(booleanValue);
        }
    }
}
