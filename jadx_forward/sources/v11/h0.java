package v11;

/* loaded from: classes11.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final v11.j0 f513927a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f513928b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f513929c;

    /* renamed from: d, reason: collision with root package name */
    public final int f513930d;

    /* renamed from: e, reason: collision with root package name */
    public final int f513931e;

    public h0(v11.j0 textView, java.lang.String blockSeparator, java.lang.String listItemSeparator, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "textView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(blockSeparator, "blockSeparator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listItemSeparator, "listItemSeparator");
        this.f513927a = textView;
        this.f513928b = blockSeparator;
        this.f513929c = listItemSeparator;
        this.f513930d = i17;
        this.f513931e = i18;
    }

    public static v11.h0 a(v11.h0 h0Var, v11.j0 textView, java.lang.String str, java.lang.String str2, int i17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 1) != 0) {
            textView = h0Var.f513927a;
        }
        if ((i19 & 2) != 0) {
            str = h0Var.f513928b;
        }
        java.lang.String blockSeparator = str;
        if ((i19 & 4) != 0) {
            str2 = h0Var.f513929c;
        }
        java.lang.String listItemSeparator = str2;
        if ((i19 & 8) != 0) {
            i17 = h0Var.f513930d;
        }
        int i27 = i17;
        if ((i19 & 16) != 0) {
            i18 = h0Var.f513931e;
        }
        h0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "textView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(blockSeparator, "blockSeparator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listItemSeparator, "listItemSeparator");
        return new v11.h0(textView, blockSeparator, listItemSeparator, i27, i18);
    }

    /* renamed from: equals */
    public boolean m170896xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.h0)) {
            return false;
        }
        v11.h0 h0Var = (v11.h0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513927a, h0Var.f513927a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513928b, h0Var.f513928b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513929c, h0Var.f513929c) && this.f513930d == h0Var.f513930d && this.f513931e == h0Var.f513931e;
    }

    /* renamed from: hashCode */
    public int m170897x8cdac1b() {
        return (((((((this.f513927a.m170909x8cdac1b() * 31) + this.f513928b.hashCode()) * 31) + this.f513929c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f513930d)) * 31) + java.lang.Integer.hashCode(this.f513931e);
    }

    /* renamed from: toString */
    public java.lang.String m170898x9616526c() {
        return "NativeMarkdownTextSegmentConfig(textView=" + this.f513927a + ", blockSeparator=" + this.f513928b + ", listItemSeparator=" + this.f513929c + ", inlineNewlineSpacingPx=" + this.f513930d + ", blockSeparatorSpacingPx=" + this.f513931e + ')';
    }
}
