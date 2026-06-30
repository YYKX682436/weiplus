package com.p314xaae8f345.p3210x3857dc;

/* loaded from: classes7.dex */
public class y2 {

    /* renamed from: a, reason: collision with root package name */
    public int f302164a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f302165b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f302166c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f302167d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f302168e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f302169f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f302170g;

    /* renamed from: h, reason: collision with root package name */
    public int f302171h;

    /* renamed from: i, reason: collision with root package name */
    public long f302172i;

    /* renamed from: j, reason: collision with root package name */
    public int f302173j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f302174k;

    /* renamed from: l, reason: collision with root package name */
    public final com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 f302175l;

    public y2(int i17, int i18, com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9) {
        this.f302164a = i17;
        this.f302171h = i18;
        this.f302175l = c27816xac2547f9;
    }

    /* renamed from: toString */
    public java.lang.String m120528x9616526c() {
        com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9 = this.f302175l;
        boolean z17 = false;
        if (c27816xac2547f9 != null && c27816xac2547f9.u(2002)) {
            if (android.text.TextUtils.isEmpty(this.f302166c)) {
                by5.c4.c("XWebScript", "checkValid failed jsSrcValue invalid = " + this.f302166c);
            } else if (android.text.TextUtils.isEmpty(this.f302165b)) {
                by5.c4.c("XWebScript", "checkValid failed jsSrcKind invalid = " + this.f302165b);
            } else if (this.f302164a >= 0) {
                long j17 = this.f302172i;
                if (j17 != 0 && this.f302173j <= 0) {
                    by5.c4.c("XWebScript", "checkValid failed bufferSize invalid = " + this.f302173j);
                } else if (this.f302173j != 0 && j17 == 0) {
                    by5.c4.c("XWebScript", "checkValid failed bufferAddr invalid = " + this.f302172i);
                } else if (android.text.TextUtils.isEmpty(this.f302170g) || c27816xac2547f9.u(2008)) {
                    z17 = true;
                } else {
                    by5.c4.c("XWebScript", "not support jsparam as file path, apk ver = " + org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.d());
                }
            } else {
                by5.c4.c("XWebScript", "checkValid failed compile mode invalid = " + this.f302164a);
            }
        }
        if (!z17) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("//XWEB_SCRIPT:");
        org.json.JSONStringer jSONStringer = new org.json.JSONStringer();
        try {
            if (c27816xac2547f9.u(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46349x3142bb26)) {
                this.f302171h |= 2048;
            }
            org.json.JSONStringer value = jSONStringer.object().key("compile_mode").value(this.f302164a).key("cache_option").value(this.f302171h).key("js_src_kind").value(this.f302165b).key("js_src").value(this.f302166c);
            if (!android.text.TextUtils.isEmpty(this.f302167d)) {
                value = value.key("cache_key").value(this.f302167d);
            }
            if (!android.text.TextUtils.isEmpty(this.f302168e)) {
                value = value.key("append_script").value(this.f302168e);
            }
            if (!android.text.TextUtils.isEmpty(this.f302170g)) {
                value = value.key("js_param_kind").value(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714).key("js_param").value(this.f302170g);
            } else if (this.f302172i != 0 && this.f302173j != 0) {
                value = value.key("js_param_kind").value("buffer").key("js_param").value(java.lang.Long.toHexString(this.f302172i)).key("js_param_length").value(this.f302173j);
            }
            if (!android.text.TextUtils.isEmpty(this.f302174k)) {
                value = value.key("js_filename").value(this.f302174k);
            }
            value.endObject();
            sb6.append(value.toString());
            if (c27816xac2547f9 != null && c27816xac2547f9.u(2004)) {
                sb6.append("XWEB_SCRIPT_END\n\r" + this.f302169f);
            }
        } catch (java.lang.Throwable th6) {
            by5.c4.d("XWebScript", "xweb script create failed, error", th6);
        }
        return sb6.toString();
    }
}
