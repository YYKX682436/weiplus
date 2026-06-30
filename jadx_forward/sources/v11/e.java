package v11;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final v11.d f513888a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f513889b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f513890c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f513891d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f513892e;

    /* renamed from: f, reason: collision with root package name */
    public final v11.b f513893f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f513894g;

    public e(v11.d type, java.lang.String label, java.lang.String callbackBuf, java.lang.String style, java.lang.String url, v11.b state, java.lang.String buttonId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(label, "label");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callbackBuf, "callbackBuf");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style, "style");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buttonId, "buttonId");
        this.f513888a = type;
        this.f513889b = label;
        this.f513890c = callbackBuf;
        this.f513891d = style;
        this.f513892e = url;
        this.f513893f = state;
        this.f513894g = buttonId;
    }

    public static v11.e a(v11.e eVar, v11.d type, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, v11.b bVar, java.lang.String str5, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            type = eVar.f513888a;
        }
        if ((i17 & 2) != 0) {
            str = eVar.f513889b;
        }
        java.lang.String label = str;
        if ((i17 & 4) != 0) {
            str2 = eVar.f513890c;
        }
        java.lang.String callbackBuf = str2;
        if ((i17 & 8) != 0) {
            str3 = eVar.f513891d;
        }
        java.lang.String style = str3;
        if ((i17 & 16) != 0) {
            str4 = eVar.f513892e;
        }
        java.lang.String url = str4;
        if ((i17 & 32) != 0) {
            bVar = eVar.f513893f;
        }
        v11.b state = bVar;
        if ((i17 & 64) != 0) {
            str5 = eVar.f513894g;
        }
        java.lang.String buttonId = str5;
        eVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(label, "label");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callbackBuf, "callbackBuf");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style, "style");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buttonId, "buttonId");
        return new v11.e(type, label, callbackBuf, style, url, state, buttonId);
    }

    public final v11.e b(v11.b newState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newState, "newState");
        return a(this, null, null, null, null, null, newState, null, 95, null);
    }

    /* renamed from: equals */
    public boolean m170878xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.e)) {
            return false;
        }
        v11.e eVar = (v11.e) obj;
        return this.f513888a == eVar.f513888a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513889b, eVar.f513889b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513890c, eVar.f513890c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513891d, eVar.f513891d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513892e, eVar.f513892e) && this.f513893f == eVar.f513893f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513894g, eVar.f513894g);
    }

    /* renamed from: hashCode */
    public int m170879x8cdac1b() {
        return (((((((((((this.f513888a.hashCode() * 31) + this.f513889b.hashCode()) * 31) + this.f513890c.hashCode()) * 31) + this.f513891d.hashCode()) * 31) + this.f513892e.hashCode()) * 31) + this.f513893f.hashCode()) * 31) + this.f513894g.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m170880x9616526c() {
        return "InteractButtonUiModel(type=" + this.f513888a + ", label=" + this.f513889b + ", callbackBuf=" + this.f513890c + ", style=" + this.f513891d + ", url=" + this.f513892e + ", state=" + this.f513893f + ", buttonId=" + this.f513894g + ')';
    }
}
