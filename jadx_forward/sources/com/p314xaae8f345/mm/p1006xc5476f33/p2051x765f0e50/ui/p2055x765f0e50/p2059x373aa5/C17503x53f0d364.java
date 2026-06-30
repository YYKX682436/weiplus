package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2059x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bB!\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001a\u0010\u001eR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/view/SettingPermissionView;", "Landroid/widget/FrameLayout;", "", "f", "Ljava/lang/String;", "getPermission", "()Ljava/lang/String;", "setPermission", "(Ljava/lang/String;)V", "permission", "g", "getBusiness", "setBusiness", "business", "Lu60/e;", "r", "Lu60/e;", "getOnAddr", "()Lu60/e;", "setOnAddr", "(Lu60/e;)V", "onAddr", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.view.SettingPermissionView */
/* loaded from: classes15.dex */
public final class C17503x53f0d364 extends android.widget.FrameLayout {

    /* renamed from: s, reason: collision with root package name */
    public static final java.util.List f243188s = kz5.c0.i("chatting", "radar", "face2face_group", "sns", "finder", "live", "scan", "shake", "story", ya.a.f77450x918d59a8, "nearby", "game", "nearby_appbrand", "mine", "status", "fav", "card", "musicplayer", "net_check", "wifi_info", "pay", "biz", "webview", "contact", "emoji", "sport", "mail", "voiceprint", "add_contact", "contact_remark", "wechatout", "savefile", "appbrand", "ting", "red_packet", "wxShop");

    /* renamed from: t, reason: collision with root package name */
    public static final java.util.List f243189t = kz5.c0.i(ya.b.f77489x9ff58fb5, "contact", "storage", "camera", "microphone", "bluetooth", "healthy", "overlay");

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f243190d;

    /* renamed from: e, reason: collision with root package name */
    public android.content.Context f243191e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public java.lang.String permission;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public java.lang.String business;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f243194h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f243195i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f243196m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f243197n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f243198o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f243199p;

    /* renamed from: q, reason: collision with root package name */
    public final i11.c f243200q;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public u60.e onAddr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17503x53f0d364(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.f243200q = new x14.t(this);
        this.onAddr = new x14.u(this);
        c(attrs, 0);
        b(context);
    }

    public final boolean a(java.lang.String str, java.lang.String str2) {
        return !((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).nj(str, str2);
    }

    public final void b(android.content.Context context) {
        java.lang.String string;
        this.f243191e = context;
        if (context == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContext");
            throw null;
        }
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ckq, this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f243190d = inflate;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.ktp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f243194h = (android.widget.TextView) findViewById;
        android.view.View view = this.f243190d;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.kto);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f243195i = (android.widget.TextView) findViewById2;
        android.widget.TextView textView = this.f243194h;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mItemNameTextView");
            throw null;
        }
        java.util.HashMap hashMap = e85.i.f331848a;
        textView.setText((java.lang.CharSequence) e85.i.f331851d.get(m69093x377efd36()));
        android.widget.TextView textView2 = this.f243195i;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mItemStatusTextView");
            throw null;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = this.f243196m;
        if (o4Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mmkv");
            throw null;
        }
        if (o4Var.getBoolean(m69093x377efd36(), a(m69095xcf667dc5(), m69093x377efd36()))) {
            string = "";
        } else {
            android.content.Context context2 = this.f243191e;
            if (context2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContext");
                throw null;
            }
            string = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ivr);
        }
        textView2.setText(string);
        android.view.View view2 = this.f243190d;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        view2.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563558au1);
        android.view.View view3 = this.f243190d;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        view3.setOnClickListener(new x14.s(this));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = this.f243196m;
        if (o4Var2 != null) {
            this.f243199p = o4Var2.getBoolean(m69093x377efd36(), a(m69095xcf667dc5(), m69093x377efd36()));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mmkv");
            throw null;
        }
    }

    public final void c(android.util.AttributeSet attributeSet, int i17) {
        java.lang.String str;
        java.lang.String str2;
        boolean z17 = false;
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f14.f.f340217a, i17, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(obtainStyledAttributes.getInt(1, -1));
        int intValue = valueOf.intValue();
        java.util.List list = f243189t;
        if (!(1 <= intValue && intValue <= list.size())) {
            valueOf = null;
        }
        if (valueOf == null || (str = (java.lang.String) list.get(valueOf.intValue() - 1)) == null) {
            str = "unknown_permission";
        }
        m69098xfd8acbd1(str);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(obtainStyledAttributes.getInt(0, -1));
        int intValue2 = valueOf2.intValue();
        java.util.List list2 = f243188s;
        if (1 <= intValue2 && intValue2 <= list2.size()) {
            z17 = true;
        }
        java.lang.Integer num = z17 ? valueOf2 : null;
        if (num == null || (str2 = (java.lang.String) list2.get(num.intValue() - 1)) == null) {
            str2 = "unknown_business";
        }
        m69096x32375e42(str2);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Zi = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Zi(m69095xcf667dc5());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Zi, "getPermissionConfigMMkv(...)");
        this.f243196m = Zi;
    }

    /* renamed from: getBusiness */
    public final java.lang.String m69093x377efd36() {
        java.lang.String str = this.business;
        if (str != null) {
            return str;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("business");
        throw null;
    }

    public final u60.e getOnAddr() {
        return this.onAddr;
    }

    /* renamed from: getPermission */
    public final java.lang.String m69095xcf667dc5() {
        java.lang.String str = this.permission;
        if (str != null) {
            return str;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("permission");
        throw null;
    }

    /* renamed from: setBusiness */
    public final void m69096x32375e42(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.business = str;
    }

    /* renamed from: setOnAddr */
    public final void m69097x1be36d72(u60.e eVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eVar, "<set-?>");
        this.onAddr = eVar;
    }

    /* renamed from: setPermission */
    public final void m69098xfd8acbd1(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.permission = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17503x53f0d364(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.f243200q = new x14.t(this);
        this.onAddr = new x14.u(this);
        c(attrs, i17);
        b(context);
    }
}
