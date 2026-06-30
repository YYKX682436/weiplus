package vw3;

/* loaded from: classes.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f522503d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.reflect.Field f522504e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f522505f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.CDNDebugIPConfigUI f522506g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.widget.EditText editText, java.lang.reflect.Field field, java.lang.Class cls, com.tencent.mm.plugin.repairer.ui.CDNDebugIPConfigUI cDNDebugIPConfigUI) {
        super(0);
        this.f522503d = editText;
        this.f522504e = field;
        this.f522505f = cls;
        this.f522506g = cDNDebugIPConfigUI;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object m143895xf1229813;
        android.text.Editable text = this.f522503d.getText();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(text, "getText(...)");
        java.lang.String obj = r26.n0.u0(text).toString();
        java.lang.reflect.Field field = this.f522504e;
        java.lang.Class cls = this.f522505f;
        com.tencent.mm.plugin.repairer.ui.CDNDebugIPConfigUI cDNDebugIPConfigUI = this.f522506g;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            field.set(cls, obj);
            cDNDebugIPConfigUI.d.edit().putString(field.getName(), obj).apply();
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        return p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(m143895xf1229813);
    }
}
